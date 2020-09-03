## Question 101

Given the code format

```java
class DBConfiguration {
    String user;
    String password;
}
```
and
```java
public class DBHandler {
    DBConfiguration configureDB(String uname, String password) {
        // insert code here
    }

    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }
}
```

Which code fragment must be inserted at line 6 to enable the code to compile?

1.
```java
DBConfiguration f;
return f;
```

2.
```java
return DBConfiguration;
```

3.
```java
return new DBConfiguration();
```

4.
```java
return 0;
```

> The answer is 3

## Question 102

```java
public class Test {
    public static void main(String[] args) {
        Integer num = Integer.parseInt(args[1]);
        System.out.println("Number is : " + num);
    }
}
```

And the commands:

```java
javac Test.java
java Test 12345
```

What is the result?

1. Number us : 12345
2. A NullPointerException is thrown at runtime
3. A NumberFormatException is thrown at runtime4. An ArrayIndexOutOfBoundException is thrown at runtime.

> The answer is 4

## Question 103

Given
```java
public class Series {
    private boolean flag;

    public void displaySeries() {
        int num = 2;
        while (flag) {
            if (num % 7 == 0) {
                flag = false;
            }
            System.out.print(num);
            num += 2;
        }
    }

    public static void main(String[] args) {
        new Series().displaySeries();
    }
}
```

What is the result?

1. 2 4 6 8 10 12
2. 2 4 6 8 10 12 14
3. Compilation fails
4. The program prints multiple of 2 infinite times
5. The program prints nothing.

> The answer is 5

## Question 104 

Which two are benefits of polymorphism?

1. Faster code at runtime
2. More efficient code at runtime
3. More dynamic code at runtime
4. More flexible and reusable code
5. Code that is protected from extension by other classe

> I would say 3 and 4

## Question 105

```java
public class StringReplace {
    public static void main(String[] args) {
        String message = "Hi everyone!";
        System.out.println("message = " + message.replace("e", "X"));
    }
}
```

What is the result?

1. message = Hi everyone!
2. message = Hi XvXryonX!
3. A compile time error is produced.
4. A runtime error is produced.
5. message =
6. message = Hi Xveryone!

> The answer is 2

## Question 106

```java
public class TestScope {
    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.print(" " + var1);
    }

    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }
}
```

What is the result?

1. 400 200
2. 200 200
3. 400 400
4. Compilation fails

> The answer is 1


## Question 107
Given:

```java
public class TestLoop {
    public static void main(String[] args) {
        float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;
        //line 7 insert code here
        System.out.println(isFound);
    }
}
```

Which code fragment, when inserted at line 7, enables the code print true?

1.
```java
while (key == myarray[index++]) {
    isFound = true;
}
```

2.
```java
while (index <= 4) {
    if (key == myarray[index]) {
        index++;
        isFound = true;
        break;
    }
}
```

3.
```java
while (index++ < 5) {
    if (key == myarray[index]) {
        isFound = true;
    }
}
```

4.
```java
while (index < 5) {
    if (key == myarray[index]) {
        isFound = true;
        break;
    }
    index++;
}
```

> The answer is 4. The options 3 throws an ArrayIndexOutOfBoundsException exception

## Question 108

Which three statements are benefits of encapsulation?

1. Allows a class implementation to change without changing the clients. 
2. Protects confidential data from leaking out of the objects
3. Prevents code from causing exceptions
4. Enables the class implementation to protect its invariants
5. Permits classes to be combined into the same package
6. Enables multiple instances of the same class to be created safely

> The answers are 1, 2, and 4

## Question 109

Given the code fragment:

```java
int row = 10;
for (; row > 0; ) {
    int col = row;
    while (col >= 0) {
        System.out.print(col + " ");
        col -= 2;
    }
    row = row / col;
}
```

What is the result?

1. 10 8 6 4 2 0
2. 10 8 6 4 2
3. AnArithmeticException is thrown at runtime
4. The program goes into an infinite loop outputting: 10 8 6 4 2 0. . .
5. Compilation fails

> The answer is 1

## Question 110

Given
```java
public static void main(String[] args){
    String theString = "Hello World";
    System.out.println(theString.charAt(10));
}
```

What is the result?

1. The program prints nothing
2. d 
3. A StringIndexOutOfBoundsException is thrown at runtime.
4. An ArrayIndexOutOfBoundsException is thrown at runtime.
5. A NullPointerException is thrown at runtime

