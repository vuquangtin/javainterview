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
public class F_E_Order_of_Initialization {
}

/*-
 Chapter 1 covered the order of initialization. Now that you’ve learned about static initializers, it is time to revisit that. Unfortunately, you do have to memorize this list.
 We’ll give you lots of practice, but you do need to know this order by heart.

 1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For now, just say “no superclass” and go on to the next rule.)
 2. Static variable declarations and static initializers in the order they appear in the file.
 3. Instance variable declarations and instance initializers in the order they appear in the file.
 4. The constructor.
 */

class InitializationOrderSimple {
	private String name = "Torchie"; // instance variable declaration

	{ // instance initializers
		System.out.println(name);
	}

	private static int COUNT = 0;

	static { // static initializers
		System.out.println(COUNT);
	}

	static {// static initializers
		COUNT += 10;
		System.out.println(COUNT);
	}

	public InitializationOrderSimple() {
		System.out.println("constructor");
	}
}

class CallInitializationOrderSimple {
	public static void main(String[] args) {
		InitializationOrderSimple init = new InitializationOrderSimple();
		// 0 10 Torchie constructor
	}
}

/*-
 Let's look at why. Rule 1 doesn't apply because there is no superclass.
 Rule 2 says to run the static variable declarations and static initializers, in this case, lines 5 and 6, which output 0 and 10.
 Rule 3 says to run the instance variable declarations and instance initializers, here, lines 2 and 3, which output Torchie.
 Finally, rule 4 says to run the constructor, here, lines 7–9, which output constructor.

 The next example is a little harder. Keep in mind that the four rules apply only if an object is instantiated.
 If the class is referred to without a new call, only rules 1 and 2 apply.
 The other two rules relate to instances and constructors. They have to wait until there is code to instantiate the object.
 What do you think happens here?
 */

/*************************/

class InitializationOrder {
	private String name = "Torchie";

	{
		System.out.println(name);
	}

	private static int COUNT = 0;

	static {
		System.out.println(COUNT);
	}

	{
		COUNT++;
		System.out.println(COUNT);
	}

	public InitializationOrder() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("read to construct");
		new InitializationOrder();
	}
}

/*-
 Again, rule 1 doesn’t apply because there is no superclass.
 Rule 2 tells us to look at the static variables and static initializers—lines 4 and 5, in that order. Line 5 outputs 0.
 Now that the statics are out of the way, the main() method can run. "read to construct"
 Next, we can use rule 3 to run the instance variables and instance initializers. Here that is lines 2 and 3, which output Torchie.
 Finally, rule 4 says to run the constructor—in this case, lines 7–9, which output constructor.

 We are going to try one more example. This one is as hard as it gets.
 If you understand the output of this next one, congratulations on a job well done; if not, don’t worry. Write some programs to play with this.
 Try typing in the examples in this section and making minor changes to see what happens. For example, you might try commenting out part of the code.
 This will give you a better feel for what is going on. Then come back and reread this section to try the examples.

 */

class YetMoreInitializationOrder {
	static {
		add(2);
	}

	static void add(int num) {
		System.out.print(num + " ");
	}

	YetMoreInitializationOrder() { // contructor
		add(5);
	}

	static {
		add(4);
	}

	{
		add(6);
	}

	static {
		new YetMoreInitializationOrder();// la primera vez no imprime porque es
											// constructor, la ultima vez cuando
											// se llama directamente si imoprime
											// 5
	}

	{
		add(8);
	}

	public static void main(String[] args) {
	}
}
/*-
 The correct answer is 2 4 6 8 5. Let's walk through why that is. There is no superclass,
 so we jump right to rule 2—the statics. There are three static blocks: on lines 2, 5, and 7. They run in that order. The static block on line 2 calls the add() method, which prints 2.
 The static block on line 5 calls the add() method, which prints 4.
 The last static block, on line 7, calls new to instantiate the object. This means we can go on to rule 3 to look at the instance variables and instance initializers.
 There are two of those: on lines 6 and 8. They both call the add() method and print 6 and 8, respectively.
 Finally, we go on to rule 4 and call the constructor, which calls the add() method one more time and prints 5.

 This example is tricky for a few reasons.
 There’s a lot to keep track of. Also, the question has a lot of one-line code blocks and methods, making it harder to visualize which is a block. Luckily,
 questions like this are rare on the exam. If you see one, just write down what is going on as you read the code.
 */
