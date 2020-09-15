package javainterview.java.ocp;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class DefaultInitialization {
	static boolean myBoolean;
	static byte myByte;
	static short myShort;
	static int myInt;
	static long myLong;
	static float myFloat;
	static double myDouble;
	static char myChar;

	public static void main(String[] args) {

		System.out.println("My boolean= " + myBoolean); // False
		System.out.println("My Byte= " + myByte); // 0
		System.out.println("My Short= " + myShort); // 0
		System.out.println("My int= " + myInt); // 0
		System.out.println("My long= " + myLong); // 0
		System.out.println("My float = " + myFloat); // 0
		System.out.println("My Double = " + myDouble); // 0.0
		System.out.println("My char = " + myChar); //
	}
}