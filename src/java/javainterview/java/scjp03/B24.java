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

class A24 {

	A24() {
		System.out.println("Executing class A constructor");
	}

	A24(int a) throws Exception {
		System.out.println("Executing class A constructor");
		throw new IOException();
	}

}

public class B24 extends A24 {
	B24() {
		System.out.println("Executing class B constructor");
	}

	public static void main(String args[]) {
		try {
			A24 a = new B24();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		byte Byte = 10;
		byte Double = 12;
		byte Integer = Byte * Double;

	}
}
