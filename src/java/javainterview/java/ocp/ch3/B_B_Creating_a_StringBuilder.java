package javainterview.java.ocp.ch3;import org.junit.Test;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */


public class B_B_Creating_a_StringBuilder {

    @Test
    public void creating_a_StringBuilder_1(){
        /* Three ways to construct a StringBuilder */

        /* StringBuilder containing an empty sequence of characters and assign sb1 to point to it */
        StringBuilder sb1 = new StringBuilder();

        /*  The second says to create a StringBuilder containing a specific value and assign sb2 to point to it */
        StringBuilder sb2 = new StringBuilder("animal");

        /* StringBuilder to reserve a certain number of slots for characters. */
        StringBuilder sb3 = new StringBuilder(10);
    }

    /*-
     *  Size vs. Capacity
       =================
    Size: is the number of characters currently in the sequence.
    capacity: is the number of characters the sequence can currently hold.
    String is immutable, the size and capacity are the same..
    StringBuilder, Java knows the size is likely to change as the object is used.
    Example StringBuilder:
    - we request a capacity of 5. At this point, the size is 0 since no characters have been added yet
            StringBuilder sb = new StringBuilder(5);
            _  _  _  _  _
            0  1  2  3  4
    - we add four characters
            sb.append("anim");
    - the size is 4 since four slots are taken. The capacity is still 5
            a  n  i  m  _
            0  1  2  3  4
    - Then we add three more characters
            sb.append("als");
    - The size is now 7 since we have used up seven slots.
            a  n  i  m  a  l  s
            0  1  2  3  4  5  6  7
    - Because the capacity wasn't large enough to store seven characters, Java automatically increased it for us
    */
}