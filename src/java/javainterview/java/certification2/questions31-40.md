## Question 31

Which statement is true about Java byte code?

1. It can run on any platform.
2. It can run on any platform only if it was compiled for that platform.
3. It can run on any platform that has the Java Runtime Environment.
4. It can run on any platform that has a Java compiler.
5. It can run on any platform only if that platform has both the Java Runtime Environment and a Java compiler.

> I would say 3

## Question 32

Given the code fragment

```java
System.out.println(28 + 5 <= 4 + 29);
System.out.println((28 + 5) <= (4 + 29));
```

What is the result?

1.
```
28false29
true
```

2
```
285 < 429 
true
```

3.
```
true
true
```

4. compilation fails

> The answer is 3

## Question 33

Given the code fragment:
```java
public class Test {

    public static List data = new ArrayList();

    // insert code here
    {
        for (String x : strs) {
            data.add(x);
        }
        return data;
    }

    public static void main(String[] args) {
        String[] d = {"a", "b", "c"};
        update(d);
        for (String s : d) {
            System.out.print(s + " ");
        }
    }
}
```

Which code fragment, when inserted at // insert code here, enables the code to compile and and print a b c?

1.
```java
List update (String[] strs)
```

2. 
```java
static ArrayList update(String[] strs)
```

3.
```java
static List update (String[] strs)
```

4
```java
static void update (String[] strs)
```

5.
```
ArrayList static update(String[] strs)
```

> The answer is 3

## Question 34

What is the name of the Java concept that uses access modifiers to protect variables and hide them within a class?

1. Encapsulation
2. Inheritance
3. Abstraction
4. Instantiation
5. Polymorphism

> The answer is 1

## Question 35

Given:
```java
public class Palindrome {
    public static int main(String[] args) {
        System.out.print(args[1]);
        return 0;
    }
}
```

And the commands:
```shell
javac Palindrome.java
java Palindrome Wow Mom
```

What is the result?

1. Compilation fails
2. The code compiles, but does not execute.
3. Paildrome
4. Wow
5. Mom

> The answer is 2

## Question 36

Given:
```java
public class Access {
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        Access accApp = new Access();
        accApp.printThis(1, 2);
        accApp.printThat(3, 4);
    }

    public void printThis(int x, int y) {
        x = x;
        y = y;
        System.out.println("x:" + this.x + " y:" + this.y);
    }

    public void printThat(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x:" + this.x + " y:" + this.y);
    }
}
```

What is the result?

1.
```
x:1 y:2
x:3 y:4
```

2.
```
x:0 y:0
x:3 y:4
```

3.
```
x:1 y:2
x:0 y:0
```

4.
```
x:0 y:0
x:0 y:0
```

> The answer is 2

## Question 37

Given the code fragment

```java
public class Test {
    public static void main(String[] args) { //line 1
        int iVar = 100; //line 2
        float fVar = 100.100f;  //line 3
        double dVar = 123; // line 4
        iVar = fVar; // line 5
        fVar = iVar; // line 6
        dVar = fVar; // line 7
        fVar = dVar; // line 8
        dVar = iVar; // line 9
        iVar = dVar; // line 10
    }
}
```

Which three lines fail to compile?

1. Line 5
2. Line 7
3. Line 8
4. Line 9
5. Line 10
6. Line 11

> The answer are 1, 3 and 5

## Question 38

```java
public class MarkList {
    int num;

    public static void graceMarks(MarkList obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
    }
}
```

How many objects are created in the memory runtime?

1. 1
2. 2
3. 3
4. 4

> The answer is 1

## Question 39

Given the content of three files

A.java
```java
package question39;

public class A {
    public void a() {
    }

    int a;
}
```

B.java
```java
package question39;

public class B {
    private int doStuff() {
        private int x = 100;
        return x++;
    }
}
```

C.java
```java
import java.io.*;
package question39;

class C {
    public void main(String fileName) throws IOException {
    }
}
```

Which statement is true?

1. Only the A.java file compiles successfully.
2. Only the B.java file compiles successfully.
3. Only the C.java file compiles successfully.
4. The A.Java and B.java files compile successfully.
5. The B.java and C.java files compile successfully.
6. The A.Java and C.java files compile successfully.

> The answer is 1


## Question 40
What is the proper way to defined a method that take two int values and returns their sum as an int value?

1.
```java
int sum(int first, int second) { first + second; }
```

2.
```java
int sum(int first, second) { return first + second; }
```

3.
```java
sum(int first, int second) { return first + second; }
```

4.
```java
int sum(int first, int second) { return first + second; }
```

5.
```java
void sum (int first, int second) { return first + second; }
```

> The answer is 4