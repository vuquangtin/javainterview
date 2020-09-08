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
public class Holt extends Thread {
	private String sThreadName;

	public static void main(String argv[]) {
		Holt h = new Holt();
		h.go();
	}

	Holt() {
	}

	Holt(String s) {
		sThreadName = s;
	}

	public String getThreadName() {
		return sThreadName;
	}

	public void go() {
		Holt first = new Holt("first");
		first.start();
		Holt second = new Holt("second");
		second.start();
	}

	public void start() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getThreadName() + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}