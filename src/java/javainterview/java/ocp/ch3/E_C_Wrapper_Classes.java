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

public class E_C_Wrapper_Classes {
    /*-
    Up to now, we’ve only put String objects in the ArrayList
    What happens if we want to put primitives in?
    Each primitive type has a wrapper class, which is an object type that corresponds to the primitive
    TABLE 3.2              Wrapper classes
    _______________________________________________________________________________________
    Primitive type                  Wrapper class                   Example of constructing
    _______________________________________________________________________________________
    boolean                         Boolean                         new Boolean(true)
    byte                            Byte                            new Byte((byte) 1)
    short                           Short                           new Short((short) 1)
    int                             Integer                         new Integer(1)
    long                            Long                            new Long(1)
    float                           Float                           new Float(1.0)
    double                          Double                          new Double(1.0)
    char                            Character                       new Character('c')
    The wrapper classes also have a method that converts back to a primitive.
    You don’t need to know much about the constructors or intValue() type methods
    because autoboxing has removed the need for them
     */

    @Test(expected = NumberFormatException.class)
    public void wrapper_Classes_1(){
        // There are also methods for converting a String to a primitive or wrapper class
        // The parse methods, such as parseInt(), return a primitive, and the valueOf() method returns a wrapper class
        int primitive = Integer.parseInt("123"); // converts a String to an int primitive
        Integer wrapper = Integer.valueOf("123"); //converts a String to an Integer wrapper class

        int bad1 = Integer.parseInt("a"); // throws NumberFormatException
        Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
    }
    /*-
    TABLE 3.3                Converting from a String
    _______________________________________________________________________________________________________________
    Wrapper class                   Converting String to primitive              Converting String to wrapper class
    ________________________________________________________________________________________________________________
    Boolean                         Boolean.parseBoolean("true");               Boolean.valueOf("TRUE");
    Byte                            Byte.parseByte("1");                        Byte.valueOf("2");
    Short                           Short.parseShort("1");                      Short.valueOf("2");
    Integer                         Integer.parseInt("1");                      Integer.valueOf("2");
    Long                            Long.parseLong("1");                        Long.valueOf("2");
    Float                           Float.parseFloat("1");                      Float.valueOf("2.2");
    Double                          Double.parseDouble("1");                    Double.valueOf("2.2");
    Character                       None                                        None
    ________________________________________________________________________________________________________________*/
}