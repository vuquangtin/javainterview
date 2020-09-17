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
public class B_A_ArithmeticOperators {

    @Test
    public void arithmeticOperators(){
        // addition (+), subtraction (-), multiplication (*), division (/), and modulus (%), unary operators, ++ and --

		/*the multiplicative operators (*, /, %) have a higher order of precedence
		than the additive operators (+, -).*/
        int x = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        /*-
         * x = 10 + 12 - 8
         * x = 14
         * */
        //con parentesis, las cosas cambian
        int y = 2 * ((5 + 3) * 4 - 8);
        System.out.println(y);
		/*-
		  y = 2 * (8 * 4 - 8);
		  y = 2 * (32 - 8);
		  y = 2 * 24;
		  y = 48
		 */

        /*the modulus operator: % */
        System.out.print(9 / 3); // Outputs 3
        System.out.print(9 % 3); // Outputs 0
        System.out.print(10 / 3); // Outputs 3
        System.out.print(10 % 3); // Outputs 1
        System.out.print(11 / 3); // Outputs 3
        System.out.print(11 % 3); // Outputs 2
        System.out.print(12 / 3); // Outputs 4
        System.out.print(12 % 3); // Outputs 0
    }
}