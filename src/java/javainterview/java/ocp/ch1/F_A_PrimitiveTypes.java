package javainterview.java.ocp.ch1;
/**
 * F_distinguishing_Between_Object_References_and_Primitives
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class F_A_PrimitiveTypes {
/* - 
 * Java has eight built-in data types, referred to as the Java primitive types.
    These eight data types represent the building blocks for Java objects, because all Java objects are just a complex collection of these primitive data types.
    TABLE 1.1   Java primitive types
    shows the Java primitive types together with their size in bytes and the range of values that each holds.
    ____________________________________________________________
    Keyword             Type                            Example
    _____________________________________________________________
    boolean             true or false                   true
    byte                8-bit integral value            123
    short               16-bit integral value           123
    int                 32-bit integral value           123
    long                64-bit integral value           123
    float               32-bit floating-point value     123.45f
    double              64-bit floating-point value     123.456
    char                16-bit Unicode value            'a'
    ___________________________________________________________
 - float and double are used for floating-point (decimal) values.
 - A float requires the letter "f" following the number so Java knows it is a float.
 - byte, short, int, and long are used for numbers without decimal points.
 - Each numeric type uses twice as many bits as the smaller similar type. For example, short uses twice as many bits as byte does.
    You won’t be asked about the exact sizes of most of these types. You should know that a byte can hold a value from –128 to 127. So you aren’t stuck memorizing this,
    let’s look at how Java gets that. A byte is 8 bits. A bit has two possible values. (These are basic computer science definitions that you should memorize.)
    28 is 2 × 2 = 4 × 2 = 8 × 2 = 16 × 2 = 32 × 2 = 64 × 2 = 128 × 2 = 256. Since 0 needs to be included in the range, Java takes it away from the positive side.
    Or if you don’t like math, you can just memorize it.
    The number of bits is used by Java when it figures out how much memory to reserve for your variable. For example, Java allocates 32 bits if you write this: int num;
    ====================================================================================================
    What Is the Largest int?
    ====================================================================================================
    You do not have to know this for the exam, but the maximum number an int can hold is 2,147,483,647. How do we know this? One way is to have Java tell us:
        System.out.println(Integer.MAX_VALUE);
    The other way is with math. An int is 32 bits. 232 is 4,294,967,296. Divide that by 2 and
    you get 2,147,483,648. Then subtract 1 as we did with bytes and you get 2,147,483,647. It’s
    easier to just ask Java to print the value, isn’t it?
    ====================================================================================================
    There are a few more things you should know about numeric primitives.
    When a number is present in the code, it is called a literal. By default, Java assumes you are defining an int value with a literal.
    In this example, the number listed is bigger than what fits in an int.
    Remember, you aren't expected to memorize the maximum value for an int. The exam will include it in the question if it comes up.
        long max = 3123456789; // DOES NOT COMPILE
    Java complains the number is out of range. And it is—for an int. However, we don’t have an int. The solution is to add the character L to the number:
        long max = 3123456789L; // now Java knows it is a long
    Alternatively, you could add a lowercase l to the number. But please use the uppercase L. The lowercase l looks like the number 1.
    Another way to specify numbers is to change the “base.” When you learned how to count, you studied the digits 0–9.
    This numbering system is called base 10 since there are 10 numbers. It is also known as the decimal number system. Java allows you to specify digits in several other formats:
        - octal (digits 0–7), which uses the number 0 as a prefix—for example, 017
        - hexadecimal (digits 0–9 and letters A–F), which uses the number 0 followed by x or X as a prefix—for example, 0xFF
        - binary (digits 0–1), which uses the number 0 followed by b or B as a prefix—for example, 0b10
    You won’t need to convert between number systems on the exam. You’ll have to recognize valid literal values that can be assigned to numbers.
    ====================================================================================================
    Converting Back to Binary
    ====================================================================================================
    Although you don’t need to convert between number systems on the exam, we’ll look at one example in case you’re curious:
    */
    //@Test
    public void primitiveTypes(){
        System.out.println(56);    // 56
        System.out.println(0b11);  // 3
        System.out.println(017);   // 15
        System.out.println(0x1F);  // 31
    }
    /*-
    First we have our normal base 10 value. We know you already know how to read that, but bear with us. The rightmost digit is 6, so it’s “worth” 6.
    The second-to-rightmost digit is 5, so it’s “worth” 50 (5 times 10.) Adding these together, we get 56.
    Next we have binary, or base 2. The rightmost digit is 1 and is “worth” 1. The second-to-rightmost digit is also 1.
    In this case, it’s “worth” 2 (1 times 2) because the base is 2. Adding these gets us 3.
    Then comes octal, or base 8. The rightmost digit is 7 and is “worth” 7. The second-to-rightmost digit is 1. In this case, it’s “worth” 8 (1 times 8) because the base is 8.
    Adding these gets us 15.
    Finally, we have hexadecimal, or base 16, which is also known as hex.
    The rightmost “digit” is F and it’s “worth” 15 (9 is “worth” 9, A is “worth” 10, B is “worth” 11, and so forth).
    The second-to-rightmost digit is 1. In this case, it’s “worth” 16 (1 times 16) because the base is 16. Adding these gets us 31.
    ====================================================================================================
    The last thing you need to know about numeric literals is a feature added in Java 7. You can have underscores in numbers to make them easier to read:
        int million1 = 1000000;
        int million2 = 1_000_000;
    We’d rather be reading the latter one because the zeroes don’t run together.
    You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal point, or right after a decimal point. Let’s look at a few examples:
        double notAtStart = _1000.00; // DOES NOT COMPILE
        double notAtEnd = 1000.00_; // DOES NOT COMPILE
        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // this one compiles  */
}