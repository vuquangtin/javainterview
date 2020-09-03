## Question 51

Given the code fragment:

```java
package question51;

import java.util.List;

public class TestLists {

    public static void main(String[] args){
        List<Integer> even = List.of();

        even.add(0, -1);
        even.add(0, -2);
        even.add(0, -3);

        System.out.println(even);
    }
}
```

What is the output?

1. [-1, -2, -3*]
2. The compilation fails.
3. A runtime exception is thrown
4. [-3, -2, -1]

> The answer is 3. List.of() returns an ImmutableCollection, so it can't be modified.

## Question 52

```java
package question52;

public interface InterfaceOne {
    void printOne();
}
```

Which three classes successfully override print.One()?

1. 

```java
package question52;

public class TestClassA implements InterfaceOne {
    private void printOne(){
        System.out.println("one");
    }
}

```
2.

```java
package question52;

public abstract class TestClassB implements InterfaceOne {
    public String printOne(){
        return "one";
    }
}
```

3.


```java
package question52;

public abstract class TestClassC implements InterfaceOne {
    public void printOne() {
        System.out.println("one");
    }
}
```

4. 

```java
package question52;

public abstract class TestClassD implements InterfaceOne {
    public abstract void printOne();
}
```

5.
```java
package question52;

public class TestClassE implements InterfaceOne {
    public void printOne() {
        System.out.println("one");
    }
}
```

6.
```java
package question52;

public class TestClassF {
    public void printOne(){
        System.out.println("one");
    }
}
```

> The answers are 3, 4 and 5.

## Question 53

Given:
```java
package question53;

public class Tester {
    public static void main(String[] args){
        String s = "this is it";
        int x = s.indexOf("is");
        s.substring(x+3);
        x = s.indexOf("is");
        System.out.println(s+" "+x);
    }
}
```

What is the result?
1. this is it 2
2. An IndexOutOfBoundsException is thrown at runtime.
3. is it 0
4. this is it 3
5. is it 1

> The answer is 1

## Question 54

Given:
```java
public class Hello {
    public static void main(String[] args){
        System.out.println(args[0]+ args[1] + args[2]);
    }
}

```

Executed using command:
```shell
java Hello “Hello World” Hello World
```

What is the output?
1. HelloHello WorldHelloWorld
2. Hello WorldHello World
3. Hello WorldHelloWorld
4. Hello World Hello World

> The answer is 3

## Question 55

Given
```java
StringBuilder s = new StringBuilder("ABCD");
```

Which would cause s to be AQCD?

1. 

```java
s.replace(s.indexOf("A"), s.indexOf("C"),"Q");
```

2.

```java
s.replace(s.indexOf("B"), s.indexOf("C"),"Q");
```

3.
```java
s.replace(s.indexOf("A"), s.indexOf("B"),"Q");
```

4.
```java
s.replace(s.indexOf("B"), s.indexOf("B"),"Q");
```

> The answer is 2

## Question 56

Given:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + "). " + args[i]);
            switch (args[i]) {
                case "one":
                    continue;
                case "two":
                    i--;
                    continue;
                default:
                    break;
            }
        }
    }
}
```

Executed with this command:

```shell
java Main one two three
```
What is the result?

1. The compilation fails.
2. It creates an infinite loop printing:
```shell
0). one 
1). two 
1). two ...
```
3. A java.lang.NullPointerException is thrown.
4. 0). one
5. 
```shell
0). one
1). two
2). three
```
## Question 57

Give:
```java
public class Employee {
	String office; 
}
```
And the code fragment:

```java
public class HRApp { // Line 1
	var employee = new ArrayList<Employee>(); // Line 2
    public var display() { // Line 3
        var empployee = new Employee(); // Line 4
        var offices = new ArrayList<>(); // Line 5
        offices.add("Chicago"); // Line 6
        offices.add("Bangalore"); // Line 7
        for (var office: offices) {  // Line 8
            System.out.println("Employee Location" + office); // Line 9
        } // Line 10
    } // Line 11
} // Line 12
```

Which two lines cause compilation errors?
1. Line 9
2. Line 7
3. Line 8
4. Lines 6
5. Line 12

> It's no clear here, assuming var is replaced it well. it would be missing the return statement

## Question 58

Given the requirement:

Module vehicle depends on module part and makes its com.vehicle package available for all other modules.

Which module-info.java declaration meets the requirement?

1. 
```
module vehicle {
   requires part;
   uses com.vehicle;
}
```

2.
```java
module vehicle { 
    requires part;
    exports com.vehicle to part;
}
```

3.
```java
module vehicle { 
   requires part;
   exports com.vehicle;
}
```

4.
```java
module vehicle {
   requires com.vehicle;
   exports part;
}
```

> The answer is 3

## Question 59

Which statement about access modifiers is correct?

1. An instance variable can be declared with the static modifier
2. An abstract method can be declared with the private modifier
3. A local variable can be declared with the final modifier.
4. An inner class can not be declared with the public modifier
5. An interface can be declared with the protected modifier.

> The answer is 3

## Question 60 (repeated from 58)

Given the requirement:

Module vehicle depends on module part and makes its com.vehicle package available for all other modules.

Which module-info.java declaration meets the requirement?

1. 
```
module vehicle {
   requires part;
   uses com.vehicle;
}
```

2.
```java
module vehicle { 
    requires part;
    exports com.vehicle to part;
}
```

3.
```java
module vehicle { 
   requires part;
   exports com.vehicle;
}
```

4.
```java
module vehicle {
   requires com.vehicle;
   exports part;
}
```

> The answer is 3
