package javainterview.java.ocp.ch5;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_C_Creating_Java_Objects {
/*
Throughout our discussion of Java in this book, we have thrown around the word object numerous times—and with good reason.
In Java, all classes inherit from a single class, java.lang.Object. Furthermore, java.lang.Object is the only class that doesn’t have any parent classes.
You might be wondering, “None of the classes I’ve written so far extend java.lang.Object, so how do all classes inherit from it?” The answer is that the compiler has been
automatically inserting code into any class you write that doesn’t extend a specific class.
For example, consider the following two equivalent class definitions:
*/
public class Zoo {
}

public class Zoo2 extends java.lang.Object {
}
/*-
The key is that when Java sees you define a class that doesn’t extend another class, it immediately adds the syntax extends java.lang.Object to the class definition.
If you define a new class that extends an existing class, Java doesn’t add this syntax, although the new class still inherits from java.lang.Object. Since all classes inherit from
java.lang.Object, extending an existing class means the child automatically inherits from java.lang.Object by construction.
This means that if you look at the inheritance structure of any class, it will always end with java.lang.Object on the top of the tree, as shown inFigure 5.3.

FIGURE 5.3 Java object inheritance

        java.lang.Object
                |
                .
                .
                .
                |
             Mannal
                |
                |
               0x
(All objects inherit java.lang.Object)

*/
}
