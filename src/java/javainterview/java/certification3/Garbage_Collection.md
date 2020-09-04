#### Garbage Collection
************
#### 100. What is Garbage Collection in Java?

Java has an internal mechanism called Garbage collection to reclaim the memory of unused projects at run time. Garbage collection is also known as automatic memory
management.

#### 101. Why Java provides Garbage Collector?

In Java, there are no pointers. Memory management and allocation is done by JVM. Since memory allocation is automated, after some time JVM may go low on memory. At that time, JVM has to free memory from unused objects. To help with the process of
reclaiming memory, Java provides an automated process called Garbage Collector.

#### 102. What is the purpose of `gc()` in Java?

Java provides two methods `System.gc()` and `Runtime.gc()` to request the JVM to run the garbage collection. By using these methods, programmers can explicitly send request for Garbage Collection. But JVM process can reject this request and wait for some time before running the GC.

#### 103. How does Garbage Collection work in Java?

Java has an automated process called Garbage Collector for Memory Management. It is a daemon in JVM that monitors the memory usage and performs memory cleanup. Once JVM is low on memory, GC process finds the unused objects that are not referenced by other objects. These unused objects are cleaned up by Garbage Collector daemon in JVM.
#### 104. When does an object become eligible for Garbage Collection in Java?
An object can be Garbage Collected by JVM, if it is not reachable.
There are two cases for deciding eligibility of objects for Garbage Collection:

1. An Object/instance that cannot be reached by a live thread.
2. A set of circularly referenced instances that cannot be reached by any other instance outside that set.

#### 105. Why do we use finalize() method in Java?

Java provides finalize() method to perform any cleanup before Garbage Collection. This method is in Object class, and it is invoked by JVM internally. Developers are free to implement this method for any custom cleanup in case of Garbage Collection.
If an Object is not Garbage Collected, then this method may not be called.
This method is never invoked more than once by JVM.

#### 106. What are the different types of References in Java?

In Java, there are four types of references:

1. Strong Reference
2. Soft Reference
3. Weak Reference
4. Phantom Reference

#### 107. How can we reference an unreferenced object again?

We can provide implementation in finalize() method to reference
and unreferenced object. For an unreferenced object, finalize()
method is called at the time of Garbage Collection. At this time,
Object can pass its reference `‘this’` to finalize() method and revive
itself.

#### 108. What kind of process is the Garbage collector thread?

Garbage Collection is a Daemon process in JVM. It is an internal
process that keep checking Memory usage and cleans up the
memory.

#### 109. What is the purpose of the Runtime class?

The purpose of the Runtime class is to provide access to the Java
Runtime system. This class provides certain important methods like:
1. Runtime.freeMemory() – This method returns the value of
free memory in JVM
2. Runtime.maxMemory() - This method returns the value of
maximum memory that JVM can use.
3. Runtime.gc() – This method can invoke garbage collection.

#### 110. How can we invoke an external process in Java?

Java provides the method `Runtime.getRuntime().exec()` to invoke an
external process from JVM.

#### 111. What are the uses of Runtime class?

Runtime class in Java provides following benefits:

1. It allows to read data via key board
2. It can use system properties and environment variables
3. It helps in running non-java programs from within a java application.