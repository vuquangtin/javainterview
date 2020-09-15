package javainterview.java.ocp.ch1;
/**
 * 
 * G_Declaring_and_Initializing_Variables
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class G_B_Identifiers {
	/*-
	 It probably comes as no surprise that Java has precise rules about identifier names.
	 Luckily, the same rules for identifiers apply to anything you are free to name, including variables, methods, classes, and fields.
	 There are only three rules to remember for legal identifiers:
	 - The name must begin with a letter or the symbol "$" or "_".
	 - Subsequent characters may also be numbers.
	 - You cannot use the same name as a Java reserved word. As you might imagine, a reserved word is a keyword that Java has reserved so that you are not allowed to use it.
	 Remember that Java is case sensitive, so you can use versions of the keywords that only differ in case. Please don’t, though.
	 Don’t worry—you won’t need to memorize the full list of reserved words. The exam will only ask you about ones you’ve already learned, such as class.
	 The following is a list of all the reserved words in Java. const and goto aren’t actually used in Java.
	 They are reserved so that people coming from other languages don’t use them by accident—and in theory, in case Java wants to use them one day.
	 abstract     assert         boolean      break             byte
	 case         catch          char         class             const*
	 continue     default        do           double            else
	 enum         extends        false        final             finally
	 float        for            goto*        if                implements
	 import       instanceof     int          interface         long
	 native       new            null         package           private
	 protected    public         return       short             static
	 strictfp     super          switch       synchronized      this
	 throw        throws         transient    true              try
	 void         volatile       while
	 Prepare to be tested on these rules. The following examples are legal:
	 okidentifier
	 $OK2Identifier
	 _alsoOK1d3ntifi3r
	 __SStillOkbutKnotsonice$
	 These examples are not legal:
	 3DPointClass // identifiers cannot begin with a number
	 hollywood@vine // @ is not a letter, digit, $ or _
	 *$coffee // * is not a letter, digit, $ or _
	 public // public is a reserved word
	 Although you can do crazy things with identifier names, you shouldn’t. Java has conventions so that code is readable and consistent.
	 This consistency includes CamelCase. In CamelCase, each word begins with an uppercase letter. This makes multiple-word variable names easier to read.
	 Which would you rather read: Thisismyclass name or ThisIsMyClass name? The exam will mostly use common conventions for identifiers, but not always.
	 When you see a nonstandard identifier, be sure to check if it is legal. If not, you get to mark the answer “does not compile” and skip analyzing everything else in the question.
	 */
}