## Question 51

```java
public class Person {
    String name;
    int age = 25;

    public Person(String name) {
        this(); // line 1
        setName(name);
    }

    public Person(String name, int age) {
        Person(name); // line 2
        setAge(age);
    }

    // setter and getter methods go here
    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
```

What is the result?

1. 
```
Jesse 25
Walter 52
```

2. Compilation fails only at line n1
3. Compilation fails only at line n2
4. Compilation fails at both line n1 and line n2

> The answer is 4

## Question 52

Given:

DoInterface.java
```java
package p1;

public interface DoInterface {
    void method1(int n1); // line n1
}
```

Test.java
```java
package p3;

import p1.DoInterface;

class DoClass implements DoInterface {

    public DoClass(int p1) { }

    @Override
    public void method1(int p1) {} // line 2

    private void method2(int p1) { } // line 3
}

public class Test {
    public static void main(String[] args) {
        DoInterface doi = new DoClass(100); // line n4 
        doi.method1(100);
        doi.method2(100);
    }
}

```

Which change will enable the code to compile?

1. Adding the public modifier to the declaration of method1 at line n1
2. Removing the public modifier from the definition of method1 at line n2
3. Changing the private modifier on the declaration of method 2 public at line n3
4. Changing the line n4 DoClass doi = new DoClass();

> Actually 3 and 4 are needed to the code compiles.


## Question 53 

Which two statements correctly describe checked exception?

1. These are exceptional conditions that a well-written application should anticipate and recover from.
2. These are exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from.
3. These are exceptional conditions that are internal to the application, and that the application usually cannot anticipate or recover from.
4. Every class that is a subclass of RuntimeException and Error is categorized as checked exception.
5. Every class that is a subclass of Exception, excluding RuntimeException and its subclasses, is categorized as checked exception.

> The answers are 1 and 5

## Question 54

Given
```java
public class TestLoop {

    public static void main(String[] args) {
        int array[] = {0, 1, 2, 3, 4};
        int key = 3;
        for (int pos = 0; pos < array.length; ++pos) {
            if (array[pos] == key) {
                break;
            }
        }
        System.out.print("Found " + key + " at " + pos);
    }
}
```

What is the result?

1. Found 3 at 2
2. Found 3 at 3
3. Compilation fails
4. An exception is thrown at runtime


## Question 55

Given the code fragment:
```java
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(5);
    String s = "";
    if (sb.equals(s)) {
        System.out.println("Match 1");
    } else if (sb.toString().equals(s.toString())) {
        System.out.println("Match 2");
    } else {
        System.out.println("No Match");
    }
}
```

What is the result?

1. Match 1
2. Match 2
3. No Match
4. A NullPointerException is thrown at runtime.

> The answer is 2. To compare a StringBuilder object you need to need to do it through toString

> Note: the argument of StringBuilder'sconstructor is the capactity.

## Question 56

Given the following array:

```java
int[] intArr = {8, 16, 32, 64, 128};
```

Which two code fragments, independently, print each element in this array?

1.
```java
for (int i : intArr) {
    System.out.print(intArr[i] + " ");
}
 
```

2.
```java
for (int i : intArr) {
    System.out.print(i + " ");
}
```

3.
```java
for (int i = 0; intArr) {
    System.out.print(intArr[i] + " ");
    i++;
}
```

4.
```java
for (int i = 0; i < intArr.length; i++) {
    System.out.print(i + " ");
}
```

5.
```java
for (int i = 0; i < intArr.length; i++) {
    System.out.print(intArr[i] + " ");
}
```

> The answers are 2 and 5

## Question 57

Which of the following can fill in the blank in this code to make it compile? (Select 2 options.)

```java
public void method() ____ Exception { 
    _____ Exception();
}
```

1. On line 1, fill in throws
2. On line 1, fill in throws new
3. On line 2, fill in throw new
4. On line 2, fill in throws
5. On line 2, fill in throws new

> The answers aare 1 and 3

## Question 58

Given the code fragment

```java
interface Contract {
}

class Super implements Contract {
}

class Sub extends Super {
}

public class Ref {
    public static void main(String[] args) {
        List objs = new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub(); // line n1
        Super s1 = new Sub();
        objs.add(c1);
        objs.add(c2);
        objs.add(s1); // line n2
        for (Object itm : objs) {
            System.out.println(itm.getClass().getName());
        }
    }
}
```

What is the result?

1.
```
Super
Sub
Sub
```

2.
```
Contract
Contract
Super
```

3. Compilation fails at line n1
4. Compilation fails at line n2

> The answers is 1

## Question 59

Given the code fragment:
```java
int nums1[] = new int[3];
int nums2[] = {1, 2, 3, 4, 5};
nums1 = nums2;
for (int x : nums1) {
    System.out.print(x + ":");
}
```

What is the result?

1. 1:2:3:4:5:
2. 1:2:3:
3. Compilation fails
4. An ArrayoutofBoundsException is thrown at runtime.

> The answer is 1

## Question 60

View the exhibit
```java
class MissingInfoException extends Exception {
}

class AgeOutofRangeException extends Exception {
}

class Candidate {
    String name;
    int age;

    Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String toString() {
        return name + " age: " + age;
    }
}
```

Given the code fragment:
```java
public class Test { //line 1
    public static void main(String[] args) { //line 2
        Candidate c = new Candidate("James", 20); //line 3
        Candidate c1 = new Candidate("Williams", 32); //line 4
        System.out.println(c); //line 5
        System.out.println(c1);//line 6
    }
}
```

Which change enables the code to print the following?
```
James age: 20
Williams age: 32
```

1. Replacing line 2 with:
```
 public static void main (String [] args) throws MissingInfoException, AgeOutofRangeException {
```

2. Replacing line 2 with:
```java
public static void main (String [] args) throws Exception {
```

3. Enclosing line 3, 4, 5 and 6 within a try block and adding:
```
catch (MissingInfoException e1) { //code goes here
}
catch (AgeOutofRangeException e2) { //code goes here}
catch(Exception e3) { //code goes here
}
```

4. Enclosing line 3 and line 4 within a try block and adding:
```java
catch (MissingInfoException e2) { //code goes here
}
catch (AgeOutofRangeException e3) {//code goes here
}
```
