package javainterview.java.scjp03;

import java.util.*;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class MyVector54 {

	public Vector myVector() {
		Vector v = new Vector();
		return v.addElement("Adding element to vector");
	}

	public static void main(String[] args) {
		MyVector54 mv = new MyVector54();
		System.out.println(mv.myVector());
	}
}
