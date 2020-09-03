## Question 131

```java
public static void main(String[] args) {
    String ta = "A ";
    ta = ta.concat("B ");
    String tb = "C ";
    ta = ta.concat(tb);
    ta.replace('C', 'D');
    ta = ta.concat(tb);
    System.out.println(ta);
}
```

What is the result?

1. A B C D
2. A C D
3. A B C
4. A B D
5. A B D C
6. A B C C 

> The answer is 6

## Questio 132

```java
public class Test {
    public static void main(String[] args) {
        // line n1
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
```

Which three code fragments can be independently inserted at line nl to enable the code to print one?

1. byte x = 1;2. short x = 1;
3. String x = "1";
4. long x = 1;
5. double x = 1;
6. Integer x = new Integer("1");

> The answers are 1,2 and 6

## Question 133

```java
class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle {
    String trans;

    Car(String trans) { // line n1
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans); //line n2
    }
}
```

And given the code fragment:

```java
public static void main(String[] args) {
    Car c1 = new Car("Auto");
    Car c2 = new Car("4W", 150, "Manual");
    System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
    System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
}
```

What is the result?
1. 
```
4W 100 Auto
4W 150 Manual
```

2.
```
null 0 Auto
4W 150 Manual
```

3. Compilation fails only at line n1
4. Compilation fails only at line n2
5. Compilation fails only at line n1 and line n2

> The answer is 5. Any constructor of Car has to invoke super. Also you can't call super and this at 
the same constructor

## Question 134

Given

```java
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("SE");
    list.add("EE");
    list.add("ME");
    list.add("SE");
    list.add("EE");
    list.remove("SE");
    System.out.print("Values are : " + list);
}
```

What is the result?
1. Values are : [EE, ME]
2. Values are : [EE, EE, ME]
3. Values are : [EE, ME, EE]
4. Values are : [SE, EE, ME, EE]
5. Values are : [EE, ME, SE, EE]

> The answer is 5

## Question 135


Given:
```java
import java.util.ArrayList;
import java.util.List;

public class Whizlabs {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(15);
        list.add(30);
        list.add(11);
        list.add(2);
        // insert here
        System.out.println(list);
    }
}
```

Which inserted at line 11, will provide the following output?
[21, 15, 11]

1. list.removeIf(e > e % 2 != 0);2. list.removeIf(e -> e % 2 == 0);
3. list.remove(e -> e % 2 == 0);
4. None of the above.

> The answer is 2

## Question 136
Traveler.java
```java
class Tours{
    public static void main(String[] args) {
        System.out.println("Happy journey!" + args[1]);
    }
}

public class Traveler {
    public static void main(String[] args) {
        Tours.main(args);
    }
}
```

And the commands:
```shell
javac Traveler.java
java Traveler Java Duke
```

1. Happy Journey! Duke
2. Happy Journey! Java
3. An exception is thrown at runtime
4. The program fails to execute due to a runtime error

> The answer is 1

## Question 137

Given the code fragment

```java
String color = "teal";
switch (color) {
    case "Red":
        System.out.print("Found Red ");
    case "Blue":
        System.out.print("Found Blue ");
        break;
    case "Teal":
        System.out.print("Found Teal ");
        break;
    default:
        System.out.print("Found Default ");
}
```


What is  the result?
1. Found Red Found Default
2. Found Teal
3. Found Red Found Blue Found Teal
4. Found Red Found Blue Found Teal Found Default
5. Found Default

> The answer is 5

## Question 138

Given
```java
public class FieldInit {
    char c;
    boolean b;
    float f;

    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }
}
```

What is the result?

1.
```
c = nullb = false
f = 0.0F
```

2.
```
c = nullb = false
f = 0.0f
```

3.
```
c = nullb = true
f = 0.0
```

4.
```
c = b = false
f = 0.0
```

> The answer is 4

## Question 139

```java
public static void main(String[] args) throws Exception {
    String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
            if (arr[i][j].equals("B")) {
                break;
            }
        }
        continue;
    }
}
```

What is the result?

1. A B C
2. A B C D E
3. A B D E
4. Compilation fails

> The aswer is 3

## Question 140

Which two are Java Exception classes? 

1. SecurityException
2. DuplicatePathException
3. IllegalArgumentException
4. TooManyArgumentsException

> The answers are 1 and 3

## Question 141

```java
package question141;

class Alpha {
    int ns;
    static int s;

    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}

public class TestA {

    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

```

What is the result?

1.
```
ns = 50  s = 125 
ns = 125 s = 125ns = 100 s = 125
```

2. 
```
ns = 50  s = 125
ns = 125 s = 125
ns = 0   s = 125
```

3.
```
ns = 50  s = 50 
ns = 125 s = 125
ns = 100 s = 100
```

4.
```
ns = 50  s = 50
ns = 125 s = 125
ns = 0   s = 125
```

> The answer is 2. Keep it mind that the printing occurs after all operations

