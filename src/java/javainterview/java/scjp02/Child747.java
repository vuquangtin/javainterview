package javainterview.java.scjp02;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
class Parent747 {
	String name = null;

	public Parent747(String n) {
		name = n;
	}
}

public class Child747 extends Parent747 {
	public Child747(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	String type = "X";

	public void demo(String[] args) {
		int i = 1;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
