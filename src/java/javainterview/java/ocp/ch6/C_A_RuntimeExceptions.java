package javainterview.java.ocp.ch6;



import org.junit.Test;

/*
* You need to recognize three types of exceptions for the OCA exam:
* -runtime exceptions
* -checked exceptions
* -errors
*
* you’ll need to recognize
* -which type of an exception it is
* -whether it’s thrown by the JVM or a programmer
*
* show you some code examples for those exceptions.
* */
public class C_A_RuntimeExceptions {
    /*
    * Runtime exceptions extend RuntimeException
    * They don’t have to be handled or declared. They can be thrown by the programmer or by the JVM. Example
    *
    * - ArithmeticException, Thrown by the JVM when code attempts to divide by zero
    * - ArrayIndexOutOfBoundsException, Thrown by the JVM, when code uses an illegal index to access an array
    * - ClassCastException, Thrown by the JVM, when an attempt is made to cast an exception to a subclass of which it is not an instance
    * - IllegalArgumentException, Thrown by the programmer to indicate that a method has been passed an illegal or inappropriate argument
    * - NullPointerException, Thrown by the JVM, when there is a null reference where an object is required
    * - NumberFormatException, Thrown by the programmer, when an attempt is made to convert a string to a numeric type but the string doesn’t have an appropriate format
    *
    * */

    @Test
    public void arithmeticException(){
        int answer = 11 / 0;
    }

    @Test
    public void arrayIndexOutOfBoundsException(){
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);
    }

    @Test
    public void classCastException(){
        //String type = "moose";
        //Integer number = (Integer) type; // DOES NOT COMPILE
        String type = "moose";
        Object obj = type;
        Integer number = (Integer) obj;
    }

    @Test
    public void illegalArgumentException(){
        /*
        IllegalArgumentException is a way for your program to protect itself.
        public static void setNumberEggs(int numberEggs) {
            if (numberEggs < 0) {
                throw new IllegalArgumentException("# eggs must not be negative");
                this.numberEggs = numberEggs;
            }
         */
    }

    @Test
    public void nullPointerException() {
        //System.out.println(name.length());
    }

    @Test
    public void numberFormatException(){
        Integer.parseInt("abc");
    }

}
