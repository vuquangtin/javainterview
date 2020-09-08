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
public class Test318 {
	Test318() {
		this(7);
	}

	Test318(int i) {
		this(1.0);
		Test318(i);
	}

	Test318(float f) {
		System.out.println(f * 2);
	}

	Test318(double d) {
		System.out.println(d * 3);
	}

	void Test318(int i) {
		System.out.println(i);
	}

	public static void main(String args[]) {
		Test318 t = new Test318();
	}
}
