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


public class D_G_Multidimensional_Arrays {
    // The arrays can hold other arrays

    @Test
    public void creating_a_Multidimensional_Array() {
        // to declare arrays with multiple dimensions
        int[][] vars1; // 2D array
        int vars2[][]; // 2D array
        int[] vars3[]; // 2D array //style confuse
        int[] vars4[], space[][]; // a 2D AND a 3D array -> 2D style confuse

        // specify the size of your multidimensional array
        String[][] rectangle = new String[3][2];
        //The result of this statement is an array rectangle with three elements, each of which refers to an array of two elements.
        //You can think of the addressable range as [0][0] through [2][1],
        //Now suppose we set one of these values:
        rectangle[0][1] = "set";
        /*-       rectangule -->   0          1           2
                                  -          -           -
                                 ▼          ▼           ▼
                                 0          0           0
                                 -          -           -
                                 1(set)     1           1                       */
    }

    @Test
    public void creating_a_Multidimensional_Array_1() {
        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};
        /*-
         * An asymmetric multidimensional array
           different Sizes -->   0          1           2
                                 -          -           -
                                 ▼         ▼           ▼
                                 0 1        0           0 1 2
                                 - -        -           - - -
                                 1 4        3           9 8 7               */
    }

    @Test
    public void creating_a_Multidimensional_Array_2() {
        //Another way to create an asymmetric array is to initialize just an array’s first dimension,
        //and define the size of each array component in a separate statement
        int[][] args = new int[4][];
        args[0] = new int[5];
        args[1] = new int[3];

    }

    @Test
    public void using_a_Multidimensional_Array() {
        //The most common operation on a multidimensional array is to loop through it.
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();
            // time for a new row
        }
    }

    @Test
    public void using_a_Multidimensional_Array_1() {
        //This entire exercise would be easier to read with the enhanced for loop
        int[][] twoD = new int[3][2];
        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

    }
}