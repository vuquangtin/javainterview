package javainterview.java.scjp01;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test16{
    public static void method(StringBuffer sb){
        sb = new StringBuffer("Hai");
        sb.append(" Added");
    }
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("String Buffer");
        method(sb);
        System.out.println(sb);
    }
}
