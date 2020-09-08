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
public class Test12 {
	public static void main(String a[]) {
		byte b = 100;
		Byte b1 = new Byte(100);
		Byte b2 = new Byte(b);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}
}