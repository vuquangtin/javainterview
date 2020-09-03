## Question 121

Which usage represents a valid way of compiling java source file with the name "Main"?

1. javac Main.java
2. java Main.class
3. java Main.java
4. javac Main
5. java Main

> The answer is 1

## Question 122

Given
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

How many MarkList instances are created in memory at runtime?

1. 1
2. 2
3. 3
4. 4

> The answer is 1

## Question 123

Given the code fragment:

```java
public class Test {
    public static void main(String[] args) { Test t = new Test();
        int[] arr = new int[10];
        arr = t.subArray(arr, 0, 2);
    }
    
    // insert code here
}
```

Which method can be inserted at line // insert code here to enable the
code to compile?

1.
```java
public int[] subArray(int[] src, int start, int end) {
    return src;
}
```

2.
```java
public int subArray(int src, int start, int end) {
    return src;
}
```

3.
```java
public int[] subArray(int src, int start, int end) {
    return src;
}
```

4.
```java
public int subArray(int[] src, int start, int end) {
    return src;
}
```

> The answer is 1

## Question 124
Given:

```java
public class Msg {
    public static String doMsg(char x) {
        return "Good Day!";
    }

    public static String doMsg(int y) {
        return "Good Luck!";
    }

    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }
}
```

1.
```
Good Day!
Good Luck!
```
2.
```
Good Day!
Good Day!
```

3.
```
Good Luck!
Good Day!
```

4.
```
Good Luck!
Good Luck!
```

5. Compilation fails

> The answer is 1

## Question 125

Given
```java
class X {
    int x1, x2, x3;
}

class Y extends X {
    int y1;

    Y() {
        x1 = 1;
        x2 = 2;
        y1 = 10;
    }
}

class Z extends Y {
    int z1;

    Z() {
        x1 = 3;
        y1 = 20;
        z1 = 100;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Z obj = new Z();
        System.out.println(obj.x3 + ", " + obj.y1 + ", " + obj.z1);
    }
}
```

Which constructor initializes the variable x3?
1. Only the default constructor of class X
2. Only the no-argument constructor of class Y
3. Only the no-argument constructor of class Z
4. Only the default constructor of object class

> I would say 1

## Question 126

Given the code fragment

```java
int x = 100;
        int a = x++; // 100
        int b = ++x; // 101
        int c = x++; // 101
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
        System.out.println(d);
```

What is the result?

1. 100
2. 101
3. 102
4. 103
5. Compilation fails

> The answer is 5

## Question 127
Which of the following can fill in the blank in this code to make it compile?

Exam.java
```java
public class Exam {
    void method(){

    }
}
```

OCAJP.java
```java
public class OCAJP extends Exam {
    ____ void method() {

    }
}

```

1. abstract
2. final
3. private
4. default
5. int

> The answer is 2

## Question 128

Given the code fragment
```java
public class Test {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arry[] = {1, 3, 5, 7, 8, 9};
        int index = arry.length;
        while (~code1~) {
            if (arry[index - 1] % 2 == 0) { isChecked = true;
            }
            ~code2~
        }
        System.out.print(arry[index] + ", " + isChecked);
    }
}
```

Which set of changes enable the code to print 1, true?

1. Replacing with index > 0 and replacing with index--;
2. Replacing with index > 0 and replacing with --index;
3. Replacing with index > 5 and replacing with --index ;
4. Replacing with index and replacing with --index ;

> Either 1 or 2

## Question 129

Given
```java
public class App {
    // Insert code here
       System.out.print("Welcome to the world of Java"); }    }
```

Which two code fragments, when inserted independently at line // Insert code here, enable the program to execute and print the welcome message on the screen?

1.
```java
static public void main (String[] args) {
```

2.
```java
static void main (String[] args) {
```

3.
```java
public static void Main (String[] args) {
```

4.
```java
public static void main (String[] args) {
```

5
```java
public void main (String[] args) {
```

> The answers are 4 and 1

## Question 130

Given

```java
public class TestField {
    int x;
    int y;

    public void doStuff(int x, int y) {
        this.x = x;
        y = this.y;
    }

    public void display() {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        TestField m1 = new TestField();
        m1.x = 100;
        m1.y = 200;
        TestField m2 = new TestField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
```

What is the result?
1. 100 200 : 100 200:
2. 100 0: 100 0:
3. 100 200 : 100 0:
4. 1000 :100 200:


