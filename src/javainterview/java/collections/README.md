# Collections
@see http://www.javainterview.in/p/collections-interview-questions.html#question1
## Why do we need collections in Java?
Arrays are not dynamic. Once an array of a particular size is declared, the size cannot be modified. To add a new element to the array, a new array has to be created with bigger size and all the elements from the old array copied to new array.

Collections are used in situations where data is dynamic. Collections allow adding an element, deleting an element and host of other operations. There are a number of Collections in Java allowing to choose the right Collection for the right context.

## What is the Collection framework in Java?
Collection Framework is a combination of classes and interface, which is used to store and manipulate the data in the form of objects. It provides various classes such as ArrayList, Vector, Stack, and HashSet, etc. and interfaces such as List, Queue, Set, etc. for this purpose.

## What are the main differences between array and collection?
Array and Collection are somewhat similar regarding storing the references of objects and manipulating the data, but they differ in many ways. The main differences between the array and Collection are defined below:

Arrays are always of fixed size, i.e., a user can not increase or decrease the length of the array according to their requirement or at runtime, but In Collection, size can be changed dynamically as per need.
Arrays can only store homogeneous or similar type objects, but in Collection, heterogeneous objects can be stored.
Arrays cannot provide the ?ready-made? methods for user requirements as sorting, searching, etc. but Collection includes readymade methods to use.

## Explain various interfaces used in Collection framework?
Collection framework implements various interfaces, Collection interface and Map interface (java.util.Map) are the mainly used interfaces of Java Collection Framework. List of interfaces of Collection Framework is given below:

### 1. Collection interface: 
>Collection (java.util.Collection) is the primary interface, and every collection must implement this interface.

Syntax:
```java
public interface Collection<E>extends Iterable  
```
Where <E> represents that this interface is of Generic type

### 2. List interface: 
>List interface extends the Collection interface, and it is an ordered collection of objects. It contains duplicate elements. It also allows random access of elements.

Syntax:
```java
public interface List<E> extends Collection<E>  
```

### 3. Set interface: 
>Set (java.util.Set) interface is a collection which cannot contain duplicate elements. It can only include inherited methods of Collection interface

Syntax:
```java
public interface Set<E> extends Collection<E>  
```

>Queue interface: Queue (java.util.Queue) interface defines queue data structure, which stores the elements in the form FIFO (first in first out).

Syntax:
```java
public interface Queue<E> extends Collection<E>  
```

### 4. Dequeue interface:
>it is a double-ended-queue. It allows the insertion and removal of elements from both ends. It implants the properties of both Stack and queue so it can perform LIFO (Last in first out) stack and FIFO (first in first out) queue, operations.

Syntax:
```java
public interface Dequeue<E> extends Queue<E>  
```

### 5. Map interface:
>A Map (java.util.Map) represents a key, value pair storage of elements. Map interface does not implement the Collection interface. It can only contain a unique key but can have duplicate elements. There are two interfaces which implement Map in java that are Map interface and Sorted Map.

## What are the important interfaces in the collection hierarchy?

## What are the important methods that are declared in the collection interface?
Most important methods declared in the collection interface are the methods to add and remove an element. add method allows adding an element to a collection and delete method allows deleting an element from a collection.

size() methods returns number of elements in the collection. Other important methods defined as part of collection interface are shown below.

```java
interface Collection<E> extends Iterable<E>
{
  boolean add(E paramE);
  boolean remove(Object paramObject);

  int size();
  boolean isEmpty();
  void clear();

  boolean contains(Object paramObject);
  boolean containsAll(Collection<?> paramCollection);
  
  boolean addAll(Collection<? extends E> paramCollection);
  boolean removeAll(Collection<?> paramCollection);
  boolean retainAll(Collection<?> paramCollection);
  

  Iterator<E> iterator();

  //A NUMBER OF OTHER METHODS AS WELL..
}
```

## Can you explain briefly about the List interface?
List interface extends Collection interface. So, it contains all methods defined in the Collection interface. In addition, List interface allows operation specifying the position of the element in the Collection.

Most important thing to remember about a List interface - any implementation of the List interface would maintain the insertion order. When an element A is inserted into a List (without specifying position) and then another element B is inserted, A is stored before B in the List.

When a new element is inserted without specifying a position, it is inserted at the end of the list of elements.

However, We can also use the void add(int position, E paramE); method to insert an element at a specific position.

Listed below are some of the important methods in the List interface (other than those inherited from Collection interface):
```java
interface List<E> extends Collection<E>
{
  boolean addAll(int paramInt, Collection<? extends E> paramCollection);

  E get(int paramInt);
  E set(int paramInt, E paramE);

  void add(int paramInt, E paramE);
  E remove(int paramInt);

  int indexOf(Object paramObject);
  int lastIndexOf(Object paramObject);

  ListIterator<E> listIterator();
  ListIterator<E> listIterator(int paramInt);
  List<E> subList(int paramInt1, int paramInt2);
}
```
## What is the difference between Set and SortedSet?
>SortedSet Interface extends the Set Interface. Both Set and SortedSet do not allow duplicate elements.

Main difference between Set and SortedSet is - an implementation of SortedSet interface maintains its elements in a sorted order. Set interface does not guarantee any Order. For example, If elements 4,5,3 are inserted into an implementation of Set interface, it might store the elements in any order. However, if we use SortedSet, the elements are sorted. The SortedSet implementation would give an output 3,4,5.

Important Operations in the SortedSet interface which are not present in the Set Interface are listed below:
```java
public interface SortedSet<E> extends Set<E> {
    
    SortedSet<E> subSet(E fromElement, E toElement);
    SortedSet<E> headSet(E toElement);
    SortedSet<E> tailSet(E fromElement);
    
    E first();
    E last();

    Comparator<? super E> comparator();
}
```

## What is difference between Map and SortedMap?
SortedMap interface extends the Map interface. In addition, an implementation of SortedMap interface maintains keys in a sorted order.

Methods are available in the interface to get a ranges of values based on their keys.
```java
public interface SortedMap<K, V> extends Map<K, V> {
    Comparator<? super K> comparator();

    SortedMap<K, V> subMap(K fromKey, K toKey);

    SortedMap<K, V> headMap(K toKey);

    SortedMap<K, V> tailMap(K fromKey);

    K firstKey();

    K lastKey();
}
```
## Explain briefly about Queue Interface?

>Queue Interface extends Collection interface. Queue Interface is typically used for implementation holding elements in order for some processing.


Queue interface offers methods peek() and poll() which get the element at head of the queue. The difference is that poll() method removes the head from queue also. peek() would keep head of the queue unchanged.
```java
interface Queue<E> extends Collection<E>
{
  boolean offer(E paramE);
  E remove();
  E poll();
  E element();
  E peek();
}
```
## Can you briefly explain about the Map Interface?
## Explain briefly about Iterator?
>Iterator interface enables us to iterate (loop around) a collection. All collections define a method iterator() that gets an iterator of the collection.

```hasNext()``` checks if there is another element in the collection being iterated. ```next()``` gets the next element.
```java
public interface Iterator<E> {
    boolean hasNext();

    E next();
}
```
## Explain about ArrayList with an example?
>ArrayList implements the list interface. So, ArrayList stores the elements in insertion order (by default). Element’s can be inserted into and removed from ArrayList based on their position.

Let’s look at how to instantiate an ArrayList of integers.
```java
List<Integer> integers = new ArrayList<Integer>();
```
Code like below is permitted because of auto boxing. 5 is auto boxed into Integer object and stored in ArrayList.Add method (by default) adds the element at the end of the list.
```java
integers.add(5);//new Integer(5)
```
## Can an ArrayList have Duplicate elements?
>ArrayList can have duplicates (since List can have duplicates).
```java
List<String> arraylist = new ArrayList<String>();

//adds at the end of list
arraylist.add("Sachin");//[Sachin]

//adds at the end of list
arraylist.add("Dravid");//[Sachin, Dravid]

//adds at the index 0
arraylist.add(0, "Ganguly");//[Ganguly, Sachin, Dravid]

//List allows duplicates - Sachin is present in the list twice
arraylist.add("Sachin");//[ Ganguly, Sachin, Dravid, Sachin]

System.out.println(arraylist.size());//4
System.out.println(arraylist.contains("Dravid"));//true
```
## How do you iterate around an ArrayList using Iterator?
Example below shows how to iterate around an ArrayList.
```java
Iterator<String> arraylistIterator = arraylist
        .iterator();
while (arraylistIterator.hasNext()) {
    String str = arraylistIterator.next();
    System.out.println(str);//Prints the 4 names in the list on separate lines.
}
```
## How do you sort an ArrayList?
Example below shows how to sort an ArrayList. It uses the Collections.sort method.
```java
List<String> numbers = new ArrayList<String>();
numbers.add("one");
numbers.add("two");
numbers.add("three");
numbers.add("four");
System.out.println(numbers);//[one, two, three, four]

//Strings - By Default - are sorted alphabetically
Collections.sort(numbers);

System.out.println(numbers);//[four, one, three, two]
```
## How do you sort elements in an ArrayList using Comparable interface?
Consider the following class Cricketer.
```java
class Cricketer implements Comparable<Cricketer> {
    int runs;
    String name;

    public Cricketer(String name, int runs) {
        super();
        this.name = name;
        this.runs = runs;
    }

    @Override
    public String toString() {
        return name + " " + runs;
    }

    @Override
    public int compareTo(Cricketer that) {
        if (this.runs > that.runs) {
            return 1;
        }
        if (this.runs < that.runs) {
            return -1;
        }
        return 0;
    }
}
```

Let’s now try to sort a list containing objects of Cricketer class.
```java
List<Cricketer> cricketers = new ArrayList<Cricketer>();
cricketers.add(new Cricketer("Bradman", 9996));
cricketers.add(new Cricketer("Sachin", 14000));
cricketers.add(new Cricketer("Dravid", 12000));
cricketers.add(new Cricketer("Ponting", 11000));
System.out.println(cricketers);
//[Bradman 9996, Sachin 14000, Dravid 12000, Ponting 11000]
```
Now let’s try to sort the cricketers.
```java
Collections.sort(cricketers);
System.out.println(cricketers);
//[Bradman 9996, Ponting 11000, Dravid 12000, Sachin 14000]
```
## How do you sort elements in an ArrayList using Comparator interface?
Other option to sort collections is by creating a separate class which implements Comparator interface.

Example below:
```java
class DescendingSorter implements Comparator<Cricketer> {

    //compareTo returns -1 if cricketer1 < cricketer2
    //                   1 if cricketer1 > cricketer2
    //                   0 if cricketer1 = cricketer2

    //Since we want to sort in descending order, 
    //we should return -1 when runs are more
    @Override
    public int compare(Cricketer cricketer1,
            Cricketer cricketer2) {
        if (cricketer1.runs > cricketer2.runs) {
            return -1;
        }
        if (cricketer1.runs < cricketer2.runs) {
            return 1;
        }
        return 0;
    }

}
```
Let’s now try to sort the previous defined collection:
```java
Collections
        .sort(cricketers, new DescendingSorter());

System.out.println(cricketers);
//[Sachin 14000, Dravid 12000, Ponting 11000, Bradman 9996]
```
## How do you convert List to Array?
There are two ways. First is to use toArray(String) function. Example below. This creates an array of String's
```java
List<String> numbers1 = new ArrayList<String>();
numbers1.add("one");
numbers1.add("two");
numbers1.add("three");
numbers1.add("four");
String[] numbers1Array = new String[numbers1.size()];
numbers1Array = numbers1.toArray(numbers1Array);
System.out.println(Arrays.toString(numbers1Array));
//prints [one, two, three, four]
```
Other option is to use toArray() function. Example below. This creates an array of Objects.
```java
Object[] numbers1ObjArray = numbers1.toArray();
System.out.println(Arrays
        .toString(numbers1ObjArray));
//[one, two, three, four]
```
## How do you convert an Array to List?
We can use the Arrays.asList method.
```java
String values[] = { "value1", "value2", "value3" };
List<String> valuesList = Arrays.asList(values);
System.out.println(valuesList);//[value1, value2, value3]
```
## What is Vector class? How is it different from an ArrayList?
>Vector has the same operations as an ArrayList. However, all methods in Vector are synchronized. So, we can use Vector if we share a list between two threads and we would want to them synchronized.

## What is LinkedList? What interfaces does it implement? How is it different from an ArrayList?
Linked List extends List and Queue.Other than operations exposed by the Queue interface, LinkedList has the same operations as an ArrayList. However, the underlying implementation of Linked List is different from that of an ArrayList.

ArrayList uses an Array kind of structure to store elements. So, inserting and deleting from an ArrayList are expensive operations. However, search of an ArrayList is faster than LinkedList.

LinkedList uses a linked representation. Each object holds a link to the next element. Hence, insertion and deletion are faster than ArrayList. But searching is slower.

## Can you give examples of classes that implement the Set Interface?
HashSet, LinkedHashSet and TreeSet implement the Set interface. These classes are described in great detail in the video - https://www.youtube.com/watch?v=W5c8uXi4qTw

## What is a HashSet?
>HashSet implements set interface. So, HashSet does not allow duplicates. However, HashSet does not support ordering. The order in which elements are inserted is not maintained.

HashSet Example
```java
Set<String> hashset = new HashSet<String>();

hashset.add("Sachin");
System.out.println(hashset);//[Sachin]

hashset.add("Dravid");
System.out.println(hashset);//[Sachin, Dravid]
```
Let’s try to add Sachin to the Set now. Sachin is Duplicate. So will not be added. returns false.
```java
hashset.add("Sachin");//returns false since element is not added
System.out.println(hashset);//[Sachin, Dravid]
```
## What is a LinkedHashSet? How is different from a HashSet?
## Explain about ArrayList with an example?
## Can an ArrayList have duplicate elements?
## How do you iterate around an ArrayList using iterator?
## How do you sort an ArrayList?
## How do you sort elements in an ArrayList using comparable interface?
## How do you sort elements in an ArrayList using comparator interface?
## What is vector class? How is it different from an ArrayList?
## What is linkedList? What interfaces does it implement? How is it different from an ArrayList?
## Can you briefly explain about the Set interface?
## What are the important interfaces related to the Set interface?
## What is the difference between Set and sortedSet interfaces?
## Can you give examples of classes that implement the Set interface?
## What is a HashSet?
## What is a linkedHashSet? How is different from a HashSet?
## What is a TreeSet? How is different from a HashSet?
## Can you give examples of implementations of navigableSet?
## Explain briefly about Queue interface?
## What are the important interfaces related to the Queue interface?
## Explain about the Deque interface?
## Explain the BlockingQueue interface?
## What is a priorityQueue?
## Can you give example implementations of the BlockingQueue interface?
## Can you briefly explain about the Map interface?
## What is difference between Map and sortedMap?
## What is a HashMap?
## What are the different methods in a Hash Map?
## What is a TreeMap? How is different from a HashMap?
## Can you give an example of implementation of navigableMap interface?
## What are the static methods present in the collections class?
Concurrency

## What is race-condition?
## What is the difference between ScheduledExecutorService and ExecutorService interface?
## What does yield method of the Thread class do?
## What is Lock interface in Java Concurrency API? What are it’s benefits over synchronization?
## What are Concurrent Collection Classes?
## What is the difference between the Runnable and Callable interfaces?
## What is the Thread’s interrupt flag? How can you set and check it? How does it relate to the InterruptedException?
## What is Java Memory Model (JMM)? Describe its purpose and basic ideas.
## Describe the conditions of livelock, and starvation.
## How ReadWritelock can help in reducing contention among multiple threads?
## What is the Difference between ReentrantLock and Synchronized?
## What is SynchronousQueue in Java?
## Why ConcurrentHashMap is faster than Hashtable in Java?
## How do you share data between two threads in Java?
## Describe the purpose and use-cases of the fork/join framework
## What is Phaser in Java concurrency?
## What is Exchanger in Java concurrency?
## What is Semaphore in Java concurrency?
## What is lock striping in concurrent programming?
## What is blocking method in Java?
## What is Callable and Future in Java concurrency?
## What is atomic variable in Java?
## What is Busy Spinning? Why will you use Busy Spinning as wait strategy?
## What is Executors Framework?
## What is FutureTask class?
## What are the available implementations of ExecutorService in the standard library?
## What are the main components of concurrency API?

Collections

## What is Java Collections Framework? List out some benefits of Collections framework?
## What is the benefit of Generics in Collections Framework?
## Why Collection doesn’t extend Cloneable and Serializable interfaces?
## Why Map interface doesn’t extend Collection interface?
## What is difference between Enumeration and Iterator interface?
## What is different between Iterator and ListIterator?
## What are different ways to iterate over a list?
## What is the difference between fail-fast and fail-safe iterator?
## How to avoid ConcurrentModificationException while iterating a collection?
## Why there are no concrete implementations of Iterator interface?
## What are different Collection views provided by Map interface?
## What is difference between HashMap and Hashtable?
## What are similarities and difference between ArrayList and Vector?
## What is difference between Array and ArrayList?
## What is difference between ArrayList and LinkedList?
## Which collection classes provide random access of it’s elements?
## What is EnumSet?
## What are concurrent Collection Classes?
## What is BlockingQueue? How to implement producer-consumer problem by using BlockingQueue?
## What is Queue and Stack, list their differences?
## What is difference between Comparable and Comparator interface?
## How can we sort a list of Objects?
## While passing a Collection as argument to a function, how can we make sure the function will not be able to modify it?
## How can we create a synchronized collection from given collection?
## What are common algorithms implemented in Collections Framework?
## What are best practices related to Java Collections Framework?
## What is Java Priority Queue?
## What is LinkedHashMap in Java?
## Which kind of tree is used to implement TreeMap in Java?
## What is default size of ArrayList and HashMap in Java?
## What is the difference between HashSet and TreeSet?
## What is the difference between Set and Map?
## What is the difference between HashSet and HashMap?
## What is the difference between HashMap and TreeMap?
## What is the difference between Collection and Collections?
## What is the advantage of the generic collection?
## What is hash-collision in Hashtable and how it is handled in Java?
## What is the Dictionary class?
## How to synchronize ArrayList?
## What are all the Classes and Interfaces that are available in the collections?
## What is meant by Ordered and Sorted in collections?
## Explain about the different lists available in the collection.
## Explain about Map and their types.
## What is the difference between List and Set?
## What is the difference between peek(), poll() and remove() method of the Queue interface?
## What is the difference between HashMap and ConcurrentHashMap?
## What is CopyOnWriteArrayList? How it is different from ArrayList in Java?
## What are concurrentCollectionClasses?
## How to make Java ArrayList Read-Only?
## How to remove duplicates from ArrayList?
## How to reverse ArrayList?
## How to sort ArrayList in descending order?
## Which design pattern followed by Iterator ?
## What is difference between IdentityHashMap and HashMap in Java?
## What is CompareAndSwap approach?
## Why there is not method like Iterator.add() to add elements to the collection?
## What is ConcurrentLinkedQueue in Java?
## What is ConcurrentLinkedDequeue in Java?
## What is difference between ArrayBlockingQueue & LinkedBlockingQueue in Java Concurrency?
## What is PriorityBlockingQueue in Java Concurrency?
## What is DelayQueue in Java Concurrency?

# Advanced collections

## What is the difference between synchronized and concurrent collections in Java?
## Explain about the new concurrent collections in Java?
## Explain about copyonwrite concurrent collections approach?
## What is compareandswap approach?
## What is a lock? How is it different from using synchronized approach?
## What is initial capacity of a Java collection?
## What is load factor?
## When does a Java collection throw UnsupportedOperationException?
## What is difference between fail-safe and fail-fast iterators?
## What are atomic operations in Java?
## What is BlockingQueue in Java?

# Generics

## What are Generics?
## Why do we need Generics? Can you give an example of how Generics make a program more flexible?
## How do you declare a generic class?
## What are the restrictions in using generic type that is declared in a class declaration?
## How can we restrict Generics to a subclass of particular class?
## How can we restrict Generics to a super class of particular class?
## Can you give an example of a generic method?
