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

public class A_B_UnderstandingExceptionTypes {
/*
As we’ve explained, an exception is an event that alters program flow. Java has a Throwable superclass for all objects that represent these events.
Not all of them have the word exception in their classname, which can be confusing. Figure 6.1 shows the key subclasses of Throwable.

                                java.lang.Object
                                        ||
                                java.lang.Throwable
                                //                 \\
                java.lang.Exception                 ava.lang.Error
                            ||
                java.lang.RuntimeException


Error: means something went so horribly wrong that your program should not attempt to recover from it.
runtime exception:  is defined as the RuntimeException class and its subclasses.
                    Runtime exceptions tend to be unexpected but not necessarily fatal.
                    For example, accessing an invalid array index is unexpected.
                    Runtime exceptions are also known as unchecked exceptions. (Sin marcar).
checked exception: includes Exception and all subclasses that do not extend RuntimeException.
                    Checked exceptions tend to be more anticipated. For example, trying to read a file that doesn’t exist.
                    Checked exceptions? What are we checking? Java has a rule called the handle or declare rule.
                    For checked exceptions, Java requires the code to either handle them or declare them in the method signature.
                    Example
*/
void fall() throws Exception {
    throw new Exception();
}

/*
-throw tells Java that you want to throw an Exception.
-throws simply declares that the method might throw an Exception
-Because checked exceptions tend to be anticipated, Java enforces that the programmer do something to show the exception was thought about.
 Maybe it was handled in the method. Or maybe the method declares that it can’t handle the exception and someone else should.
-An example of a runtime exception is a NullPointerException, which happens when you try to call a member on a null reference.
 This can occur in any method. If you had   to declare runtime exceptions everywhere, every single method would have that clutter!
 */
}
