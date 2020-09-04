## Exception Handling
******


#### 132. What is Exception Handling in Java?

Java provides Exception Handling mechanism to handle Runtime errors that occur in JVM. There are checked exceptions in a program that we expect to occur in certain situations.
Exception handling mechanism catches these checked exceptions
and takes relevant actions.


#### 133. In Java, what are the differences between a Checked and Unchecked?

Checked Exceptions extend Throwable class, but they do not extend
RuntimeException or Error classes. UncheckedException extend
RuntimeException class.

Checked Exceptions are checked at compile time in Java.
Unchecked Exceptions happen at Runtime, so they are not checked
at compile time.

IOException, SQLException etc. are examples of Checked
Exceptions. NullPointerException, ArithmeticException etc. are
examples of Unchecked Exceptions.


#### 134. What is the base class for Error and Exception classes in Java?

Error as well as Exception class is derived from Throwable class
in Java.

![](https://images.duckduckgo.com/iu/?u=http%3A%2F%2Fmath.hws.edu%2Feck%2Fcs124%2Fnotes98%2Fc8%2Ffig1.gif&f=1)
#### 135. What is a finally block in Java?

Java provides a finally block with a try block. This is an optional
block. But finally block is always executed after the execution of try
block.


#### 136. What is the use of finally block in Java?

As per Java specification, a finally block is always executed,
whether an error occurs or not, whether an exception is handled or
not. It helps in doing the cleanup like- Rollback Transaction, Close
Connection, Close a file etc.


#### 137. Can we create a finally block without creating a catch block?

Yes. A finally block can follow a try block or catch block. So we
can defined a finally block just after a try block.138. Do we have to always put a catch
block after a try block?
Java does not enforce the rule to put a catch block after try block.
We can write catch block or finally block after a try block.
Any exception that we want to catch is mentioned in catch block.

#### 139. In what scenarios, a finally block will not be executed?

There are two main scenarios in which finally block is not executed:

1. Program exits by calling system.exit() call.
2. A fatal error causes JVM to crash.


#### 140. Can we re-throw an Exception in Java?

Yes, Java allows to re-throw an Exception.

#### 141. What is the difference between throw and throws in Java?

Java provides throw keyword to throw an exception from a method
or a static block. Java provides throws keyword to mention the
probable exception thrown by a method in its declaration.
We use throw to explicitly throw an exception. We used
throws to declare an exception in method definition.
We cannot propagate checked exceptions with throw only. But
checked exceptions can be propagated with throws keyword.
A throw call is followed by an instance. Class or Exception follows
a throws keyword.
Call to throw occurs within a method. throws is just used with
method signature.
We can throw only one exception at a time. But we can mention as
many exceptions in throws clause.



#### 142. What is the concept of Exception Propagation?

In Exception Propagation, uncaught exceptions are propagated in the
call stack until stack becomes empty. This propagation is called
Exception Propagation.

Let say an exception propagates from one method to another method.
A() calls B(), which calls C(), which calls D(). And if D() throws
an exception, the exception will propagate from D to C to B to A,
unless one of the methods catches the exception.


#### 143. When we override a method in a Child class, can we throw an additional Exception that is not thrown by the Parent class method?

Yes, Java allows us to throw additional Exception in a child class,
but the additional exception should be an unchecked exception
(RuntimeException).

### What is a user defined exception?

User defined exceptions may be implemented by defining a new exception class by extending the Exception class.

```java
public class MyException extends Exception {
    /* class definition of constructors goes here */
    public MyException() {
        super();
    }
    public MyException (String errorMessage) {
        super (errorMessage);
    }
}
```

Throw and/or throws statement is used to signal the occurrence of an exception. To throw an exception:

```java
throw new MyException("I threw my own exception.")
```

To declare an exception: public myMethod() throws MyException {...}