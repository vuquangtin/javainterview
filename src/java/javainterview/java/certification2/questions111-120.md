## Question 111


Given
```java
public class Whizlabs {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 3, 26);
        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));
    }
}
```
What is the output?

1. 2015-03-27
2. 2015-04-27
3. 2015-02-27
4. Compilation fails due to error at line 6.
5. Compilation fails due to error at line 8.

> The answer is 1

## Question 112

Given the code fragment:
```java
int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
int sum = 0;
for (int frnt = 0, rear = lst.length - 1; frnt < 5 && rear >= 5; frnt++, rear--) {
    sum = sum + lst[frnt] + lst[rear];
}
System.out.print(sum);
```

What is the result?

1. 20
2. 25
3. 29
4. Compilations fails
5. An ArrayIndexOutOfBoundsException is thrown at runtime

> The answer is 1

## Question 113

Given
```java
class Base {
    public static void main(String[] args) {
        System.out.println("Base " + args[2]);
    }
}

public class Sub extends Base {
    public static void main(String[] args) {
        System.out.println("Overriden " + args[1]);
    }
}
```

and the commands
```shell
javac Sub.java
java Sub 10 20 30
```
What is the result?

1. Base 30
2. Overriden 20
3.
```
Overriden 20
Base 30
```
4.
```
Base 30
Overriden 20
```

> The answer is 2

## Question 114

Which three statements are true about the structure of a Java class?

1. A class can have only one private constructor.
2. A method can have the same name as a field.
3. A class can have overloaded static methods.
4. A public class must have a main method.
5. The methods are mandatory components of a class.
6. The fields need not be initialized before use.

> The answers are 2, 3 and 6

## Question 115

```java
public class Test {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case "7":
                System.out.print("Uranus");
            case "6":
                System.out.print("Saturn");
            case "1":
                System.out.print("Mercury");
            case "2":
                System.out.print("Venus");
            case "3":
                System.out.print("Earth");
            case "4":
                System.out.print("Mars");
            case "5":
                System.out.print("Jupiter");
        }
    }
}
```
Which two modifications, made independently, enable the code to compile and run?

1. Adding a break statement after each print statement
2. Adding a default section within the switch code-block
3. Changing the string literals in each case label to integer
4. Changing the type of the variable day to String
5. Arranging the case labels in ascending order

> The answers are 3 and 4

## Question 116

Given the fragment:
```java
float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 14_56.02f;
float var2 = var1 + 1024;
System.out.print(var2);
```

What is the result?

1. 13480.0
2. 13480.02
3. Compilation fails
4. An exception is thrown at runtime

> The answer is 1

## Question 117
```java
public class App {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i / 5;
        System.out.print(i + " : " + j + " : " + k);
    }
}
```

What is the result?

1. 10 : 22 : 20
2. 10 : 22 : 22
3. 10 : 22 : 6
4. 10 : 30 : 6

> The answer is 2

## Question 118
Given the code fragment

```java
public static void main(String[] args) { // line 1
    int x = 5;                           // line 2
    while (isAvailable(x)){              // line 3
        System.out.print(x);             // line 4
                                         // line 5
    }                                    // line 6
}                                        // line 7
                                         // line 8
public static boolean isAvailable(int x) { // line 9
    return x-- > 0 ? true : false;       // line 10
}                                        // line 11
```

Which modification enables the code to print 54321?

1. Replace line 4 with System.out.print(--x);
2. At line 5, insert x--;
3. Replace line 4 with --x; and, at line 5, insert System.out.print(x);
4. Replace line 10 With return (x > 0) ? false : true;

> The answer is 2

## Question 119

Given
```java
class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    public void start() {
        init();
        System.out.println("Started");
    }
}

public class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
        c.init();
    }
}
```

What is the result?

1. 
```
Initialized
Started
```
2.
```
Initialized
Started
Initialized
```

3. Compilation fails
4. An exception is thrown at runtime

> The answer is 3

## Question 120

Given:
```java
interface Readable {
    public void readBook();

    public void setBookMark();
}

abstract class Book implements Readable { // line n1
    public void readBook() {
    }
    // line n2
}

class EBook extends Book { // line n3
    public void readBook() {
    }
    // line n4
}
```

Which options enable the code to compile?

1. Replace the code fragment at line n1 with:
```java
class Book implements Readable {
```
2. At line n2 insert:
```java
public abstract void setBookMark();
```

3. Replace the code fragment at line n3 with:
```java
abstract class EBook extends Book{
```

4. At line n4 insert:
```java
public void setBookMark() { }
```

> The answers aare 2


