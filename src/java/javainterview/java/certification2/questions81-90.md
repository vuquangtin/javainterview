## Question 81

DoInterface.java
```java
package p1;

public interface DoInterface {
    void m1(int n); // line n1

    public void m2(int n);
}
```

DoClass.java
```java
package p3;

import p1.DoInterface;

public class DoClass implements DoInterface {
    int x1, x2;
    public DoClass() {
        this.x1 = 0;
        this.x2 = 10;
    }

    public void m1(int p1) { x1 += p1; System.out.println(x1); } // line 2

    public void m2(int p1) {  x2 += p1; System.out.println(x2); }
}
```

Test.java
```java
package p2;

import p1.DoInterface;
import p3.DoClass;

class Test {
    public static void main(String[] args) {
        DoInterface doi = new DoClass(); // line n3
        doi.m1(100);
        doi.m2(200);
    }
}
```

What is the result?

1. 
```
100
210
```
2. Compilation fails due to an error in line n1
3. Compilation fails due to an error at line n2
4. Compilation fails due to an error at line n3

> The answer is 1

## Question 82

Given the code fragment

```java
public class App {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        
        //line n1
        {
            System.out.println("Equal");
        } else{
            System.out.println("Not Equal");
        }
    }
}
```

Which code fragment, when inserted at line n1, enables the App class to print Equal?

1.
```java
String str3 = str2;
if (str1 == str3)
```

2.
```java
if (str1.equalsIgnoreCase(str2))
```

3.
```java
String str3 = str2;
if (str1.equals(str3))
 ``

4.
```java
if (str1.toLowerCase() == str2.toLowerCase())
```

> The answer is 2

## Question 83

```java
class StaticField {
    static int i = 7;

    public static void main(String[] args) {
        StaticField obj = new StaticField();
        obj.i++;
        StaticField.i++;
        obj.i++;
        System.out.println(StaticField.i + " " + obj.i);
    }
}
```

What is the result?
1. 10 10
2. 8 9
3. 9 8
4. 7 10

> The answer is 1

## Question 84

Which three are advantages of the Java exception mechanism?

1. Improves the program structure because the error handling code is separated from the normal program function
2. Provides a set of standard exceptions that covers all the possible errors
3. Improves the program structure because the programmer can choose where to handle exceptions
4. Improves the program structure because exceptions must be handled in the method in which they occurred
5. Allows the creation of new exceptions that are tailored to the particular program being created.

> The answer are 1, 3 and 5

## Question 85

Given the code fragment
```java
public static void main(String[] args) {
    String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(date);
}
```

What is the result?
1. May 04, 2014T00:00:00.000
2. 2014-05-04T00:00:00.000
3. 5/4/14T00:00:00.000
4. An exception is thrown at runtime.

> The answer is 4

## Question 86

A method is declared to take three arguments. A program calls this method and passes only two arguments. What is the results?

1. Compilation fails.
2. The third argument is given the value null.
3. The third argument is given the value void.
4. The third argument is given the value zero.
5. The third argument is given the appropriate falsy value for its declared type
6. An exception occurs when the method attempts to access the third argument.

> The answer is 1

## Question 87

Given the following code for a Planet object

```java
public class Planet {
    public String name;
    public int moons;

    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }
}
```

and the following main method:

```java
public static void main(String[] args) {
    Planet[] planets = {
            new Planet("Mercury", 0), new Planet("Venus", 0), new Planet("Earth", 1),
            new Planet("Mars", 2)};
    System.out.println(planets);
    System.out.println(planets[2]);
    System.out.println(planets[2].moons);
}
```

What is the output?

1.
```
planets
Earth
1
```
2.
```
[LPlanets.Planet;@15db9742
Earth
1
```
3.
```
[LPlanets.Planet;@15db9742
Planets.Planet@6d06d69c
1
```
4.
```
[LPlanets.Planet;@15db9742
Planets.Planet@6d06d69c
[LPlanets.Moon;@7852e922
```

5.
```
[LPlanets.Planet;@15db9742
Venus
0
```

> The answer is 3

## Question 88

Given:

Test.java
```java
class Alpha {

    public String[] main = new String[2];

    Alpha(String[] main) {
        for (int ii = 0; ii < main.length; ii++) {
            this.main[ii] = main[ii] + 5;
        }
    }

    public void main() {
        System.out.print(main[0] + main[1]);
    }
}

public class Test {
    public static void main(String[] args) {
        Alpha main = new Alpha(args);
        main.main();
    }
}
```
And the commands:
```shell
javac Test.java
java Test 1 2
```

What is the result?
1. 1525
2. 13
3. Compilation fails
4. An exception is thrown at runtime
5. The program fails to execute due to runtime error

> The answer is 1

## Question 89

Given the code fragment
```java
 double discount = 0;
int qty = Integer.parseInt(args[0]);
// line n1;
```

And given the requirements:
- If the value of the qty variable is greater than or equal to 90, discount = 0.5
- If the value of the qty variable is between 80 and 90, discount = 0.2

Which two code fragments can be independently placed at line n1 to meet the requirements?

1.
```java
if (qty >= 90) {discount = 0.5; }
if (qty > 80 && qty < 90) {discount = 0.2; }
```

2.
```java
discount = (qty >= 90) ? 0.5 : 0;
discount = (qty > 80) ? 0.2 : 0;
```
3.
```java
discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
```

4.
```java
if (qty > 80 && qty < 90) {
    discount = 0.2;
} else {
    discount = 0;
}
if (qty >= 90) {
    discount = 0.5;
} else {
    discount = 0;
}
```

5.
```java
discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
```

> The answers are 1 and 3

## Question 90

Given the code fragment

```java
LocalDate date1 = LocalDate.now();
LocalDate date2 = LocalDate.of(2014, 6, 20);
LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
System.out.println("date1 = " + date1);
System.out.println("date2 = " + date2);
System.out.println("date3 = " + date3);
``` 

Assume that the system date is June 20, 2014. What is the result?

1.
```
date1 = 2014-06-20
date2 = 2014-06-20
date3 = 2014-06-20
```

2.
```
date1 = 06/20/2014
date2 = 2014-06-20
date3 = Jun 20, 2014
```

3. Compilation fails
4. A DateParseException is thrown at runtime.

> The answer is 1

