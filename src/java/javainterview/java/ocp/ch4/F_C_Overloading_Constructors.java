package javainterview.java.ocp.ch4;



/**  You can have multiple constructors in the same class as long as they have different method signatures.
    When overloading methods, the method name and parameter list needed to match    
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class F_C_Overloading_Constructors {
    private String color;
    private int weight;

//    public C_Overloading_Constructors(int weight) { // first constructor
//        this.weight = weight;
//        color = "brown";
//    }

    public F_C_Overloading_Constructors(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }

//  What we really want is for the first constructor to call the second constructor with two parameters. You might be tempted to write this:
//        public C_Overloading_Constructors(int weight) {
//            C_Overloading_Constructors(weight, "brown"); // DOES NOT COMPILE
//        }

    public F_C_Overloading_Constructors(int weight) {
        this(weight, "brown");
    }
}