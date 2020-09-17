package javainterview.java.ocp.ch3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


public class E_F_Sorting {
    //Sorting an ArrayList is very similar to sorting an array.

    @Test
    public void sorting_1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]
    }
}