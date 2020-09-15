package javainterview.java.ocp.ch1;
/**
 * 
 * F_distinguishing_Between_Object_References_and_Primitives
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class F_B_ReferenceTypes {
    /*-
    A reference type refers to an object (an instance of a class).
    Unlike primitive types that hold their values in the memory where the variable is allocated, references do not hold the value of the object they refer to.
    Instead, a reference “points” to an object by storing the memory address where the object is located, a concept referred to as a pointer.
    Unlike other languages, Java does not allow you to learn what the physical memory address is.
    You can only use the reference to refer to the object.
    Let’s take a look at some examples that declare and initialize reference types. Suppose we declare a reference of type java.util.Date and a reference of type String:
        java.util.Date today;
        String greeting;
    The today variable is a reference of type Date and can only point to a Date object.
    The greeting variable is a reference that can only point to a String object. A value is assigned to a reference in one of two ways:
         -  A reference can be assigned to another object of the same type.
         -  A reference can be assigned to a new object using the new keyword.
    For example, the following statements assign these references to new objects:
        today = new java.util.Date();
        greeting = "How are you?";
    The today reference now points to a new Date object in memory, and today can be used to access the various fields and methods of this Date object.
    Similarly, the greeting reference points to a new String object, "How are you?". The String and Date objects do not have names and can be accessed only via their corresponding reference.
    Figure 1.1 shows how the reference types appear in memory.
    A Date reference                 A Date object
     __________                     ___________________
    |today |   |                    |day   month   year|
    |______|___|----------------->  |---   ----    ----|
                                    |29      7     2011|
                                    |__________________|
    A String reference      A String object
     ____________            ______________
    |gretting|   |          | How are you? |
    |________|___| -------->|______________|            */
}