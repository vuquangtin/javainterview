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
public class B_B_NumericPromotion {

    @Test
    public void numericPromotion(){
        /*you should know that a long takes up more space than an int, which in turn takes up more space than a short, and so on*/
        /*RULES*/
		/*-
		 1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
		 2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point values data type.
		 3. Smaler data types, namely byte, short, and char, are first promoted to int any time they are used with a Java binary arithmetic operator, even if neither of the operands is int.
		 (unary operators are excluded from this rule.) For example, applying ++ to a short value results in a short value.
		 4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.*/

        int a = 1;
        long b = 33;
        System.out.println("First Rule, promoted to 'a' long : --> " + a * b);
        //long is larger than int, then the int value is promoted to a long

        double c = 39.21;
        float d = 2.1f;
        System.out.println("First Rule too, promoted to 'd' double : --> " + c + d);
        //with both operands being promoted to a double, and the result would be a double value

        short e = 10;
        short f = 3;
        System.out.println("Third Rule: " + e / f);
        //that "e" and "f" will both be promoted to int

        short g = 14;
        float h = 13;
        double i = 30;
        System.out.println("All Rules: " + g * h / i);
        //g will automatically be promoted to int
        //g value will then be automatically promoted to a float
        //(g * y) will then be automatically promoted to a double,
    }

    @Test
    public void name() {
        byte b1= 3 & 2;
        System.out.println(b1);

        // 011 & 010 = 010
        System.out.println(b1);
    }
}