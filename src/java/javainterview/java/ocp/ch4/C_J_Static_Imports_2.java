package javainterview.java.ocp.ch4;


//import static java.util.Arrays; // DOES NOT COMPILE
/*
tries to use a static import to import a class.
Remember that static imports are only for importing static members.
Regular imports are for importing a class
*/

import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE

/*-
tries to see if you are paying attention to the order of keywords.
The syntax is import static and not viceversa.
*/
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_J_Static_Imports_2 {
    public static void main(String[] args) {
        // Arrays.asList("one"); // DOES NOT COMPILE
        // We imported the asList method on line 2. However, we did not import the Arrays class anywhere
    }
/*-
In Chapter 1, you learned that importing two classes with the same name gives a compiler error.
This is true of static imports as well.
The compiler will complain if you try to explicitly do a static import of two methods with the same name or two static variables with the same name

import static statics.A.TYPE;
import static statics.B.TYPE; // DOES NOT COMPILE

Luckily when this happens, we can just refer to the static members via their classname in
the code instead of trying to use a static import.
*/
}