package javainterview.java.ocp.ch2;import java.io.File;

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


public class D_E_EqualityOperators {

    @Test
    public void equalityOperators() {
        //the equals operator == and not equals operator !=, they compare two operands and return a boolean value
    	/*-
    	The equality operators are used in one of three scenarios:
    		1.  Comparing two numeric primitive types. If the numeric values are of different data types, 
    		the values are automatically promoted as previously described.
    		    For example,
    			    5 == 5.00 returns true since the left side is promoted to a double.
    		2. Comparing two boolean values.
    		3. Comparing two objects, including null and String values.
    		boolean x = true == 3; // DOES NOT COMPILE
			boolean y = false != "Giraffe"; // DOES NOT COMPILE
			boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
    	 */

        boolean a = false;
        boolean b = (a = true); //the expression is assigning the value of true to "a",  and as you saw in the section on assignment operators, the assignment itself has the value of the assignment
        //esta asignando true a la variable "a" y "b" toma el valor de la asignacion TRUE
        System.out.println("b = "+ b); // Outputs true

        /*For object comparison, the equality operator is applied to the references to the objects*/
        /*Two references are equal if and only if they point to the same object, or both point to null*/
        File x = new File("myFile.txt");
        File y = new File("myFile.txt");
        File z = x;
        System.out.println(x == y); // Outputs false
        System.out.println(x == z); // Outputs true
    }

}
