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
public class Test718 {
	public static void demo(String s) {
		debug("In demo:" + s);
	}

	private void debug(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Test718.demo("Hello");
	}

	void m34() {
		String s = null;
		String t = "null";
		if (s == t) {
			System.out.println("s equal to t");
		} else {
			System.out.println("s not equal to t");
		}

	}

	public void demo() {
		String s[];
		if (s.equals(null)) {
			System.out.println("s is null");
		} else {
			System.out.println("s is not equal");
		}
	}
}
