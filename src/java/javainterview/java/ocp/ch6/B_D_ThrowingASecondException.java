package javainterview.java.ocp.ch6;



import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class B_D_ThrowingASecondException {
    /*
    So far, we’ve limited ourselves to one try statement in each example. However, a catch or finally block can have any valid Java code in it—including another try statement.

    Even though the topic of reading files is on the OCP exam, the OCA exam may ask you about exception handling with those classes. This is actually a gift.
    When you see such a question, you know the problem has to be about basic Java syntax or exception handling!

     */

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }
    }

    private static FileReader read() throws IOException {
        // CODE GOES HERE
        return null;
    }
    /*
    The easiest case is if line 28 doesn’t throw an exception. Then the entire catch block on lines 20–25 is skipped. Next, consider if line 28 throws a NullPointerException. That isn’t an IOException, so the catch block on lines 20–25 will still be skipped.
    If line 28 does throw an IOException, the catch block on lines 20–25 does get run. Line 22 tries to close the reader. If that goes well, the code completes and the main() method ends normally. If the close() method does throw an exception, Java looks for more catch blocks. There aren’t any, so the main method throws that new exception. Regardless, the exception on line 28 is handled. A different exception might be thrown, but the one from line 28 is done.
     */

    public void explore() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } /*finally {
            throw new Exception();
        }*/
    }
    /*
    Line 27 throws an exception, which is caught on line 28. The catch block then throws an exception on line 29. If there were no finally block, the exception from line 29 would be thrown. However, the finally block runs after the try block. Since the finally block throws an exception of its own on line 31, this one gets thrown. The exception from the catch block gets forgotten about. This is why you often see another try/catch inside a finally block—to make sure it doesn’t mask the exception from the catch block.
    Next we are going to show you the hardest example you can be asked related to exceptions. What do you think this method returns? Go slowly. It’s tricky.
     */

    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }
    /*
    The correct answer is before catch finally done. Everything is normal up until line 35, when "before" is added. Line 36 throws a NullPointerException. Line 37 is skipped as Java goes straight to the catch block. Line 38 does catch the exception, and "catch" is added on line 39. Then line 40 throws a RuntimeException. The finally block runs after the catch regardless of whether an exception is thrown; it adds "finally" to result. At this point, we have completed the inner try statement that ran on lines 34–44. The outer catch block then sees an exception was thrown and catches it on line 45; it adds "done" to result.
     */

}
