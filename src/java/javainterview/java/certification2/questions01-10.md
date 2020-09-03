## Question 1

Given:

```java
public class Natural {
    private int i;
    void disp(){
        while (i <= 5){
            for (int i = 1; i <= 5; ){
                System.out.print(i + " ");
                i++;
            }
            System.out.println("");
            i++;
        }
    }

    public static void main(String[] args){
        new Natural().disp();
    }
}
```

What is the result?

1. Prints 1 2 3 4 5 once
2. Prints 1 3 5 once
3. Prints 1 2 3 4 5 five times 
4. Prints 1 2 3 4 5 six times 
5. Compilation fails

> The answer is 4

## Question 2

```java
public class Base {
    // insert code here
}
```

```java
public class Derived extends Base {

    public static void main(String[] args){
        Derived obj = new Derived();
        obj.setNum(3);
        System.out.println("Square = " + obj.getNum() * obj.getNum());
    }
}
```

Which two options, when inserted independently inside class Base, ensure that the class is being properly encapsulated and allow the program to execute and print the square of the number?

1.

```java
private int num;

public int getNum() {
   return num;
}

public void setNum(int num) {
   this.num = num;
}
```

2.
```java
public int num;

protected public int getNum() {
   return num;}

protected public void setNum(int num) {
   this.num = num;
}
```

3.

```java
private int num;

public int getNum() {
   return num;
}

private void setNum(int num) {
   this.num = num;
}
```

4.
```java
protected int num;

public int getNum() {   return num;
}

public void setNum(int num) {
   this.num = num;
}
```

5.
```java
protected int num;

private int getNum() {
   return num;
}

public void setNum(int num) {   this.num = num;
}
```

> The answers are 1 and 4

## Question 3

Given:
```java
public class Overloading {
    int x(double d) {
        System.out.println("one");
        return 0;
    }

    String x(double d) {
        System.out.println("two");
        return null;
    }

    double x(double d) {
        System.out.println("three");
        return 0.0;
    }
    
    public static void main(String[] args){
        new Overloading().x(4.0);
    }
}
```
What is the result? 
1. One
2. Two
3. Three
4. Compilation fails.

> The answer is 4

## Question 4

Given:

```java
public class Whizlabs {
    public static void main(String[] args){
        String s = "A";
        switch (s){
            case "a":
                System.out.println("simaple A");
            default:
                System.out.println("default ");
            case "A":
                System.out.println("Capital A");
        }
    }
}
```

What is the result?

1. simaple A
2. Capital A
3. simaple A default Capital A 
4. simaple A default
5. Compilation fails.

> The answer is 2

## Question 5

Given
```java
public class CheckingAccount {
    public int amount;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }
}
```

And given the following main method, located in another class:

```java
public static void main(String[] args) {
   CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
   // Line 1
   System.out.println(acct.getAmount());
}
```

Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?

1. this.amount = 0;
2. amount = 0;
3. acct(0);
4. acct.amount = 0;
5. acct.getAmount() = 0;
6. acct.changeAmount(0);
7. acct.changeAmount(-acct.amount);
8. acct.changeAmount(-acct.getAmount());

> The answers are 4, 7 and 8

## Question 6

Given:

```java
public class Test {
    static String[][] arr = new String[3][];

    private static void doPrint() {
        // insert code here
    }

    public static void main(String[] args) {
        String[] class1 = {"A", "B", "C"};
        String[] class2 = {"L", "M", "N", "O"};
        String[] class3 = {"I", "J"};
        arr[0] = class1;
        arr[1] = class2;
        arr[2] = class3;
        Test.doPrint();
    }
}
```

Which code fragment, when inserted at line //insert code here, enables the code to print COJ?

1.
```java
int i = 0;
for (String[] sub : arr) {
    int j = sub.length - 1;
    for (String str : sub) {
        System.out.println(str[j]);
        i++;
    }
}
```

2.
```java
for (int i = 0; i < arr.length; i++) {
    int j = arr[i].length - 1;
    System.out.print(arr[i][j]);
}        
```

3.
```java
int i = 0;
for (String[] sub : arr[][]){
    int j = sub.length;
    System.out.print(arr[i][j]);
    i++;
}
```

4.
```java
for (int i = 0; i < arr.length - 1; i++) {
    int j = arr[i].length - 1;
    System.out.print(arr[i][j]);
    i++;
}
```

> The answer is 2

## Question 7

Given:

```java
public class Main {
    public static void main(String[] args) {
        int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj - 1; ii = ii + 2) {
            System.out.print(ii + " ");
        }
    }
}
```

What is the result?

1. 2 4
2. 0 2 4 6
3. 0 2 4
4. Compilation fails

> The answer is 3

## Question 8

Given:
```java
public class MyFo3 {
    public static void main(String[] args){
        int[] xx = null;
        for (int ii: xx){
            System.out.println(ii);
        }
    }
}
```

What is the result?
1. null
2. Compilation fails
3. An exception is thrown at runtime
4. 0

> 3. A java.lang.NullPointerException is thrown which is a RuntimeException

## Question 9

Given

```java
public class TestApp {
    public static void main(String[] args) {
        TestApp t = new TestApp();
        try {
            t.doPrint();
            t.doList();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
    }

    public void doList() throws Exception {
        throw new Error("Error");
    }

    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }
}
```

What is the result?

1.
```
Caught java.lang.RuntimeException: Exception 
Exception in thread "main" java.lang.Error: Error 
at TestApp.doList(TestApp.java: 14)
at TestApp.main(TestApp.java: 6)
```

2.
```
Exception in thread "main" java.lang.Error: Error 
at TestApp.doList(TestApp.java: 14)
at TestApp.main(TestApp.java: 6)
```

3.
```
Caught java.lang.RuntimeException: Exception
Caught java.lang.Error: Error
```

4.
```
Caught java.lang.RuntimeException: Exception
```

> The answer is 4

> Note: Error and Exception are at the same level, and both inherits Throwable

## Question

Which of the following will print current time?

1.
```java
System.out.println(new LocalTime().now());
```

2.
```java
System.out.println(new LocalTime());
```

3.
```java
System.out.print(LocalTime.now());
```

4.
```java
System.out.print(LocalTime.today());
```

5. None of the above

> The answer is 3


