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
public class Test15{
    public static void method(StringBuffer sb){
        sb.append(" Added");
        sb = new StringBuffer("Hai");
    }
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("String Buffer");
        method(sb);
        System.out.println(sb);
    }
}
