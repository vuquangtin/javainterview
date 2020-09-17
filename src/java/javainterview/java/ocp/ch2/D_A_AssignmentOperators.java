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
public class D_A_AssignmentOperators {

    @Test
    public void assignmentOperators() {
        // The simplest assignment operator is the "=" assignment
        // This statement assigns x the value of 1.
        int x = 1;
        //Java will automatically promote from smaller to larger data types
        //it will throw a compiler exception if it detects you are trying to convert from larger to smaller data types
        /*- EXAMPLES
           ========
          int x = 1.0; // DOES NOT COMPILE, you are trying to assign a double 1.0 to an integer value.
          short y = 1921222; // DOES NOT COMPILE, 1921222 is outside the range of short
          int z = 9f; // DOES NOT COMPILE, f added to the end of the number that instructs the compiler to treat the number as floating-point value
          long t = 192301398193810323; // DOES NOT COMPILE, he value is larger than int allows
        */
    }
    /***************Casting Primitive Values***************/
    @Test
    public void castingPrimitiveValues(){
        /*-
          We can fix the examples in the previous section by casting the results to a smaller data type.
          Casting primitives is required any time you are going from a larger numerical data type to a smaller numerical 
          data type or converting from a floating-point number to an integral value
        */
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9l;
        long t = 192301398193810323L;

        short a = 10;
        short b = 3;
        //short c =  a * b; // DOES NOT COMPILE, a y b son promovidos a int x lo que (a * b) es int, int es mas grande que short, 
        //so, error, tendrias que castearlo a short para que compile
        short c = (short) (a * b); //lo solucionamos con un explicit cast al valor mas grande
    }


    @Test
    public void overflowAndUnderflow(){
        short y = (short)1921222; // Stored as 20678
        /*-
        The second value, 1,921,222 , is too large to be stored as a short, so numeric OVERFLOW occurs and it becomes 20,678
        OVERFLOW is when a number is so large that it will no longer fit within the data type, so the system "wraps around"  
        to the next lowest value and counts up from there.
        There's also an analogous UNDERFLOW, when the number is too low to fit in the data type.
        */
        /*OJO*/
        System.out.print(2147483647 + 1); // -2147483648
        //Since 2147483647 is the maximum int value, adding any strictly positive value to it will
        //cause it to wrap to the next negative number.
    }

}