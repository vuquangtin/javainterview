package javainterview.java.ocp.ch3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * E_Understanding_an_ArrayList
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class E_A_Creating_an_ArrayList {
	/*-
	- An array has one glaring shortcoming (defecto flagrante)
	- you have to know how many elements will be in the array when you create it and then you are stuck with that choice.
	  (cuantos elementos habra en la mareiz cuando los creas, te quedas con esa eleccion)
	- Just like a StringBuilder, ArrayList can change size at runtime as needed
	- Like an array, an ArrayList is an ordered sequence that allows duplicates.
	- As when we used Arrays.sort, ArrayList requires an import
	import java.util.*                  // import whole package including ArrayList
	import java.util.ArrayList;         // import just ArrayList
	In this section, we’ll look at creating an ArrayList, common methods, autoboxing, conversion, and sorting.
	 */
	@Test
	public void creating_an_ArrayList_1() {
		// Java 5
		// As with StringBuilder, there are three ways to create an ArrayList:
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		/*-
		The first says to create an ArrayList containing space for the default number of elements but not to fill any slots yet
		The second says to create an ArrayList containing a specific number of slots, but again not to assign any
		The final example tells Java that we want to make a copy of another ArrayList. We copy both the size and contents of that ArrayList
		 */
		// Java 5 introduced generics: which allow you to specify the type of
		// class that the ArrayList will contain
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		/*-
		Java 5 allows you to tell the compiler what the type would be by specifying it between < and >.
		in Java 7, you can even omit that type from the right side. T
		This is called the "diamond operator" because <> looks like a diamond.
		there is one more thing you need to know
		ArrayList implements an interface called List.
		just know that you can store an ArrayList in a List reference variable but not viceversa.
		The reason is that List is an interface and interfaces can’t be instantiated
		 */

		List<String> list6 = new ArrayList<>();
		// ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
	}
}