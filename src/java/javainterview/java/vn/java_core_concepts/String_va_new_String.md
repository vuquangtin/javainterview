# What is the difference between “text” and new String(“text”)?
-----


What is the difference between these two following statements?

```java
String s = "text";

String s = new String("text");
```

>```new String("text")```; explicitly creates a new and referentially distinct instance of a ```String``` object; ```String s = "text"```; may reuse an instance from the string constant pool if one is available.

You very rarely would ever want to use the new String(anotherString) constructor. From the API:

>String(String original) : Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string. Unless an explicit copy of original is needed, use of this constructor is unnecessary since strings are immutable. 


## What referential distinction means

Examine the following snippet:

```java
    String s1 = "foobar";
    String s2 = "foobar";

    System.out.println(s1 == s2);      // true

    s2 = new String("foobar");
    System.out.println(s1 == s2);      // false
    System.out.println(s1.equals(s2)); // true
```

== on two reference types is a reference identity comparison. Two objects that are equals are not necessarily ==. It is usually wrong to use == on reference types; most of the time equals need to be used instead.

Nonetheless, if for whatever reason you need to create two equals but not == string, you can use the new String(anotherString) constructor. It needs to be said again, however, that this is very peculiar, and is rarely the intention.

## References

- <a href='http://java.sun.com/docs/books/jls/third_edition/html/expressions.html#15.21.3'> JLS 15.21.3 Reference Equality Operators == and !=</a>
- <a href='http://java.sun.com/javase/6/docs/api/java/lang/Object.html#equals%28java.lang.Object%29'>class Object - boolean Object(equals)</a>

Related issues

- <a href='https://stackoverflow.com/questions/767372/java-string-equals-versus'>Java String.equals versus ==</a>
- <a href='https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java'>How do I compare strings in Java?</a>
