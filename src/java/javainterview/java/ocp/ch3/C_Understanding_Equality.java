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

public class C_Understanding_Equality {

	@Test
	public void understanding_Equality_1() {
		// you learned how to use == to compare numbers and that object
		// references refer to the same object
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a"); // chaining
		System.out.println(one == two); // false
		System.out.println(one == three); // true
	}

	@Test
	public void understanding_Equality_2() {
		// String equality, made so in part because of the way the JVM reuses
		// String literals:
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); // true
		/*
		 * Remember that Strings are immutable and literals are pooled. The JVM
		 * created only one literal in memory. x and y both point to the same
		 * location in memory; therefore, the statement outputs true.
		 */
	}

	@Test
	public void understanding_Equality_3() {
		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x == z); // false
		// Since it isn’t the same at compile-time, a new String object is
		// created.
	}

	@Test
	public void understanding_Equality_4() {
		String x = new String("Hello World");
		String y = "Hello World";
		System.out.println(x == y); // false
		// Since you have specifically requested a different String object, the
		// pooled value isn’t shared
	}

	// The lesson is to never use == to compare String objects. The only time
	// you should have to deal with == for Strings is on the exam

	@Test
	public void understanding_Equality_5() {
		/*
		 * You saw earlier that you can say you want logical equality rather
		 * than object equality for String objects:
		 */
		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x.equals(z)); // true
		// check the values inside the String rather than the String itself
		// If you call equals() on two StringBuilder instances, it will check
		// reference equality.
	}

	@Test
	public void understanding_Equality_6() {
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = t1;
		System.out.println(t1 == t1); // true
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t2)); // false
		// true: we are comparing references to the same object.
		// false: the two object references are different
	}

	class Tiger {
		String name;
	}
}