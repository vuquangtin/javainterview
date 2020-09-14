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
class Base {
	static int oak = 99;
}

public class Doverdale extends Base {	
	public static void main(String argv[]) {
		Doverdale d = new Doverdale();
		d.amethod();
	}

	public void amethod() {
		// Here
		System.out.println(Base.oak);
		System.out.println(super.oak);
		System.out.println(oak);
		//oak = 50.1;
	}
}
