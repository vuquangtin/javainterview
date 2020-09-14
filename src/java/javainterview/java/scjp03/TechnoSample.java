package javainterview.java.scjp03;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class TechnoSample {
	public static void main(String argv[]) {
		TechnoSample inc = new TechnoSample();
		int i = 0;
		System.out.println(i++);
		System.out.println(++i);
		inc.fermin(i);
		i = i++;
		i = ++i;
		System.out.println(i);
	}

	void fermin(int i) {
		i++;
	}
}