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
public class D_Passing_Data_Among_Methods {
    /*-
    Java is a “pass-by-value” language.
    This means that a copy of the variable is made and the method receives that copy. Assignments made in the method do not affect the caller.
     */

    public static void main(String[] args) {
        int num = 4;
        newNumber(5);
        System.out.println(num); // 4
    }

    public static void newNumber(int num) {
        num = 8;
    }

}
/*-
Notice how we keep talking about variable assignments. This is because we can call methods on the parameters.
As an example, we have code that calls a method on the StringBuilder passed into the method
 */

class A_Passing_Data_Among_Methods_2 {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Webby
    }

    public static void speak(StringBuilder s) {
        s.append("Webby");
    }
}
/*-
In this case, the output is Webby because the method merely calls a method on the parameter.
It doesn’t reassign name to a different object you can see how pass-by-value is still used.
"s" is a copy of the variable name.
Both point to the same StringBuilder, which means that changes made to the StringBuilder are available to both references
*/
class ReturningValues {

    public static void main(String[] args) {
        int number = 1;         // 1
        String letters = "abc";         // abc
        number(number);         // 1 -> se queda en uno
        letters = letters(letters);         // abcd
        System.out.println(number + letters);         // 1abcd
    }

    public static int number(int number) {//aumneta en uno
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
/*-
This is a tricky one because there is a lot to keep track of. When you see such questions on the exam, write down the values of each variable.
Lines 3 and 4 are straightforward assignments.
Line 5 calls a method. Line 10 increments the method parameter to 2 but leaves the numbers variable in the main() method as 1.
While line 11 returns the value, the caller ignores it.
The method call on line 6 doesn’t ignore the result so letters becomes "abcd".
Remember that this is happening because of the returned value and not the method parameter
 */