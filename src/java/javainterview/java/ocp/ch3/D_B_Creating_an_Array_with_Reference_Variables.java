package javainterview.java.ocp.ch3;

import org.junit.Test;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class D_B_Creating_an_Array_with_Reference_Variables {

	@Test
	public void creating_an_Array_with_Reference_Variables_1() {
		// You can choose any Java type to be the type of the array. This
		// includes classes you create yourself.
		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		/*-
		We can call equals() because an array is an object. It returns true because of reference equality
		The equals() method on arrays does not look at the elements of the array.
		last line is the hash code
		Since Java 5, Java has provided a method that prints an array nicely
		java.util.Arrays.toString(bugs); //output: [cricket, beetle, ladybug].
		 */
	}

	@Test
	public void creating_an_Array_with_Reference_Variables_2() {
		/*-
		 *  The array does not allocate space for the String objects. Instead, it allocates space for a reference to where the objects are really stored
		                    0           1           2
		                    -           -           -
		                    |           |           |
		                    V           V           V
		                 "cricket"   "beetle"   "ladybug"
		what do you think this array points to?
		class Names {
		    String names[];
		}
		The answer is null. The code never instantiated the array so it is just a reference variable to null
		what do you think this array points to?
		class Names {
		    String names[] = new String[2];
		}
		It is an array because it has brackets. It is an array of type String since that is the type mentioned in the declaration.
		It has two elements because the length is 2. Each of those two slots currently is null, but has the potential to point to a String object.
		Remember casting from the previous chapter when you wanted to force a bigger type into a smaller type?
		You can do that with arrays too:
		 */
		String[] strings = { "stringValue" }; // -->creates an array of type
												// String
		Object[] objects = strings; // -->doesn’t require a cast because Object
									// is a broader type than String.
		String[] againStrings = (String[]) objects; // -->a cast is needed
													// because we are moving to
													// a more specific type.
		// Strings[0] = new StringBuilder(); // DOES NOT COMPILE, because a
		// String[] only allows String objects and StringBuilder is not a
		// String.
		objects[0] = new StringBuilder(); // careful!
		/*
		 * From the point of view of the compiler, this is just fine. A
		 * StringBuilder object can clearly go in an Object[]. The problem is
		 * that we don’t actually have an Object[]. We have a String[] referred
		 * to from an Object[] variable. At runtime, the code throws an
		 * ArrayStoreException. You don’t need to memorize the name of this
		 * exception, but you do need to know that the code will throw an
		 * exception
		 */
	}
}