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
public class StringBuild {
	public static void main(String[] args) {
		String ta = "A ";
		ta = ta.concat("B "); // A_B_
		String tb = "C ";
		ta = ta.concat(tb);// A_B_C_
		ta.replace('C', 'D');// no affect on string --skip
		ta = ta.concat(tb);// A_B_C_C_
		System.out.println(ta);// A_B_C_C_
	}
}
