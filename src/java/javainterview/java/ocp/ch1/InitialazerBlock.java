package javainterview.java.ocp.ch1;

/**
 * 
 * instance-init-block
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a href="https://github.com/vuquangtin/javainterview">https://github.com
 *      /vuquangtin/javainterview</a>
 *
 */
public class InitialazerBlock extends SuperClass {
	private int number;
	private String string;
	static int sNumber = 100;

	static {
		System.out.println("From SUBCLASS _STATIC_ block!");
		System.out.println(sNumber);
		System.out.println("____________________");
	}

	{
		System.out.println("From SUBCLASS INSTANCE block!");
		number = 42;
		System.out.println(number);
		string = "Forty two!";
		System.out.println(toString() + " TOSTRING");
	}

	public InitialazerBlock() {
		System.out.println(this + " THIS");
		System.out.println("Hi from constructor!");
	}

	public static void main(String[] args) {
		System.out.println("Begining ________");
		InitialazerBlock block = new InitialazerBlock();
		System.out.println(block);
	}

	@Override
	public java.lang.String toString() {
		return "InitialazerBlock{" + "number=" + number + ", string='" + string + '\'' + '}';
	}
}
