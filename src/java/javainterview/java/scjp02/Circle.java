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
/** File Drawable.java */
interface Drawable {
	public void draw();

	public void fill();
}

/** End of file Drawable.java */

/** File Circle.java */
public class Circle implements Drawable {
	int center = 0;

	public void draw() {
		System.out.println("Drawing circle");
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
	}

}
/** End of file Circle.java */
