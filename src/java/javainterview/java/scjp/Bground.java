package javainterview.java.scjp;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class Bground extends Thread {
	public static void main(String argv[]) {
		Bground b = new Bground();
		b.run();
	}

	public void start() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value of i = " + i);
		}
	}
}