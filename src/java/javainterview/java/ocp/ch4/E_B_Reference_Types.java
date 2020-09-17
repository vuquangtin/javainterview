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
//Given the rule about Java picking the most specific version of a method that it can, what do you think this code outputs?
public class E_B_Reference_Types {

    public void fly(String s) {
        System.out.println("string ");
    }

    public void fly(Object o) {
        System.out.println("object ");
    }

    public static void main(String[] args) {
        E_B_Reference_Types r = new E_B_Reference_Types();
        r.fly("test");
        r.fly(56);
    }

/*
 The answer is "string object". The first call is a String and finds a direct match.
 There's no reason to use the Object version when there is a nice String parameter list just waiting to be called.
 The second call looks for an int parameter list. When it doesn't find one, it autoboxes to Integer.
 Since it still doesn't find a match, it goes to the Object one
*/
}
