package javainterview.java.basic;

/**
 * Difference between == and .equals() method in Java
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
// Java program to understand
// the concept of == operator
public class EqualsTest {
	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
