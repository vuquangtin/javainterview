package javainterview.java.scjp01;

import java.io.IOException;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class Test312 extends A312 {
	public void method() throws Exception {
		System.out.println("Subclass");
	}

	public static void main(String args[]) throws Exception {
		A312 a = new A312();
		a.method();
		a = new Test312();
		a.method();
	}
}

class A312 {
	public void method() throws IOException {
		System.out.println("Superclass");
	}
}
