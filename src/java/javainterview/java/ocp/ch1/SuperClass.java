package javainterview.java.ocp.ch1;
/**
 *  
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class SuperClass {
    private String s;
    static {
        System.out.println("From SUPERCLASS STATIC blok!");
    }
    {
        System.out.println("From SUPERCLASS INSTANCE block!");
    }
    public SuperClass() {
        System.out.println( this + " from superclass");
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "s='" + s + '\'' +
                '}';
    }
}