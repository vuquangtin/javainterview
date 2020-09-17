package javainterview.java.ocp.ch4;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_E_Designing_Static_Methods_and_Fields {
    /*-
    Static methods don’t require an instance of the class.
    They are shared among all users of the class.
    You can think of statics as being a member of the single class object that exist independently of any instances of that class

    Does Each Class Have Its Own Copy of the Code?
    Each class has a copy of the instance variables. There is only one copy of the code for the instance methods.
    Each instance of the class can call it as many times as it would like.
    However, each call of an instance method (or any method) gets space on the stack for method parameters and local variables.

    The same thing happens for static methods. There is one copy of the code. Parameters and local variables go on the stack.
    Just remember that only data gets its “own copy.” There is no need to duplicate copies of the code itself.
    That means you can call it by the classname.
    The main() method is a static method. That means you can call it by the classname.
     */
}

class Koala {
    public static int count = 0; // static variable

    public static void main(String[] args) { // static method
        System.out.println(count);
    }
}
/*
We said that the JVM basically calls Koala.main() to get the program started.
You can do this too. We can have a KoalaTester that does nothing but call the main() method
*/
class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]); // call static method
    }
}
/*-
static methods have two main purposes:

- For utility or helper methods that don’t require any object state.
 Since there is no need to access instance variables, having static methods eliminates the need for the caller to instantiate the object just to call the method.

-  For state that is shared by all instances of a class, like a counter. All instances must share the same state.
 Methods that merely use that state should be static as well.

 Let’s look at some examples covering other static concepts.
*/