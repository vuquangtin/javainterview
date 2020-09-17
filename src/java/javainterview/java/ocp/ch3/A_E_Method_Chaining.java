package javainterview.java.ocp.ch3;
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


public class A_E_Method_Chaining {

    @Test
    public void method_Chaining_1() {
        /* It is common to call multiple methods on the same String */
        String start = "AniMaL      ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); //"animal"
        String result = lowercase.replace('a', 'A'); //"AnimAl"
        System.out.println(result);
    }

    @Test
    public void method_Chaining_2() {
        /*You’ll see code using a technique called method chaining */
        String result = "AniMaL     ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
        /* Remember that String is immutable. */
    }

    @Test
    public void method_Chaining_3() {
        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3'); // chaining
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}