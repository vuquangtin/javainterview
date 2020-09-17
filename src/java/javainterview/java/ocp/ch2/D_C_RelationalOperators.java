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


public class D_C_RelationalOperators {

    @Test
    public void relationalOperators() {
        //compare two expressions and return a boolean value
        //The first four relational operators (see Table 2.3) are applied to numeric primitive data types only.

        /*-
        TABLE 2.3       Relational operators
        __________________________________________________
            <        Strictly less than
            <=       Less than or equal to
            >        Strictly greater than
            >=       Greater than or equal to
        _________________________________________________
         */
        int x = 10, y = 20, z = 10; //primitivos
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false
    }
}