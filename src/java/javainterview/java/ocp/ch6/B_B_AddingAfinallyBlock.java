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
public class B_B_AddingAfinallyBlock {

    /* The try statement also lets you run code at the end with a finally clause regardless of whether an exception is thrown

         A finally block can only appear as part of a try statement.

                                        try {
                                            //protected code
                                        } catch ( exceptiontype identifier ) {
                                            //exception handler
                                        } finally {
                                            //finally block
                                        }

        The finally block always executes, whether or not an The finally keyword exception occurs in the try block.

        There are two paths through code with both a catch and a finally. If an exception is thrown, the finally block is run after the catch block.
        If no exception is thrown, the finally block is run after the try block completes.

    */

    void explore() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }

    private void goHome() {
    }

    private void seeMoreAnimals() {
    }

    private void getHugFromDaddy() {
    }

    private void fall() {
    }

    private void seeAnimals() {
    }

    /*
    The girl falls on line 15. If she gets up by herself, the code goes on to the finally block and runs line 19.
    Then the try statement is over and the code proceeds on line 21.
    If the girl doesn’t get up by herself, she throws an exception.
    The catch block runs and she gets a hug on line 17. Then the try statement is over and the code proceeds on line 21.
    Either way, the ending is the same. The finally block is executed and the try statement ends.

    On the OCA exam, a try statement must have catch and/or finally. Having both is fine. Having neither is a problem

    The exam will try to trick you with missing clauses or clauses in the wrong order.
    Do you see why the following do or do not compile?

     */

    void explore2() {

        /*
        The first example (lines 25–31) does not compile because the catch and finally blocks are in the wrong order.

        try { // DOES NOT COMPILE
            fall();
        } finally {
            System.out.println("all better");
        } catch(Exception e){
            System.out.println("get up");
        }
        */


        /*
        The second example (lines 33–35) does not compile because there must be a catch or finally block

        try { // DOES NOT COMPILE
            fall();
        }
        */

        /*
        The third example (lines 37–41) is just fi ne. catch is not required if finally is present

        try {
            fall();
        } finally {
            System.out.println("all better");
        }
        */
    }

    /*
    One problem with finally is that any realistic uses for it are out of the scope of the
    OCA exam. finally is typically used to close resources such as fi les or databases—both of which are topics on the OCP exam.
    This means most of the examples you encounter on the
    OCA exam with finally are going to look contrived. For example, you’ll get asked questions such as what this code outputs:

     */

    void explore3() {
        String s = "";
        try {
            s += "t";
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.print(s); //Rpta: tfa

    }

    /*
    There is one exception to “the finally block always runs after the catch block” rule:

    Java defines a method that you call as System.exit(0);. The integer parameter is the error code that gets returned. System.exit tells Java,
    “Stop. End the program right now. Do not pass go. Do not collect $200.” When System.exit is called in the try or catch block, finally does not run.
     */

}


