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

public class A_C_The_String_Pool {
	/* strings use up a lot of memory */
	/*
	 * The string pool, also known as the intern pool, is a location in the Java
	 * virtual machine (JVM) that collects all these strings.
	 */

	@Test
	public void theStringPool_1() {
		/*
		 * The string pool contains literal values that appear in your program.
		 * For example, "name" is a literal and therefore goes into the string
		 * pool.
		 */
		/*
		 * myObject.toString() is a string but not a literal, Strings not in the
		 * string pool are garbage collected
		 */
		String name1 = "Fluffy";
		String name2 = new String("Fluffy");// create a new object for me even
											// though it is less efficient.
		// For the exam, you need to know that it is allowed
	}
}