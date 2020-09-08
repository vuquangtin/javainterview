package javainterview.java.scjp;

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

public class Test305 {
	public static void main(String args[]) {
		try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("Excepion");
		} catch (IOException e) {
			System.out.println("IOExcepion");
		}
	}
}
