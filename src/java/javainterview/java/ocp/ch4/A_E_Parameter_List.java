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
public class A_E_Parameter_List {
    // you can just have an empty pair of parentheses after the method name

    public void walk1() { }
    //public void walk2 { } // DOES NOT COMPILE -> missing the parentheses
    public void walk3(int a) { }
    //public void walk4(int a; int b) { } // DOES NOT COMPILE -> the parameters are separated by a semicolon rather than a comma
    public void walk5(int a, int b) { }

}