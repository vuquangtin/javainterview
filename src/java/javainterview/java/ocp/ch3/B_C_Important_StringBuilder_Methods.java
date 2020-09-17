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


public class B_C_Important_StringBuilder_Methods {

    @Test
    public void charAt_indexOf_length_and_substring() {
        //same as in the String class
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // substring(0, 4) // anim   return un string
        int len = sb.length();//7
        char ch = sb.charAt(6);//s
        System.out.println(sub + " " + len + " " + ch); //output: anim 7 s
    }

    @Test
    public void append() {
        //the most frequently used method in StringBuilder
        //it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder
        //StringBuilder append(String str)
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true
    }

    @Test
    public void insert() {
        //adds characters to the StringBuilder at the requested index and returns a reference to the current StringBuilder.
        //StringBuilder insert(int offset, String str)
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals-
        System.out.println(sb);
        //As we add and remove characters, their indexes change, draw what is going on so you won’t be confused
    }

    @Test
    public void delete_and_deleteCharAt() {
        //is the opposite of the insert() method.
        //removes characters from the sequence and returns a reference to the current StringBuilder
        //The deleteCharAt() method is convenient when you want to delete only one character.
        /*-  StringBuilder delete(int start, int end)
            StringBuilder deleteCharAt(int index)       */
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        System.out.println(sb);
        //we delete the characters starting with index 1 and ending right before index 3.
        //sb.deleteCharAt(5); // throws an exception
    }

    @Test
    public void reverse() {
        //it reverses the characters in the sequences and returns a reference to the current StringBuilder
        // StringBuilder reverse()
        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);//CBA
    }

    @Test
    public void method_toString() {
        //converts a StringBuilder into a String
        //String toString()
        StringBuilder sb = new StringBuilder("ABC");
        String s = sb.toString();
        //Often StringBuilder is used internally for performance purposes but the end result needs to be a String
    }
}