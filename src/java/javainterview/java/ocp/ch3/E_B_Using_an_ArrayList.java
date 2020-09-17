package javainterview.java.ocp.ch3;

import java.util.ArrayList;
import java.util.List;

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

public class E_B_Using_an_ArrayList {
	/*-
	 a “class” named E
	 E is used by convention in generics to mean “any class that this array can hold.”
	 If you didn’t specify a type when creating the ArrayList, E means Object.
	 You should also know that ArrayList implements toString() so you can easily see the contents just by printing it
	 Arrays do not do produce such pretty output.
	 */

	@Test
	public void add() {
		// Insert a new value in the ArrayList
		/*-      boolean add(E element) -->It always returns true
		        void add(int index, E element)                  */
		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]
		// we didn’t specify a type for ArrayList; therefore, the type is
		// Object, which includes everything except primitives.
	}

	@Test
	public void add_1() {
		// Now, let’s use generics to tell the compiler we only want to allow
		// String objects in our ArrayList:
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		// safer.add(Boolean.TRUE); // DOES NOT COMPILE

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]
	}

	@Test
	public void remove() {
		// remove the first matching value in the ArrayList or remove the
		// element at a specified index.
		/*-      boolean remove(Object object)
		        E remove(int index)             */
		// This time the boolean return value tells us whether a match was
		// removed.
		// The E return type is the element that actually got removed
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.remove("cardinal")); // prints false
		System.out.println(birds.remove("hawk")); // prints true
		System.out.println(birds.remove(0)); // prints hawk
		System.out.println(birds); // []
	}

	@Test
	public void set() {
		// Changes one of the elements of the ArrayList without changing the
		// size.
		/* E set(int index, E newElement) */
		// The E return type is the element that got replaced.
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		System.out.println(birds.size()); // 1
		birds.set(0, "robin"); // [robin]
		System.out.println(birds.size()); // 1
		birds.set(1, "robin"); // IndexOutOfBoundsException
	}

	@Test
	public void isEmpty_and_Size() {
		// look at how many of the slots are in use.
		/*
		 * boolean isEmpty() int size()
		 */
		List<String> birds = new ArrayList<>();
		System.out.println(birds.isEmpty()); // true
		System.out.println(birds.size()); // 0
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.isEmpty()); // false
		System.out.println(birds.size()); // 2
	}

	@Test
	public void clear() {
		// Provides an easy way to discard all elements of the ArrayList
		/* void clear() */
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.isEmpty()); // false
		System.out.println(birds.size()); // 2
		birds.clear(); // []
		System.out.println(birds.isEmpty()); // true
		System.out.println(birds.size()); // 0
		// After we call clear(), birds is back to being an empty ArrayList of
		// size 0
	}

	@Test
	public void contains() {
		// checks whether a certain value is in the ArrayList.
		/* boolean contains(Object object) */
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		System.out.println(birds.contains("hawk")); // true
		System.out.println(birds.contains("robin")); // false
		// This method calls equals() on each element of the ArrayList to see
		// whether there are any matches. Since String implements equals(), this
		// works out well.
	}

	@Test
	public void equals() {
		/*
		 * ArrayList has a custom implementation of equals() so you can compare
		 * two lists to see if they contain the same elements in the same order
		 * boolean equals(Object object)
		 */
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a"); // [a]
		System.out.println(one.equals(two)); // false
		two.add("a"); // [a]
		System.out.println(one.equals(two)); // true
		one.add("b"); // [a,b]
		two.add(0, "b"); // [b,a]
		System.out.println(one.equals(two)); // false
	}
}