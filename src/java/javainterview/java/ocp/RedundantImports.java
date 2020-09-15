package javainterview.java.ocp;

//import java.lang.System; //Redundant
//import java.lang.*; //Redundant
import java.util.Random;

//import java.util.*; //Redundant

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class RedundantImports {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}