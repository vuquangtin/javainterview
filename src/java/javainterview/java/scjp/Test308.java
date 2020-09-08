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
public class Test308 {
	public static void main(String args[]) throws Exception {
		Test308 t = new Test308();
		t.method();
		System.out.println("Print");
	}

	public void method() {
		try {
			throw new Exception();
		} catch (Exception e) {
		}
	}
}
