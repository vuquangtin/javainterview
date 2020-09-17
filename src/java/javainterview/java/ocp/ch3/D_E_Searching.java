package javainterview.java.ocp.ch3;
import java.util.Arrays;

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


public class D_E_Searching {
    //Java also provides a convenient way to search, but only if the array is already sorted.
    //Table 3.1 covers the rules for binary search.

    /*-
    TABLE 3 .1       Binary search rules
    __________________________________________________________________________________________________
    Scenario                                        Result
    __________________________________________________________________________________________________
    Target element found in sorted array            Index of match
    Target element not found in sorted array        Negative value showing one smaller than the negative of index,
                                                    where a match needs to be inserted to preserve sorted order
    Unsorted array                                  A surprise—this result isn’t predictable
    ___________________________________________________________________________________________________
     */

    @Test
    public void searching_1() {
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); //-1
        System.out.println(Arrays.binarySearch(numbers, 3)); //-2
        System.out.println(Arrays.binarySearch(numbers, 9)); //-5
        /*-
        Line 5 searches for the index of 1. Although 1 isn’t in the list, the search can determine that it should be inserted at element 0 to preserve the sorted order.
        Since 0 already means something for array indexes, Java needs to subtract 1 to give us the answer of –1.
        Line 7 is similar. Although 3 isn’t in the list, it would need to be inserted at element 1 to preserve the sorted order.
        We negate and subtract 1 for consistency, getting –1 –1, also known as –2.
        Finally, line 8 wants to tell us that 9 should be inserted at index 4. We again negate and subtract 1, getting –4 –1, also known as –5.
         */
    }

    @Test
    public void searching_2() {
        //What do you think happens in this example?
        int[] numbers = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers, 2)); //output: 1
        System.out.println(Arrays.binarySearch(numbers, 3)); //output: -4
        //the array isn’t sorted. This means the output will not be predictable.
    }
}