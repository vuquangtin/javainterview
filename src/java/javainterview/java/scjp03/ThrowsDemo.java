package javainterview.java.scjp03;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class ThrowsDemo {
	static void throwMethod() throws Exception {
		System.out.println("Inside throwMethod.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwMethod();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}
}
