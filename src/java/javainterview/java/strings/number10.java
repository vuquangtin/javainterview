package javainterview.java.strings;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class number10 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		// capacity=5 -----
		// length=0;
		// string="";
		String s = "";
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			// sb.toString().equals(s)
			System.out.println("Match 2"); // right answer
		} else {
			System.out.println("No Match");
		}

	}
}