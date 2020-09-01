package javainterview.java.core.basic;

/**
 *  Difference between == and .equals() method in Java
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

// Java program to illustrate
// == operator for compatible data
// types
public class EqualsTest2 {
	public static void main(String[] args) {
		// integer-type
		System.out.println(10 == 20);

		// char-type
		System.out.println('a' == 'b');

		// char and double type
		System.out.println('a' == 97.0);

		// boolean type
		System.out.println(true == true);
	}
}
