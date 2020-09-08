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
public class Test316 extends A316 {
	Test316() {
		System.out.println("Sub");
	}

	public static void main(String args[]) {
		Test316 t = new Test316();
	}
}

class A316 {
	A316(int i) {
		System.out.println("Super");
	}
}
