package javainterview.java.ocp.ch1;

/**
 * 
 * G_Declaring_and_Initializing_Variables
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
/*-
 We’ve seen some variables already. A variable is a name for a piece of memory that stores data.
 When you declare a variable, you need to state the variable type along with giving it a name.
 For example, the following code declares two variables.
 One is named zooName and is of type String. The other is named numberAnimals and is of type int.
 String zooName;
 int numberAnimals;
 Now that we’ve declared a variable, we can give it a value.
 This is called initializing a variable. To initialize a variable, you just type the variable name followed by an equal sign, followed by the desired value:
 zooName = "The Best Zoo";
 numberAnimals = 100;
 Since you often want to initialize a variable right away, you can do so in the same statement as the declaration.
 For example, here we merge the previous declarations and initializations into more concise code:
 String zooName = "The Best Zoo";
 int numberAnimals = 100;
 In the following sections, we’ll look at how to declare multiple variables in one-line and legal identifiers.
 */
public class G_A_Declaring_Multiple_Variables {
	// You can also declare and initialize multiple variables in the same
	// statement. How many variables do you think are declared and initialized
	// in the following two lines?
	String s1, s2;
	String s3 = "yes", s4 = "no";
	/*-
	 Four String variables were declared: s1, s2, s3 , and s4. You can declare many variables in the same declaration as long as they are all of the same type.
	 You can also initialize any or all of those values inline. In the previous example, we have two initialized variables: s3 and s4.
	 The other two variables remain declared but not yet initialized. This is where it gets tricky.
	 Pay attention to tricky things! The exam will attempt to trick you. Again, how many variables do you think are declared and initialized in this code?
	 */
	int i1, i2, i3 = 0;
	/*-
	 As you should expect, three variables were declared: i1, i2, and i3. However, only one of those values was initialized: i3.
	 The other two remain declared but not yet initialized. That’s the trick. Each snippet separated by a comma is a little declaration of its own.
	 The initialization of i3 only applies to i3. It doesn’t have anything to do with i1 or i2 despite being in the same statement.
	 Another way the exam could try to trick you is to show you code like this line:
	 */
	// int num, String value; // DOES NOT COMPILE
	/*-
	 This code doesn’t compile because it tries to declare multiple variables of different types in the same statement.
	 The shortcut to declare multiple variables in the same statement only works when they share a type.
	 To make sure you understand this, see if you can figure out which of the following are legal declarations.
	 “Legal,” “valid,” and “compiles” are all synonyms in the Java exam world. We try to use all the terminology you could encounter on the exam.
	 */
	boolean b1, b2;
	String s11 = "1", s22;
	// double d11, double d22; // DOES NOT COMPILE
	int i15;
	int i25;
	// int i35; i45; // DOES NOT COMPILE
	/*-
	 The first statement is legal. It declares two variables without initializing them. The second statement is also legal. It declares two variables and initializes only one of them.
	 The third statement is not legal. Java does not allow you to declare two different types in the same statement. Wait a minute! Variables d1 and d2 are the same type.
	 They are both of type double. Although that’s true, it still isn’t allowed.
	 If you want to declare multiple variables in the same statement, they must share the same type declaration and not repeat it. double d1, d2; would have been legal.
	 The fourth statement is legal. Although int does appear twice, each one is in a separate statement. A semicolon ( ;) separates statements in Java.
	 It just so happens there are two completely different statements on the same line. The fifth statement is not legal.
	 Again, we have two completely different statements on the same line. The second one is not a valid declaration because it omits the type.
	 When you see an oddly placed semicolon on the exam, pretend the code is on separate lines and think about whether the code compiles that way. In this case, we have the following:
	 */
	int i11;
	int i22;
	int i33;
	// i44; // DOES NOT COMPILE
	/*-
	 Looking at the last line on its own, you can easily see that the declaration is invalid.
	 And yes, the exam really does cram multiple statements onto the same line—partly to try to trick you and partly to fit more code on the screen.
	 In the real world, please limit yourself to one declaration per statement and line. Your teammates will thank you for the readable code.
	 */
}
