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

public class E_E_The_do_while_Statement {

	@Test
	public void theDo_whileStatement() {
		// a do-while loop guarantees that the statement or block will be
		// executed at least once.
		int x = 0;
		do {
			x++;
		} while (false);
		System.out.println(x); // Outputs 1
		// Java will execute the statement block first, and then check the loop
		// condition.
		// puedes combinar los 2
	}
}