package javainterview.java.ocp.ch6.B_Subclasses;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class D_A_Subclasses {
    /*
    Now that you have a deeper understanding of exceptions, let’s look at overriding methods with exceptions in the method declaration.
    When a class overrides a method from a superclass or implements a method from an interface, it’s not allowed to add new checked exceptions to the method signature.
    For example, this code isn’t allowed
     */
}

class Hopper {
    public void hop() { }
}
class Bunny extends Hopper {
    //public void hop() throws CanNotHopException { } // DOES NOT COMPILE
}

class CanNotHopException extends Exception {
}

/*
Java knows hop() isn’t allowed to throw any checked exceptions because the superclass Hopper doesn’t declare any.
Imagine what would happen if subclasses could add checked exceptions—you could write code that calls Hopper’s hop() method and not handle any exceptions.
Then if Bunny was used in its place, the code wouldn’t know to handle or declare CanNotHopException.

A subclass is allowed to declare fewer exceptions than the superclass or interface. This is legal because callers are already handling them.
 */

class Hopper_2 {
    public void hop() throws CanNotHopException { }
}
class Bunny_2 extends Hopper_2 {
    public void hop() { }
}

/*
    A subclass not declaring an exception is similar to a method declaring it throws an exception that it never actually throws. This is perfectly legal.
    Similarly, a class is allowed to declare a subclass of an exception type. The idea is the same.
    The superclass or interface has already taken care of a broader type. Here’s an example:
 */

class Hopper_3 {
    public void hop() throws Exception { }
}
class Bunny_3 extends Hopper_3 {
    public void hop() throws CanNotHopException { }
}

/*
Bunny could declare that it throws Exception directly, or it could declare that it throws a more specifi c type of Exception. It could even declare that it throws nothing at all.
This rule applies only to checked exceptions. The following code is legal because it has a runtime exception in the subclass’s version:
 */

class Hopper_4 {
    public void hop() { }
}

class Bunny_4 extends Hopper_4 {
    public void hop() throws IllegalStateException { }
}

/*
The reason that it’s okay to declare new runtime exceptions in a subclass method is that the declaration is redundant.
Methods are free to throw any runtime exceptions they want without mentioning them in the method declaration
 */
