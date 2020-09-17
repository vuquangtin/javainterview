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
public class C_A_LogicalComplementAndNegationOperators {
	/*-unary operator is one that requires exactly one operand, or variable, to function*/
	/*-
	    TABLE 2. 2 Java unary operators
	    ________________________________________________________________________________________________________________________________________________________
	    Unary operator	Description
	    ________________________________________________________________________________________________________________________________________________________
	        + 			Indicates a number is positive, although numbers are assumed to be positive in Java unless accompanied by a negative unary operator
	        - 			Indicates a literal number is negative or negates an expression
	        ++ 			Increments a value by 1
	        -- 			Decrements a value by 1
	        ! 			Inverts a Booleans logical value
	    ________________________________________________________________________________________________________________________________________________________
	 */
	@Test
	public void logicalComplementAndNegationOperators() {
		// The logical complement operator --> !
		boolean b = false;
		System.out.println(b); // false
		b = !b;
		System.out.println(b); // true

		// the negation operator --> -
		double a = 1.21;
		System.out.println(a); // 1.21
		a = -a;
		System.out.println(a); // -1.21
		a = -a;
		System.out.println(a); // 1.21

		// you cannot apply a negation operator, -, to a boolean expression
		// nor can you apply a logical complement operator, !, to a numeric
		// expression
		// example
		// int x = !5; // DOES NOT COMPILE
		// boolean y = -true; // DOES NOT COMPILE
		// boolean z = !0; // DOES NOT COMPILE

	}
}