## Question 61


Which two statements are true about the modular JDK?

1. APIs are deprecated more aggressively because the JDK has been modularized.
2. The foundational APIs of the Java SE Platform are found in the java.base module.
3. It is possible but undesirable to configure modules exports from the command line.
4. An application must be structured as modules in orden to run on the modular JDK.

> I would say 2 and 4

## Question 62

Given:
```java
public class Testser {

    public static void main(String[] args) {
        char letter = 'b';
        int i = 0;
        switch(letter) {
            case 'a':
                i++;
                break;
            case 'b':
                i++;
                break;
            case 'c' | 'd': // line 1
                i++;
                break;
            case 'e':
                i++;
                break;
            case 'f':
                i++;
                break;
            default:
                System.out.print(letter);
        }
        System.out.println(i);
    }
}
```

What is the result=

1. b2
2. b3
3. 2
4. b1
5. 1
6. 3
7. The compilation fails due to an error in line 1

> The answer is 1

## Question 63

Given:
```java
public class Tester {
    public static void main(String[] args){
        int x = 4;
        int y = 2;
        System.out.println(x+y+"=(x+y)="+x+y);
    }
}
```

What is the result?
1. 42=(x+y)=6
2. 6=(x+y)=6
3. An exception is thrown at runtime
4. 42=(x+y)=42
5. 6=(x+y)=42

> The answer is 5

## Question 64

Which describes an aspect of Java that contributes to high performance?
1. Java monitors and optimizes code that is frequently executed.
2. Java has a library of built-in functions that can be used to enable pipeline burst execution
3. Java automatically parallelizes code excecution
4. Java prioritizes garbage collection.

> I would say 4

## Question 65

Given:

```java
public class A {
    private boolean checkValue(int val){
        return true;
    }
}

```

and

```java
public class B extends A {
    public int modifyVal(int val) {
        if (checkValue(val)) {
            return val;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        B b = new B();
        System.out.println(b.modifyVal(10));
    }
}
```

What is the result?

1. 10
2. Nothing
3. It fails to compile
4. A java.lang.IllegalArgumentException is thrown
5. 0

> The answer is 3. A.checkValue is private 

## Question 66

Given

```java
public class ConSuper {
    protected ConSuper() {
        this(2);
        System.out.print("1");
    }

    protected ConSuper(int a) {
        System.out.print(a);
    }
}
```

and

```java
public class ConSub extends ConSuper {
    ConSub() {
        this(4);
        System.out.print("3");
    }

    ConSub(int a) {
        System.out.print(a);
    }

    public static void main(String[] args) {
        new ConSub(4);
    }
}
```
What is the result?

1. 214
2. 2134
3. 2143
4. 234

> The answer is 1

## Question 67

Which command line runs the main class com.acme.Main from the module com.example?

1. java --module-path mods –m com.example/com.acme.Main
2. java --module-path mods com.example/com.acme.Main
3. java -classpath com.example.jar –m com.example/com.acme.Main
4. java –classpath com.example.jar com.acme.Main

## Question 68

```java
String s1 = new String("ORACLE");
String s2 = ("ORACLE");
String s3 = s1.intern();

System.out.print((s1 == s2) + " ");
System.out.print((s2 == s3) + " ");
System.out.println(s1 == s3);
```
What is the result?

1. false true false
2. true false false
3. false false true
4. false true true

> The answer is 1

## Question 69

Given:

```java
import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class Main {
    public static void main(String[] args) {
        var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
        switch (today) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekend");
                break;
            case MONDAY: FRIDAY:
                System.out.println("Working");
            default:
                System.out.println("Unknown");
        }
    }
}
```

What is the result?
1. Working
2. Working Unknown
3. Unknown
4. The compilation fails Tuesday
5. Tuesday Unknown

> The answer is 3

## Question 70


Given:

```java
import java.util.Collection;

public class X {
    private Collection collection;
    public void set(Collection collection) {
        this.collection = collection;
    }
}
```

and 
```java
import java.util.Map;

public class Y extends X {
    public void set(Map<String, String> map){
        super.set(map); // 1
    }
}
```

Which two lines can replace line 1 so that the Y class compiles?
1. super.set(List<String> map)
2. set(map)
3. set(map.values());
4. Map.forEach ((k, v) -> set (v)));
5. super.set(map.values());

> The answers are 3 and 5


