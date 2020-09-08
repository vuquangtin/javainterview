package javainterview.java.scjp01;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Background implements Runnable {
	int i = 0;

	public int run() {
		while (true) {
			i++;
			System.out.println("i=" + i);
		}
		return 1;
	}
}// End class