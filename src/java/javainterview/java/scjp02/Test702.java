package javainterview.java.scjp02;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test702 {
	public int addTest(int x, int y) {
		x = x + 1;
		y = y + 1;
		int z = (x + y);
		return z;
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z = 0;
		Test702 t = new Test702();
		z = t.addTest(x, y);
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}
}
