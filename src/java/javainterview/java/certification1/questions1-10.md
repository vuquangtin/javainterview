# Java Programmer I

## Question 1

```java
package question1;

public abstract class Media {
    int duration;
    int volume;
    int contrast;
    String title;

    abstract void play();

    abstract void stop();

    abstract void changeVolume(int x);

    abstract void changeContrast(int x);

    abstract void changeTitle(String title);
}
```

```java
package question1;

public interface Audio {
}

```

```java
package question1;

public interface Video {
}

```

```java
package question1;


public class MediaFormat1 extends Media implements Audio {

    @Override
    void play() {

    }

    @Override
    void stop() {

    }

    @Override
    void changeVolume(int x) {

    }

    @Override
    void changeContrast(int x) {

    }

    @Override
    void changeTitle(String title) {

    }
}

```

```java
package question1;


public class MediaFormat2 extends Media implements Video {

    @Override
    void play() {

    }

    @Override
    void stop() {

    }

    @Override
    void changeVolume(int x) {

    }

    @Override
    void changeContrast(int x) {

    }

    @Override
    void changeTitle(String title) {

    }
}

```

```java
package question1;


public class MediaFormat3 extends Media implements Video, Audio {

    @Override
    void play() {

    }

    @Override
    void stop() {

    }

    @Override
    void changeVolume(int x) {

    }

    @Override
    void changeContrast(int x) {

    }

    @Override
    void changeTitle(String title) {

    }
}

```

Examine these specifications:
- MediaFormat1 is audio-only. Users should have the ability to change the volumen, but not the contrast. Assume contrast is fixed at 0.
- MediaFormat2 is video-only Users should have the ability to change the volumen, but not the contrast. Assume volumen is fixed at 0.
- MediaFormart3 contains both audio and video. Users should have the ability to adjust both volumen and contrast.

Which two changes would allow you to achieve these specifications?
1. move int volumen from media to audio
2. move int contrast from Media to Video
3. make media an interface rather tan an abstract class
4. move changeVolume from Media to Video
5. move changeContrast from Media to Video
6. make Media, rather tan MediaFormat1, MediaFormat2, and MediaFormat3 implement Audio and Video

> Unresolved

## Question 2

### Given

```java
public class Super 
{
    static String greeting() { 
        return "Good Night"; 
    }
    
    String name() { 
        return "Harry"; 
    } 
}
```

and

```java
class Sub extends Super 
{
    static String greeting() { 
        return "Good Morning"; 
    }

    String name() { 
        return "Potter"; 
    } 
}
```

and
```java
class Test 
{
    public static void main(String[] args) 
    {
        Super s = new Sub(); 
        System.out.println(s.greeting() + ", " + s.name());
    } 
}
```

### What is the result?
1. Good Morning, Harry
2. Good Night, Potter
3. Good Night, Harry
4. Good Morning, Potter


> The answer is: 2
>
> Take care of static and instance method's. Java favors static methods of the data type, and 
>instance methods to the instance.

## Question 3

### Given

```java
public class Test 
{
    public static void main(String[] args) { 
        Person person = new Person("Duke", 23);
    }
}
```
and
```java
class Person {
    String name;
    int age;
    Person(String name, int age) {
        //line 1 
    }
}
```

### Which code should be insert in line 1 to set the value to name and age when the person object is instantiated?

1. super.name = this.name; super.age = this.age;
2. name = name; age = age;
3. name = this.name; age = this.age
4. this.name = name; this.age = age;

> Answer is: 4
>
> can't be 1, because super has no properties.
>
> can't be 2, because the setting is to the same local variable.
>
> can't be 3, because this.name and this.age are instance's fields and don't have value


## Question 4 about primitives and wrappers

### Given
```java
public class TestArray {
    private static final int size = 4;
    public static void main(String[] args) {
        int[] arrint = new int[size]; 
        Integer[] arrInt = new Integer[size]; 
        System.out.println(arrint[2]);
        System.out.println(arrInt[2]);
    }
}
```
### What is the result?

1. 0 0
2. null null
3. An ArrayIndexOutOfBoundException is thrown
4. null 0
5. 0 null

> Answer is: 5
>
> int primitives are always initialized to 0
>
> the wrapper Integer is initialized to null 

## Question 5 about strings

### given
```java
public class pregunta5 {
    String s = "www.oracle.com"; 
    /* insert code here */
    for (String o: tokens) { 
        System.out.print(o + " ");
    }
}
```

### Which statement when inserted in line 7 prints www oracle com?

1. String[] tokens = s.split("\\.");
2. String[] tokens = s.strip("\\..");
3. String[] tokens = s.split("\\s", -1);
4. String[] tokens = s.strip(".");

> The answer is: 1.
> 
> strip doesn't take arguments and returns a string, not an array of String
> the option 3 returns the same string

### Questions 6: Exceptions

Given:
```java
package question6;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        try {
            doA();
            doB();
        } catch (IOException e) {
            System.out.print("c");
            return;
        } finally {
            System.out.print("d");
        }
        System.out.print("f");
    }

    public static void doA() {
        System.out.print("a");
        if (false) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static void doB() throws FileNotFoundException {
        System.out.print("b");
        if (true) {
            throw new FileNotFoundException();
        }
    }
}
```

What is the result?
1. abcd
2. The compilation fails
3. abdf
4. abd
5. adf

> The answer is: 1.
>
> _f_ is never printed because of the return. However, _d_ is printed because 
> the finally block is always executed.

### Question 7
```java
package question7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pregunta7 {
    public static final int[] VALUES = {1, 2, 3};
    private static final Integer[] PRIVATE_VALUES = {1, 2, 5, 4};
    public static final List<Integer> LIST_VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
```

Which two statements are true?

1. The array myArray2 can be modified by other defining classes 
2. The elements of myArray2 cannot be modified
3. The array myArray1 can be modified
4. The array myArray2 and the elements can be modified
5. The list VALUES can be modified through myArray2
6. The elements of myArray1 can be modified by other classes

### Question 8

Given:
```java
package question8;

public class MethodTest {
    // line 1
}
```

Which two method implementations are correct, when inserted independently in line 1?

1. 
```java
public void methodC(int x) {
    return ++x;`
}
```

2. 
```java
public char methodE(String msg) {
    return msg; 
}
```

3. 
```java
public void methodA() { 
    System.out.println("methodA");
}
```

4.
```java
public String methodB(int x) {
    System.out.println("methodB"); 
}
```

5. 
```java
public boolean methodD(int x) { 
    return x > 0;
}
```

> Answers are: 3 y 5
>
> can't be 1, because it doesn't have to return nothing but it has a return
> can't be 2, because returns a String instead of a char
> can't be 4, because it has to return a String and returns nothing.

### Question 9

Given
```java
package question9.pkgA;

public class A {

    int i = 10;
    protected int j = 12;
    public int k = 8;
}
```

and
```java
package question9.pkgB;

import question9.pkgA.A;

public class B extends A {

    public static void main(String[] args) {
        B ob = new B();

        System.out.println(" " + ob.i); // Line 1
        System.out.println(" " + ob.j); // Line 2
        System.out.println(" " + ob.k); // Line 3
    }
}
```

Where does the compilation fail?
1. only at Line n2
2. at Line n2 and Line n3
3. only at Line n1
4. at Line n1 and Line n2

> Answer is: 3
>
> _i_ is not public, cannot be accesed from outside package. Actually _i_ is default.
> To define a property as default you omits the visibility accesor
>
> _j_ is protected and B inherited
>
> _k_ is public and can be accessed from anywhere

### Question 10

```java
package question10;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Kale");
        vegetables.add(0, "Lettuce");
        System.out.println(vegetables);

        List<char> fish = new ArrayList<>();
        fish.add("Salmon");
        fish.add(0, "Seabass");
        System.out.println(fish);
    }
}
```

Whats is the result?
1. [Lettuce, Kale] [Seabass, Salmon]
2. A compilation error is thrown
3. [Lettuce, Kale]
4. [Kale , Lettuce] [Salmon , Seabass]

> Answer is: 2, you can't use a primitive as argument of a List
>
> Note: if it fixed the answer would be 1.

### Question 11

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
