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
public class C_I_Static_Initialization {
    /*  In Chapter 1, we covered instance initializers that looked like unnamed methods.
        Just code inside braces. Static initializers look similar.
        They add the "static" keyword to specify they should be run when the class is first used    */
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
    /*
    The statements in it run and assign any static variables as needed.
    We just got through saying that final variables aren’t allowed to be reassigned.
    The key here is that the static initializer is the first assignment.
    And since it occurs up front, it is okay.
     */
}

class OtherClass {
    private static int one; //declares static variable that is not final. It can be assigned as many times as we like.
    private static final int two; //declares a final variable without initializing it. This means we can initialize it exactly once in a static block
    private static final int three = 3;
    //private static final int four; // DOES NOT COMPILE
    /*
    declares a final variable that never gets initialized.
    The compiler gives a compiler error because it knows that the static blocks are the only place the variable could possibly get initialized.
    Since the programmer forgot, this is clearly an error
     */
    static {
        one = 1;
        two = 2;
        //three = 3; // DOES NOT COMPILE, We are not allowed to assign it again, so line 21 doesn’t compile
        //two = 4;  // DOES NOT COMPILE //doesn’t compile because this is the second attempt
    }
}
/*-
Try to Avoid Static and Instance Initializers
============================================
Using static and instance initializers can make your code much harder to read.
Everything that could be done in an instance initializer could be done in a constructor instead.
The constructor approach is easier to read.

There is a common case to use a static initializer:
when you need to initialize a static field and the code to do so requires more than one line.
This often occurs when you want to initialize a collection like an ArrayList.
When you do need to use a static initializer, put all the static initialization in the same block.
That way, the order is obvious.
 */