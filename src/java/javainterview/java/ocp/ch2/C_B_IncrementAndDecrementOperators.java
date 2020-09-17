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
public class C_B_IncrementAndDecrementOperators {

    @Test
    public void incrementAndDecrementOperators() {
        //Increment and decrement operators, ++ and --,
        //They have the higher order or precedence
        //pre-increment operator and the pre-decrement operator
        //post-increment operator and the post-decrement operator,
        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        //Problemita
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
		/*-
		y = 4 * 5 / x-- + --x; // x assigned value of 4
		y = 4 * 5 / 4 + --x; // x assigned value of 3
		y = 4 * 5 / 4 + 2; // x assigned value of 2
		y = 20 / 4 + 2
		y = 5 + 2
		Respuesta:
		x is 2
		y is 7
		*/
    }
}