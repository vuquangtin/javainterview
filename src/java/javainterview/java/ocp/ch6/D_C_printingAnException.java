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

public class D_C_printingAnException {
    /*
    There are three ways to print an exception.
    - You can let Java print it out,
    - print just the message,
    - or print where the stack trace comes from.

    This example shows all three approaches
     */

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            /*
            java.lang.RuntimeException: cannot hop
             */
            System.out.println(e.getMessage());
            /*
            cannot hop
             */
            e.printStackTrace();
            /*
            java.lang.RuntimeException: cannot hop
            at ch6.ch6.exceptions.D_callingMethodsThatThrowExceptions.C_printingAnException.hop(C_printingAnException.java:28)
            at ch6.ch6.exceptions.D_callingMethodsThatThrowExceptions.C_printingAnException.main(C_printingAnException.java:20)
             */
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }

    /*
    The fi rst line shows what Java prints out by default: the exception type and message.
    The second line shows just the message. The rest shows a stack trace.

    The stack trace is usually the most helpful one because it shows where the exception occurred in each method that it passed through.
    On the OCA exam, you will mostly see the fi rst approach. This is because the exam often shows code snippets.

    The stack trace shows all the methods on the stack. Figure 6.4 shows what the stack looks like for this code.
    Every time you call a method, Java adds it to the stack until it completes.
    When an exception is thrown, it goes through the stack until it fi nds a method that can handle it or it runs out of stack.

            new RuntimeException()
                        |
                        |
                        V
                      hop()
                      main()
     */
}
