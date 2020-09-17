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

public class F_D_Final_Fields {
    /*-
    As you saw earlier in the chapter, final instance variables must be assigned a value exactly once.
    We saw this happen in the line of the declaration and in an instance initializer.
    There is one more location this assignment can be done: in the constructor.
     */
    private final int volume;
    private final String name = "The Mouse House";

    public F_D_Final_Fields(int length, int width, int height) {
        volume = length * width * height;
    }
    /*-
    The constructor is part of the initialization process, so it is allowed to assign final
    instance variables in it. By the time the constructor completes, all final instance variables
    must have been set.
    */
}
