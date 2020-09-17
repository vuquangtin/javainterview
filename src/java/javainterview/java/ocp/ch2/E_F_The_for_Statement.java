package javainterview.java.ocp.ch2;

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

public class E_F_The_for_Statement {

	@Test
	public void theForStatement() {
		// loops to a more complex repetition control structure

		/********************* The Basic for Statement ***********************/

		/*
		 * for(initialization; booleanExpression; updateStatement) { // Body }
		 */
		// The initialization and update sections may contain multiple
		// statements, separated by commas.
		// 1.-Variables declared in the initialization block of a for loop have
		// limited scope and are only accessible within the for loop
	}

	// basic example

	@Test
	public void theForStatement_1() {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		// Output: 0 1 2 3 4 5 6 7 8 9
		// The local variable i is initialized first to 0. The variable i is
		// only in scope for the duration of the loop and is not available
		// outside the loop once the loop has completed
		// there are a number of variations and edge cases you could see on the
		// exam.
	}

	@Test
	public void theForStatement_2() {
		/* 1. Creating an Infinite Loop */
		for (;;) {
			System.out.println("Hello World");
		}

		// for( ) will not compile.
	}

	@Test
	public void theForStatement_3() {
		/* 2. Adding Multiple Terms to the for Statement */
		int x = 0;
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print("x: " + x);
		// you can declare a variable, such as x in this example, before the
		// loop begins and use it after it completes
		// your initialization block, boolean expression, and update statements
		// can include extra variables that may not reference each other. For
		// example,
		// z is defined in the initialization block and is never used
		// the update statement can modify multiple variables.
		// Output: 0 1 2 3 4 5
	}

	@Test
	public void theForStatement_4() {
		/* 3. Redeclaring a Variable in the Initialization Block */
		int x = 0;
		/*-
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {// DOES NOT COMPILE, porque x es int, luego lo redeclaran a long
		    System.out.print(x + " ");
		}
		 */
	}

	@Test
	public void theForStatement_5() {
		int x = 0;
		long y = 10;
		// compila porque en el bloque de inicializacion asigna un valor a x
		// pero no la declara
		for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(x + " ");
		}
	}

	@Test
	public void theForStatement_6() {
		/* 4. Using Incompatible Data Types in the Initialization Block */
		// The variables in the initialization block must all be of the same
		// type.
		/*-
		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {// DOES NOT COMPILE
		    System.out.print(x + " ");
		}
		 */
	}

	@Test
	public void theForStatement_7() {
		/* 5. Using Loop Variables Outside the Loop */
		for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		// System.out.print(x); // DOES NOT COMPILE
		// Since x was only scoped for the loop, using it outside the loop will
		// throw a compiler error.
	}

	/*************************** The for-each Statement ****************************/
	// designed for iterating over arrays and Collection objects
	/*-
	for(datatype instance : collection) {
	    // Body
	}
	 */
	// composed of an initialization section and an object to be iterated over.
	// The right-hand side must be a built-in Java array or an object whose
	// class implements java.lang.Iterable, which includes most of the Java
	// Collections framework.
	@Test
	public void theForStatement_8() {
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for (String name : names) {
			System.out.print(name + ", ");
		}
		// output: Lisa, Kevin, Roger,
	}

	@Test
	public void theForStatement_9() {
		java.util.List<String> values = new java.util.ArrayList<>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for (String value : values) {
			System.out.print(value + ", ");
		}
		// output: Lisa, Kevin, Roger,
	}

	@Test
	public void theForStatement_10() {
		String names2 = "Lisa";
		/*-
		for(String name : names2) { // DOES NOT COMPILE, xq the String names2 is not an array, nor does it implement java.lang. Iterable,
		    System.out.print(name + " ");
		}
		 */
		String[] names3 = new String[3];
		/*-
		for(int name : names3) { // DOES NOT COMPILE, statement does not define an instance of String
		    System.out.print(name + " ");
		}
		 */
	}
}