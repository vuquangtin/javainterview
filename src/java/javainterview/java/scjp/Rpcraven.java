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
public class Rpcraven {
	public static void main(String argv[]) {
		Pmcraven pm1 = new Pmcraven("one");
		pm1.run();
		Pmcraven pm2 = new Pmcraven("two");
		pm2.run();
	}
}

class Pmcraven extends Thread {
	private String sTname = "";

	Pmcraven(String s) {
		sTname = s;
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
			yield();
			System.out.println(sTname);
		}
	}
}