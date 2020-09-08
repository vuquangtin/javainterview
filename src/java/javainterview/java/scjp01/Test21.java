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
public class Test21{
    public static void main(String a[]){
       String s1 = new String("Hai");
       String s2 = "Hai";
       String s3 = new String("Hai").intern();
       System.out.println(s1 == s2);
       System.out.println(s1 == s3);
       System.out.println(s2 == s3);
    }
}
