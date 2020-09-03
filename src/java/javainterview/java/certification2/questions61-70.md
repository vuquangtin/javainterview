## Question 61

Given 

```java
public class Case {
    public static void main(String[] args) {
        String product = "Pen";
        product.toLowerCase();
        product.concat(" BOX".toLowerCase());
        System.out.print(product.substring(4, 6));
    }
}
```

What is the result?

1. box
2. nbo
3. bo
4. nb
5. An exception is thrown at runtime

> The answer is 5

## Question 62

Given the code fragment

```java
List<String> names = new ArrayList<>();
names.add("Robb");
names.add("Bran");
names.add("Rick");
names.add("Bran");
if (names.remove("Bran")) {
    names.remove("Jon");
}
System.out.println(names);
```
What is the result?

1. [Robb, Rick, Bran]
2. [Robb, Rick]
3. [Robb, Bran, Rick, Bran]
4. An exception is thrown at runtime.

> The answer is 1

## Question 63

Given the code fragment:

```java
int var1 = -5;
int var2 = var1--;
int var3 = 0;
if (var2 < 0) {
    var3 = var2++;
} else {
    var3 = --var2;
}
System.out.println(var3);
```

What is the result?

1. -6
2. -4
3. -5
4. 5
6. 4
7. Compilation fails

> The answer is 3

## Question 64 

Which statement is/are true?
- A. Default constructor only contains "super();" call.
- B. We can't use any access modifier with a constructor.
- C. A constructor should not have a return type.


1. Only I.
2. Only II.
3. Only I and II. 
4. Only I and III. 
5. ALL

> The answer is 4.

## Question 65

Given the following main method

```java
public static void main(String[] args) {
    int num = 5;
    do {
        System.out.print(num-- + " ");
    } while (num == 0);
}
```

1. 5 4 3 2 1 0
2. 5 4 3 2 1
3. 4 2 1
4. 5
5. Nothing is printed

> The answer is 4

## Question 66

Given the following code:

```java
public static void main(String[] args) {
    String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
    System.out.print(planets.length + " ");
    System.out.print(planets[1].length());
}
```

What is the output?

1. 4 4
2. 3 5
3. 4 7
4. 5 4
5. 4 5
6. 4 21

> The answer is 5

## Question 66

Which code fragment cause a compilation error?

1.
```java
float flt = 100F;
```
2.
```java
float flt = (float) 1_11.00;
```
3.
```java
float flt2 = 100;
```
4.
```
double y1 = 203.22;
float flt3 = y1;
```
5.
```
int y2 = 100;
float flt = (float) y2;
```

> The answer is 4

## Question 68

Consider
```java
Integer number = Integer.valueOf("808.1");
```

Which is true about the above statement?

1. The value of the variable number will be 808.1
2. The value of the variable number will be 808
3. The value of the variable number will be 0.
4. A NumberFormatException will be throw.
5. It will not compile

> The answer is 4

## Question 69

Which statement will empty the contents of a StringBuilder variable named sb?

1. sb.deleteAll();
2. sb.delete(0, sb.size());
3. sb.delete(0, sb.length());
4. sb.removeAll();

> The answer is 3

## Question 70

Which of the following exception will be thrown due to the statement given here

1. NullPointerException
2. NegativeArraySizeException
3. ArrayIndexOutOfBoundsException
4. IndexOutOfBoundsException
5. This statement does not cause any exception.

> The answer is 2









