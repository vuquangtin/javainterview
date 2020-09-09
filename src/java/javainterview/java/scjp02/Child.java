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
class Parent {
	public Parent() {
		System.out.println("I am Parent");
	}
}

public class Child extends Parent {
	public Child(int x) {
		System.out.println("I am Child");
	}

	public static void main(String[] args) {
		Child c = new Child(10);
	}
}
