package javainterview.java.ocp.ch3;

import org.junit.Test;

/**
 * D_Understanding_Java_Arrays
 * 
 * 
 * An array is an area of memory on the heap with space for a designated number
 * of elements. A String is implemented as an array with some methods that you
 * might want to use when dealing with characters specifically. A StringBuilder
 * is implemented as an array where the array object is replaced with a new
 * bigger array object when it runs out of space to store all the characters. A
 * big difference is that an array can be of any other Java type. If we didn't
 * want to use a String for some reason, we could use an array of char
 * primitives directly char[] letters; This wouldn't be very convenient because
 * we’d lose all the special properties String gives us, such as writing “Java”.
 * Keep in mind that letters is a reference variable and not a primitive. char
 * is a primitive. But char is what goes into the array and not the type of the
 * array itself. In other words, an array is an ordered list. It can contain
 * duplicates.
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class D_A_Creating_an_Array_of_Primitives {

	@Test
	public void creating_an_Array_of_Primitives_1() {
		// The most common way to create an array
		int[] numbers1 = new int[3];
		/*-
		It specifies the type of the array (int) and the size (3)
		The brackets tell you this is an array
		When using this form to instantiate an array, set all the elements to the default value for that type. As you learned in Chapter 1, the default value of an int is 0
		 element      0   0   0
		              _   _   _
		 index        0   1   2                                         */
	}

	@Test
	public void creating_an_Array_of_Primitives_2() {
		// Another way to create an array is to specify all the elements it
		// should start out with
		int[] numbers2 = new int[] { 42, 55, 99 };
		// In this example, we also create an int array of size 3. This time, we
		// specify the initial values of those three elements instead of using
		// the defaults
		/*-
		   element      42  55  99
		                _   _   _
		  index         0   1   2
		 */
		/*
		 * Java recognizes that this expression is redundant. Since you are
		 * specifying the type of the array on the left side of the equal sign,
		 * Java already knows the type. And since you are specifying the initial
		 * values, it already knows the size
		 */

		int[] numbers3 = { 42, 55, 99 };
		// This approach is called an "anonymous array". It is anonymous because
		// you don’t specify the type and size
		// Finally, you can type the [] before or after the name, and adding a
		// space
		int[] numAnimals;
		int[] numAnimals2;
		int numAnimals3[];
		int numAnimals4[];
		// Most people use the first one
	}

	@Test
	public void multipleArraysInDeclarations() {
		int[] ids, types;
		// is two variables of type int[].

		int ids1[], types1;
		/*
		 * The first one is called ids[]. This one is a int[] called ids. The
		 * second one is just called types. No brackets, so it is a regular
		 * integer. Needless to say, you shouldn't write code that looks like
		 * this
		 */
	}
}