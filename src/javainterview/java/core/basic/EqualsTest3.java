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
// == operator for incompatible data types
public class EqualsTest3 {
	public static void main(String[] args) {
		Thread t = new Thread();
		Object o = new Object();
		String s = new String("GEEKS");

		System.out.println(t == o);
		System.out.println(o == s);

		// Uncomment to see error
		//System.out.println(t == s);
	}
}
