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

public class B_A_UsingAtryStatement {

    /*
    how to handle them
    _________________
    Java uses a "try" statement to separate the logic that might throw an exception from the logic to handle that exception.

    try {
           //The try block is also referred to
           //as protected code
    } catch ( exception_type identifier ) {
           //exception handler
    }

    The code in the try block is run normally.
    If any of the statements throw an exception that can be caught by the exception type listed in the catch block,
    the try block stops running and execution goes to the catch statement.
    If none of the statements in the try block throw an exception that can be caught, the catch clause is not run.

   You probably noticed the words “block” and “clause” used interchangeably.
   The exam does this as well, so we are getting you used to it. Both are correct.
   “Block” is correct because there are braces present.
   “Clause” is correct because they are part of a try statement.

   In our example:
   The little girl gets up by herself the first time she falls. Here’s what this looks like:
    */
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            //getUp();
        }
        //seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
    }

    /*
    try // DOES NOT COMPILE
        fall();
    catch (Exception e)
        System.out.println("get up");

    The problem is that the braces are missing. It needs to look like this:
     */

    void explore2() {
        try {
            fall2();
        } catch (Exception e) {
            System.out.println("get up");
        }
    }

    void fall2() {
        throw new RuntimeException();
    }

    /*Good*/

    /*try {// DOES NOT COMPILE
        fall();
    }
    This code doesn’t compile because the try block doesn’t have anything after it.
    Remember, the point of a try statement is for something to happen if an exception is thrown. Without another clause, the try statement is lonely.
    Now that you know the basics, let’s start adding more features to exceptions. The following sections show
    you how to add a finally clause to a try statement and catch different
    types of exceptions and describe what happens if an exception is thrown in catch or finally.
    */
}
