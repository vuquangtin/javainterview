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
public class Test320 extends A320 {
	Test320() {
		this("Hi");
	}

	Test320(String str) {
		System.out.println(str);
	}

	public static void main(String args[]) {
		Test320 t = new Test320();
	}
}

class A320 {
	A320() {
		System.out.println("Super");
	}
}
