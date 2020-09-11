package javainterview.java.scjp03;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
class Top {

	static void myTop() {
		System.out.println("Testing myTop method in Top class");
	}
}

public class Down extends Top {

	void myTop() {
		System.out.println("Testing myTop method in Down class");
	}

	public static void main(String[] args) {
		for ( int i = 0; i < 1; i++ ) {
			System.out.print(args[i]);
			}
		Top t = new Down();
		t.myTop();
	}
}
