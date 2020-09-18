package javainterview.java.ocp.ch1;

import java.util.Arrays;

/**
 *  
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class ArrayMain {
    static int[] a = {1, 5, 6, 10, 43, 12, 45, 11, 77};
    static int[] b = new int[9];
    public static void main(String[] args) {
        System.arraycopy(a, 3, b, 1, 4);
        System.out.println(Arrays.toString(b));
    }
}