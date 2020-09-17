package javainterview.java.ocp.ch3;
import org.junit.Test;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */


public class A_D_Important_String_Methods {
    /* The String class has dozens of methods. */
    /* For all these methods, you need to remember that a string is a sequence of characters and Java counts from 0 when indexed */

    /*-
     * Indexing for a string
            a  n  i  m  a  l  s
            0  1  2  3  4  5  6
     */
    @Test
    public void length() {
        /* The method length() returns the number of characters in the String */
        String string = "animals";
        System.out.println(string.length());
        //outpu: 7
    }

    @Test
    public void charAt() {
        /* The method charAt() lets you query the string to find out what character is at a specific index. */
        String string = "animals";
        System.out.println(string.charAt(0)); //output: a
        System.out.println(string.charAt(6)); //output: s
        //System.out.println(string.charAt(7)); // throws exception java.lang.StringIndexOutOfBoundsException:
    }

    @Test
    public void indexOf() {
        /* The method indexOf()looks at the characters in the string and finds the first index that matches the desired value. */
        /*-
        int indexOf(char ch)
        int indexOf(char ch, index fromIndex)
        int indexOf(String str)
        int indexOf(String str, index fromIndex)
        */

        String string = "animals";
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al", 5));
        /* returns –1 when no match is found. */

    }

    @Test
    public void substring() {
        /* The method substring() also looks for characters in a string. It returns parts of the string. */
        /*-
        int substring(int beginIndex)
        int substring(int beginIndex, int endIndex)
            a  n  i  m  a  l  s
            0  1  2  3  4  5  6
        */
        String string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        /*Notice we said "stop at" rather than "include." This means the endIndex parameter is allowed to be 1 past the end of the sequence */

        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // throws exception becouse the final index is back
        //System.out.println(string.substring(3, 8)); // throws exception because 8 is out

    }

    @Test
    public void toLowerCase_and_toUpperCase() {
        /*-
        String toLowerCase(String str)
        String toUpperCase(String str)
        */
        String string = "animals";
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123
    }

    @Test
    public void equals_and_equalsIgnoreCase() {
        /* The equals() method checks whether two String objects contain exactly the same characters in the same order */
        /* The equalsIgnoreCase() method checks whether two String objects contain the same characters with the
            exception that it will convert the characters’ case if needed. */
        /*-
        boolean equals(String str)
        boolean equalsIgnoreCase(String str)
        */

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true
    }

    @Test
    public void startsWith_and_endsWith() {
        /* The startsWith() and endsWith() methods look at whether the provided value matches part of the String. */
        /*
        boolean startsWith(String prefix)
        boolean endsWith(String suffix)
        */
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false
    }

    @Test
    public void contains() {
        /* The contains() method also looks for matches in the String. The match can be anywhere in the String. */
        /*
        boolean contains(String str)
        */
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false
        /* you don’t have to write str.indexOf(otherString) != -1 */
    }

    @Test
    public void replace() {
        /* The replace() method does a simple search and replace on the string */
        /*
        String replace(char oldChar, char newChar)
        String replace(CharSequence oldChar, CharSequence newChar)
         */
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

    }

    @Test
    public void trim() {
        /* The trim() method removes whitespace from the beginning and end of a String. */
        /* public String trim() */
        System.out.println("abc".trim());  // abc
        System.out.println("\t       a b c\n".trim()); // a b c

    }
}