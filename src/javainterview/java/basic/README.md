## Sự khác nhau giữa JDK,JRE và JVM?
## Trình biên dịch JIT là gì?
Trình biên dịch JIT (Just-In-Time) được sử dụng để tăng hiệu suất biên dịch chương trình. Trình JIT biên dịch từng phần của byte code có chức năng giống nhau tại cùng một thời điểm, do đó sẽ giảm được thời gian biên dich. Ở đây, thuật ngữ "trình biên dịch" dùng để chỉ trình dịch từ tập lệnh của một máy ảo Java (JVM) tới tập lệnh của một CPU cụ thể.
## Platform là gì?
Bất cứ môi trường phần cứng hoặc phần mềm nào mà trong đó có một chương trình chạy, thì được hiểu như là một Platform. Với môi trường runtime riêng cho mình (JRE) và API, Java được gọi là Platform
## Sự khác nhau giữa Java platform và các platform khác?
Java platform khác với hầu hết các nền tảng khác theo nghĩa nó là một nền tảng dựa trên phần mềm chạy trên các nền tảng phần cứng khác. Nó có hai thành phần:

* Môi trường thực thi (Runtime)
* API(Application Programming Interface)

## Tính chất "viết một lần chạy nhiều nơi" của java là gì?
Java code được biên dịch thành một byte code, là ngôn ngữ trung gian giữa mã nguồn và mã máy. Byte code này không phải là nền tảng cụ thể và do đó có thể được thông dịch cho bất kỳ nền tảng nào.
## Classloader trong java là gì?
Classloader là một hệ thống con của JVM được sử dụng để tải các lớp và các interface. Có rất nhiều loại Classloader ví dụ: Bootstrap classloader, Extension classloader, System classloader, Plugin classloader...
### Sự khác nhau giữa bộ nhớ heap và stack trong java?
@see https://viettuts.vn/interview/list-cau-hoi-phong-van-java-core-2

>Stack là một vùng nhớ được sử dụng để lưu trữ các tham số và các biến local của phương thức mỗi khi một phương thức được gọi ra.

>Heap là một vùng nhớ trong bộ nhớ được sử dụng để lưu trữ các đối tượng khi từ khóa new được gọi ra, các biến static và các biến toàn cục (biến instance). 

### File có tên trống ".java" có hợp lệ không?

Có, bạn có thể lưu file java với tên ".java", sau đó biên dịch bằng lệnh javac .java và chạy bằng lệnh java ten_lop. Ví dụ:

```java
class A{  
    public static void main(String args[]){  
        System.out.println("Hello java");  
    }
}  
```

Biên dịch: ```javac .java```

Run: java A 

### Các từ delete, next, main, exit và null có phải là từ khóa trong java không?

Không.

### Nếu không cung cấp bất kỳ đối số nào trên command line, thì mảng String của hàm main là empty hay null?

Mảng String là empty, không phải null. 

### Chuyện gì xảy ra nếu khai báo static public void thay vì public static void?

Chương trình được biên dịch và run đúng. 

### Giá trị mặc định của các biến local là gì?
Các biến local không được khởi tạo với bất kỳ giá trị mặc định nào, bất kể là nguyên thủy hay tham chiếu đối tượng.

### What is final keyword in Java?

*final* is a special keyword in Java that is used as a non-access modifier. A final variable can be used in different contexts such as:

* final variable

>When the final keyword is used with a variable then its value can’t be changed once assigned. In case the no value has been assigned to the final variable then using only the class constructor a value can be assigned to it.

* final method

>When a method is declared final then it can’t be overridden by the inheriting class.

* final class

>When a class is declared as final in Java, it can’t be extended by any subclass class but it can extend other class.

### What is the difference between this() and super() in Java?

In Java, super() and this(), both are special keywords that are used to call the constructor. 

|this()|	super()|
|----|----|
1. this() represents the current instance of a class	|1. super() represents the current instance of a parent/base class
2. Used to call the default constructor of the same class	|2. Used to call the default constructor of the parent/base class
3. Used to access methods of the current class	|3. Used to access methods of the base class
4.  Used for pointing the current class instance	|4. Used for pointing the superclass instance
5. Must be the first line of a block	|5. Must be the first line of a block

### Giá trị mặc định của các biến local là gì?

Các biến local không được khởi tạo với bất kỳ giá trị mặc định nào, bất kể là nguyên thủy hay tham chiếu đối tượng. 

### String vs StringBuffer vs StringBuilder

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

### What is the difference between an array and an array list?
|Array|	ArrayList|
|----|----|
Cannot contain values of different data types|	Can contain values of different data types.
Size must be defined at the time of declaration|	Size can be dynamically changed
Need to specify the index in order to add data|	No need to specify the index
Arrays are not type parameterized	|Arraylists are type 
Arrays can contain primitive data types as well as objects|	Arraylists can contain only objects, no primitive data types are allowed

### Why Java Strings are immutable in nature?

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

### Differentiate between the constructors and methods in Java?

Methods	|Constructors|
|----|----|
1. Used to represent the behavior of an object	|1. Used to initialize the state of an object
2. Must have a return type	|2. Do not have any return type
3. Needs to be invoked explicitly|	3. Is invoked implicitly
4. No default method is provided by the compiler	|4. A default constructor is provided by the compiler if the class has none
5. Method name may or may not be same as class name	|5. Constructor name must always be the same as the class name

### Difference between == and .equals() method in Java

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

### What is a Map in Java?

In Java, Map is an interface of Util package which maps unique keys to values. The Map interface is not a subset of the main Collection interface and thus it behaves little different from the other collection types. Below are a few of the characteristics of Map interface: 

* Map doesn’t contain duplicate keys.
* Each key can map at max one value.

### Tại sao String Object không thể thay đổi (**Immutable**) trong Java?

1. String pool là có thể bởi vì String là bất biến trong Java. Bằng cách này, Java Runtime tiết kiệm rất nhiều khoảng trống trong Java heap space, bởi vì các String variable khác nhau có thể tham chiếu đến cùng một biến String variable trong string pool. Nếu String không phải là bất biến, thì việc thực hiện chuỗi sẽ không diễn ra được, bởi vì nếu bất kỳ variable nào thay đổi giá trị, nó sẽ cũng gây ảnh hưởng lên các variable khác.
2. Nếu String không phải là bất biến, thì nó sẽ gây ra một mối đe dọa bảo mật nghiêm trọng cho ứng dụng. Ví dụ, tên người dùng và mật khẩu cơ sở dữ liệu được chuyển thành String để có được kết nối cơ sở dữ liệu, máy chủ lập trình trong socket và các chi tiết của portal được chuyển thành String. Vì Chuỗi không thể thay đổi nên không thể thay đổi các giá trị này. Nếu không, bất kỳ tin tặc nào cũng có thể thay đổi giá trị được tham chiếu để gây ra các vấn đề bảo mật trong ứng dụng.
3. Vì String là bất biến, nó cũng an toàn cho multithreading, và một cá thể String đơn có thể được chia sẻ qua các thread khác nhau. Điều này giúp tránh việc sử dụng đồng bộ hóa cho thread safety.
4. Các chuỗi được sử dụng trong  Java classloader, và tính bất biến bảo đảm rằng class đúng sẽ được load bởi Classloader..
5. Vì String là bất biến, nên hashcode của nó được lưu vào bộ nhớ cache tại thời điểm tạo và không cần phải tính lại. Điều này làm cho nó trở thành một ứng cử viên tuyệt vời để làm key trong map, và quá trình xử lý của nó cũng nhanh hơn các  HashMap key object khác. Đây là lý do tại sao String là object được sử dụng nhiều nhất của các  HashMap key


## What is runtime polymorphism or dynamic method dispatch?
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