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
public class Test303{
    public static void main(String args[]){
        System.out.println(method());
    }
    public static int method(){
        try{
            throw new Exception();
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            return 3;
        }
    }
}
