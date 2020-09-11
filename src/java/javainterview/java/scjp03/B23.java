package javainterview.java.scjp03;

import java.io.*;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

class A23 {

	A23() throws Exception {
		System.out.println("Executing class A constructor");
		throw new IOException();
	}
}

public class B23 extends A23 {
	B23() {
		System.out.println("Executing class B constructor");
	}

	public static void main(String args[]) {
		try {
			A23 a = new B23();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
