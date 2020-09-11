package javainterview.java.scjp03;

import java.awt.*;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class TestBorder extends Frame {
	public static void main(String args[]) {
		Button b = new Button("Hello");
		TestBorder t = new TestBorder();
		t.setSize(150, 150);
		t.add(b);
	}
}
