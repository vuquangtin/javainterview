## What is final keyword in Java?

*final* is a special keyword in Java that is used as a non-access modifier. A final variable can be used in different contexts such as:

* final variable

>When the final keyword is used with a variable then its value can’t be changed once assigned. In case the no value has been assigned to the final variable then using only the class constructor a value can be assigned to it.

* final method

>When a method is declared final then it can’t be overridden by the inheriting class.

* final class

>When a class is declared as final in Java, it can’t be extended by any subclass class but it can extend other class.

## What is the difference between this() and super() in Java?

In Java, super() and this(), both are special keywords that are used to call the constructor. 

|this()|	super()|
|----|----|
1. this() represents the current instance of a class	|1. super() represents the current instance of a parent/base class
2. Used to call the default constructor of the same class	|2. Used to call the default constructor of the parent/base class
3. Used to access methods of the current class	|3. Used to access methods of the base class
4.  Used for pointing the current class instance	|4. Used for pointing the superclass instance
5. Must be the first line of a block	|5. Must be the first line of a block

## Giá trị mặc định của các biến local là gì?

Các biến local không được khởi tạo với bất kỳ giá trị mặc định nào, bất kể là nguyên thủy hay tham chiếu đối tượng. 

## String vs StringBuffer vs StringBuilder

1. _String is immutable whereas StringBuffer and StringBuilder are mutable classes._
2. _StringBuffer is thread-safe and synchronized whereas StringBuilder is not. That’s why StringBuilder is faster than StringBuffer._
3. _String concatenation operator (+) internally uses StringBuffer or StringBuilder class._
4. _For String manipulations in a non-multi threaded environment, we should use StringBuilder else use StringBuffer class._


|Factor	|String	|StringBuilder	|StringBuffer|
|----|----|----|----|
Storage Area	|Constant String Pool|	Heap Area|	Heap Area
Mutability|	Immutable|	Mutable	|Mutable
Thread Safety|	Yes|	No	|Yes
Performance	|Fast|	More efficient|	Less efficient|

## What is the difference between an array and an array list?
|Array|	ArrayList|
|----|----|
Cannot contain values of different data types|	Can contain values of different data types.
Size must be defined at the time of declaration|	Size can be dynamically changed
Need to specify the index in order to add data|	No need to specify the index
Arrays are not type parameterized	|Arraylists are type 
Arrays can contain primitive data types as well as objects|	Arraylists can contain only objects, no primitive data types are allowed

## Why Java Strings are immutable in nature?

> In Java, string objects are immutable in nature which simply means once the String object is created its state cannot be modified. Whenever you try to update the value of that object instead of updating the values of that particular object, Java creates a new string object. Java String objects are immutable as String objects are generally cached in the String pool. Since String literals are usually shared between multiple clients, action from one client might affect the rest. It enhances security, caching, synchronization, and performance of the application. 


### What is the difference between Array list and vector in Java?

|ArrayList|Vector|
|---------|------|
|Array List is not synchronized.|	 Vector is synchronized.|
Array List is fast as it’s non-synchronized.|	Vector is slow as it is thread safe.
If an element is inserted into the Array List, it increases its Array size by 50%.|	Vector defaults to doubling size of its array.
Array List does not define the increment size.|Vector defines the increment size.
Array List can only use Iterator for traversing an Array List.|	Vector can use both Enumeration and Iterator for traversing.

### What are the differences between Heap and Stack Memory in Java?

The major difference between Heap and Stack memory are:

|Features	|Stack	|Heap|
|----|----|----|
|Memory|	Stack memory is used only by one thread of execution.|	Heap memory is used by all the parts of the application.
Access|	Stack memory can’t be accessed by other threads.	|Objects stored in the heap are globally accessible.
Memory Management|	Follows LIFO manner to free memory.	|Memory management is based on the generation associated with each object.
Lifetime|	Exists until the end of execution of the thread.|	Heap memory lives from the start till the end of application execution.
Usage|	Stack memory only contains local primitive and reference variables to objects in heap space.	|Whenever an object is created, it’s always stored in the Heap space.

## Differentiate between the constructors and methods in Java?

Methods	|Constructors|
|----|----|
1. Used to represent the behavior of an object	|1. Used to initialize the state of an object
2. Must have a return type	|2. Do not have any return type
3. Needs to be invoked explicitly|	3. Is invoked implicitly
4. No default method is provided by the compiler	|4. A default constructor is provided by the compiler if the class has none
5. Method name may or may not be same as class name	|5. Constructor name must always be the same as the class name

## Difference between == and .equals() method in Java

In general both equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

1. Main difference between .equals() method and == operator is that one is method and other is operator.
2. We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
3. If a class does not override the equals method, then by default it uses equals(Object o) method of the closest parent class that has overridden this method. See this for detail

Coding Example:

```java
package javainterview.java.core.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
// Java program to understand
// the concept of == operator
public class EqualsTest {
	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

```

Output:

```
false
true
```
Explanation: Here we are creating two objects namely s1 and s2.

* Both s1 and s2 refers to different objects.
* When we use == operator for s1 and s2 comparison then the result is false as both have different addresses in memory.
* Using equals, the result is true because its only comparing the values given in s1 and s2.

Let us understand both the operators in detail:

_Equality operator(==)_

We can apply equality operators for every primitive types including boolean type. we can also apply equality operators for object types.

```java
package javainterview.java.core.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

// Java program to illustrate
// == operator for compatible data
// types
public class EqualsTest2 {
	public static void main(String[] args) {
		// integer-type
		System.out.println(10 == 20);

		// char-type
		System.out.println('a' == 'b');

		// char and double type
		System.out.println('a' == 97.0);

		// boolean type
		System.out.println(true == true);
	}
}

```

Output:
```
false
false
true
true
```

If we apply == for object types then, there should be compatibility between arguments types (either child to parent or parent to child or same type). Otherwise we will get compile time error.

```java
package javainterview.java.core.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

// Java program to illustrate
// == operator for incompatible data types
public class EqualsTest3 {
	public static void main(String[] args) {
		Thread t = new Thread();
		Object o = new Object();
		String s = new String("GEEKS");

		System.out.println(t == o);
		System.out.println(o == s);

		// Uncomment to see error
		System.out.println(t == s);
	}
}

```

Output:
	
```
false
false
// error: incomparable types: Thread and String

```

_.equals()_

In Java, string equals() method compares the two given strings based on the data/content of the string. If all the contents of both the strings are same then it returns true. If all characters are not matched then it returns false. 

```java
package javainterview.java.core.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class EqualsTest4 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;

		String s1 = new String("GEEKS");
		String s2 = new String("GEEKS");

		System.out.println(t1 == t3);
		System.out.println(t1 == t2);
		System.out.println(s1 == s2);

		System.out.println(t1.equals(t2));
		System.out.println(s1.equals(s2));
	}
}

```

Output:
```
true
false
false
false
true
```

Explanation: Here we are using .equals method to check whether two objects contains the same data or not.

* In the above example, we are creating 3 Thread objects and 2 String objects.
* In the first comparison, we are checking that t1 == t3 or not. As we know that both t1 and t3 pointing to same object that’s why it returns true.
* In second comparison, we are using operator “==” for comparing the String Objects and not the contents of the objects. Here, both the objects are different and hence the outcome of this comparison is “False”
* When we are comparing 2 String objects by .equals() operator then we are checking that is both objects contains the same data or not.
* Both the objects contains the same String i.e. GEEKS that’s why it returns true.

## What is a Map in Java?

In Java, Map is an interface of Util package which maps unique keys to values. The Map interface is not a subset of the main Collection interface and thus it behaves little different from the other collection types. Below are a few of the characteristics of Map interface: 

* Map doesn’t contain duplicate keys.
* Each key can map at max one value.

## Tại sao String Object không thể thay đổi (**Immutable**) trong Java?

1. String pool là có thể bởi vì String là bất biến trong Java. Bằng cách này, Java Runtime tiết kiệm rất nhiều khoảng trống trong Java heap space, bởi vì các String variable khác nhau có thể tham chiếu đến cùng một biến String variable trong string pool. Nếu String không phải là bất biến, thì việc thực hiện chuỗi sẽ không diễn ra được, bởi vì nếu bất kỳ variable nào thay đổi giá trị, nó sẽ cũng gây ảnh hưởng lên các variable khác.
2. Nếu String không phải là bất biến, thì nó sẽ gây ra một mối đe dọa bảo mật nghiêm trọng cho ứng dụng. Ví dụ, tên người dùng và mật khẩu cơ sở dữ liệu được chuyển thành String để có được kết nối cơ sở dữ liệu, máy chủ lập trình trong socket và các chi tiết của portal được chuyển thành String. Vì Chuỗi không thể thay đổi nên không thể thay đổi các giá trị này. Nếu không, bất kỳ tin tặc nào cũng có thể thay đổi giá trị được tham chiếu để gây ra các vấn đề bảo mật trong ứng dụng.
3. Vì String là bất biến, nó cũng an toàn cho multithreading, và một cá thể String đơn có thể được chia sẻ qua các thread khác nhau. Điều này giúp tránh việc sử dụng đồng bộ hóa cho thread safety.
4. Các chuỗi được sử dụng trong  Java classloader, và tính bất biến bảo đảm rằng class đúng sẽ được load bởi Classloader..
5. Vì String là bất biến, nên hashcode của nó được lưu vào bộ nhớ cache tại thời điểm tạo và không cần phải tính lại. Điều này làm cho nó trở thành một ứng cử viên tuyệt vời để làm key trong map, và quá trình xử lý của nó cũng nhanh hơn các  HashMap key object khác. Đây là lý do tại sao String là object được sử dụng nhiều nhất của các  HashMap key


## What is runtime polymorphism or dynamic method dispatch?
>Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

Let's first understand the upcasting before Runtime Polymorphism.

### Upcasting:-

When reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:

```java
class A{}

class B extends A{}

A a=new B();//upcasting

```

### Example of Runtime Polymorphism:-

In this example, we are creating two classes vehical and pulsor. pulsor class extends vehical class and overrides its run() method. We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, subclass method is invoked at runtime.

note: Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism

```java
class vehical{

void run(){System.out.println("running");}

}

class pulsor extends vehical{

	void run(){System.out.println("running safely with 60km");}
	
	public static void main(String args[]){
	
	vehical b = new pulsor(); //upcasting
	
	b.run();

}

}
```

## What is difference between dependency injection and factory design pattern?
## Difference between Adapter and Decorator pattern?
## Difference between Adapter and Proxy Pattern?
## What is Template method pattern?
## When do you use Visitor design pattern?
## When do you use Composite design pattern?
## The difference between Inheritance and Composition?
## Difference between Abstract factory and Prototype design pattern?
## What is Adapter pattern? When to use it?
## The difference between nested public static class and a top level class in Java?
## Give me an example of design pattern which is based upon open closed principle?
## Can you explain Liskov Substitution principle?
## What is Law of Demeter violation? Why it matters?
## When do you use Flyweight pattern?
## The difference between nested static class and top level class?
## The difference between DOM and SAX parser in Java?
## What is the difference between an object-oriented programming language and object-based programming language?
## Difference between Static binding and Dynamic binding in java ?

## Exception in java
<img src='../../../../resources/images/ex.png'/>

## ArrayList vs Vector vs LinkedList
<img src='../../../../resources/images/list.jpeg'/>

 1. ArrayList is implemented as a re-sizable array. It's elements can be accessed directly by 
    using the get and set methods, since ArrayList is essentially an array.
 2.  LinkedList is implemented as a double linked list. Its performance on 
     add and remove is better than Arraylist, but worse on get and set methods.
 3. Vector is similar with ArrayList, but it is synchronized. ArrayList is a
    better choice if your program is thread-safe.
    Vector and ArrayList require space as more elements are added. 
    Vector each time doubles its array size, while ArrayList grow 50% of its size 
    each time. LinkedList, however, also implements Queue interface which adds more
    methods than ArrayList and Vector, such as offer(), peek(), poll(), etc.  

## Java Basics
1. **What is the difference between an Interface and an Abstract class?**

    Both define an interface that has to be implemented. Abstract class can contain concrete methods as well as abstract. Abstract class can contain regular class fields. Interface can contain only public static final fields.

2. **What is the purpose of garbage collection in Java, and when is it used?**

    GC in Java is the mechanism that keeps track of memory and objects residing in memory. GC collects the object when it is no longer needed (usually when no references to the object are available).

3. **What is the difference between a constructor and a method?**

    We can say that constructor is a special kind of method that instantiates the object. The main differences are

 * Special treatment of constructors when they are called (memory allocation, superclass constructors chain)
 * More caution is required when writing a constructor

4. **State the significance of public, private, protected, default modifiers both singly and in combination and state the effect of package relationships on declared items qualified by these modifiers.**

 * public  
        class -- accessible from anywhere. Can be subclassed by anyone (if not declared final)  
        method -- accessible from anywhere. Can be overriden in subclasses.  
        variable -- accessible from anywhere. Usually not a good practice except for the constants  
        inner class -- accessible from anywhere.  
        nested class -- accessible from anywhere.  
 * private  
        class -- only for inner classes.  
        method -- accessible only from the class where it is declared. Cannot be overridden  
        variable -- accessible only from the class where it is declared  
        inner class -- same  
        nested class -- same  
 * protected  
        class -- only for inner classes  
        method -- accessible from the same package or from any subclass  
        variable -- same  
        inner class -- same  
        nested class -- can be written but doesn't make sense (protected static!?)  
 * default (no access modifier)  
        class -- only this package and subclasses in this package  
        method -- same  
        variable -- same  
        inner class -- same  
        nested class -- same 

5. **What is an abstract class?**

    An abstract class is a java class that has one or more abstract methods (no body). Abstract classes cannot be instantiated. Abstract class defines an interface that has to be implemented by all its subclasses.

6. **What is static in java?**

    static is Java Language keyword.  
    a) When used with a method defines a method of a class.  
    b) When used with a field defines a class field.  
    c) When used on an nested class declaration defines a static nested class.  
    d) Also can be used for static initialization block.  
    e) Can be used as a static initialization block

7. **What is final?**

    final is Java Language keyword.  
    a) When used with a method protects it from being overridden in subclasses. Done for security and/or performance reasons.  
    b) When used with a field means that the value stored in the field cannon be changed after initialization. Not to be confused with immutability of the object.  
    c) When used with a class declaration protects it from being subclassed. Done for security and/or performance reasons. Also for immutability. Many of Java core classes are final (e.g. String)

8. **How can one prove that the array is not null but empty using one line of code?**

```java
array == null ? xx : array.length == 0
```

 * if the array is instance field it's initialized to null. And this code works.
 * if the array is local variable the compiler will generate an error if it has not been initialized

9. **What environment variables do I need to set on my machine in order to be able to run Java programs?**

    CLASSPATH, PATH and/or JAVA_HOME

10. **Do I need to import java.lang package any time? Why ?**

    No. It is imported by default

11. **Can I import same package/class twice? Will the JVM load the package twice at runtime?**

    Yes you can declare import twice in the import section.
    No it will not be loaded twice at runtime.

12. **What is Overriding?**

    Changing method behavior in the subclasses.

13. **What are different types of inner classes?**

    if declared with static -- it's nested class. Nested classes are fairly independent and treated as top-level classes. But the constructor call is different.
    To construct one: new OuterClassNeme.InnerClassName().

    if declared without static -- inner class. Each instance of inner class can only exist within an instance of the outer class.
    To construct one: instanceOfOuterClass.new InnerClassName()

    local class -- declared and visible only within a block of code
    anonymous -- same, but they don't even have a name.

14. **Are the imports checked for validity at compile time? e.g. will the code containing an import such as java.lang.ABCD compile?**

    Yes, they are checked. No it won't compile.

15. **Does importing a package imports the sub-packages as well? e.g. Does importing com.MyTest.* also** import com.MyTest.UnitTests.*?

    No. This declaration will only import classes located directly in com.MyTest package.

16. **What is the difference between declaring a variable and defining a variable?**

    Declaring is declaring. Defining is assigning some value to the declared vaiable.

17. **What is the default value of an object reference declared as an instance variable?**

    null

18. **Can a top level class be private or protected?**

    No. It is only allowed to be public or to have default access modifier.

19. **What type of parameter passing does Java support?**

    Java passes all parameters by values. The references to objects are passed by values.

20. **Primitive data types are passed by reference or pass by value?**

    See above

21. **Objects are passed by value or by reference?**

    See above

22. **What are pass by reference and pass by value?**

    Pass by reference -- a reference to the Object is passed to the method.
    Pass by value -- a copy of the actual value of the Object is passed to the method. The method is then unable to modify the original Object. (Not true in Java. In Java references to objects are passed by value)

23. **Give a simplest way to find out the time a method takes for execution without using any profiling tool?**

    System.currentTimeMillis() in the beginning and end of the method

24. **Is Empty .java file a valid source file?**

    Yes it is.

25. **Can a .java file contain more than one java classes?**

    Yes it can. It has to contain only one top level public java class but it can contain any number of inner, anonymous and top level classes with default access modifier.

26. **Is String a primitive data type in Java?**

    No. String is an Object. An immutable one.

27. **Is main a keyword in Java?**

    No. main is the name of the method that is treated in special way if declared properly.

28. **Is next a keyword in Java?**

    No. next() is method of Iterator or Enumeration interface.

29. **Is delete a keyword in Java?**

    No. delete is not a keyword. And I cannot even remember a class that has a method called delete(). Rather remove()

30. **Is exit a keyword in Java?**

    No. exit() is a method of java.lang.System class

31. **What happens if you dont initialize an instance variable of any of the primitive types in Java?**

    It gets assigned the default value. 0 for int and long, 0.0 for float and double, false for boolean. Though I tried to compile a class where variables were not initialized and it didn't compile.

32. **What are the different scopes for Java variables?**

    static fields, instance fields, method parameters, local variables

33. **What is the default value of the local variables?**

    No default value. Default values are assigned to instance fields. Local variables have to be explicitly initialized.

34. **Does garbage collection guarantee that a program will not run out of memory?**

    No. Not at all. Example: recursive call. Or just create lots of objects until you get OutOfMemoryError (or is it an exception?)

35. **What is the purpose of finalization?**

    Free up the resources. (e.g. close connections and streams, release a lock etc)

36. **Can a public class MyClass be defined in a source file named YourClass.java?**

    no. Unless it is a nested class public class.

37. **What will be the output of the following statement? System.out.println ("1" **+ 3);**

    13

38. **What will be the default values of all the elements of an array defined as an instance variable?**

    All elements will be initialized to default value of corresponding type.

39. **Length in bytes for primitive types**

    | Primitive type| length in bytes  | Comment                                 |
    | :------------ |:----------------:| ---------------------------------------:|
    | boolean       | 1 bit            |  saved as 4 bytes; 1 byte in an array   |
    | char          | 2 bytes          |  unsigned                               |
    | byte          | 1 byte           |                                         |
    | short         | 2 bytes          |                                         |
    | int           | 4 bytes          |                                         |
    | long          | 8 bytes          |                                         |
    | float         | 4 bytes          |                                         |
    | double        | 8 bytes          |                                         |


40. **Contract between equals() and hashCode()**

    if a.equals(b) returns true then a.hashCode() == b.hashCode() is also true. Note that equal hashCode doesn't mean anything.

41. **What different between StringBuffer and StringBuilder?**

    StringBuilder -- new. StringBuffer -- old. StringBuffer -- synchronized. Where possible use StringBuilder.
    Both represent mutable sequence of characters.

42. **What internal methods of String do you know?**

    static methods of String class: valueOf
    indexOf, lastIndexOf, replace, contains, startsWith, endsWith, substring
    matches, split
    equals, isEmpty

43. **Purpose, types and creation of nested classes**

    Types of nested classes see above.
    Purpose:
    If a package-private top-level class (or interface) is used by only one class, consider making the top-level class a private nested class of the sole class that uses. This reduces its accessibility from all the classes in its package to the one class that uses it. But it is far more important to reduce the accessibility of a gratuitously public class than of a package-private top-level class: the public class is part of the package’s API, while the package-private top-level class is already part of its implementation.
    One common use of a static member class is as a public helper class, useful only in conjunction with its outer class
    If an instance of a nested class can exist in isolation from an instance of its enclosing class, then the nested class must be a static member class: it is impossible to create an instance of a nonstatic member class without an enclosing instance.
    One common use of a nonstatic member class is to define an Adapter that allows an instance of the outer class to be viewed as an instance of some unrelated class.
    For example, implementations of the Map interface typically use nonstatic member classes to implement their collection views, which are returned by Map’s keySet, entrySet, and values methods. Similarly, implementations of the collection interfaces, such as Set and List, typically use nonstatic member classes to implement their iterators.[Effective Java]
    A common use of private static member classes is to represent components of the object represented by their enclosing class. For example, consider a Map instance, which associates keys with values. Many Map implementations have an internal Entry object for each key-value pair in the map.
    One common use of anonymous classes is to create function objects on the fly. For example, the sort method invocation sorts an array of strings according to their length using an anonymous Comparator instance.
    To recap, there are four different kinds of nested classes, and each has its place. If a nested class needs to be visible outside of a single method or is too long to fit comfortably inside a method, use a member class. If each instance of the member class needs a reference to its enclosing instance, make it nonstatic; otherwise, make it static. Assuming the class belongs inside a method, if you need to create instances from only one location and there is a preexisting type that characterizes the class, make it an anonymous class; otherwise, make it a local class.

44. **What does it mean that an object or a class is mutable or immutable?**

    Immutability: the state of the object doesn't change

45. **Is it enough to define this class as final? To make this class immutable?**

    No. If the class is declared final it only means that it cannot be subclassed. If the instance of the class is declared to be final it only means that the reference will not change. The inner state of the object in both cases can change.

46. **Besides “String” do you know any other immutable classes?**

    BigDecimal, BigInteger all classes that correspond to primitive types
    java.awt.Color

47. **Increasing/descreasing of methods visibility (inheritence)**

    The main rule is that visibility cannot be reduced in the subclass

48. **You need to create the string, which contains 1,000,000 **random numbers, comma separated. How would** you do that, considering performance?

    I would use StringBuilder class

49. **Garbage collection principles**

    The garbage collector first performs a task called marking. The garbage collector traverses the application graph, starting with the root objects; those are objects that are represented by all active stack frames and all the static variables loaded into the system. Each object the garbage collector meets is marked as being used, and will not be deleted in the sweeping stage. The sweeping stage is where the deletion of objects take place.

50. **Java de-compiler, when it could be helpful except studying, learning, stealing**

    Recovering lost sources?TODO????????

51. **How is the virtual space divided in Java?**

    http://stackoverflow.com/questions/1262328/how-is-the-java-memory-pool-divided
    http://docs.oracle.com/javase/6/docs/technotes/guides/management/jconsole.html

52. **What difference between float and BigDecimal. How they store the data?**

    float is floating point number and can loose precision during the computations.
    BigDeciamal is fixed point number. The computations (which type of computations?) are guaranteed to maintain the needed precision.
    Internally BigDecimal consists of an arbitrary precision integer unscaled value and a 32-bit integer scale
    If no rounding mode is specified and the exact result cannot be represented, an exception is thrown

53. **What is deep copy of a Java object?**

    Deep copy creates a copy of the object including deep copies of all its fields.

54. **What are utilities for JVM monitoring? What is Jconsole?**

    From http://docs.oracle.com/javase/6/docs/technotes/tools/

    jvisualvm --  A graphical tool that provides detailed information about the Java technology-based applications (Java applications) while they are running in a Java Virtual Machine. Java VisualVM provides memory and CPU profiling, heap dump analysis, memory leak detection, access to MBeans, and garbage collection.See Java VisualVM for more information.

    jconsole --    A JMX-compliant graphical tool for monitoring a Java virtual machine. It can monitor both local and remote JVMs. It can also monitor and manage an application.

    jps --    Experimental: JVM Process Status Tool - Lists instrumented HotSpot Java virtual machines on a target system.

    jstat -- Experimental: JVM Statistics Monitoring Tool - Attaches to an instrumented HotSpot Java virtual machine and collects and logs performance statistics as specified by the command line options.

    jstatd -- Experimental: JVM jstat Daemon - Launches an RMI server application that monitors for the creation and termination of instrumented HotSpot Java virtual machines and provides a interface to allow remote monitoring tools to attach to Java virtual machines running on the local system.

    jhat -- Experimental - Heap Dump Browser - Starts a web server on a heap dump file (eg, produced by jmap -dump), allowing the heap to be browsed.

    jmap -- Experimental - Memory Map for Java - Prints shared object memory maps or heap memory details of a given process or core file or a remote debug server.

    jsadebugd -- Experimental - Serviceability Agent Debug Daemon for Java - Attaches to a process or core file and acts as a debug server.

    jstack -- Experimental - Stack Trace for Java - Prints a stack trace of threads for a given process or core file or remote debug server.

    Never used any of these tools yet. :(

55. **How and in what cases we need to configure sizes of memory areas in Java?**

    In case of getting OutOfMemoryError: Java heap space. What other cases?
    JVM parameter -Xmx###m where ### is number of megabytes you need for the JVM.
    -Xms###m to set the initial heap size
    More info on this topic can be found here: http://blog.codecentric.de/en/2011/03/java-memory-configuration-and-monitoring-3rd-act/

56. **What is an Object and how do you allocate memory to it?**

    Object is the base class in Java. Object in general case is an instance of a class. The memory is allocated when new operator is executed. The minimum size is 8 bytes (thats what you get if you call new Object). Each primitive data type takes 4 bytes, except double and long, which take 8 bytes.

58. **What are methods and how are they defined?**

    Method is an abstraction that defines how a specific computation has to be carried out. Method "abstracts away" the code it contains.

59. **What is the use of bin and lib in JDK?**

    bin -- all java binaries: javac, java, appletviewer, jconsole...
    lib -- java libraries

60. **What is casting?**

    changing the type of the object.

61. **In how many ways can an argument be passed to a subroutine and explain them?**

    only one. By value. See above

62. **What is the difference between an argument and a parameter?**

    parameter -- abstract. argument -- concrete value of the parameter.
    parameters of the function are defined when the function is declared
    arguments of the funciton are defined when it is called

63. **What is final, finalize() and finally?**

    final -- Java keyword, see above
    finalize() -- gets called before the object is GC-ed
    finally -- Java keyword used in exception handling.

64. **What is UNICODE?**

    See info on Unicode here http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/Character.html

65. **What is finalize() method?**

    See above.

66. **What are Transient and Volatile Modifiers?**

    Transient signifies that the field is not part of the object state (e.g. it's some derieved value or some cache). Transient fields are not present in serialized representation of the object.
    If field is declared with volatile keyword then any thread that reads the field will see the most recently written value [Effective Java Item 66]

67. **What is difference between overloading and overriding?**

    overloading -- adding a method with the same name but different signature
    overriding -- changing the method implementation in the subclass

68. **What is meant by Inheritance and what are its advantages?**

    Inheritance is one of principles of OOP. It allows to create class hierarchies. Classes can inherit methods and properties from the base classes thus increasing code reuse.

69. **What is the difference between this() and super()?**

    this() calls the constructor of current class.
    super() calls the superclass constructor
    super() has to be the first statement of subclass constructor;
    this and super are references to the current object and to current object treated as superclass.
    this.new Something() has to be used to create inner classes

70. **What is the difference between superclass and subclass?**

    Obvious.

71. **What modifiers may be used with top-level class?**

    only public or default (package-private)

72. **What is a package?**

    In Java package is a mechanism to oragnize classes into modules.

73. **What is a reflection package?**

    Not sure the question is clearly stated. What I would answer is pasted from javadoc of java.lang.reflect
    Provides classes and interfaces for obtaining reflective information about classes and objects. Reflection allows programmatic access to information about the fields, methods and constructors of loaded classes, and the use reflected fields, methods, and constructors to operate on their underlying counterparts on objects, within security restrictions.

74. **What is the difference between Integer and int?**

    Integer is a wrapper class for int primitive type. Integer can be used in generic collections whereas int cannot. Also contains a number of utility methods.

75. **What is a cloneable interface and how many methods does it contain?**

    Cloneable -- is a marker interface and it doesn't contain any methods. It determines the behavior of Object’s protected clone implementation: if a class implements Cloneable, Object’s clone method returns a field-by-field copy of the object; otherwise it throws CloneNotSupportedException

76. **Can you have an inner class inside a method and what variables can you access?**

    You can create a local or anonymous class inside the method. It can access only final variables.

77. **What is the difference between String and StringBuffer?**

78. **What is the difference between a while statement and a do statement?**

    do is guaranteed to execute at least once.

79. **What is the difference between static and non-static variables?**

    a) The way they are initialized. Static are initalized when the class is loaded. Non-static -- when it's instantiated.
    b) Non-static belong to the instance of an object while static are class variables.
    c) Static are accessed using ClassName.varName

80. **How does Java handle integer overflows and underflows?**

    It goes down to the MIN_INT value in case of overflow and to MAX_INT in case of overflow

Main method
---------------
1. **Can an application have multiple classes having main method?**

    Yes it can. But only one main method will be used as the entrance point for the program.

2. **Can I have multiple main methods in the same class?**

    No, if you mean public static void main(String[] args).
    Yes, if you mean a method with a name "main" and any other signature

3. **What if the main method is declared as private?**

    The class will compile. But the method cannot be used as the entrance point

4. **What if the static modifier is removed from the signature of the main method?**

    It becomes an instance method. No longer an entrance point but just a valid regular method.

5. **What if I write static public void instead of public static void?**

    Nothing happens. Class compiles. Method runs.

6. **What if I do not provide the String array as the argument to the method?**

    You just define a static method called "main" with no parameters. It cannot be used as entrance point.

7. **What is the first argument of the String array in main method?**

    These are the parameters passed to the program from command line.

8. **If I do not provide any arguments on the command line, then the String array of Main method will be** empty or null?

    Array of size 0

9. **Can main method be declared final?**

    Yes it can be declared as final.