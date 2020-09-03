## Question 41

Given
Person.java
```java
public class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

Test.java

```java
public class Test {
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(
                new Person("Hank", 45),
                new Person("Charlie", 40),
                new Person("Smith", 38)
        );
        // line n1
    }
}
```

Which code fragment, when inserted at line n1, enables the code to print Hank?

1.
```java
checkAge(iList, () -> p.getAge() > 40);
```

2.
```java
checkAge(iList, Person p -> p.getAge() > 40);
```

3.
```java
checkAge(iList, p -> p.getAge() > 40);
```

4.
```java
checkAge(iList, (Person p) -> { p.getAge() > 40; });
```

> The answer is 3

## Question 42

Given the code fragment

```java
for (int ii = 0; ii < 3; ii++) {
    int count = 0;
    for (int jj = 3; jj > 0; jj--) {
        if (ii == jj) {
            ++count;
            break;
        }
    }
    System.out.print(count);
    continue;
}
```

What is the result?

1. 011
2. 012
3. 123
4. 000

> The answer is 1


## Question 43
```java
public class MainTest {
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }

    public static void main(String[] args) {
        System.out.println("String main " + args[0]);
    }
}
```

and the commands:
```shell
javac MainTest.java
java MainTest 1 2 3
```

What is the result?

1. int main 1
2. Object main 1
3. String main 1
4. Compilation fails
5. An exception is thrown at runtime

> The answer id 3

## Question 44

Which statement best describes encapsulation?

1. Encapsulation ensures that classes can be designed so that only certain fields and methods of an object are accessible from other objects.
2. Encapsulation ensures that classes can be designed so that their methods are inheritable.
3. Encapsulation ensures that classes can be designed with some fields and methods declared as abstract.
4. Encapsulation ensures that classes can be designed so that if a method has an argument MyType x, any subclass of MyType can be passed to that method.

> The answer is 1

## Question 45

```java
String[] cartoons = {"tom", "jerry", "micky", "tom"};
int counter = 0;
if ("tom".equals(cartoons[0])) {
    counter++;
} else if ("tom".equals(cartoons[1])) {
    counter++;
} else if ("tom".equals(cartoons[2])) {
    counter++;
} else if ("tom".equals(cartoons[3])) {
    counter++;
}
System.out.print(counter);
```
What is the result?

1. 1
2. 2
3. 4
4. 0

> The answer is 1

## Question 45

```java
public class Student {
    public String name = "";
    public int age = 0;
    public String major = "Undeclared";
    public boolean fulltime = true;

    public void display() {
        System.out.println("Name: " + name + " Major: " + major);
    }

    public boolean isFullTime() {
        return fulltime;
    }
}
```

Which line of code initializes a student instance?

1. Student student1;
2. Student student1 = Student.new();
3. Student student1 = new Student();
4. Student student1 = Student();

> The answer is 3

## Question 46

```java
abstract class Planet {
    protected void revolve() { // line n1
    }

    abstract void rotate(); // n2
}
```

```java
public class Earth extends Planet {
    void revolve() { // line n3
    }

    protected void rotate(){ // line 4
    }
}
```

Which two modifications, made independently, enable the code to compile?

1. Make the method at line n1 public.
2. Make the method at line n2 public.
3. Make the method at line n3 public.
4. Make the method at line n3 protected.
5. Make the method at line n4 public.

The answers are 3 and 4

## Question 48
Given
```java
public class Painting {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Painting obj1 = new Painting();
        Painting obj2 = new Painting();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + " : " + obj2.getType());
    }
}
```
What is the result?

1. : Fresco
2. null : Fresco
3. Fresco : Fresco
4. A NullPointerException is thrown at runtime

> The answer is 2

## Question 49

Given
```java
public class Dog {
    public Dog() {
        try {
            throw new Exception();
        } catch (Exception e) {
        }
    }
}
```

and 
```java
public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d2;
        // do complex stuff
    }
}
```

How many objects have been created when the line // do complex stuff is reached?

1. Two
2. Three
3. Four
4. Six

> The answer is 3. Exceptions are objects too

## Question 50

```java
public class App {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);
        System.out.println(bool[0] + " " + bool[1]);
    }
}
```
What is the result?

1. true false
2. true null
3. Compilation fails
4. A NullPointerException is thrown at runtime.

> 1

