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
class Test {
}

public class Test403 {
	static void method(Object obj) {
		System.out.println("StringBuffer");
	}

	static void method(String str) {
		System.out.println("String");
	}

	static void method(Test t) {
		System.out.println("Test");
	}

	public static void main(String args[]) {
		method(null);
	}
}
