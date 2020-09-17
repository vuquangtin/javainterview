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


public class E_B_The_if_then_else_Statement {

    @Test
    public void theIf_then_elseStatement_1() {
        int hourOfDay = 8;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if (hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }
    }

    @Test
    public void theIf_then_elseStatement_2() {
        //mejor usa esto:Now our code is truly branching between one of the two possible options,
        int hourOfDay = 8;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }
    }

    @Test
    public void theIf_then_elseStatement_3() {
        // tambien
        int hourOfDay = 8;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }

    @Test
    public void theIf_then_elseStatement_4() {
        int hourOfDay = 8;
        //if-then-else statements is that order is important
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

        //OJO
		/*-
		int x = 1;
		if(x) { // DOES NOT COMPILE
		...
		}
		*/

		/*-
		int x = 1;
		if(x = 5) { // DOES NOT COMPILE
			...
		}
		*/

        /**************Ternary Operator******************/
        //The conditional operator, ? :
        //booleanExpression ? expression1 : expression2
        //second and third can be any expression that returns a value.
        //The ternary operation is really a condensed form of an ifthen-else statement that returns a value
        int y1 = 10;
        final int x1;
        if (y1 > 5) {
            x1 = 2 * y1;
        } else {
            x1 = 3 * y1;
        }
        //es equivalente
        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y);

		/*-
		 System.out.println((y > 5) ? 21 : "Zebra"); is ok xqel syso solo imprime
		int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE, xq lo almacena en un int y Horse no es int
		 */
    }
}