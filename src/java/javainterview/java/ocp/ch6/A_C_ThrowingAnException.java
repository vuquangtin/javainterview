package javainterview.java.ocp.ch6;



import org.junit.Test;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_C_ThrowingAnException {

    @Test
    public void c_ThrowingAnException() {
        String[] animals = new String[0];
        System.out.println(animals[0]);
    }
    //This code throws an ArrayIndexOutOfBoundsException.

    //The second way for code to result in an exception is to explicitly request Java to throw one. Java lets you write statements like these:
    @Test
    public void c_ThrowingAnException_1() throws Exception {
        throw new Exception();
        //throw new Exception("Ow! I fell.");
        //throw new RuntimeException();
        //throw new RuntimeException("Ow! I fell.");
    }

    /*
    The throw keyword tells Java you want some other part of the code to deal with the exception.
    This is the same as the young girl crying for her daddy. Someone else needs to figure out what to do about the exception.

    When creating an exception, you can usually pass a String parameter with a message or you can pass no parameters and use the defaults.
    We say usually because this is a convention. Someone could create an exception class that does not have a constructor that takes a message.
    The fi rst two examples create a new object of type Exception and throw it.

    The last two show that the code looks the same regardless of which type of exception you throw.


    TABLE 6 .1          Types of exceptions
    _________________________________________________________________________________________________________________________________________
    Type                    How to recognize                Okay for program to catch?              Is program required to handle or declare?
    _________________________________________________________________________________________________________________________________________

    Runtime exception       Subclass of RuntimeException                Yes                                         No


    Checked exception       Subclass of Exception but not               Yes                                         No
                            subclass of RuntimeException

    Error                   Subclass of Error                           No                                          No
    _________________________________________________________________________________________________________________________________________
     */

}
