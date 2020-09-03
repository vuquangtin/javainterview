## Question 91

Given:
```java
class Mid {
    public int findMid(int n1, int n2) {
        return (n1 + n2) / 2;
    }
}

public class Calc extends Mid {
    public static void main(String[] args) {
        int n1 = 22, n2 = 2;
        // insert code here
        System.out.print(n3);
    }
}
```

Which two code fragments, when inserted at // insert code here, enable the code to compile and print 12?

1.
```java
Calc c = new Calc();
int n3 = c.findMid(n1, n2);
```

2.
```java
int n3 = super.findMid(n1, n3);
```

3.
```java
Calc c = new Mid();
int n3 = c.findMid(n1, n2);
```

4.
```java
Mid m1 = new Calc();
int n3 = m1.findMid(n1, n2);
```

5.
```java
int n3 = Calc.findMid(n1, n2);
```

> The answers are 1 and 4

## Question 92

Given:
```java
public class String1 {
    public static void main(String[] args) {
        String s = "123";
        if (s.length() > 2) {
            s.concat("456");
        }
        for (int x = 0; x < 3; x++) {
            s += "x";
        }
        System.out.println(s);
    }
}
```

What is the result?
1. 123
2. 123xxx
3. 123456
4. 123456xxx
5. Compilation fails

## Question 93

Given:
```java
public class ColorTest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        int count = 0;
        for (String c : colors) {
            if (count >= 4) {
                break;
            } else {
                continue;
            }
            if (c.length() >= 4) {
                colors[count] = c.substring(0, 3);
            }
            count++;
        }
        System.out.println(colors[count]);
    }
}

```

What is the result?
1. Yellow
2. Maroon
3. Compilation fails
4. A StringIndexOutOfBoundsException is thrown at runtime.

> The answer is 3. It is really cool that unreachable statements are detected at compilation time

## Question 94

Given:
```java
public class Triangle {
    static double area;
    int b = 2, h = 3;

    public static void main(String[] args) {
        double p, b, h; // line n1
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
        }
        area = p * b * h; // line n2
        System.out.println("Area is " + area);
    }
}
```

What is the result?
1. Area is 6.0
2. Area is 3.0
3. Compilation fails at line n1.
4. Compilation fails at line n2.

> The answer is 4

## Question 95

Given the code fragment:
```java
String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
```

Which code fragment prints blue, cyan, ?

1.
```java
for (String c : colors) {
    if (c.length() != 4) {
        continue;
    }
    System.out.print(c + ", ");
}
```

2.
```java
for (String c : colors[]){
    if (c.length() <= 4) {
        continue;
    }
    System.out.print(c + ", ");
}
```

3.
```java
for (String c : String[]colors){
    if (c.length() >= 4) {
        continue;
    }
    System.out.print(c + ", ");
}
```

4.
```java
for (String c : colors) {
    if (c.length() >= 4) {
        System.out.print(c + ", ");
        continue;
    }
}
```

> The answer is 1

## Question 96
```java
public class Test {
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}

```
What is the result?

1. true true
2. true false
3. false true
4. false false
5. Compilation fails

> The answer is 3

## Question 97

Given the code fragment
```java
if (aVar++ < 10){
    System.out.println(aVar + " Hello World!");
} else {
    System.out.println(aVar + " Hello Universe!");
}
```
What is the result if the integer aVar is 9?
1. 10 Hello World!
2. Hello Universe!
3. Hello World!
4. Compilation fails

## Question 98

Given:
```java
public class SuperTest {
    public static void main(String[] args) {
        // statement 1
        // statement 2
        // statement 3
    }
}

class Shape {
    public Shape() {
        System.out.println("Shape: constructor");
    }

    public void foo() {
        System.out.println("Shape: foo");
    }
}

class Square extends Shape {
    public Square() {
        super();
    }

    public Square(String label) {
        System.out.println("Square: constructor");
    }

    public void foo() {
        super.foo();
    }

    public void foo(String label) {
        System.out.println("Square: foo");
    }
}
```

What should statement1, statement2, and statement3, be respectively, in order to produce the result?

Shape: constructor
Square: foo
Shape: foo

1.
```java
Square square = new Square("bar");
square.foo("bar");
square.foo();
```
2.
```java
Square square = new Square("bar");
square.foo("bar");square.foo("bar");
```
3.
```java
Square square = new Square();
square.foo();
square.foo(bar);
```

4.
```java
Square square = new Square();
square.foo();
square.foo("bar");
```

5.
```java
Square square = new Square();square.foo();
square.foo();
```


6.
```java
Square square = new Square();
square.foo("bar");
square.foo();
```

> The answer is 6

## Question 99

Consider following method
```java
 default void print(){ }
```

Which statement is true?

1. This method is invalid.
2. This method can be used only in an interface
3. This method can return anything
4. This method can be user only in an interface or an abstract class.
5. None of above.

> The answer is 2

## Question 100
Given:
```java
interface Pet {
}

class Dog implements Pet {
}

class Beagle extends Dog {
}
```

Which three are valid?

1.
```java
Pet a = new Dog();
```

2.
```java
Pet b = new Pet();
```

3.
```java
Dog f = new Pet();
```

4.
```java
Dog d = new Beagle();
```

5.
```java
Pet e = new Beagle();
```

6.
```java
Beagle c = new Dog();
```

> The answer are 1, 4 and 5