## String
****
#### 121. What is the meaning of Immutable in the context of String class in Java?

An Immutable object cannot be modified or changed in Java. String is an Immutable class in Java. Once a String object is created, it cannot be changed. When we assign the String to a new value, a new object is created.

#### 122. Why a String object is considered immutable in java?

Java language uses String for a variety of purposes. For this it has marked String Immutable. There is a concept of String literal in Java. Let say there are 2 String variables A and B that reference to a String object “TestData”. All these variables refer to same String literal. If one reference variable A changes the value of the String literal from “TestData” to “RealData”, then it will affect the other variable as well. Due to which String is considered Immutable. In this case, if one variable A changes the value to “RealData”, then a new String literal with “RealData” is created and A will point to new String literal. While B will keep pointing to “TestData”

#### 123. How many objects does following code create?

```java
String s1=" HelloWorld ";
String s2=" HelloWorld ";
String s3=" HelloWorld ";
```

The above code creates only one object. Since there is only one String Literal “HelloWorld” created, all the references point to same object.

#### 124. How many ways are there in Java to create a String object?

Java provides two ways to create a String object. One is by using String Literal, the other is by using new operator.

#### 125. How many objects does following code create?

Code:

```java
String s = new String("HelloWorld");
```

The above code creates two objects. One object is created in String constant pool and the other is created on the heap in non-pool area.

#### 126. What is String interning?

String interning refers to the concept of using only one copy of a distinct String value that is Immutable. It provides the advantage of making String processing efficient in Time as well as Space complexity. But it introduces extra time in
creation of String.

#### 127. Why Java uses String literal concept?

Java uses String literal concept to make Java more efficient in
memory. If same String already exists in String constant pool, it can
be reused. This saves memory usage.

#### 128. What is the basic difference between a String and StringBuffer object?

String is an immutable object. Its value cannot change after creation.
StringBuffer is a mutable object. We can keep appending or
modifying the contents of a StringBuffer in Java.

#### 129. How will you create an immutable class in Java?

In Java, we can declare a class final to make it immutable. There are following detailed steps to make it Immutable:

1. Add final modifier to class to prevent it from getting extended.
2. Add private modifier to all the fields to prevent direct access .
3. Do not provide any setter methods for member variables.
4. Add final modifier to all the mutable fields to assign value only once
5. Use Deep Copy to initialize all the fields by a constructor.
6. In clone method, return a copy of object instead of the actual object reference.

#### 130. What is the use of toString() method in java ?

In Java, Object class has toString() method. This method can be used to return the String representation of an Object. When we print an object, Java implicitly calls toString() method.

Java provides a default implementation for toString() method. But we can 

#### 131. Arrange the three classes `String`, `StringBuffer` and `StringBuilder` in the order of efficiency for String processing operations?

`StringBuilder` is the most efficient class. It does not have the overhead of Synchronization. `StringBuffer` is a Synchronized class. It has better performance than String but it is slower than StringBuilder. String is the slowest for any String processing operations, since it is leads to creation of new String literal with each modification. So the decreasing order of efficiency is: `StringBuilder` > `StringBuffer` >  `String`.