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

public class EqualsTest4 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;

		String s1 = new String("GEEKS");
		String s2 = new String("GEEKS");

		System.out.println(t1 == t3);
		System.out.println(t1 == t2);
		System.out.println(s1 == s2);

		System.out.println(t1.equals(t2));
		System.out.println(s1.equals(s2));
	}
}
