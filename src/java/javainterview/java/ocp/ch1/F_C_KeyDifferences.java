package javainterview.java.ocp.ch1;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class F_C_KeyDifferences {
	/*-  There are a few important differences you should know between primitives and reference types. First, reference types can be assigned null, 
	 * which means they do not currently refer to an object.
	 Primitive types will give you a compiler error if you attempt to assign them null. 
	 In this example, value cannot point to null because it is of type int:      */

	// int value = null; // DOES NOT COMPILE
	String s = null;

	/*-  Next, reference types can be used to call methods when they do not point to null. Primitives do not have methods declared on them.
	 In this example, we can call a method on reference since it is of a reference type. You can tell length is a method because it has () after it.
	  The following line is gibberish.
	 No methods exist on len because it is an int primitive. Primitives do not have methods.     */

	String reference = "hello";
	int len = reference.length();
	// int bad = len.length(); // DOES NOT COMPILE

	// Finally, notice that all the primitive types have lowercase type names.
	// All classes that come with Java begin with uppercase. You should follow
	// this convention for classes you create as well.

}