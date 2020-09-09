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
public class MyThread extends Thread {
	public void run() {
		System.out.println("Done");
	}

	public void demo() {
		System.out.println("Demo");
	}

	public static void main(String args[]) {
		MyThread th = new MyThread();
		th.run();
		th.stop();
		th.demo();
		String s1 = " 5 + 5 = 10 ";
		s1.trim();
		s1.replace('+', '-');

	}

	public static void main2(String[] args) {
		String s = "Hi";
		StringBuffer sb = new StringBuffer(s);
		String s1 = new String("There");
		StringBuffer sb1 = new StringBuffer(s1);
		if (s == sb) {
			System.out.println("s==sb");
		}
		if (s.equals(sb)) {
			System.out.println("s.equals(sb)");
		}
		if (s1.equals(sb1)) {
			System.out.println("s1.equals(sb1)");
		}
	}
}
