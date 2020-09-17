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
public class A_C_Return_Type {
    /*
    The return type might be an actual Java type such as String or int.
    If there is no return type, the void keyword is used.
    You cannot omit the return type.
    Can you explain why these methods compile or don’t?
    */
    public void walk1() { }

    public void walk2() { return; } // correctly doesn’t return anything.

    public String walk3() { return ""; }

    //public String walk4() { } // DOES NOT COMPILE -->  the return statement is missing

    //public walk5() { } // DOES NOT COMPILE --> the return type is missing.

    //String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE

    //When returning a value, it needs to be assignable to the return type.

    int integerExpanded() {
        int temp = 9;
        return temp;

    }
    /*
    int longExpanded() {
        int temp = 9L; // DOES NOT COMPILE
        return temp;
    }
    This shows more clearly why you can’t return a long primitive in a method that returns an int
    */
}