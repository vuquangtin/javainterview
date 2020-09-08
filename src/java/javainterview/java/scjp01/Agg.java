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
public class Agg {
	public static void main(String argv[]) {
		Agg a = new Agg();
		a.go();
	}

	public void go() {
		DSRoss ds1 = new DSRoss("one");
		ds1.start();
	}
}

class DSRoss extends Thread {
	private String sTname = "";

	DSRoss(String s) {
		sTname = s;
	}

	public void run() {
		notwait();
		System.out.println("finished");
	}

	public void notwait() {
		while (true) {
			try {
				System.out.println("waiting");
				wait();
			} catch (InterruptedException ie) {
			}
			System.out.println(sTname);
			notifyAll();
		}
	}
}