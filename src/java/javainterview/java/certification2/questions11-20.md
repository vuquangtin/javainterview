## Question 11

Given
```java
public class Test {
    public static void main(String[] args) {
        if (args[0].equals("Hello") ? false : true) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
```

And given the commands:
```shell
javac Test.Java
java Test Hello
```

What is the result?

1. Success
2. Failure
3. Compilation fails.
4. An exception is thrown at runtime

> The answer is 2

## Question 13

Given:
```java
public class Cake {
    int model;
    String flavor;

    Cake() {
        model = 0;
        flavor = "Unknown";
    }
}
```

```java
public class Test {
    public static void main(String[] args){
        Cake c = new Cake();
        bake1(c);
        System.out.println(c.model + " " + c.flavor);
        bake2(c);
        System.out.println(c.model + " " + c.flavor);

    }

    public static Cake bake1(Cake c){
        c.flavor = "Strawberry";
        c.model = 1200;
        return  c;
    }

    public static void bake2(Cake c){
        c.flavor = "Chocolate";
        c.model = 1230;
        return;
    }
}
```

What is the result?

1.
```
0 unknown
0 unknown
```
2. 
```
1200 Strawberry
1200 Strawberry
```
3.
```
1200 Strawberry
1230 Chocolate
```

4. Compilation fails


> The answer is 3

## Question 13

```java
int i, j = 0;
i = (3 * 2 + 4 + 5);
j = (3 * ((2 + 4) + 5)); System.out.println("i:" + i + "\nj:" + j);
```

What is the result?

1.
```
i: 16
j: 33
```
2.
```
i: 15
j: 33
```
3.
```
i: 33
j: 23
```
4.
```
i: 15
j: 23
```

> The answer is 2

## Question 14 

Which two actions will improve the encapsulation of a class?

1. Changing the access modifier of a field from public to private
2. Removing the public modifier from a class declaration
3. Changing the return type of a method to void
4. Returning a copy of the contents of an array or ArrayList instead of a direct reference

> The answers are 1 and 4


## Question 15

Given the code fragment:
```java
float x = 22.00f % 3.00f; =int y = 22 % 3; System.out.print(x + ", " + y);
```

What is the result?
1. 1.0, 1
2. 1.0f, 1
3. 7.33, 7
4. Compilation fails
5. An exception is thrown at runtime

> The answer is 4

## Question 16

Given:
```java
public class Equal {
    public static void main(String[] args) {
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (String str : str2) {
            str3 = str3 + str;
        }
        boolean b1 = (str1 == str3);
        boolean b2 = (str1.equals(str3));
        System.out.print(b1 + ", " + b2);
    }
}
```

What is the result?
1. true, false
2. false, true
3. true, true
4. false, false

> The answer is 2


## Question 17
```java
public class MyClass {
    public static void main(String[] args) {
        String s = " Java Duke ";
        int len = s.trim().length();
        System.out.print(len);
    }
}
```

What is the result?

1. 8
2. 9
3. 11
4. 10
5. Compilation fails

> The answer is 2

## Question 18

The protected modifier on a Field declaration within a public class means that the field _____________.

1. Cannot be modified
2. Can be read but not written from outside the class
3. Can be read and written from this class and its subclasses only within the same package
4. Can be read and written from this class and its subclasses defined in any package

> The answer is 4

## Question 19

Given the code fragment:

```java
import java.util.ArrayList;
import java.util.List;

public class Student {

    int rollnumber;
    String name;
    List cources = new ArrayList();
    // insert code here
    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
}
```

```java
import java.util.ArrayList;
import java.util.List;

public class Student {

    int rollnumber;
    String name;
    List cources = new ArrayList();
    // insert code here
    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
}
```

Which code fragment, when inserted at line // insert code here, enables class Test to print 123 : Fred : [Java, C]?


1.
```java
private Student(int i, String name, List cs) {
    /* initialization code goes here */
}
```

2.
```java
public void Student(int i, String name, List cs) {    /* initialization code goes here */
}
```

3.
```java
Student(int i, String name, List cs) {
    /* initialization code goes here */
}
 
```

4.
```java
Student(int i, String name, ArrayList cs) {    /* initialization code goes here */
}
```

> The answer is 3.

## Question 20

Given:
```java
public class Circle {
    double radius;
    public double area;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return /* ??? */;
    }
}
```

```java
class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(17.4);
        c1.area = Math.PI * c1.getRadius() * c1.getRadius();
    }
}
```

The class is poorly encapsulated. You need to change the circle class to compute and return the area instead.

Which two modifications are necessary to ensure that the class is being properly encapsulated?

1. Remove the area field

2. Change the getArea( ) method as follows:
```java
public double getArea ( ) { return Math.PI * radius * radius; }
```

3. Add the following method:
```java
public double getArea ( ) {area = Math.PI * radius * radius; }
```

4. Change the acess modifier of the SetRadius() method to be protected.

> The answers are 1 and 2

