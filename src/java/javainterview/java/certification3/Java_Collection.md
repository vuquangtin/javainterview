## Java Collection
******
#### 144. What is the difference between Collection and Collections Framework in Java?

In Java, a Collection is an object that contains multiple elements of same type in a single unit. These multiple elements can be accessed through one Collection object.

In Java Collections Framework is a library that provides common architecture for creating, updating and accessing different types of collections. In Collections framework there are common methods that are frequently used by developers for working on a Collection
object.
#### 145. Main benefits of Collections Framework in Java are as follows:

1. **Reusability**: Java Collections Framework provides
common classes and utility methods than can be used with
different types of collections. This promotes the reusability
of the code. A developer does not have to re-invent the
wheel by writing the same method again.
2. **Quality**: Using Java Collection Framework improves the
program quality, since the code is already tested and used
by thousands of developers.
3. **Speed**: Most of programmers report that their development
speed increased since they can focus on core logic and use
the generic collections provided by Java framework.
4. **Maintenance**: Since most of the Java Collections
framework code is open source and API documents is
widely available, it is easy to maintain the code written
with the help of Java Collections framework. One
developer can easily pick the code of previous developer.

#### 146. What is the root interface of Collection hierarchy in Java?
The root interface of Collection hierarchy in Java is `Collection`
interface. But the `Collection` interface extends `Iterable` interface. Due to this some people consider `Iterable` interface as the root interface.
Iterable interface is present in java.lang package but Collection
interface is present in java.util package. Oracle Java API docs
mention that Collection interface is a member of the Java
Collections framework.
Whereas, Iterable interface is not stated as a part of Java
Collections framework in Java docs.
Due to this **`Collection` interface is the root of Collections**
Framework.
#### 147. What are the main differences between Collection and Collections?
Main differences between Collection and Collections are as
follows:
1. `Collection` is an interface in Java. But `Collections` is a class in Java.
2. `Collection` is a base interface. `Collections` is a utility class in Java.
3. `Collection` defines methods that are used for data structures that contain the objects. `Collections` defines the methods that are used for operations like access, find etc. on a Collection.

#### 148. What are the Thread-safe classes in Java Collections framework?

The Thread-safe classes in Java Collections framework are:

* `Stack`
* `Properties`
* `Vector`
* `Hashtable`
* `BlockingQueue`
* `ConcurrentMap`
* `ConcurrentNavigableMap`

#### 149. How will you efficiently remove elements while iterating a Collection?

The right way to remove elements from a collection while iterating
is by using `ListIterator.remove()` method.

E.g.
```java
ListIterator<Integer> iter = myList.iterator();
while(iter.hasNext()) {
itr.remove();
}
```

Some developers use following code to remove an element which is incorrect:

```java
Iterator<Integer> iter = myList.iterator();
while(iter.hasNext()) {
itr.remove();
}
```

By doing so we get `ConcurrentModificationException`. An iterator is first created to traverse the list. But at the same time the list is changed by `remove()` method.
In Java, it is not allowed for a thread to modify a collection while
another thread is iterating it. ListIterator provides the capability of
removing an object during traversal.

#### 150. How will you convert a List into an array of integers like- int[ ]?

We can use ArrayUtils class in Apache Commons Lang library.
Sample code is:

```java
int[]intArray = ArrayUtils.toPrimitive(myList.toArray(newInteger[0]));
```

If we use List.toArray(), it will convert List to Integer[].
Another option is:
```java
int[] intArray = new int[myList.size()];
for (int i=0; i < myList.size(); i++) {
    intArray [i] = myList.get(i);
}
```

#### 151. How will you convert an array of primitive integers int[] to a List collection?

We can use ArrayUtils in Apache Commons Lang library for this
purpose.
Sample code is:

```java
List intList = Arrays.asList(ArrayUtils.toObject(intArray));
```

The other option would be to use a for loop and explicitly adding
integers to a List.
Sample code is:

```java
int[]intArray = {10,20,30};
List<Integer> intList = new ArrayList<Integer>();
for (int i: intArray) {
    intList.add(i);
}
```
#### 152. How will you run a filter on a Collection?
We can use CollectionUtils of Apache for this purpose. We will
have to create a Predicate that will define the condition for our
filter. Then we can apply this Predicate in filter() method.
Sample code is:
In this example we filter any names that are less than 5 characters
long.
```java
List<String> namesList = asList( "Red", "Blue", "Green" );
List<String> shortNamesList = new ArrayList<String>();
shortNamesList.addAll( namesList );
CollectionUtils.filter( shortNamesList, new Predicate(){
    public boolean evaluate( Object input ) {
        return ((String) input).length() < 5;
    }
} );
```

We can also use Google Guava library for this.
In Java 8, we can use Predicate to filter a Collection through
Stream.

#### 153. How will you convert a List to a Set?

There are two ways to convert a List to a Set in Java.
Option 1: Use `HashSet`

```java
Set<Integer> mySet = new HashSet<Integer>(myList);
```

In this case we put a list into a HashSet. Internally `hashCode()`
method is used to identify duplicate elements.
Option 2: Use `TreeSet`
In this case we use our own comparator to find duplicate objects.

```java
Set<Integer> mySet = new TreeSet<Integer>(myComparator);
mySet.addAll(myList);
```

#### 154. How will you remove duplicate elements from an ArrayList?

The trick in this question is to use a collection that does not allow
duplicate elements. So we use a Set for this purpose.
Option 1: Use `Set`
If ordering of elements is not important then we just put the elements of `ArrayList` in a `HashSet` and then add them back to the `ArrayList`.
Sample Code is:

```java
ArrayList myList = // ArrayList with duplicate elements
Set<Integer> mySet = new HashSet<Integer>(myList);
myList.clear();
myList.addAll(mySet);
```

Option 2: Use `LinkedHashSet`
If ordering of elements is important then we put the elements of
`ArrayList` in a `LinkedHashSet` and then add them back to the
ArrayList.
Sample Code is:

```java
ArrayList myList = // ArrayList with duplicate elements
Set<Integer> mySet = new LinkedHashSet<Integer>(myList);
myList.clear();
myList.addAll(mySet);
```

#### 155. How can you maintain a Collection with elements in Sorted order?

In Java, there are many ways to maintain a Collection with elements in sorted order.

Some collections like `TreeSet` store elements in the natural ordering. In case of natural ordering we have to implement Comparable interface for comparing the elements.We can also maintain custom ordering by providing a custom Comparator to a Collection.

Another option is to use the utility method `Collections.sort()` to sort a List. This sorting gives nlog(n) order of performance. But if we have to use this method multiple times then it will be costly on performance.

Another option is to use a `PriorityQueue` that provides an ordered queue. The main difference between `PriorityQueue` and `Collections.sort()` is that `PriorityQueue` maintains a queue in Order.

all the time, but we can only retrieve head element from queue. We cannot access the elements of PriorityQueue in Random order. We can use `TreeSet` to maintain sorted order of elements in collection if there are no duplicate elements in collection.

#### 156. What are the differences between the two data structures: a `Vector` and an `ArrayList`?

An `ArrayList` is a newer class than a `Vector`. A `Vector` is considered a legacy class in Java. The differences are:

1. **Synchronization**: Vector is synchronized, but the ArrayList is not synchronized. So an ArrayList has faster operations than a Vector.
2. **Data Growth**: Internally both an ArrayList and Vector use an array to store data. When an ArrayList is almost full it increases its size by 50% of the array size. Whereas a Vector increases it by doubling the underlying array size.

#### 157. What are the differences between Collection and Collections in Java?

Main differences between Collection and Collections are:

1. **Type**: Collection is an interface in Java. Collections is a class.
2. **Features**: Collection interface provides basic features of data structure to List, Set and Queue interfaces. Collections is a utility class to sort and synchronize collection elements. It has polymorphic algorithms to operate on collections.
3. **Method Type**: Most of the methods in Collection are at instance level. Collections class has mainly static methods that can work on an instance of Collection.

#### 158. In which scenario, `LinkedList` is better than `ArrayList` in Java?

`ArrayList` is more popular than `LinkedList` in Java due to its ease of
use and random access to elements feature.

But `LinkedList` is better in the scenario when we do not need random access to elements or there are a lot of insertion, deletion of elements.

#### 159. What are the differences between a List and Set collection in Java?

Main differences between a `List` and a `Set` are:

1. **Order**: List collection is an ordered sequence of elements. A Set is just a distinct collection of elements that is unordered.
2. **Positional Access**: When we use a `List`, we can specify where exactly we want to insert an element. In a `Set` there is no order, so we can insert element anywhere without worrying about order.
3. **Duplicate**: In a List we can store duplicate elements. A `Set` can hold only unique elements.

#### 160. What are the differences between a HashSet and TreeSet collection in Java?

Main differences between a `HashSet` and `TreeSet` are:

1. **Ordering**: In a HashSet elements are stored in a random order. In a TreeSet, elements are stored according to natural ordering.
2.** Null Value Element**: We can store null value object in a `HashSet`. A TreeSet does not allow to add a null value
object.
3. **Performance**: `HashSet` performs basic operations like `add()`, `remove()`, `contains()`, `size()` etc in a constant size time. A `TreeSet` performs these operations at the order of
log(n) time.
4. **Speed**: A HashSet is better than a TreeSet in performance
for most of operations like add(), remove(), contains(),
size() etc .
5. **Internal Structure**: a HashMap in Java internally backs a
HashSet. A NavigableMap backs a TreeSet internally.
6. **Features**: A TreeSet has more features compared to a
HashSet. It has methods like `pollFirst()`, `pollLast()`, `first()`,
`last()`, `ceiling()`, `lower()` etc.
7. **Element Comparison**: A HashSet uses equals() method for
comparison. A TreeSet uses compareTo() method forcomparison to maintain ordering of elements.

#### 161. In Java, how will you decide when to use a `List`, `Set` or a `Map` collection?

1. If we want a Collection that does not store duplicate values, then we use a `Set` based collection.
2. If we want to frequently access elements operations based on an index value then we use a `List` based collection. E.g. `ArrayList`
3. If we want to maintain the insertion order of elements in a
collection then we use a `List` based collection.
4. For fast search operation based on a key, value pair, we
use a `HashMap` based collection.
5. If we want to maintain the elements in a sorted order, then
we use a `TreeSet` based collection.

#### 162. What are the differences between a `HashMap` and a `Hashtable` in Java?

Main differences between a HashMap and a Hashtable are:

1. **Synchronization**: `HashMap` is not a synchronized collection. If it is used in multi-thread environment, it may not provide thread safety. A `Hashtable` is a synchronized collection. Not more than one thread can access a `Hashtable` at a given moment of time. The thread that works on Hashtable acquires a lock on it and it makes other threads wait till its work is completed.
2. **Null values**: A HashMap allows only one null key and any number of null values. A Hashtable does not allow null keys and null values.
3. **Ordering**: A `HashMap` implementation by `LinkedHashMap` maintains the insertion order of elements. A `TreeMap` sorts the mappings based on the ascending order of keys. On the other hand, a Hashtable does not provide guarantee of any kind of order of elements. It does not maintain the mappings of key values in any specific order.
4. **Legacy**: Hashtable was not the initial part of collection framework in Java. It has been made a collection framework member, after being retrofitted to implement the Map interface. A HashMap implements Map interface and is a part of collection framework since the beginning.
5. **Iterator**: The Iterator of HashMap is a fail-fast and it throws `ConcurrentModificationException` if any other Thread modifies the map by inserting or removing any element except iterator’s own `remove()` method.Enumerator of the `Hashtable` is not fail-fast.

#### 163. What are the differences between a `HashMap` and a `TreeMap`?

Main differences between a `HashMap` and a `TreeMap` in Java are:

1. **Order**: A `HashMap` does not maintain any order of its keys.
In a `HashMap` there is no guarantee that the element inserted first will be retrieved first.  In a `TreeMap` elements are stored according to natural ordering of elements. A `TreeMap` uses `compareTo()` method to store elements in a natural order.
2. **Internal Implementation:** A `HashMap` uses Hashing internally. A `TreeMap` internally uses Red-Black tree implementation.
3. **Parent Interfaces:** A `HashMap` implements Map interface.
`TreeMap` implements `NavigableMap` interface.
4. **Null values**: A `HashMap` can store one null key and
multiple null values. A `TreeMap` can not contain null key
but it may contain multiple null values.
5. **Performance:** A `HashMap` gives constant time performance for operations like `get()` and `put()`. A `TreeMap` gives order of log(n) time performance for `get()` and `put()` methods.
6. **Comparison:** A HashMap uses `equals()` method to compare keys. A `TreeMap` uses `compareTo()` method for maintaining natural ordering.
8. **Features:** A `TreeMap` has more features than a `HashMap`. It has methods like `pollFirstEntry()` , `pollLastEntry()` , `tailMap()` , `firstKey()` , `lastKey()` etc. that are not provided by a `HashMap`.

#### 164. What are the differences between Comparable and Comparator?

Main differences between Comparable and Comparator are:

1. **Type**: Comparable<T> is an interface in Java where T is the type of objects that this object may be compared to. 
2. Comparator<T> is also an interface where T is the type of objects that may be compared by this comparator.
3. **Sorting**: In Comparable, we can only create one sort sequence. In Comparator we can create multiple sort sequences.
4. **Method Used**: `Comparator<T>` interface in Java has method `public int compare (Object o1, Object o2)` that returns a negative integer, zero, or a positive integer when the object o1 is less than, equal to, or greater than the
object o2. A `Comparable<T>` interface has method `public int compareTo(Object o)` that returns a negative integer,zero, or a positive integer when this object is less than, equal to, or greater than the object o.
5. **Objects for Comparison**: The `Comparator` compares two objects given to it as input. `Comparable` interface compares "this" reference with the object given as input.
6. **Package location**: `Comparable` interface in Java is defined in `java.lang` package. `Comparator` interface in Java is defined in `java.util` package.

#### 165. In Java, what is the purpose of Properties file?

A Properties file in Java is a list of key-value pairs that can be
parsed by java.util.Properties class.
Generally a Properties file has extension .properties e.g.
myapp.properties.

Properties files are used for many purposes in all kinds of Java applications. Some of the uses are to store configuration, initial data, application options etc.

When we change the value of a key in a properties file, there is no need to recompile the Java application. So it provides benefit of
changing values at runtime.

#### 166. What is the reason for overriding equals() method?

The equals() method in Object class is used to check whether two
objects are same or not. If we want a custom implementation we can
override this method.

For example, a Person class has first name, last name and age. If we want two Person objects to be equal based on name and age, then we can override equals() method to compare the first name, last name and age of Person objects.
Generally in HashMap implementation, if we want to use an object
as key, then we override equals() method.

#### 167. How does `hashCode()` method work in Java?

Object class in Java has `hashCode()` method. This method returns a hash code value, which is an integer. The `hashCode()` is a native method and its implementation is not pure Java. Java doesn't generate `hashCode()`. However, Object generates a HashCode based on the memory address of the instance of the
object.

If two objects are same then their `hashCode()` is also same.

#### 168. Is it a good idea to use Generics in collections?

Yes. A collection is a group of elements put together in an order or based on a property. Often the type of element can vary. But the properties and behavior of a Collection remains same. Therefore it is good to create a Collection with Generics so that it is type-safe and it can be used with wide variety of element