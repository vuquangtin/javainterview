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
public class Test7 {
	public static void method(byte b) {
		System.out.println("Byte");
	}

	public static void method(int i) {
		System.out.println("Int");
	}

	public static void main(String a[]) {
		byte b = 1;
		method(1);
		method(128);
		method((byte) 128);
		method(b);
	}
}
