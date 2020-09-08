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
public class Test322 {

	public static void main(String args[]) {
		Test322 t = null;
		try {
			t.method();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void method() {
		System.out.println("NullPointerException");
	}
}
