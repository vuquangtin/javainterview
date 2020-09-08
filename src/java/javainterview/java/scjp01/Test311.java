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
public class Test311 extends A311 {
	Test311() throws Exception {
		System.out.println("Test10 Class");
	}

	Test311(int i) {
	}

	public static void main(String args[]) throws Exception {
		Test311 t = new Test311();
	}
}

class A311 {
	A311() throws Exception {
		System.out.println("A Class");
	}
}
