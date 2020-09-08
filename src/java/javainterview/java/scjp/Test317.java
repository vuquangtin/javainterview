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
public class Test317 extends A317{
	Test317(int i){
        System.out.println(i);
        super(2);
    }
    public static void main(String args[]) {
    	Test317 t = new Test317(5);
    }
}
class A317{
	A317(int i){
        System.out.println(i);
    }
}
