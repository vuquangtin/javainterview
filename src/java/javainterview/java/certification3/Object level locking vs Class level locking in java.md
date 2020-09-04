
# Object level locking

Object level locking means you want to synchronize non static method or block so that it can be accessed by only one thread at a time for that instance. It is used if you want to protect non static data.
You can achieve Object level locking by following.


Make method synchronized:

```java
public synchronized int incrementCount(){
}
```

Using synchronized block and lock on this:


```java
public int incrementCount() {
  synchronized (this) {
   count++;
   return count;
  }
 
```

Using synchronized block and lock on some other object:

```java
private final Object lock=new Object();
public int incrementCount() {
  synchronized (lock) {
   count++;
   return count;
  }
```

# Class level locking:

Class level locking means you want to synchronize static method or block so that it can be accessed by only one thread for whole class. If you have 10 instances of class, only one thread will be able to access only one method or block of any one instance at a time. It is used if you want to protect static data.
This can be achieved by following:

Make static method synchronized:

```java
public static synchronized int incrementCount()
{
}
```

Using synchronized block and lock on .class:

```java
public int incrementCount() {
  synchronized (RequestCounter.class) {
   count++;
   return count;
  }
```

Using synchronized block and lock on some other static object:

```java
private final static Object lock=new Object();
public int incrementCount() {
  synchronized (lock) {
   count++;
   return count;
  }
 
```
