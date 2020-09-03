## Question 31

Which two describe reasons to modularize the JDK?

1. Improves application robustness
2. Improves security and maintainability
3. Easier to exposes implementation details
4. Easier to understand the Java language
5. Easier to build a custom runtime linking application modules and JDK modules

## Question 32

```java
package a;

public abstract class Animal {

    protected abstract void walk();
}

```


```java

package b;

import a.Animal;

public abstract class Human extends Animal {
    
}

```

Which two lines inserted in line 1 will allow this code to compile?

1. private void walk(){}
2. protected void walk(){}
3. void walk(){}
4. abstract void walk();
5. public abstract void walk();

> Answer is 2 and 5

## Question 33

Given:


```java
public class Person {
    private String name;

    public void setName(String name) {
        String title = "Dr. ";
        name = title + name;
    }

    public String toString() {
        return name;
    }
}

```

```java
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Who");
        System.out.println(p);
    }
}

```

What is the result?
1. null
2. Dr. Null
3. Dr. Who
4. An exception is thrown at runtime

> The answer is 1

## Question 34

Given

```java
public interface ExampleInterface {}
```

Which two statements are valid to be written in this interface?

1.

```java
final void methodG(){
	System.out.println("G");
}
```

2. public int x;

3. 

```java
public void methodF(){
	System.out.println("F");
}
```

4. public abstract void methodB();
5. final void methodE();
6. private abstract void methodC();
7. public String methodD();

> invalids are 1, 3, 5, 6. The answer is 4 and 6. Although in jdk 11 you can declarate variables in interfaces. By the way, in 4 abstract is redundant

try this with jdk 11:

```java
package question34;

public interface ExampleInterface {

    public int x = 10;
    public abstract void methodB();
    public String methodD();
}
```

```java
package question34;

public class Impl implements ExampleInterface {

    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public String methodD() {
        return "methodD";
    }


    public static void main(String[] args){

        ExampleInterface i = new Impl();

        i.methodB();
        System.out.println(i.methodD());
        System.out.println(i.x);
    }
}
```

output:

```
methodB
methodD
10
```

## Question 35

Given:


```java
Package A;

public class Test {

    String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

```

and

```java
package question35.B;

import question35.A.Test;

public class Main {

    public static void main(String[] args){
        Test test = new Test("Student");
        System.out.println(test);
    }
}
```

What is the result?
1. java.lang.IllegalAccessException is thrown
2. Student
3. nothing
4. null
5. It fails to compile

> The answer is 5. `Package A;` is invalid, it should be `package A;`

## Question 36

Which describes a characteristic of setting up the Java development environment?

1. Setting up the Java development environment requires that you also install the JRE
2. You set up the Java development environment for a specific operating system when you install the JDK
3. The Java development environment is set up for all operating systems for default
4. Setting up the Java development environment occurs when you install an IDE before the JDK

## Question 37

Given:

```java
package question37;

public class Test {
    public static void main(String[] args) {
	}

    public void foo() throws FooException {
        // ....
    }
}

```

And omitting the throws FooException clause results in a compilation error.

Which statement is true about FooException?
1. The body of foo can only throw FooException
2. The body of foo can throw FooException or one of its subclasses
3. FooException is unchecked
4. FooException is a subclass of RuntimeException

> The answer is 2. RuntimeException is unchecked and is not necessary to declare throws.

> The option 4 is rewritten, it said RuntimeError instead of RuntimeException. RuntimeError
is not a class in Java.

## Question 38

Given:
```java
package question38;

public class Foo {
    public static void main(String[] args) {
        for(var x: args){
            System.out.println(x);
        }
    }
}
```

What is the type of the local variable x?
1. String[] 
2. String
3. Character 
4. char

> The answer is 2

## Question 39

Given:

```java
package question39;

import java.util.ArrayList;
import java.util.List;

public class Question39 {

    public static void main(String[] args) {
        List<String> list ...;


        list.forEach(x -> {
            System.out.println(x);
        });
    }
}
```

Whats is the type of x?
1. List<Character>
2. char
3. String
4. List<String>

> The answer is 3

## Question 40

```java
package test;

import java.time.*;

public class Diary {

    private LocalDate now = LocalDate.now();

    public LocalDate getDate(){
        return now;
    }
}
```

```java
package test;

public class Tester {

    public static void main(String[] args) {
        Diary d = new Diary();
        System.out.println(d.getDate());

    }
}
```

Which statement is true?
1. All classes from the package java.time are loaded for the class Diary
2. Class Tester does not need to import java.time.LocalDate because it is already visible to
members of the package test
3. Only LocalDate class from java.time package is loaded
4. Tester must import java.time.LocalDate in order to compile

> The answer is 3.



