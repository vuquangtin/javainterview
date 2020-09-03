## Question 71

Given

Acc.java
```java
package p1;

public class Acc {
    int p;
    private int q;
    protected int r;
    public int s;
}
```

Test.java
```java
package p2;

import p1.Acc;

public class Test extends Acc {

    public static void main(String[] args){
        Acc obj = new Test();
        System.out.println(obj.s);
    }
}
```

Which statement is true?

1. Both p and s are accessible by obj.
2. Only s is accessible by obj.
3. Both r and s are accessible by obj
4. p, r, and s are accessible by obj.

> The answer is 2

## Question 72

Given
```java
public class TestLoop1 {
    public static void main(String[] args) {
        int a = 0, z = 10;
        while (a < z) {
            a++;
            --z;
        }
        System.out.print(a + " : " + z);
    }
}
```

What is the result?

1. 5 : 5
2. 6 : 4
3. 6 : 5
4. 5 :4 

> The answer is 1

## Question 73

Given:
```java
boolean log3 = (5.0 != 6.0) && (4 != 5);
boolean log4 = (4 != 4) || (4 == 4);
System.out.println("log3:" + log3 + "\nlog4" + log4);
```

What is the result?
1. 
```
log3: false
log4: true
```
2. 
```
log3: true
log4: true
```

3. 
```
log3: true
log4: false
```

4. 
```
log3: false
log4: false
```

> The answer is 2

## Question 74

Given the code fragment
```java
System.out.println(2 + 4 * 9 - 3); //Line 21
System.out.println((2 + 4) * 9 - 3); // Line 22
System.out.println(2 + (4 * 9) - 3); // Line 23
System.out.println(2 + 4 * (9 - 3)); // Line 24
System.out.println((2 + 4 * 9) - 3); // Line 25
```

Which line of codes prints the highest number?

1. Line 21
2. Line 22
3. Line 23
4. Line 24
5. Line 25

## Question 75 

Consider following interface:

```java
public interface Runnable {
    public void run(int i);
}
```

Which of the following will create instance of Runnable type?

1. 
```java
Runnable run = () -> {System.out.println("Run");};
```

2.
```java
Runnable run = () -> System.out.println("Run");
```

3.
```java
Runnable run = () > System.out.println("Run");
```

4.
```java
Runnable run = > System.out.println("Run");
```

5. None of the above.

> The answer is 5

## Question 76

Given the following code for the classes MyException and Test:

MyException.java
```java
public class MyException extends RuntimeException {
}
```

Test.java
```java
public class Test {

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        }
    }

    public static void method1() { // line n1
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.print("B");
        }
    }
}
```
What is the result?
1. A
2. B
3. Either A or B
4. A B
5. A compile time error occurs at line n1

> The answer is 2. If a MyException is thrown will be catched by the catch of RuntimeException anyways

## Question 77

Given:
```java
public class SampleClass {
    public static void main(String[] args) {
        AnotherSampleClass asc = new AnotherSampleClass();
        SampleClass sc = new SampleClass();
        sc = asc;
        System.out.println("sc: " + sc.getClass());
        System.out.println("asc: " + asc.getClass());
    }
}

class AnotherSampleClass extends SampleClass {
}
```

What is the result?

1.
```
sc: class Object
asc: class AnotherSampleClass
```

2.
```
sc: class SampleClass
asc: class AnotherSampleClass
```
3.
```
sc: class AnotherSampleClass
asc: class SampleClass
```

4.
```
sc: class AnotherSampleClass
asc: class AnotherSampleClass
```

> The answer is 4

## Question 78

Given:

```java
public class Jump {
    static String args[] = {"lazy", "lion", "is", "always"};

    public static void main(String[] args) {
        System.out.println(args[1] + " " + args[2] + " " + args[3] + " jumping");
    }
}
```

and the commands
```shell
javac Jump.java
java Jump crazy elephant is always
````

What is the result?
1. lazy lion is jumping
2. lion is always jumping
3. crazy elephant is jumping
4. elephant is always jumping
5. Compilation fails

> The answer is 4

## Question 80

Given
```java
public class Test {
    static double dvalue;
    static Test ref;

    public static void main(String[] args) {
        System.out.println(ref);
        System.out.println(dvalue);
    }
}
```

What is the result?

1.
```
p1.Test.class
0.0
```

2. 
```
0.000000
```

3.
```
null
0.0
```

4. Compilation fails
5. A NullPointerException is thrown at runtime

> The answer is 3
