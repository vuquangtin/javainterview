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

public class D_B_Casting_Objects {
/*
In the previous example, we created a single instance of a Lemur object and accessed it via superclass and interface references.
Once we changed the reference type, though, we lost access to more specific methods defined in the subclass that still exist within the object.
We can reclaim those references by casting the object back to the specific sub-class it came from:
*/
}
/*public*/ class Lemur3 extends Primate implements TieneCola {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur3 lemur3 = new Lemur3();

        Primate primate = lemur3;
        //Lemur3 lemur = primate; // DOES NOT COMPILE: try to convert the primate reference back to a lemur reference.
        Lemur3 lemur = (Lemur3) primate;

        System.out.println(lemur3.age);
    }
}
/*
In this example, we first try to convert the primate reference back to a lemur reference, lemur2, without an explicit cast.
The result is that the code will not compile.
In the second example, though, we explicitly cast the object to a subclass of the object Primate and we gain access to all the methods available to the Lemur class.
Here are some basic rules to keep in mind when casting variables:

    1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
    2. Casting an object from a superclass to a subclass requires an explicit cast.
    3. The compiler will not allow casts to unrelated types.
    4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class.

The third rule is important; the exam may try to trick you with a cast that the compiler doesn’t allow.
For example, we were able to cast a Primate reference to a Lemur reference, because Lemur is a subclass of Primate and therefore related.

Consider this example:
*/
/*public*/ class Ave {}

/*public*/ class Pescado {
    public static void main(String[] args) {
        Pescado pescado = new Pescado();
        //Ave ave = (Ave)pescado; // DOES NOT COMPILE, xq no tiene relacion
    }
}
/*
In this example, the classes Fish and Bird are not related through any class hierarchy that the compiler is aware of; therefore, the code will not compile.
Casting is not without its limitations.
Even though two classes share a related hierarchy, that doesn’t mean an instance of one can automatically be cast to another.
Here’s an example:
*/
/*public*/ class Roedor4 {}

/*public*/ class Pikachu extends Roedor4 {
    public static void main(String[] args) {
        Roedor4 roedor = new Roedor4();
        Pikachu pikachu = (Pikachu) roedor; // Throws ClassCastException at runtime
    }
}
/*
This code creates an instance of Roedor and then tries to cast it to a subclass of Roedor, Pikachu.
Although this code will compile without issue, it will throw a ClassCastException at runtime since the object being referenced is not an instance of the Pikachu class.
The thing to keep in mind in this example is the object that was created is not related to the Pikachu class in any way.
============================================================================================================================================
Although this topic is out of scope for the OCA exam, keep in mind that the instanceof operator can be used to check whether an object belongs to a particular class and to prevent ClassCastExceptions at runtime.
Unlike the previous example, the following code snippet doesn’t throw an exception at runtime and performs the cast only if the instanceof operator returns true.
*/
/*public*/ class Pikachu2 extends Roedor4 {
    public static void main(String[] args) {
        Roedor4 roedor = new Roedor4();
        if(roedor instanceof Pikachu2) {
            Pikachu2 pikachu = (Pikachu2)roedor;
        }
    }
}
/*============================================================================================================================================
When reviewing a question on the exam that involves casting and polymorphism, be sure to remember what the instance of the object actually is.
Then, focus on whether the compiler will allow the object to be referenced with or without explicit casts.
*/