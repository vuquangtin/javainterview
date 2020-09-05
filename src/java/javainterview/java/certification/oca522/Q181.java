package javainterview.java.certification.oca522;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Q181 {
	public static void main(String[] args) {
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
	}
}

/*-
 Q181
 What is the result?
 A. A B C C
 B. A C D
 C. A C D D
 D. A B D
 E. A B D C
 Answer: A
 */