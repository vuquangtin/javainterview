package javainterview.java.ocp.ch1;

import java.util.Random;

/**
 * D_creating_objects
 * 
 * Our programs wouldn't be able to do anything useful if we didn't have the
 * ability to create new objects. Remember that an object is an instance of a
 * class.
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class D_A_Constructors {
	// To create an instance of a class, all you have to do is write new before
	// it
	Random r = new Random();

	/*-
	First you declare the type that you’ll be creating (Random) and give the variable a name ( r). This gives Java a place to store a reference to the object.
	Then you write new Random() to actually create the object. Random() looks like a method since it is followed by parentheses.
	It’s called a constructor, which is a special type of method that creates a new object
	 */
	public D_A_Constructors() {
		System.out.println("in constructor");
	}

	/*-  There are two key points to note about the constructor:
	        - the name of the constructor matches the name of the class,
	        - and there’s no return type.               */

	public void Chick() {
	} // NOT A CONSTRUCTOR
}

/*-
 The purpose of a constructor is to initialize fields, although you can put any code in there.
 Another way to initialize fields is to do so directly on the line on which they’re declared. This example shows both approaches:  */

/* public */class Chicken {
	int numEggs = 0;// initialize on line
	String name;

	public Chicken() {
		name = "Duke";// initialize in constructor
	}
}