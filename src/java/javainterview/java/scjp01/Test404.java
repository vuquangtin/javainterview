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
public class Test404 {
	public static void main(String args[]) {
		I i1 = new A404();
		I i2 = new B404();
		A404 a = new A404();
		System.out.println(i1 instanceof I);
		System.out.println(i2 instanceof B404);
		System.out.println(a instanceof I);
	}
}

interface I {
}

class A404 implements I {
}

class B404 implements I {
}
