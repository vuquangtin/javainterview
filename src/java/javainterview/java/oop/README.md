# Object oriented programming basics
## List the features of Java Programming language.

There are the following features in Java Programming Language.

* Simple: Java is easy to learn. The syntax of Java is based on C++ which makes easier to write the program in it.

* Object-Oriented: Java follows the object-oriented paradigm which allows us to maintain our code as the combination of different type of objects that incorporates both data and behavior.

* Portable: Java supports read-once-write-anywhere approach. We can execute the Java program on every machine. Java program (.java) is converted to bytecode (.class) which can be easily run on every machine.

* Platform Independent: Java is a platform independent programming language. It is different from other programming languages like C and C++ which needs a platform to be executed. Java comes with its platform on which its code is executed. Java doesn't depend upon the operating system to be executed.

* Secured: Java is secured because it doesn't use explicit pointers. Java also provides the concept of ByteCode and Exception handling which makes it more secured.

* Robust: Java is a strong programming language as it uses strong memory management. The concepts like Automatic garbage collection, Exception handling, etc. make it more robust.

* Architecture Neutral: Java is architectural neutral as it is not dependent on the architecture. In C, the size of data types may vary according to the architecture (32 bit or 64 bit) which doesn't exist in Java.

* Interpreted: Java uses the Just-in-time (JIT) interpreter along with the compiler for the program execution.

* High Performance: Java is faster than other traditional interpreted programming languages because Java bytecode is "close" to native code. It is still a little bit slower than a compiled language (e.g., C++).

* Multithreaded: We can write Java programs that deal with many tasks at once by defining multiple threads. The main advantage of multi-threading is that it doesn't occupy memory for each thread. It shares a common memory area. Threads are important for multi-media, Web applications, etc.

* Distributed: Java is distributed because it facilitates users to create distributed applications in Java. RMI and EJB are used for creating distributed applications. This feature of Java makes us able to access files by calling the methods from any machine on the internet.

* Dynamic: Java is a dynamic language. It supports dynamic loading of classes. It means classes are loaded on demand. It also supports functions from its native languages, i.e., C and C++.Simple: Java is easy to learn. The syntax of Java is based on C++ which makes easier to write the program in it.

    
## What is the difference between abstract classes and interfaces?
|Abstract Class|	Interfaces|
|----|----|
An abstract class can provide complete, default code and/or just the details that have to be overridden|	An interface cannot provide any code at all, just the signature
In the case of an abstract class, a class may extend only one abstract class|	A Class may implement several interfaces
An abstract class can have non-abstract methods|	All methods of an Interface are abstract
An abstract class can have instance variables|	An Interface cannot have instance variables
An abstract class can have any visibility: public, private, protected|	An Interface visibility must be public (or) none
If we add a new method to an abstract class then we have the option of providing default implementation and therefore all the existing code might work properly|	If we add a new method to an Interface then we have to track down all the implementations of the interface and define implementation for the new method
An abstract class can contain constructors|	An Interface cannot contain constructors
Abstract classes are fast|	Interfaces are slow as it requires extra indirection to find the corresponding method in the actual class

## What is object cloning in Java?

Object cloning in Java is the process of creating an exact copy of an object. It basically means the ability to create an object with a similar state as the original object. To achieve this, Java provides a method clone() to make use of this functionality. This method creates a new instance of the class of the current object and then initializes all its fields with the exact same contents of corresponding fields. To object clone(), the marker interface java.lang.Cloneable must be implemented to avoid any runtime exceptions. One thing you must note is Object clone() is a protected method, thus you need to override it.

## What is a copy constructor in Java?

Copy constructor is a member function that is used to initialize an object using another object of the same class. Though there is no need for copy constructor in Java since all objects are passed by reference. Moreover, Java does not even support automatic pass-by-value.

## What is OOPS?

OOPS is abbreviated as Object Oriented Programming system in which programs are considered as a 
collection of objects. Each object is nothing but an instance of a class.
Object means a real word entity such as pen, chair, table etc. 
Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.
It simplifies the software development and maintenance by providing some concepts:


## What are the core concepts of OOPS?

OOPS core concepts are;

* Abstraction
* Encapsulation
* Polymorphism
* Inheritance
* Composition
* Association
* Aggregation

## What is a class?

>A class is simply a representation of a type of object. 

It is the blueprint/ plan/ template that describes the details of an object.


## What is Abstraction?

Abstraction is an OOPS concept to construct the structure of the real world objects. During this construction only the general states and behaviors are taken and more specific states and behaviors are left aside for the implementers.

* Hiding internal details and showing functionality is known as abstraction.
* Abstraction is the concept of hiding the internal details and describing things in simple terms. 
* For example, a method that adds two integers. 
* For example: phone call, we don't know the internal processing.
* The method internal processing is hidden from outer world. 
* There are many ways to achieve abstraction in object oriented programming, such as encapsulation and inheritance.

## What are manipulators?

Manipulators are the functions which can be used in conjunction with the insertion (<<) and 
extraction (>>) operators on an object. Examples are endl and setw.

## What is Encapsulation?

Encapsulation is an OOPS concept to create and define the permissions and restrictions of an object and its member variables and methods. A very simple example to explain the concept is to make the member variables of a class private and providing public getter and setter methods. Java provides four types of access level modifiers: public, protected, no modifier and private.

## What is the difference between Abstraction and Encapsulation?

* “Program to interfaces, not implementations” is the principle for Abstraction and “Encapsulate what varies” is the OO principle for Encapsulation.
* Abstraction provides a general structure of a class and leaves the details for the implementers. Encapsulation is to create and define the permissions and restrictions of an object and its member variables and methods.
* Abstraction is implemented in Java using interface and abstract class while Encapsulation is implemented using four types of access level modifiers: public, protected, no modifier and private.

## What is Polymorphism?

Polymorphism is the occurrence of something in various forms. Java supports various forms of polymorphism like polymorphic reference variables, polymorphic method, polymorphic return types and polymorphic argument types.

## What is Inheritance?

>A subclass can inherit the states and behaviors of it’s super class is known as inheritance.

* When one object acquires all the properties and behaviours of parent object 
* It provides code reusability. It is used to achieve runtime polymorphism.
* If inheritance applied on one class is called Single Inheritance, and if it depends on multiple classes, 
then it is called multiple Inheritance.


## What is multiple inheritance?

A child class inheriting states and behaviors from multiple parent classes is known as multiple inheritance.

## What is the diamond problem in inheritance?

In case of multiple inheritance, suppose class A has two subclasses B and C, and a class D has two super classes B and C.If a method present in A is overridden by both B and C but not by D then from which class D will inherit that method B or C? This problem is known as diamond problem.

## Why Java does not support multiple inheritance?

Java was designed to be a simple language and multiple inheritance introduces complexities like diamond problem. Inheriting states or behaviors from two different type of classes is a case which in reality very rare and it can be achieved easily through an object association.

## What is Static Binding and Dynamic Binding?

* Static or early binding is resolved at compile time. Method overloading is an example of static binding.
* Dynamic or late or virtual binding is resolved at run time. Method overriding is an example of dynamic binding.

## What is the meaning of “IS-A” and “HAS-A” relationship?

“IS-A” relationship implies inheritance. A sub class object is said to have “IS-A” relationship with the super class or interface. If class A extends B then A “IS-A” B. It is transitive, that is, if class A extends B and class B extends C then A “IS-A” C. The “instanceof” operator in java determines the 
 “IS-A” relationship.
When a class A has a member reference variable of type B then A “HAS-A” B. It is also known as Aggregation.

## What is Association?

Association is a relationship between two objects with multiplicity.

## What is Aggregation?

Aggregation is also known as “HAS-A” relationship. When class Car has a member reference variable of type Wheel then the relationship between the classes Car and Wheel is known as Aggregation. Aggregation can be understood as “whole to its parts” relationship.

Car is the whole and Wheel is part. Wheel can exist without the Car. Aggregation is a weak association.

## What is Composition?

Composition is a special form of Aggregation where the part cannot exist without the whole. Composition is a strong Association. Composition relationship is represented like aggregation with one difference that the diamond shape is filled.

## What is Dependency?

When one class depends on another because it uses that at some point in time then this relationship is known as Dependency. One class depends on another if the independent class is a parameter variable or local variable of a method of the dependent class. A Dependency is drawn as a dotted line from the dependent class to the independent class with an open arrowhead pointing to the independent class.

## What is the difference between Association and Dependency?

The main difference between Association and Dependency is in case of Association one class has an attribute or member variable of the other class type but in case of Dependency a method takes an argument of the other class type or a method has a local variable of the other class type.

## What is a Class?

A class is the specification or template of an object.A class is simply a representation of a type of object. 
It is the blueprint/ plan/ template that describes the details of an object.

## What is an Object?

>Object is instance of class.

* An object is an instance of a class. It has its own state, behavior, and identity.
* Any entity that has state and behavior is known as an object. 
* For example: chair, pen, table, keyboard, bike etc. It can be physical and logical.
* Object Oriented Programming System is the programming technique to write programs 
	based on the real world objects. 
* The states and behaviors of an object are represented as the member variables and methods.
* In OOPS programming programs are organized around objects and data rather than actions and logic.

# Advanced object oriented concepts

## What is polymorphism?

* When one task is performed by different ways known as polymorphism. 
* For example: to convince the customer differently, to draw something e.g. shape or rectangle etc.

## What is the use of instanceof operator in Java?
## What is coupling?
## What is cohesion?

## What is encapsulation?

* Binding (or wrapping) code and data together into a single unit is known as encapsulation.
* For example: capsule, it is wrapped with different medicines.
* Encapsulation is an OOPS concept to create and define the permissions and restrictions 
	of an object and its member variables and methods. 
* A very simple example to explain the concept is to make the member variables of a class private and providing public getter and setter methods. 
* Java provides four types of access level modifiers: public, protected,no modifier and private.

## What is an inner class?
## What is a static inner class?
## Can you create an inner class inside a method?
## What is an anonymous class?

## Method Overloading

* If a class has multiple methods having same name but different in parameters, 
	it is known as Method Overloading.
* If we have to perform only one operation, having same name of the methods increases the 
	readability of the program.
* There are two ways to overload the method in java
  1.By changing number of arguments
  2.By changing the data type

## Define a constructor?

A constructor is a method used to initialize the state of an object, and it gets invoked 
at the time of object creation. Rules forconstructor are:
* Constructor Name should be same as class name.
* A constructor must have no return type.

## Define Destructor?

A destructor is a method which is automatically called when the object is made of scope or destroyed. 
Destructor name is also same as class name but with the tilde symbol before the name.

## What is an Inline function?

An inline function is a technique used by the compilers and instructs to insert complete body 
of the function wherever that function is used in the program source code.


@see https://github.com/laxman810/Interview-Questions/tree/a38d0cb0a2745a7f0a96f5f30634e36ce083857c/OOPS
