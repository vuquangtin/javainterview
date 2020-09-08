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
public class Test8{
    public static void main(String a[]){
       byte b = 1;
       char c = 2;
       short s = 3;
       int i = 4;

       c = b; // 1
       s = b; // 2
       i = b; //3
       s = c * b; //4
    }
}
