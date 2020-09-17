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

public class C_E_Static_Interface_Methods {}
/*
Java 8 also now includes support for static methods within interfaces.
These methods are defined explicitly with the static keyword and function nearly identically to static methods defined in classes, as discussed in Chapter 4.
In fact, there is really only one distinction between a static method in a class and an interface.
A static method defined in an interface is not inherited in any classes that implement the interface.
Here are the static interface method rules you need to be familiar with:
    1. Like all methods in an interface, a static method is assumed to be public and will not compile if marked as private or protected.
    2. To reference the static method, a reference to the name of the interface must be used.

The following is an example of a static method defined in an interface:
*/
    /*public*/ interface Hop {
        static int getJumpHeight() {
            return 8;
        }
    }
/*
The method getJumpHeight() works just like a static method as defined in a class.
In other words, it can be accessed without an instance of the class using the Hop.getJumpHeight() syntax.
Also, note that the compiler will automatically insert the access modifier public since all methods in interfaces are assumed to be public.
The following is an example of a class Bunny that implements Hop:
/*
    /*public*/ class Bunny implements Hop {
        public void printDetails() {
            //System.out.println(getJumpHeight()); // DOES NOT COMPILE
        }
    }
/*
As you can see, without an explicit reference to the name of the interface the code will not compile, even though Bunny implements Hop.
In this manner, the static interface methods are not inherited by a class implementing the interface.
The following modified version of the code resolves the issue with a reference to the interface name Hop:
*/
    /*public*/ class Bunny2 implements Hop {
        public void printDetails() {
            System.out.println(Hop.getJumpHeight());
        }
    }
/*
It follows, then, that a class that implements two interfaces containing static methods with the same signature will still compile at runtime,
because the static methods are not inherited by the subclass and must be accessed with a reference to the interface name.
Contrast this with the behavior you saw for default interface methods in the previous section:
the code would compile if the subclass overrode the default methods and would fail to compile otherwise.
You can see that static interface methods have none of the same multiple inheritance issues and rules as default interface methods do.
*/