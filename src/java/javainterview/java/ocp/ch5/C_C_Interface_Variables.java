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

public class C_C_Interface_Variables {}
/*
Let’s expand our discussion of interfaces to include interface variables, which can be defined within an interface.
Like interface methods, interface variables are assumed to be public. Unlike interface methods, though, interface variables are also assumed to be static and final.
Here are two interface variables rules:
    1. Interface variables are assumed to be public, static, and final. Therefore, marking a variable as private or protected will trigger a compiler error, as will marking any variable as abstract.
    2. The value of an interface variable must be set when it is declared since it is marked as final.
In this manner, interface variables are essentially constant variables defined on the interface level.
Because they are assumed to be static, they are accessible even without an instance of the interface.
Like our earlier CanFly example, the following two interface definitions are equivalent, because the compiler will automatically convert them both to the second example:
*/
    /*public*/ interface CanSwim3 {
        int MAXIMUM_DEPTH = 100;
        final static boolean UNDERWATER = true;
        public static final String TYPE = "Submersible";
    }

    /*public*/ interface CanSwim4 {
        public static final int MAXIMUM_DEPTH = 100;
        public static final boolean UNDERWATER = true;
        public static final String TYPE = "Submersible";
    }
/*
As we see in this example, the compile will automatically insert public static final to any constant interface variables it finds missing those modifiers.
Also note that it is a common coding practice to use uppercase letters to denote constant values within a class.

Based on these rules, it should come as no surprise that the following entries will not compile:
*/
    /*public*/ interface CanDig {
        //private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE, no private
        //protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE, public, no abstract
        //public static String TYPE; // DOES NOT COMPILE, value?
    }
/*
The first example, MAXIMUM_DEPTH, doesn’t compile because the private modifier is used, and all interface variables are assumed to be public.
The second line, UNDERWATER, doesn’t compile for two reasons.
It is marked as protected, which conflicts with the assumed modifier public, and it is marked as abstract, which conflicts with the assumed modifier final.
Finally, the last example, TYPE, doesn’t compile because it is missing a value.
Unlike the other examples, the modifiers are correct, but as you may remember from Chapter 4, you must provide a value to a static final member of the class when it is defined.
*/