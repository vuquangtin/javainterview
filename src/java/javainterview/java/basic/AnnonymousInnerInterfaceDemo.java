package javainterview.java.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
interface Hello {
	void show();
}

public class AnnonymousInnerInterfaceDemo {

	// An anonymous class that implements Hello interface
	Hello h = new Hello() {
		public void show() {
			System.out.println("I am in anonymous class");
		}
	};

	public void call() {

		h.show();
	}

	public static void main(String[] args) {
		AnnonymousInnerInterfaceDemo obj = new AnnonymousInnerInterfaceDemo();
		obj.call();
	}
}