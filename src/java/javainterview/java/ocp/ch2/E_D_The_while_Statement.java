package javainterview.java.ocp.ch2;

import org.junit.Test;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class E_D_The_while_Statement {

	/*
	 * During execution, the boolean expression is evaluated before each
	 * iteration of the loop and exits if the evaluation returns false.
	 */
	int roomInBelly = 5;

	@Test
	public void eatCheese() {
		int bitesOfCheese = 4;
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
		// you ensure that the while loop can end for either of the conditions
	}
	// tener cuidado con los loops infinitos
}