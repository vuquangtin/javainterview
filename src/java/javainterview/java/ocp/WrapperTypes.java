package javainterview.java.ocp;

/**
 * Wrapper starts with capital letter and it is an object and can be null When
 * converting int to Integer it is called boxing. And they other way around
 * called unboxing
 * 
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class WrapperTypes {

	public static void main(String[] args) {
		int myInt = 10;
		Integer myInteger = 10;
		Integer myInteger2 = 20;
		Integer myInteger3 = Integer.valueOf(10);
		Integer myInteger4 = Integer.parseInt("3");
		Integer myInteger5 = null;
		// int myInt2 = null int can't hold null

		System.out.println("myInteger =" + myInteger);
		System.out.println("myInteger2 =" + myInteger2);
		System.out.println("myInteger4 =" + myInteger3);
		System.out.println("myInteger4 =" + myInteger4);
		System.out.println("myInteger5 =" + myInteger5);

		// converting wrapper to primitive -> unboxing
		int myInt3 = myInteger3; // unboxing

		// boxing -> converting primitive to wrapper
		Integer myInteger6 = new Integer(10);
		Integer myInteger7 = myInt;

		printSum(1, 2, 3); // autoboxing
		printSum(myInteger, myInteger2, myInteger3);
	}

	private static void printSum(Integer first, Integer second, Integer third) {
		Integer sum = first + second + third;
		System.out.println("sum= " + sum);
	}
}