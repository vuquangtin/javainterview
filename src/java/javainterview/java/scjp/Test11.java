package javainterview.java.scjp;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test11{
    public static void main(String a[]){
       Integer i1 = new Integer(127);
       Integer i2 = new Integer(127);
       Long l = new Long(127);
       System.out.println(i1 == i2);
       System.out.println(i1.equals(i2));
       System.out.println(i1.equals(l));
    }
}
