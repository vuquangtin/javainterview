# Java Programmer I

## Question 11

```java
package question11;

public class pregunta11 {

    public static void main(String[] args) {
        String s = "";
        if (Double.parseDouble("11.00f") > 11) {
            s += 1;
        }
        if (1_7 == Integer.valueOf("17")) {
            s += 2;
        }
        if (1024 > 1023L) {
            s += 3;
        }
        System.out.print(s);
    }
}
```

What is the result?
1. 23
2. 12
3. 123
4. 13

> The answer is 1
>
> 1_7 is another form to write 17, you can separate numbers with _

## Question 12

Given

```java
package question12;

public class SomeClass {
    public void methodA(){
        System.out.println("SomeClass#methodA");
    }
}
```

```java
package question12;

public class AnotherClass extends SomeClass {

    public void methodA(){
        System.out.println("AnotherClass#methodA");
    }
}
```

```java
package question12;

public class Test {

    public static void main(String[] args){
        AnotherClass ac = new AnotherClass();
        SomeClass sc = new AnotherClass();

        ac = sc;

        sc.methodA();
        ac.methodA();
    }
}
```

What is the result?
1. AnotherClass#methodA()
AnotherClass#methodA()
2. AnotherClass#methodA()
SomeClass#methodA()
3. A ClassCastException is thrown at runtime
4. SomeClass#methodA()
AnotherClass#methodA()
5. SomeClass #methodA() SomeClass #methodA()
6. The compilation fails

> Answer 6, cast fails, you can't cast SomeClass into a AnotherClass
>
> Note: without the incorrect cast the output would be 1

## Question 13

```java
package question13;

public class Hello {
    /* insert code here */
}
```

Executed as:
```shell script
java question13.Hello joe
```

Which code when added to Hello class produces the output Hello Joe?

1.
```java
public static void main(String values[]) {
    System.out.println("Hello " + values[0]);
}
```

2.
```java
public static String main(String name) {
    return "Hello " + name;
}
```

3.
```java
public static void main(String[] args) {
    System.out.println("Hello " + args);
}
```

4.
```java
public static String main(String[] values) {
    return "Hello " + values;
}
```

> The answer is 1.

## Question 14

Given:
```java
package question14;

public class Price {
    public final double value;

    public Price(String value) {
        this(Double.parseDouble(values));
    }

    public Price() {
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        Price p1 = new Price("1.99");
        Price p2 = new Price("2.99");
        Price p3 = new Price();
        System.out.println(p1.getValue() + ", " + p2.getValue() + ", " + p3.getValue());
    }
}
```

What is the result?
1. 1.99,2.99
2. 1.99,2.99,0.0
3. The compilation fails
4. 1.99,2.99,0

> The answer is 3. First of all `values` is not defined, second there is no construct that accepts
> a double as argument.

## Question 15

Analyze the code:
```java
package question15;

public class Test {
    static String prefix = "Global:";
    private String name = "namescope";

    public static String getName() {
        return new Test().name;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(Test.prefix + Test.getName());
        System.out.println(new Test().prefix + new Test().name);
    }
}
```

Which two options can you inserted inside println method to produce Global:namescope?

1. Test.getName+prefix
2. prefix+Test.name
3. Test.prefix+Test.getName()
4. prefix+name
5. new Test().prefix+ new Test().name
5. Test.prefix+Test.name

> Answer are 3 and 5. Besides name is private instance property, the access occurs inside the class
> and it's allowed

## Question 16

Given:

```java
package question16.Test.t1;

public class A {
    public int x = 42;

    protected A() { } //line1
}
```

```java
package question16.Test.t2;

import question16.Test.t1.A;

public class B extends A {
    int x = 17; // line 2
    public B() { super(); } // line 3
}
```

```java
package question16.Tesst;

import question16.Test.t1.A;
import question16.Test.t2.B;

public class Tester {
    public static void main(String[] args) {
        A obj = new B(); // line 4
        System.out.println(obj.x); // line 5
    }
}
```

What is the result?
1. The compilation fails due to an error in line 3
2. 42
3. The compilation fails due to an error in line 5
4. The compilation fails due to an error in line 1
5. 17
6. The compilation fails due to an error in line 4
7. The compilation fails due to an error in line 2

> The answer is 2. Can't be 5 because the property is default and can't be access from outside
> of the package, also the datatype is A not B.

## Question 17

```java
package question17;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
```

```java
package question17;

public class Employee extends Person {
    Manager manager;

    public Employee(String name) {
        super(name);
    }

    public String toString() {
        String managerStr = this.manager == null ? "None" : this.manager.toString();
        return super.toString() + " Manager: " + managerStr;
    }
}
```

```java
package question17;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    List<Employee> reports = new ArrayList<>();

    public Manager(String name, Employee... reports) {
        this(name, null, reports);
    }

    public Manager(String name, Manager manager, Employee... reports) {

        super(name);
        this.manager = manager;
        for (Employee employee : reports) {
            employee.manager = this;
        }
        this.reports.addAll(List.of(reports));
    }

    public String toString() {
        return super.toString() + " Reports: " + reports.size();
    }
}
```

```java
package question17;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("AA", new Employee("BB"), new Employee("CC"));
        System.out.println(manager);
    }
}
```

What is the result?
1. AA
2. Nothing
3. java.lang.NullPointerException is thrown
4. AA Manager: None Reports: 2
5. AA Manager: None

> The answer is 4. AA Manager: None Reports: 2

## Question 18

A class Car is defined in the package com.foo.

The physical location of this class is /bar/com/foo/Car.class

```java
package question18.bar;

// Line 1

public class MyCar {

    Car c;

    public static void main(String[] args){

    }
}

```

Which statement inserted at line 1 makes the MyCar Class compile?

1. import com.foo;
2. import com.foo.Car;
3. import bar.com.foo.MyCar;
4. import bar.com.foo.*;

> Answer is: 2. Even when the physical location is bar/com/foo/Car.class, the package is com.foo

## Question 19

Given

```java
package question19;

public class Tester {
    public static void main(String[] args) {
        int x = 0, y = 6;
        for (; x < y; x++, y--) { //line1
            if (x % 2 == 0) {
                continue;
            }
            System.out.println(x + "-" + y);
        }
    }
}
```

What is the result?

1. 0-6 1-5 2-4
2. The compilation fails due to an error in line 1
3. 2-4
4. 1-5
5. 0-6
6. 1-5 2-4 G) 0-6 2-4

> The answer is 4

## Question 20

Given:

```java
package question20;

public class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        if (y > 2) {
            x = ++y;
            y = x + 7;
        } else {
            y++;
        }
        System.out.println(x + " " + y);
    }
}
```

What is the result?

1. 6 13
2. compilation error
3. 0 5
4. 5 12

> The answer is 1
