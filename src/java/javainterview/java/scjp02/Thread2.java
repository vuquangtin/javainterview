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
/** File Thread1.java */
class Thread1 implements Runnable {
	public void run() {
		System.out.println("Running Thread1");
	}
}

/** End of file Thread1.java */

/** Thread2.java */
public class Thread2 extends Thread {
	public void run() {
		System.out.println("Running Thread2");
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread2(t1);
		t1.start();
		t2.start();
	}
}
/** End of Thread2.java */

