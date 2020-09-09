package javainterview.java.scjp02;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test708 {
	String x;

	public void testDemo(int n) {
		String y;
		if (n > 0) {
			y = "Hello";
		}
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		Test708 test = new Test708();
		test.testDemo(2);
	}
}
