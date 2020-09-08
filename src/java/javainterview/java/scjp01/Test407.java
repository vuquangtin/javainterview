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
public class Test407 implements I {
	int k = 1;
	static {
		k = k * 2;
	}
	{
		k = k * 2;
	}

	public static void main(String args[]) {
		Test407 t1 = new Test407();
		Test407 t2 = new Test407();
		System.out.println(t1.k);
		System.out.println(t2.k);
		System.out.println(k);
	}
}
