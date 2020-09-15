package javainterview.java.ocp;
import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static javainterview.java.ocp.Config.*;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */


public class StaticImportExample {
    public static void main(String[] args) {
        int min = min(5,7);
        System.out.println("min= " + min);
        System.out.println(PI);

        Config.printConfig();

        out.println("name= " + NAME);
        out.println("column count " + MAX_COLUMN_COUNT);
    }
}