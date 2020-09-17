package javainterview.java.ocp.ch4;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_F_Optional_Exception_List {
    //code can indicate that something went wrong by throwing an exception.
    //that it is optional and where in the method signature it goes if present
    // You can list as many types of exceptions as you want in this clause separated by commas.
    public void zeroExceptions() { }

    public void oneException() throws IllegalArgumentException { }

    public void twoExceptions() throws IllegalArgumentException, InterruptedException { }

    //The calling method can throw the same exceptions or handle them.
}