## Question 21

Given:
```java
public class Series {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        for (int var : arr) {
            int i = 1;
            while (i <= var) ;
            System.out.println(i++);
        }
    }
}
```

What is the result?

1.
```
1
1
1
```

2.
```
1
2
3
```

3.
```
2
3
4
```

4. Compilations fails

5. The loop executes infinite times

> The answer is 5

## Question 22

Given the following class declarations:

```java
public abstract class Animal {}
public interface Hunter {}
public class Cat extends Animal implements Hunter {}
public class Tiger extends Cat {}
```

Which answer fails to compile
1.
```java
ArrayList<Animal> myList = new ArrayList<>();
myList.add(new Tiger());
```
2.
```java
ArrayList<Hunter> myList = new ArrayList<>();
myList.add(new Cat());
```

3.
```java
ArrayList<Hunter> myList = new ArrayList<>();
myList.add(new Tiger());
```

4.
```java
ArrayList<Tiger> myList = new ArrayList<>();
myList.add(new Cat());
```

5.
```java
ArrayList<Animal> myList = new ArrayList<>();
myList.add(new Cat());
```

> The answer is 4

## Question 23

```java
// insert code here
arr[0] = new int[3];
arr[0][0] = 1;
arr[0][1] = 2;
arr[0][2] = 3;
arr[1] = new int[4];
arr[1][0] = 10;
arr[1][1] = 20;
arr[1][2] = 30;
arr[1][3] = 40;
```

Which two statements, when inserted independently at line // insert code here, enable the code to compile?

1.
```java
int[][] arr = null;
```

2.
```java
int[][] arr = new int[2];
```

3.
```java
int[][] arr = new int[2][];
```

4.
```java
int[][] arr = new int[][4];
```

5.
```java
int[][] arr = new int[2][4];
```

6.
```java
int[][] arr = new int[0][4];
```

> The answers are 3 and 5

## Question 24

Given the for loop construct:

```
for ( expr1 ; expr2 ; expr3 ) {
    statement;}
```

Which two statements are true?

1. This is not the only valid for loop construct; there exits another form of for loop constructor.
2. The expression expr1 is optional. it initializes the loop and is evaluated once, as the loop begin.
3. When expr2 evaluates to false, the loop terminates. It is evaluated only after each iteration through the loop.
4. The expression expr3 must be present. It is evaluated after each iteration through the loop.

> The answers are 1 and 2

## Question 25

Given the code fragment:

```java
int a[] = {1, 2, 3, 4, 5};
for (XXX) {
    System.out.print(a[e]);
}
```

Which option can replace xxx to enable the code to print 135?

1.
```
int e = 0; e <= 4; e++
```

2.
```
int e = 0; e < 5; e += 2
```

3.
```
int e = 1; e <= 5; e += 1
```

4.
```
int e = 1; e < 5; e +=2
```

> The answer is 2

## Question 26

Given
```java
public class X implements Z {
    @Override
    public String toString() {
        return "X ";
    }
    
    public static void main(String[] args){
        Y myY = new Y();
        X myX = myY;
        Z myZ = myX;

        System.out.println(myX);
        System.out.println((Y) myX);
        System.out.println(myZ);
    }
}

public class Y extends X {
    public String toString() {
        return "Y ";
    }
}

public interface Z {
    public String toString();
}
```

What is the output?

1. X X X
2. X Y X
3. Y Y X
4. Y Y Y

> The answer is 4

## Question 27

```java
public class ComputeSum {
    public int x;
    public int y;
    public int sum;

    public ComputeSum(int nx, int ny) {
        x = nx;
        y = ny;
        updateSum();
    }

    public void setX(int nx) {
        x = nx;
        updateSum();
    }

    public void setY(int ny) {
        x = ny;
        updateSum();
    }

    void updateSum() {
        sum = x + y;
    }
}
```

This class needs to protect an invariant on the sum field.
Which three members must have the private access modifier to ensure that this invariant is maintained?

1. The x field
2. The y field
3. The sum field
4. The ComputerSum() constructor
5. The setX() method
6. The setY() method

> The answers are 1, 2 and 3.

## Question 28

Given the code fragment:

```java
int[] array = {1, 2, 3, 4, 5};
```

And given the requirements:
- Process all the elements of the array in the order of entry. 
- Process all the elements of the array in the reverse order of entry.
- Process alternating elements of the array in the order of entry.

Which two statements are true?

1. Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.
2. Requirements 1, 2, and 3 can be implemented by using the standard for loop.
3. Requirements 2 and 3 CANNOT be implemented by using the standard for loop.
4. Requirement 1 can be implemented by using the enhanced for loop.
5. Requirement 3 CANNOT be implemented by using either the enhanced for loop or the standard for loop.

> The answers are 2 and 4

## Question 29

Given:

```java
public class Whizlabs {
    public static void main(String[] args) {
        try {
            Double number = Double.valueOf("120D");

        } catch (NumberFormatException ex) {
        }
        System.out.println(number);
    }
}
```

What is the result?
1. 120
2. 120D
3. A NumberFormatException will be thrown.
4. Compilation fails due to error at line 5.
5. Compilation fails due to error at line 8.

> The answer is 5

## Question 30

Which statement is true about the default constructor of a top- level class?

1. It can taken arguments.
2. It has private access modifier in its declaration.
3. It can be overloaded.
4. The default constructor of a subclass always invokes the no-argument constructor of its superclass.


