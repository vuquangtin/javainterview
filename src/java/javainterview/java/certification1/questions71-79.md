## Question 71

Given:
```java
public class TestDoWhile {
    public static void main(String[] args) {
        int x = 0;
        do {
            x++;
            if (x == 1) {
                continue;
            }
            System.out.println(x);
        } while (x < 1);
    }
}
```

What is the result?

1. 1
2. 0 1
3. 0
4. It prints 1 in the infinite loop.
5. The program prints nothing.

> The answer is 5


## Question 72

```java

public class Over {
    public void analyze(Object[] o) {
        System.out.println("I am an object array");
    }

    public void analyze(Object[] 1) {
        System.out.println("I am an array");
    }

    public void analyze(Object o) {
        System.out.println("I am an object");
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        new Over().analyze(nums); // line 1 }
    }
}
```

What is the output?

1. I am an array
2. The compilation fails due to an error in the line 1
3. I am an object
4. I am an object array

> The answer is 3

## Question 73

Given:
```java
import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {
    public static void main(String[] args) {
        String[] fruitNames = {"apple", "orange",
                "grape", "lemon", "apricot", "watermelon"};
        var fruits = new ArrayList<>(Arrays.asList(fruitNames));
        fruits.sort((var a, var b) -> -a.compareTo(b));
        fruits.forEach(System.out::println);
    }
}
```

What is the result?
1.
```
watermelon
orange
lemon
grape
apricot
apple
```

2. nothing
3.
```
apple
orange
grape
lemon
apricot
watermelon
```

4.
```
apple
apricot
grape
lemon
orange
watermelon
```

> The answer is 1

## Question 74

Given:
```java
public class Main {

    static Map<String, String> map = new HashMap<>();
    static List<String> keys = new ArrayList<>(List.of("A", "B", "C", "D"));
    static String[] values = {"one", "two", "three", "four"};

    static {
        for (var i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values[i]);
        }
    }

    public static void main(String[] args) {
        keys.clear();
        values = new String[0];
        System.out.println("Map: " + map.size() +
                " Keys: " + keys.size() +
                " Values: " + values.length);
    }
}
```

What is the result?
1. The compilation fails
2. Map: 0 Keys: 0 Value: 0
3. Map: 4 Keys: 0 Values: 0
4. Map: 0 Keys: 4 Value: 4
5. Map: 4 Keys: 4 Values: 4

> The answer is 3

## Question 75

Given:
```java
import java.util.*;

public class Foo {
    public List<Number> foo(Set<CharSequence> m) {
        return null;
    }
}
```

and 

```java
import java.util.*; 
public class Bar extends Foo {
	// line 1 
}
```

Which two statements can be added at line 1 in Bar to successfully compile it?

1. public List<Integer> foo(TreeSet<String> m) { ... }
2. public ArrayList<Integer> foo(Set<String> m) { ... }
3. public List<Integer> foo(Set<CharSequence> m) { ... }
4. public List<Integer> foo(Set<String> m) { ... }
5. public ArrayList<Number> foo(Set<CharSequence> m) { ... }
6. public List<Object> foo(Set<CharSequence> m) { ... }

> The answers are 1 and 5

## Question 76

Given
```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        for (String s : args) {
            System.out.println((i++) + ") " + s);
        }
    }
}

```

Executed with this command:
```shell
java Main one two three
```

What is the output of this class:

1.
```
1) one
2) two
3) three
```

2. nothing
3. 1) one
4. A java.lang.ArrayIndexOutofBoundsException is thrown
5. The compilation fails

> The answer is 1

## Question 77

Which two commands are used to identify class and module dependencies?

1. java --show-module-resolution
2. jdeps --list-deps
3. java Hello.java
4. jmod describe
5. jar --show-module-resolution

## Question 78

```java
public interface A {
    abstract void x();
}
```

```java
public abstract class B /* position 1 */ {
	/* position 2 */
    public void x() { }
    public abstract void z();
}
```


```java
public class C extends B implements A {
    /* position 3*/   
}
```

1. 
```
implements A // position 1
@Override // position 2
```
2. 
```
@Override  // position 2
public void x() { } // position 3
```

3. 
```
@Override  // position 3
public void x() { } // position 3
@Override  // position 3
public void z() { } // position 3

```

4. none
 
> The answer is 3

## Question 79

```java
void myLambda() {
   int i = 25;
   Supplier<Integer> foo = () -> i;
   i++;
   System.out.println(foo.get());
}
```

Which is true?

1. The code compiles but does not print any result.
2. The code does not compile
3. The code throws an exception at runtime.
4. The code prints 25.

> The answeir is 2. i has to be final to be accepted in the lambda expression. 