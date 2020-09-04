## Package



#### 78. What is the purpose of package in Java?
A package is used to encapsulate a group of classes, interfaces and sub-packages. Often, it is a hierarchical structure of storing information. It is easier to organize the related classes and sub-packages in this manner.
A Package also provides access protection for classes and interfaces. A package also helps in removing naming collision.


#### 79. What is java.lang package?
In Java, java.lang package contains the classes that are fundamental to the design of Java programming language. The most important class in this package is Object class. It also contains wrapper classes like- Integer, Boolean, Character
etc. It provides Math class for mathematical operations.


#### 80. Which is the most important class in Java?
It is an open-ended question with many answers. In my view, Object class is the most important class of Java programming language. It is the root of all the classes in Java. It provides some very important and fundamental methods.


#### 81. Is it mandatory to import java.lang package every time?
No. By default, JVM loads it internally.


#### 82. Can you import same package or class twice in your class?
If we import same package multiple times in a class, compiler includes it only once. So neither JVM nor Compiler gives any error/warning on including a package multiple times. If you have two classes with same name, then you may get name collision on importing the class erroneously. JVM internally loads the class only one time.


#### 83. What is a static import in Java?
Static import is similar to normal import declaration. Normal import allows us to import classes from packages without using package qualifier. Static import allows us to import static members from a class without using class qualifier.


#### 84. What is the difference between import static com.test.Fooclass and import com.test.Fooclass?
First import is a static import and the second import is normal import of a class. First import allows us to import static members of class.Internationalization


#### 85. What is Locale in Java?
A Locale object represents a specific geographical, political, or
cultural region. It is used to locale-sensitive operations in Java.
It helps is following the local conventions of a country, native or
region. These conventions can be for formatting the dates, money,
numbers etc.


#### 86. How will you use a specific Locale in Java?
To use a specific Locale, we need to load that Locale. We can use
ResourceBundle.getBundle("Locale.UK") method to load a Locale.Serialization


#### 87. What is the serialization?
Serialization is a process converting an object into a byte array. This byte array represents the class, version and internal state of the object. JVM can use this byte array to transmit/read the object over a network.


#### 88. What is the purpose of serialization?
Some of the uses of serialization are:
1. **Communication**: It is used for transmitting an object over network between two machines.
2. **Persistence**: We can store the object’s state in a database
and retrieve it from database later on.
3. **Caching**: Serialization can be used for caching to improve performance. We may need 10 minutes to build an object, but it may take just 10 seconds to de-serialize the object.
4. **Cross JVM Synchronization**: It can be used in same way
across multiple JVM that follow different architecture.


#### 89. What is Deserialization?
Deserialization is the process of reconstructing the object from the serialized state. It is the reverse process of serialization.


#### 90. What is Serialization and Deserialization conceptually?
**Serialization** is persisting the state of object by converting Object data into a stream of bytes.

**Deserialization** is to convert a stream of bytes back into a copy of the original object.


#### 91. Why do we mark a data member transient?
Member variables of an object are marked transient to indicate that they should not be serialized. During serialization process the transient variables are not
considered part of the persistent state of an object.


#### 92. Is it allowed to mark a method as transient?
No, Java does not allow marking a method as transient. The transient keyword is valid only for member variables.


#### 93. How does marking a field as transient makes it possible to serialize an object?
Let say we have a class ABC that implements Serializable interface, but it contains a member variable object of class XYZ that does not implement Serializable interface. Due to this it is not possible to Serialize the class ABC.
To solve this issue, we can mark the member variable XYZ as
Transient in class ABC. This will allow us to serialize the class
ABC.


#### 94. What is Externalizable interface in Java?
`Externalizable` interface `extends Serializable` interface in Java. It is
used for giving the Class control over saving and restoring the contents of its instances.

A class implements methods `writeExternal(ObjectOutput out)` and `readExternal(ObjectInput in)` to
store and restore the object.


#### 95. What is the difference between Serializable and Externalizable interface?
`Serializable` is a marker interface but Externalizable is not a marker interface.
When we implement `Serializable` interface, the class is serialized automatically by default. We can override `writeObject()` and `readObject()` methods to control more complex object Serialization process.

In case of `Externalizable`, we use `readExternal()` and `writeExternal()` methods to give control to class for class's serialization process.

`Serializable` interface is based on recursive algorithm.
Serializable gives you two options. One option is to provide custom way of serialization, the other default way. 

In `Externalizable`, you have to always implement `readExternal()` and `writeExternal`() methods.
A public no-arg constructor is needed while using `Externalizable`
interface.

In `Serialization`, we need to define `serialVersionUID`. If it is not explicitly defined it will be generated automatically based on all the fields, methods of the class.