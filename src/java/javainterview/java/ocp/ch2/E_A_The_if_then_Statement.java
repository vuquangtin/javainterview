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
public class E_A_The_if_then_Statement {

	@Test
	public void theIf_thenStatement() {
		// we only want to execute a block of code under certain circumstances
		// Accomplishes this by allowing our application to execute a particular
		// block of code if and only if a boolean expression evaluates to true
		// at runtime.

		int morningGreetingCount = 0;
		int hourOfDay = 8;

		if (hourOfDay < 11)
			System.out.println("Good Morning");

		// usando llaves, multiples statements
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
			morningGreetingCount++;
		}
	}
}