package javainterview.java.oca.chapter00.intro;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Q2 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString());
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}
}

/*-
 * What is the result of the following code?
 * 
 * String s1 = "Java"; String s2 = "Java"; StringBuilder sb1 = new
 * StringBuilder(); sb1.append("Ja").append("va"); System.out.println(s1 == s2);
 * System.out.println(s1.equals(s2)); System.out.println(sb1.toString() == s1);
 * System.out.println(sb1.toString().equals(s1));
 * 
 * A. true is printed out exactly once. B. true is printed out exactly twice. C.
 * true is printed out exactly three times. D. true is printed out exactly four
 * times. E. The code does not compile.
 */