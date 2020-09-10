package javainterview.java.oca.chapter01;

/**
 * //Question 1
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class _C {
	private static int $;

	public static void main(String[] args) {
		String a_b; // A_b has tobe instintiated to be printed
		System.out.println($);
		// System.out.println(a_b);
	}

}

class Question2 {

	public static void matchStringVales() {
		String s1 = "Java";
		String s2 = "Java";

		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println("s1 == s2 : " + " " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + " " + s1.equals(s2));
		System.out
				.println("sb1.toString() == s1 : " + " " + sb1.toString() == s1);
		System.out.println("sb1.toString().equals(s1) : " + " "
				+ sb1.toString().equals(s1));
	}

	public static void main(String[] args) {

		matchStringVales();
	}

}

// Question 3
interface HasTail {
	int getTailLength();
}

abstract class Puma implements HasTail {

	@Override
	public int getTailLength() {
		return 5;
	}
}

class Cougar extends Puma {

	public static void main(String[] args) {
		// Puma puma = new Puma() // code will fail
		// to compile this line since Puma Class in abstract
		// can only have class created if puma is extend by a concrete class

	}

}

// Question 4

class FeedingSchedule {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while (count++ < 3) {
			int y = (1 + 2 * count) % 3;
			switch (y) {
			default:
			case 0:
				x -= 1;
				break;
			case 1:
				x += 5;
			}
		}
		System.out.println(x);
	}
}

class Question5 {

	public static void main(String[] args) {
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.print("c");
		} finally {
			System.out.print("d");
		}
		System.out.print("e");
	}
}