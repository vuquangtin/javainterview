package javainterview.java.ocp.ch6;

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
public class D_D_RealWorldScenario {

    /*
    Why Swallowing Exception Is Bad

    Because checked exceptions require you to handle or declare them, there is a temptation to catch them so they “go away.”
    But doing so can cause problems. In the following code, there’s a problem reading in the fi le:
     */

    public static void main(String[] args) {
        String textInFile = null;
        try {
            readInFile();
        } catch (IOException e) {
            // ignore exception
        }
        // imagine many lines of code here
        System.out.println(textInFile.replace(" ", ""));
    }

    private static void readInFile() throws IOException {
        throw new IOException();
    }

    /*
    The code results in a NullPointerException. Java doesn’t tell you anything about the original IOException because it was handled.
    Granted, it was handled poorly, but it was handled.

    When writing your own code, print out a stack trace or at least a message when catching an exception.
    Also, consider whether continuing is the best course of action. In our example, the program can’t do anything after it fails to read in the file.
    It might as well have just thrown the IOException.
     */

}
