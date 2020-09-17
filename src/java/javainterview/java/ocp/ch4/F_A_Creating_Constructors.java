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

public class F_A_Creating_Constructors {
	// a constructor is a special method that matches the name of the class and
	// has no return type. Example:
	private String color;
	private int height;
	private int length;

	public F_A_Creating_Constructors(int length, int theHeight) {
		length = this.length; // backwards – no good!
		height = theHeight; // fine because a different name
		this.color = "white"; // fine, but redundant
	}

	public static void main(String[] args) {
		F_A_Creating_Constructors b = new F_A_Creating_Constructors(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}

	/*-
	Line 6 is incorrect and you should watch for it on the exam. The instance variable length starts out with a 0 value.
	That 0 is assigned to the method parameter length. The instance variable stays at 0.

	Line 7 is more straightforward. The parameter theHeight and instance variable height have different names.
	Since there is no naming collision, this is not required.

	Finally, line 8 shows that it is allowed to use this even when there is no duplication of variable names.
	In this section, we’ll look at default constructors, overloading constructors, final fields, and the order of initialization in a class.
	 */

}
