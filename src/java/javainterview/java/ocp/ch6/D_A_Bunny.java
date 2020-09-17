package javainterview.java.ocp.ch6;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class D_A_Bunny {

    /*
    When you’re calling a method that throws an exception, the rules are the same as within a method.
    The problem is that NoMoreCarrotsException is a checked exception. Checked exceptions must be handled or declared

    public static void main(String[] args) {
        eatCarrot();// DOES NOT COMPILE
    }
    SOLUCION
    */
    public static void main_1() throws NoMoreCarrotsException {// declare exception
        eatCarrot_1();
    }
    /* O tambien es solucion */
    public static void main_2() {
        try {
            eatCarrot_1();
        } catch (NoMoreCarrotsException e) {// handle exception
            System.out.print("sad rabbit");
        }
    }
    /*
    You might have noticed that eatCarrot() didn’t actually throw an exception; it just declared that it could.
    This is enough for the compiler to require the caller to handle or declare the exception.
     */

    private static void eatCarrot_1() throws NoMoreCarrotsException {
    }
    /*
    The compiler is still on the lookout for unreachable code. Declaring an unused exception isn’t considered unreachable code.
    It gives the method the option to change the implementation to throw that exception in the future. Do you see the issue here?
     */

    public void bad() {
//        try {
//            eatCarrot_2();
//        } catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
//            System.out.print("sad rabbit");
//        }
    }
    public void good() throws NoMoreCarrotsException {
        eatCarrot_2();
    }
    private static void eatCarrot_2() { }

    /*
    Java knows that eatCarrot_2() can’t throw a checked exception—which means there’s no way for the catch block in bad() to be reached.
    In comparison, good() is free to declare other exceptions.
     */
}

class NoMoreCarrotsException extends Exception {

}
