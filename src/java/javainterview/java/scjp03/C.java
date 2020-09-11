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
class A {
	A() {
		System.out.println("Class A constructor");
	}
}

class B extends A {
	B() {
		System.out.println("Class B constructor");
	}
}

public class C extends A {
	C() {
		System.out.println("Class C constructor");
	}

	public static void main(String args[]) {
		A a = new A(); // Line 1
		A a1 = new B(); // Line 2
		A a2 = new C(); // Line 3
		B b = new C(); // Line 4
	}
}
