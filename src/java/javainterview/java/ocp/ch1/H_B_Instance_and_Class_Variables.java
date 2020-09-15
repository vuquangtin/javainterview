package javainterview.java.ocp.ch1;
/**
 *  H_Understanding_Default_Initialization_of_Variables
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class H_B_Instance_and_Class_Variables {
/*-
Variables that are not local variables are known as "instance variables" or "class variables".
"Instance variables" are also called fields.
"Class variables" are shared across multiple objects. You can tell a variable is a class variable because it has the keyword "static" before it.
"Instance and class" variables do not require you to initialize them. As soon as you declare these variables, they are given a default value.
You’ll need to memorize everything in table 1.2 except the default value of char.
To make this easier, remember that the compiler doesn’t know what value to use and so wants the simplest type it can give the value:
"null" for an object and 0/false for a primitive.
    TABLE 1.2: Default initialization values by type
    _________________________________________________________________________
    Variable type                               Default initialization value
    _________________________________________________________________________
    boolean                                     false
    byte, short, int, long                      0 (in the type’s bit-length)
    float, double                               0.0 (in the type’s bit-length)
    char                                        '\u0000' (NUL)
    All object references (everything else)     null
    _________________________________________________________________________
*/
}
