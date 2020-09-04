## Mixed Questions
*******


#### 169. What are Wrapper classes in Java?

A wrapper class wraps (encloses) around a data type and gives it an object .Wrapper classes include methods to unwrap the object and give back the data type. 

List of Wrapper classes:

| PRIMITIVE DATA TYPE | WRAPPER CLASS |
| ------------------- | ------------- |
| byte                | Byte          |
| short               | Short         |
| int                 | Integer       |
| long                | Long          |
| float               | Float         |
| double              | Double        |
| char                | Character     |
| boolean             | Boolean       |

![](http://way2java.com/wp-content/uploads/2011/01/ss52.bmp)

Importance of Wrapper classes

There are mainly two uses with wrapper classes.

1. To convert simple data types into objects, that is, to give object form to a data type; here constructors are used.
2. To convert strings into data types (known as parsing operations), here methods of type parseXXX() are used.

#### 170. What is the purpose of native method in Java?

Native methods allow you to use code from other languages such as C or C++ in your java code. You use them when java doesn't provide the functionality that you need. 

For example, if I were writing a program to calculate some equation and create a line graph of it, I would use java, because it is the language I am best in. However, I am also proficient in C. Say in part of my program I need to calculate a really complex equation. I would use a native method for this, because I know some C++ and I know that C++ is much faster than java, so if I wrote my method in C++ it would be quicker. Also, say I want to interact with another program or device. This would also use a native method, because C++ has something called pointers, which would let me do that

#### 171. What is System class?

The `java.lang.System` class contains several useful class fields and methods. It cannot be instantiated.Facilities provided by System − standard output. error output streams. standard input and access to externally defined properties and environment variables.

#### 172. What is System, out and println in System.out.println method call?

System is a final class provided by java.lang package.
out refers to PrintStream class and a static member of System class.
println is a method of PrintStream class.

#### 173. What is the other name of Shallow Copy in Java?

Object Cloning. A Shallow Copy just copies the values of references in a
Class.

#### 174. What is the difference between Shallow Copy and Deep Copy in Java?

A Shallow copy just copies the values of the references in the class.
A Deep copy copies the values of the objects as well.

#### 175. What is a Singleton class?

A Singleton class in Java has maximum one instance of the class
present in JVM, all the time. The constructor of this class is written
in such a way that it never creates more than one object of same
class.

#### 176. What is the difference between Singleton class and Static class?

A static class in Java has only static methods. It is a container of
functions. It is created based on procedural programming design.

Singleton class is a pattern in Object Oriented Design. A Singleton
class has only one instance of an object in JVM. This pattern is
implemented in such a way that there is always only one instance of
that class present in JVM.
