## Java Design Patterns
******


#### 59. When will you use Strategy Design Pattern in Java?
Strategy pattern is very useful for implementing a family of algorithms. It is a behavioral design pattern. With Strategy pattern we can select the algorithm at runtime. We can use it to select the sorting strategy for data. We can use it to save files in different formats like- .txt, .csv, .jpg etc.
In Strategy pattern we create an abstraction, which is an interface through which clients interact with our system. Behind the abstraction we create multiple implementation of same interface
with different algorithms.
For a client, at runtime we can vary the algorithm based on the type
of request we have received.
So we use Strategy pattern to hide the algorithm implementation
details from client.
In Java Collections.sort() method uses strategy design pattern.


#### 60. What is Observer design pattern?
In Observer design pattern, there is a Subject that maintains the list
of Observers that are waiting for any update on the Subject. Once
there is an update in Subject it notifies all the observers for the
change.

E.g. In real life, students are waiting for the result of their test. Here
students are the observers and test is the subject. Once the result of
test is known, testing organization notifies all the students about
their result.

The most popular use of Observer pattern is in Model View
Controller (MVC) architectural pattern.
Main issue with Observer pattern is that it can cause memory leaks.
The subject holds a strong reference to observers. If observers are
not de-registered in time, it can lead to memory leak.


#### 61. What are the examples of Observer design pattern in JDK?

In JDK there are many places where Observer design pattern is
used. Some of these are as follows:
1. `java.util.Observer`, `java.util.Observable`
2. `javax.servlet.http.HttpSessionAttributeListener`
3. javax.servlet.http.HttpSessionBindingListener
4. All implementations of java.util.EventListener, and also in
Swing packages
5. javax.faces.event.PhaseListener


#### 62. How Strategy design pattern is different from State design pattern in Java?
State design pattern is a behavioral design pattern that is use for
defining the state machine for an object. Each state of an object is
defined in a child class of State class. When different actions are
taken on an Object, it can change its state.

Strategy pattern is also a behavioral pattern, but it is mainly used
for defining multiple algorithms. With same action of a client, the
algorithm to be used can change.

Some people consider State pattern similar to Strategy pattern,
since an Object changes its Strategy with different method
invocations. But the main difference is that in State pattern internal
state of an Object is one of the determining factors for selecting the
Strategy for change of state.

Where as in Strategy pattern, client can pass some external
parameter in input during method invocation that determines the
strategy to be used at run time.

Therefore State pattern is based on the Object’s internal state,
where as Strategy pattern is based on Client’s invocation.
State pattern is very useful in increasing the maintainability of the
code in a large code-base.


#### 63. Can you explain Decorator design pattern with an example in Java?
Some people call Decorator pattern as Wrapper pattern as well. It
is used to add the behavior to an object, without changing the
behavior of other objects of same class.

One of the very good uses of Decorator pattern is in `java.io`
package. We can have a FileInputStream to handle a File. To add
Buffering behavior we can decorate `FileInputStream`
with
`BufferedInputStream`. To add the gzip behavior `BufferedInputStream`
we can decorate it with `GzipInputStream`. To add serialization
behavior to `GzipInputStream`, we can decorate it with
`ObjectInputStream`.
E.g.
Open a FileInputStream:
```java
FileInputStream fis = new FileInputStream("/myfile.gz");
```
Add buffering:
```java
BufferedInputStream bis = new BufferedInputStream(fis);
```
Add Gzip:
```java
GzipInputStream gis = new GzipInputStream(bis);
```
Add Serialization:
```java
ObjectInputStream ois = new ObjectInputStream(gis);
```
So with each step we have decorated the FileInputStream with
additional behavior.


#### 64. What is a good scenario for using Composite design Pattern in Java?
Some of the good scenarios where Composite design pattern can be
used are as follows:

**Tree Structure**: The most common use of Composite design pattern
is Tree structure. If you want to represent data in a Tree data
structure, Composite pattern can be used.

E.g. In an Organization, to a Manager has Employees. But Manager
is also an Employee. If we start from CEO level, there is one big
tree for the whole organization structure. Under that big tree there
are many sub-trees. This can be easily represented with Composite
design pattern.

**Recursion**: Another use of Composite design pattern is Recursion. If
we have a Recursion based algorithm, we need data to be passed to
algorithm in a data structure that treats individual objects and
compositions at each level of recursion uniformly.
E.g. To implement a recursive Polynomial Solving algorithm, we
can use Composite design pattern to store the intermediate results.
**Graphics**: Another good use of Composite design pattern is in
Graphics. We can group shapes inside a composite and make
higher-level groups of smaller groups of shapes to complete the
graphics to be displayed on screen.


#### 65. Have you used Singleton design pattern in your Java project?
Yes. Singleton is one of the most popular design patterns in enterprise level Java applications. Almost in every project we see
some implementation of Singleton. 

With Singleton pattern we can be sure that there is only one instance
of a class at any time in the application.

This helps in storing properties that have to be used in the
application in a unique location.


#### 66. What are the main uses of Singleton design pattern in Java project?
Some of the main uses of Singleton design pattern in Java are as
follows:
1. Runtime: In JDK, java.lang.Runtime is a singleton-based class. There
is only one instance of Runtime in an application. This is the only
class that interfaces with the environment/machine in which Java
process is running.
2. Enum: In Java, enum construct is also based on Singleton pattern.
Enum values can be accessed globally in same way by all classes.
3. Properties: In an application it makes sense to keep only one copy of
the properties that all classes can access. This can be achieved by
making properties class Singleton so that every class gets same copy
of properties.
4. Spring: In Spring framework, all the beans are by default Singleton
per container. So there is only one instance of bean in a Spring IoC
container. But Spring also provides options to make the scope of a
bean prototype in a container.


#### 67. Why java.lang.Runtime is a Singleton in Java?
In Java, java.lang.Runtime is implemented on Singleton design
pattern.

Runtime is the class that acts as an interface with the environment in
which Java process is running. Runtime contains methods that can
interact with the environment.

Like- totalmemory() method gives the total memory in JVM.
maxMemory() method gives the maximum memory that JVM can
use.

There is an exit() method to exit the Java process. We do not want
multiple objects in JVM to have exit() method.
Similarly there is gc() method that can run the Garbage Collector.
With only one copy of gc() method, we can ensure that no other
object can run the Garbage Collector when one instance of GC is
already running.

Due to all these reasons there is only one copy of Runtime in Java.
To ensure single copy of Runtime, it is implemented as a Singleton
in Java.


#### 68. What is the way to implement a thread-safe Singleton design pattern in Java?
In Java there are many options to implement a thread-safe Singleton
pattern. Some of these are as follows:
1. **Double Checked Locking**: This is the most popular method
to implement Singleton in Java. It is based on Lazy Initialization. In this we first check the criteria for locking before acquiring a lock to create an object. In Java we use it with volatile keyword.
Sample code:
```java
class DoubleCheckSingleton {
    private volatile HelloSingleton helloSingleton; // Use Volatile
    public HelloSingleton getHelloSingleton() {
        HelloSingleton result = helloSingleton;
        if (result == null) {
            synchronized(this) { // Synchronize for thread safety
                result = helloSingleton;
                if (result == null) {
                    result = new HelloSingleton();
                    helloSingleton = result;
                }
            }
        }
        return result;
    }
}
```
2. **Bill Pugh Singleton**: We can also use the method by Bill
Pugh for implementing Singleton in Java. In this we use an
Inner Static class to create the Singleton instance.
Sample code:
```java
public class SingletonBillPugh {
    // Inner class that holds instance
    private static class InnerSingleton{
        private static final SingletonBillPugh INSTANCE = new
        SingletonBillPugh();
    }
    // Private constructor
    private SingletonBillPugh(){}
    public static SingletonBillPugh getInstance(){
        return InnerSingleton.INSTANCE;
    }
}
```
When first time SingletonBillPugh is loaded in memory,
InnerSingleton is not loaded. Only when getInstance() method is
called, InnerSingleton class is loaded and an Instance is created.
3. **Enum**: We can also use Java enum to create thread-safe
implementation. Java enum values are accessible globally
so these can be used as a Singleton.
Sample Code:
```java
public enum SingletonEnum {
    INSTANCE;
    public static void doImplementation(){
    // Some code here
    }
}
```


#### 69. What are the examples of Singleton design pattern in JDK?
In JDK there are many places where Singleton design pattern is
used. Some of these are as follows:
1. `java.lang.Runtime.getRuntime()`: This method
Runtime class that has only one instance in a JVM.
gives
2. `java.lang.System.getSecurityManager()`: This method
returns a SecurityManager for the current platform.
`java.awt.Desktop.getDesktop()`


#### 70. What is Template Method design pattern in Java?
It is a behavioral design pattern. We can use it to create an outline
for an algorithm or a complex operation. We first create the skeleton
of a program. Then we delegate the steps of the operation to
subclasses. The subclasses can redefine the inner implementation of
each step.

E.g. While designing a Game in Java, we can implement it as an
algorithm with Template Method pattern. Each step in the game can
be deferred to subclasses responsible for handling that step.
Let say we implement Monopoly game in Java. We can create
methods like initializeGame(), makeMove(), endGame() etc. Each
of these methods can be handled in subclasses in an independent
manner.

We can use same algorithm for Chess game with same set of
abstract methods. The subclass for Chess game can provide the
concrete implementation of methods like initializeGame(),
makeMove(), endGame() etc.

Template Method pattern is very useful in providing customizable
class to users. We can create the core class with a high level
implementation. And our users can customize our core class in their
custom subclasses.


#### 71. What are the examples of Template method design pattern in JDK?
In JDK there are many places where Template method design
pattern is used. Some of these are as follows:
1. In Java Abstract Collection classes like
`java.util.AbstractList`, `java.util.AbstractSet` and
`java.util.AbstractMap` implement a template for their
corresponding Collection.
2. `javax.servlet.http.HttpServlet`: In the HttpServlet class all
the doGet(), doPost() etc. methods send a HTTP 405
"Method Not Allowed" error to the response. This error
response is like a Template that can be further customized
for each of these methods.
3. In `java.io` package there are Stream and Writer classes like
`java.io.InputStream`, `java.io.OutputStream`, `java.io.Reader`
and `java.io.Writer` that provide non-abstract methods.
These methods are implementation of Template method
design pattern.


#### 72. Can you tell some examples of Factory Method design pattern implementation in Java?
Factory Method pattern is a creational design pattern. A Factory is
an object that is used to create more objects.

In general, a Factory object has methods that can be used to create a
type of objects. Some people call it Factory Method design pattern
as well.

Some of the examples of Factory Method pattern in JDK are:
1. `Java.lang.Class.forName()`
2. `java.net.URLStreamHandlerFactory.createURLStreamHandler(String)`
3. `java.util.Calendar.getInstance()`
4. `java.util.ResourceBundle.getBundle()`
5. `java.text.NumberFormat.getInstance()`
6. `java.nio.charset.Charset.forName()`
7. `java.util.EnumSet.of()`
8. `javax.xml.bind.JAXBContext.createMarshaller()`


#### 73. What is the benefit we get by using static factory method to create object?
By using Static Factory Method we encapsulate the creation process
of an object. We can use new() to create an Object from its
constructor. Instead we use static method of a Factory to create the
object. One main advantage of using Factory is that Factory can
choose the correct implementation at runtime and create the right
object. The caller of method can specify the desired behavior.

E.g. If we have a ShapeFactory with createShape(String type)
method. Client can call ShapeFactory.createShape(“Circle”) to get
a circular shape. ShapeFactory.createShape(“Square”) will return
square shape. In this way, ShapeFactory knows how to create
different shapes based on the input by caller.
Another use of Factory is in providing access to limited resources
to a large set of users.

E.g. In ConnectionPool, we can limit the total number of
connections that can be created as well as we can hide the
implementation details of creating connection. Here ConnectionPool
is the factory. Clients call static method `ConnectionPool.getConnection()`.


#### 74. What are the examples of Builder design pattern in JDK?
In JDK there are many places where Builder design pattern is used.
Some of these are as follows:
1. `java.lang.StringBuilder.append()`: StringBuilder is based
on Builder pattern.
2. `java.nio.IntBuffer.put()`: Invocation of put() method return
IntBuffer. Also there are many variants of this method to
build the IntBuffer.
3. `javax.swing.GroupLayout.Group.addComponent()`: We can
use addComponent() method to build a UI that can contain
multiple levels of components.
4. `java.lang.Appendable`
5. `java.lang.StringBuffer.append()`: StringBuffer is similar to
StringBuilder and it is also based on Builder design
pattern.


#### 75. What are the examples of Abstract Factory design pattern in JDK?
In JDK there are many places where Abstract Factory design pattern
is used. Some of these are as follows:
1. `javax.xml.xpath.XPathFactory.newInstance()`
2. `javax.xml.parsers.DocumentBuilderFactory.newInstance()`
3. `javax.xml.transform.TransformerFactory.newInstance()`


#### 76. What are the examples of Decorator design pattern in JDK?
In JDK there are many places where Decorator design pattern is
used. Some of these are as follows:
1. In `java.io` package many classes use Decorator pattern.
Subclasses of `java.io.InputStream`, `OutputStream`, `Reader`
and `Writer` have a constructor that can take the instance of same type and decorate it with additional behavior.
2. In `java.util.Collections`, there are methods like
* checkedCollection(),
* checkedList(),
* checkedMap(),
* synchronizedList(),
* synchronizedMap(),
* synchronizedSet(), unmodifiableSet(), unmodifiableMap()
and unmodifiableList() methods that can decorate an object
and return the same type.
3. In `javax.servlet` package, there are classes like
`javax.servlet.http.HttpServletRequestWrapper`
and
`HttpServletResponseWrapper` that are based on Decorator
design pattern.


#### 77. What are the examples of Proxy design pattern in JDK?
Proxy design pattern provides an extra level of indirection for
providing access to another object. It can also protect a real object
from any extra level of complexity.

In JDK there are many places where Proxy design pattern is used.
Some of these are as follows:
1. `java.lang.reflect.Proxy`
2. `java.rmi.*`
3. `javax.inject.Inject`
4. `javax.ejb.EJB`
5. `javax.persistence.PersistenceContext`


#### 78. What are the examples of Chain of Responsibility design pattern in JDK?
In JDK there are many places where Chain of Responsibility design
pattern is used. Some of these are as follows:
1. `java.util.logging.Logger.log()`: In this case Logger class
provides multiple variations of log() method that can take
the responsibility of logging from client in different
scenarios. The client has to just call the appropriate log()
method and Logger will take care of these commands.
2. `javax.servlet.Filter.doFilter()`: In the Filter class, the
Container calls the doFilter method when a
request/response pair is passed through the chain. With
filter the request reaches to the appropriate resource at the
end of the chain. We can pass FilterChain in doFilter()
method to allow the Filter to pass on the request and
response to the next level in the chain.


#### 79. What are the main uses of Command design pattern?
Command design pattern is a behavioral design pattern. We use it to
encapsulate all the information required to trigger an event. Some of
the main uses of Command pattern are:
1. **Graphic User Interface (GUI)**: In GUI and menu items, we
use command pattern. By clicking a button we can read the
current information of GUI and take an action.
2. **Macro Recording**: If each of user action is implemented as
a separate Command, we can record all the user actions in
a Macro as a series of Commands. We can use this series
to implement the “Playback” feature. In this way, Macro
can keep on doing same set of actions with each replay.
3. **Multi-step Undo**: When each step is recorded as a Command, we can use it to implement Undo feature in which each step can by undo. It is used in text editors like
MS-Word.
4. **Networking**: We can also send a complete Command over the network to a remote machine where all the actions encapsulated within a Command are executed.
5. **Progress Bar**: We can implement an installation routine as
a series of Commands. Each Command provides the
estimate time. When we execute the installation routine,
with each command we can display the progress bar.
6. **Wizard**: In a wizard flow we can implement steps as Commands. Each step may have complex task that is just implemented within one command.
7. **Transactions**: In a transactional behavior code there are
multiple tasks/updates. When all the tasks are done then
only transaction is committed. Else we have to rollback the
transaction. In such a scenario each step is implemented as
separate Command.


#### 80. What are the examples of Command design pattern in JDK?
In JDK there are many places where Command design pattern is
used. Some of these are as follows:
1. All implementations of `java.lang.Runnable`
2. All implementations of `javax.swing.Action`


#### 81. What are the examples of Interpreter design pattern in JDK?
Interpreter design pattern is used to evaluate sentences in a
language. E.g. In SQL we can use it to evaluate a query by
evaluating each keyword like SELECT, FROM, WHERE clause.

In an Interpreter implementation there is a class for each
keyword/symbol. A sentence is just a composite of these keywords.
But the sentence is represented by Syntax tree that can be
interpreted.

In JDK there are many places where Interpreter design pattern is
used. Some of these are as follows:
1. `java.util.Pattern`
2. `java.text.Normalizer`
3. Subclasses of `java.text.Format`: MessageFormat, NumberFormat, DateFormat
5. Subclasses of `javax.el.ELResolver`: ArrayELResolver,
6. MapELResolver, CompositeELResolver etc.


#### 82. What are the examples of Mediator design pattern in JDK?
By using Mediator pattern we can decouple the multiple objects that
interact with each other. With a Mediator object we can create
many-to-many relationships in multiple objects.

In JDK there are many places where Mediator design pattern is
used. Some of these are as follows:
1. `java.util.Timer`: schedule() methods in Timer class act as Mediator between the clients and the TimerTask to be scheduled.
2. `java.util.concurrent.Executor.execute()`: The execute() method in an Executor class acts as a Mediator to execute the different tasks.
3. `java.util.concurrent.ExecutorService`
4. `java.lang.reflect.Method.invoke()`: In Method class of reflection package, invoke() method acts as a Mediator.
5. `java.util.concurrent.ScheduledExecutorService`: Here also schedule() method and its variants are Mediator pattern implementations.


#### 83. What are the examples of Strategy design pattern in JDK?
In JDK there are many places where Strategy design pattern is used.
Some of these are as follows:
1. java.util.Comparator: In a Comparator we can use compare() method to change the strategy used by
Collections.sort() method.
2. javax.servlet.http.HttpServlet: In a HttpServlet class
service() and doGet(), doPost() etc. methods take
HttpServletRequest and HttpServletResponse and the
implementor of Servlet processes it based on the strategy it
selects.


#### 84. What are the examples of Visitor design pattern in JDK?
By using Visitor design pattern we can add new virtual methods to
existing classes without modifying their core structure.
In JDK there are many places where Visitor design pattern is used.
Some of these are as follows:
1. `javax.lang.model.element.AnnotationValue` and `AnnotationValueVisitor`
2. `java.nio.file.FileVisitor` and `SimpleFileVisitor`
3. `javax.lang.model.type.TypeMirror` and `TypeVisitor`
4. `javax.lang.model.element.Element` and `ElementVisitor`
5. `javax.faces.component.visit.VisitContext` and `VisitCallback`


#### 85. How Decorator design pattern is different from Proxy pattern?
Main differences between Decorator and Proxy design pattern are:
1. Decorator provides an enhanced interface after decorating
it with additional features. Proxy provides same interface
since it is just acting as a proxy to another object.
2. Decorator is a type of Composite pattern with only one
component. But each decorator can add additional
features. Since it is one component in Decorator, there is
no object aggregation.
3. Proxy can also provide performance improvement by lazy
loading. There is nothing like this available in Decorator.
4. Decorator follows recursive composition. Proxy is just
one object to another object access.
5. Decorator is mostly used for building a variety of objects.
Proxy is mainly used for access to another object.


#### 86. What are the different scenarios to use Setter and Constructor based injection in Dependency Injection
(DI) design pattern?
We use Setter injection to provide optional dependencies of an
object. Constructor injection is used to provide mandatory
dependency of an object.

In Spring IoC, Dependency Injection is heavily used. There we have
to differentiate between the scenario suitable for Setter based and
Constructor based dependency injection.


#### 87. What are the different scenarios for using Proxy design pattern?
Proxy design pattern can be used in a wide variety of scenario in
Java. Some of these are as follows:
1. Virtual Proxy: This is a virtual object that acts as a proxy
for objects that are very expensive to create. It is used in
Lazy Loading. When client makes the first request, the real
object is created.
2. Remote Proxy: This is a local object that provides access
to a remote object. It is generally used in Remote Method
Invocation (RMI) and Remote Procedure Call (RPC). It is
also known as a Stub.
3. Protective Proxy: This is an object that control the access
to a Master object. It can authenticate and authorize the
client for accessing the Master object. If client has right
permissions, it allows client to access the main object.
4. Smart Proxy: It is an object that can add additional
information to the main object. It can track the number of
other objects accessing the main object. It can track the
different clients from where request is coming. It can even
deny access to an object if the number of requests is
greater than a threshold.


#### 88. What is the main difference between Adapter and Proxy design pattern?
Adapter pattern provides a different interface to an object. But the
Proxy always provides same interface to the object.
Adapter is like providing an interface suitable to client’s use. But
Proxy is same interface that has additional feature or check.
E.g. In electrical appliances we use Adapter to convert from one
type of socket to another type of socket. In case of proxy, we have a
plug with built-in surge protector. The interface for plug and the
original device remains same.


#### 89. When will you use Adapter design pattern in Java?
If we have two classes with incompatible interfaces, we use Adapter pattern to make it work. We create an Adapter object that can adapt the interface of one class to another class. It is generally used for working with third party libraries. We create an Adapter class between third party code and our class. In case of any change in third party code we have to just change the Adapter
code. Rest of our code can remain same and just take to Adapter.


#### 90. What are the examples of Adapter design pattern in JDK?
In JDK there are many places where Adapter design pattern is used.
Some of these are as follows:
1. `java.util.Arrays.asList()`: This method can adapt an Array
to work as a List.
2. `java.util.Collections.list()`: This method can adapt any
collection to provide List behavior.
3. `java.util.Collections.enumeration()`: This method returns
an enumeration over the collection.
4. `java.io.InputStreamReader(InputStream)`: adapts a Stream to Reader class.
This
method
5. `java.io.OutputStreamWriter(OutputStream)`: This method adapts an OutputStream to Writer class.
6. `javax.xml.bind.annotation.adapters.XmlAdapter.marshal()` 
#

#### 91. What is the difference between Factory and Abstract Factory design pattern?
With Factory design pattern we can create concrete products of a
type that Factory can manufacture. E.g. If it is CarFactory, we can
produce, Ford, Toyota, Honda, Maserati etc.

With Abstract Factory design pattern we create a concrete
implementation of a Factory. E.g. DeviceFactory can be Abstract
and it can give us GoogleDeviceFactory, AppleDeviceFactory etc.
With AppleDeviceFactory we will get products like- iPhone, iPad,
Mac etc. With GoogleDeviceFactory we will get products like-
Nexus phone, Google Nexus tablet, Google ChromeBook etc.

So it is a subtle difference between Factory and Abstract Factory
design pattern. One way to remember is that within Abstract Factory
pattern, Factory pattern is already implemented.


#### 92. What is Open/closed design principle in Software engineering?
Open/closed design principle states “software entities (classes,
modules, functions, etc.) should be open for extension, but closed
for modification”.

Open/closed principle term was originated by Bertrand Meyer in
his book Object Oriented Software Construction.

As per this principle, if a module is available for extension then it
is considered open. If a module is available for use by other
modules then it is considered closed.

Further Robert C. Martin has mentioned it as O in SOLID principles
of Object Oriented design.

It is used in State and Strategy design patterns. Context class is
closed for modification. But new functionality can be added by
writing new strategy code.


#### 93. What is SOLID design principle?
SOLID word in SOLID design principle is an acronym for:

1. **S**: _Single responsibility_. A Class should have a single
responsibility.
2. **O**: _Open-closed_. Software entities should be open for
extension but closed for modification.
3. **L**: _Liskov substitution_. Objects in a program should be
replaceable by subclasses of same type without any
adverse impact.
4. **I**: _Interface segregation_. Multiple client specific interfaces
are preferable over single generic interface.
5. **D**: _Dependency inversion_. Program should depend on
abstract entities. It should not depend on concrete
implementation of an interface.

This principle was mentioned by Robert C. Martin. These are
considered five basic principles of Object Oriented design.

If we follow these principles, then we can create a stable program
that is easy to maintain and can be extended over time.


#### 94. What is Builder design pattern?
Builder design pattern is a creational design pattern. We can use
Builder pattern to create complex objects with multiple options.
E.g. when we have to create a Meal in a restaurant we can use
Builder pattern. We can keep adding options like- Starter, Drink,
Main Course, and Dessert etc. to create complete meal. When a user
selects other options of Starter, Drink Main Course, Dessert another
type of meal is created.
Main feature of Builder pattern is step-by-step building of a
complex object with multiple options.


#### 95. What are the different categories of Design Patterns used in Object Oriented Design?
In Object Oriented design mainly three categories of design patterns
are used. These categories are:

**Creational Design Patterns:**
1. Builder
2. Factory Method
3. Abstract Factory
4. Object Pool
5. Singleton
6. Prototype

**Structural Design Patterns:**
1. Adapter
2. Bridge
3. Façade
4. Decorator
5. Composite
6. Flyweight
7. Proxy

**Behavioral Design Patterns:**
1. Command
2. Iterator
3. Chain of Responsibility
4. Observer
5. State
6. Strategy
7. Mediator
8. Interpreter


#### 96. What is the design pattern suitable to access elements of a Collection?
We can use Iterator design pattern to access the individual elements
of a Collection. In case of an ordered collection we can get Iterator
that returns the elements in an order.

In Java there are many implementation of Iterator in Collections
package. We have iterators like- Spliterator, ListIterator etc. that
implement Iterator pattern.


#### 97. How can we implement Producer Consumer design pattern in Java?
We can use BlockingQueue in Java to implement Producer
Consumer design pattern.

It is a concurrent design pattern.


#### 98. What design pattern is suitable to add new features to an existing object?
We can use Decorator design pattern to add new features to an
existing object. With a Decorator we work on same object and
return the same object with more features. But the structure of the
object remains same since all the decorated versions of object
implement same interface.


#### 99. Which design pattern can be used when to decouple abstraction from the implementation?
We can use Bridge design pattern to detach the implementation from
the abstraction.

Bridge is mainly used for separation of concern in design. We can
create an implementation and store it in the interface, which is an
abstraction. Where as specific implementation of other features can
be done in concrete classes that implement the interface.
Often Bridge design pattern is implemented by using Adapter
pattern.

E.g. we have Shape interface. We want to make Square and Circle
shapes. But further we want to make RedSquare, BlackSquare
shapes and GreenCircle, WhiteCircle shapes. In this case rather
than creating one hierarchy of all the shapes, we separate the Color
concern from Shape hierarchy.

So we create two hierarchies. One is Shape to Square and Shape to
Circle hierarchy. Another one is Color to Red, Black, Green, White
hierarchy. In this way we can create multiple types of shapes with
multiple colors with Bridge design pattern.


#### 100. Which is the design pattern used in Android applications?
Android applications predominantly use Model View Presenter
design pattern.
1. **Model**: This is the domain model of the Android
application. It contains the business logic and business
rules.
2. **View**: These are the UI components in your application.
These are part of the view. Also any events on UI
components are part of view module.
3. **Presenter**: This is the bridge between Model and View to
control the communication. Presenter can query the model
and return data to view to update it.

4. E.g. If we have a Model with large news article data, and
view needs only headline, then presenter can query the
data from model and only give headline to view. In this
way view remains very light in this design pattern.


#### 101. How can we prevent users from creating more than one instance of singleton object by using clone() method?
First we should not implement the Cloneable interface by the object
that is a Singleton.

Second, if we have to implement Cloneable interface then we can
throw exception in clone() method.

This will ensure that no one can use clone() method or Cloneable
interface to create more than one instance of Singleton object.


#### 102. What is the use of Interceptor design pattern?
Interceptor design pattern is used for intercepting a request. Primary
use of this pattern is in Security policy implementation.
We can use this pattern to intercept the requests by a client to a
resource. At the interception we can check for authentication and
authorization of client for the resource being accessed.
In Java it is used in javax.servlet.Filter interface.
This pattern is also used in Spring framework in HandlerInterceptor
and MVC interceptor.


#### 103. What are the Architectural patterns that you have used?
Architectural patterns are used to define the architecture of a
Software system. Some of the patterns are as follows:
1. **MVC**: Model View Controller. This pattern is extensively
used in the architecture of Spring framework.
2. **Publish-subscribe**: This pattern is the basis of messaging
architecture. In this case messages are published to a
Topic. And subscribers subscribe to the topic of their
interests. Once the message is published to a topic in
which a Subscriber has an interest, the message is
consumed by the relevant subscriber.
3. **Service Locator**: This design pattern is used in a service
like JNDI to locate the available services. It uses as
central registry to maintain the list of services.
4. **n-Tier**: This is a generic design pattern to divide the
architecture in multiple tiers. E.g. there is 3-tier
architecture with Presentation layer, Application layer and
Data access layer. It is also called multi-layer design
pattern.
5. **Data Access Object (DAO)**: This pattern is used in
providing access to database objects. The underlying
principle is that we can change the underlying database
system, without changing the business logic. Since
business logic talks to DAO object, there is no impact of
changing Database system on business logic.
6. **Inversion of Control (IoC)**: This is the core of Dependency
Injection in Spring framework. We use this design patternto increase the modularity of an application. We keep the
objects loosely coupled with Dependency Injection.


#### 104. What are the popular uses of Façade design pattern?
Some of the popular uses of Façade design pattern are as follows:

1. A Façade provides convenient methods for common tasks that are used more often.
2. A Façade can make the software library more readable.
3. A Façade can reduce the external dependencies on the working of inner code.
4. A Façade can act as a single well-designed API by wrapping a collection of poorly designed APIs.
5. A Façade pattern can be used when a System is very complex and difficult to use. It can simplify the usage of complex system.


#### 105. What is the difference between Builder design pattern and Factory design pattern?
Both Factory and Builder patterns are creational design patterns.
They are similar in nature but Factory pattern is a simplified generic
version of Builder pattern.

We use Factory pattern to create different concrete subtypes of an
Object. The client of a Factory may not know the exact subtype. E.g.
If we call createDrink() of a Factory, we may get Tea or Coffee
drinks.

We can also use Builder pattern to create different concrete
subtypes of an object. But in the Builder pattern the composition of
the object can be more complex. E.g. If we call createDrink() for
Builder, we can getCappuccino Coffee with Vanilla Cream and
Sugar, or we can get Latte Coffee with Splenda and milk cream.

So a Builder can support creation of a large number of variants of
an object. But a Factory can create a broader range of known
subtypes of an object.


#### 106. What is Memento design pattern?
1. Memento design pattern is used to implement rollback 
feature in an object. In a Memento pattern there are three
objects:
2. Originator: This is the object that has an internal state.
Caretaker: This is the object that can change the state of
Originator. But it wants to have control over rolling back
the change.
3. Memento: This is the object that Caretaker gets from
Originator, before making and change. If Caretaker wants
to Rollback the change it gives Memento back to
Originator. Originator can use Memento to restore its own
state to the original state.

E.g. One good use of memento is in online Forms. If we
want to show to user a form pre-populated with some
data, we keep this copy in memento. Now user can
update the form. But at any time when user wants to reset
the form, we use memento to make the form in its original
pre-populated state. If user wants to just save the form
we save the form and update the memento. Now onwards
any new changes to the form can be rolled back to the
last saved Memento object.


#### 107. What is an AntiPattern?
An AntiPattern is opposite of a Design Pattern. It is a common
practice in an organization that is used to deal with a recurring
problem but it has more bad consequences than good ones.
AntiPattern can be found in an Organization, Architecture or
Software Engineering.
Some of the AntiPatterns in Software Engineering are:
1. Gold Plating: Keep on adding extra things on a working
solution even though these extra things do not add any
additional value.
2. Spaghetti Code: Program that are written in a very
complex way and are hard to understand due to misuse of
data structures.
3. Coding By Exception: Adding new code just to handle
exception cases and corner case scenarios.
4. Copy Paste Programming: Just copying the same code
multiple times rather than writing generic code that can be
parameterized.


#### 108. What is a Data Access Object (DAO) design pattern?
DAO design pattern is used in the data persistent layer of a Java
application. It mainly uses OOPS principle of Encapsulation.
By using DAO pattern it makes the application loosely coupled and
less dependent on actual database.

We can even implement some in-memory database like H2 with
DAO to handle the unit-testing.

In short, DAO hides the underlying database implementation from
the class that accesses the data via DAO object.

Recently we can combine DAO with Spring framework to inject any
DB implementation.