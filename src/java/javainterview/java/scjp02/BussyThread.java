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
public class BussyThread extends Thread {	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			i = i - 1;
		}// end of for loop
	}// end of run()

	public static void main(String args[]) {
		BussyThread b1 = new BussyThread();
		BussyThread b2 = new BussyThread();
		b1.start();
		b2.start();
	}
}// end of class
