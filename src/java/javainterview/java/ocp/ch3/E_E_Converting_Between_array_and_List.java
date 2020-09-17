package javainterview.java.ocp.ch3;
import java.util.ArrayList;
import java.util.Arrays;
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


public class E_E_Converting_Between_array_and_List {
    //You should know how to convert between an array and an ArrayList

    @Test
    public void converting_Between_array_and_List_1() {
        //Let’s start with turning an ArrayList into an array
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray(); //--> shows that an ArrayList knows how to convert itself to an array.
                                               // The only problem is that it defaults to an array of class Object.
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[5]);//-->specifies the type of the array and does what we actually want.
        //The advantage of specifying a size of 0 for the parameter is that Java will create a new array of the proper size for the return value.
        // If you like, you can suggest a larger array to be used instead. If the ArrayList fits in that array, it will be returned. Otherwise, a new one will be created.
        System.out.println(stringArray.length + " - " + stringArray.toString()); // 2
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void converting_Between_array_and_List_2() {
        //Converting from an array to a List is more interesting.
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list --> converts the array to a List
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test] -->It updates both array and list because they point to the same data store.
        array[0] = "new"; // [new, test] -->  also changes both array and list.
        for (String b : array)
            System.out.print(b + " "); // new test
        list.remove(1); // throws an exception because we are not allowed to change the size of the list.
    }

    @Test
    public void a_Cool_Trick_with_Varargs() {
        //merging varargs with ArrayList conversion allows you to create an ArrayList in a cool way:
        List<String> list = Arrays.asList("one", "two");
        //asList() takes varargs, which let you pass in an array or just type out the String values.
    }
}