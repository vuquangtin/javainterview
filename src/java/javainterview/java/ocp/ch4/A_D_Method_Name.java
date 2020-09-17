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
public class A_D_Method_Name {
    /*
    an identifier may only contain letters, numbers, $, or _.
    Also, the first character is not allowed to be a number, and reserved words are not allowed.
    By convention, methods begin with a lowercase letter but are not required to.
     */
    public void walk1() { }

    //public void 2walk() { } // DOES NOT COMPILE -> not allowed to begin with numbers

    //public walk3 void() { } // DOES NOT COMPILE -> the method name is before the return type

    public void Walk_$() { }

    //public void() { } // DOES NOT COMPILE -> method name is missing

}