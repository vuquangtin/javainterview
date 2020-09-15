package javainterview.java.ocp;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Config {
    public static final String NAME = "myName";
    public static final int MAX_COLUMN_COUNT = 5;

    public static void printConfig(){
        System.out.println("name= " + NAME + "column count= " + MAX_COLUMN_COUNT);
    }
}
