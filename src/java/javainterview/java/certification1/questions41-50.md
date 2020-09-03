## Question 41

Given:

```java
package question41;

public class Test {
    private int sum;

    public int compute() {
        int x = 0;
        while (x < 3) {
            sum += x++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int sum = t.compute();
        sum = t.compute();
        t.compute();

        System.out.println(sum);
    }
}
```

What is the result?

1. 9
2. 3
3. 6
4. An exception is thrown at runtime

> The answer is: 6

## Question 42

```java
package question42;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] secA = {2, 4, 6, 8, 10};
        int[] secB = {2, 4, 6, 8, 10};
        int res1 = Arrays.mismatch(secA, secB);
        int res2 = Arrays.compare(secA, secB);
        System.out.print(res1 + " : " + res2);
    }
}
```

What is the result?
1. 2 : 3 
2. 3 : 0 
3. 2 : -1 
4. -1 : 2
5. -1 : 0

> The answer is 5

## Question 43

```java
package question43;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

    private static void doA() throws IOException, IndexOutOfBoundsException {
        if (false){
            throw new FileNotFoundException();
        } else{
            throw new IndexOutOfBoundsException();
        }
    }

    public static void main(String[] args){

        try {
            doA();
        } catch (IOException e){

        }
    }
}
```

What must be added in line 1 to compile this class?

1. catch(IOException e) { }
2. catch(FileNotFoundException e) { }
catch(IndexOutOfBoundsException e) { }
3. catch(FileNotFoundException | IOException e) { }
4. catch(FileNotFoundException | IndexOutOfBoundsException e) { }
5. catch(IndexOutOfBoundsException e) { }
catch(FileNotFoundException e) { }

> The answer is 1. Turns out IndexOutOfBoundsException extends from RuntimeException and is a unchecked 
exception

## Question 44

44. Which two statements are correct about try blocks?
1. A finally block must be immediately placed after the try or catch blocks.
2. catch blocks must be ordered from generic to specific exception types
3. A try block must have a catch block and a finally block
4. A try block can have more than one catch block
5. A finally block in a try –with-resources statement executes before the resources
declared are closed.

> The answers are 2 and 4.

> Note: The resources are closed before the finally execution 

## Question 45

Given the code fragment:

```java
package question45;

public class TestChars {
    public static void main(String[] main){
        char[][] arrays = {{'a', 'd'}, {'b', 'e'}, {'c', 'f'}};
        for (char[] xx: arrays){
            for (char yy: xx){
                System.out.print(yy);
            }
            System.out.print(" ");
        }
    }
}
```

What is the result?
1. abc def
2. An ArrayIndexOutOfBoundsExceptions is thrown at runtime.
3. The compilation fails.
4. ab cd ef
5. ad be cf

> The answer is 5

## Question 46

Given:
```java
package question46;

public class Foo {

    private void print() {
        System.out.println("Bonjour le monde!");
    }

    public void foo() {
        print();
    }
}
```

and

```java
package question46;

public class Bar extends Foo {

    private void print() {
        System.out.println("Hello World");
    }

    public void bar() {
        print();
    }

    public static void main(String[] args) {
        Bar b = new Bar();
        b.foo();
        b.bar();
    }
}
```

What is the output?
1. Hello world! \n Bonjour le monde!
2. Bonjour le monde! \n Bonjour le monde!
3. Hello world! \n Hello world!
4. Bonjour le monde! \n Hello world!

> The answer is 4

## Question 47

```java
public interface A {
    public Iterable a();
}

public interface B extends A {
    public Iterable a();
}

public interface C extends A {
    public Iterable a();
}

public interface D extends B, C {
    public Iterable a();
}
```

Why does D cause a compilation error?
1. D extends more than one interface.
2. D does not define any method.
3. D inherits a() from B and C but the return types are incompatible.
4. D inherits a() only from c.

## Question 48

48. Which is the correct order of possible statements in the structure of a Java class file?
1. package, class, import
2. import, package, class
3. class, package, import
4. import, class, package
5. package, import, class

> The answer is 5

## Question 49

```java
package question49;

public class Sportcar extends Automobile {
    
    private float turbo;

    public void setTurbo(float turbo) {
        this.turbo = turbo;
    }
}
```

What is known about the Sportscar class?
1. The Sportscar subclass cannot override setTurbo method from the superclass Automobile. 
2. The Sportscar class is a superclass that has more functionality than the Automobile class.
3. The Sportscar class is a subclass of Automobile and inherits its methods.
4. The Sportscar class inherits the setTurbo method from the superclass Automobile.

> The answer is 3

## Question 50

Given the code fragment:
```java
int x = 0;
while (x < 10) {
	System.out.print(x++);
}
```

Which “for loop” produces the same output?

1. 
```java
for (int c = 0; ; c++) {
	System.out.print(c);
	if (c == 10) {
		break;
	}
}
```

2.
```java
for(int d = 0; d < 10;) {
	System.out.print(d);
	++d; 
}
```

3. 
```java
for(a; a < 10; a++) {
	System.out.print(a);
}
```

4.
```java
int b = 0;
for( ; b < 10; ) {
	System.out.print(++b); 
}
```

> The answer is 2
