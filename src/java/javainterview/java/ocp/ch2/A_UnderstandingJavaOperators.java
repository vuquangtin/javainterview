package javainterview.java.ocp.ch2;

import org.junit.Test;

/**
 * operatorsAndStatements
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_UnderstandingJavaOperators {

	@Test
	public void operator() {
		// normalmente evalua de izquierda a derecha
		// pero, en algunos casos de derecha a izquierda. (El orden se rige
		// segun la table 2.1, a menos que usen parentesis)
		int y = 4;
		double x = 3 + 2 * --y;
		System.out.println(x);
		System.out.println(y);
		/*-
		 * x = 3 + 2 * 3
		 * x = 3 + 6
		 * x = 9
		 * como es double lo convierte a x = 9.0 , y = 3
		 * */

		/*-
		 *
		 * TABLE 2.1 Order of operator precedence
		________________________________________________________________
		Operator 							Symbols and examples
		________________________________________________________________
		Post-unary operators 				expression++, expression--
		Pre-unary operators 				++expression, --expression
		Other unary operators 				+, -, !
		Multiplication/Division/Modulus 	*, /, %
		Addition/Subtraction 				+, -
		Shift operators 					<<, >>, >>>
		Relational operators				<, >, <=, >=, instanceof
		Equal to/not equal to 				==, !=
		Logical operators 					&, ^, |
		Short-circuit logical operators 	&&, ||
		Ternary operators 					boolean expression ? expression1 : expression2
		Assignment operators 				=, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
		__________________________________________________________________
		 */
	}

}