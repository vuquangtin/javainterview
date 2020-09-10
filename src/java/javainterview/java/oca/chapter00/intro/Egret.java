package javainterview.java.oca.chapter00.intro;

/**
 * Assessment_12
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Egret {
	private String color;

	public Egret() {
		this("white");
	}

	public Egret(String color) {
		color = color;
		// this.value = value;
	}

	public static void main(String[] args) {

		Egret e = new Egret();

		System.out.println("Color:" + e.color);

	}
	/*-
	What is the result of the following program?
	1: public class Egret {
	2:     private String value;
	3:     public Egret() {
	4:         this("white");
	5:     }
	6:     public Egret(String value) {
	7:          value = value;
	8:     }
	9:     public static void main(String[] args) {
	10:          Egret e = new Egret();
	11:          System.out.println("Color:" + e.value);
	12:    }
	13: }
	A. Color:
	B. Color:null
	C. Color:White
	D. Compiler error on line 4.
	E. Compiler error on line 10.
	F. Compiler error on line 11.
	B. Line 10 calls the constructor on lines 3–5. That constructor calls the other construc-
	tor. However, the constructor on lines 6–8 assigns the method parameter to itself,
	which leaves the value instance variable on line 2 set to its default value of null. For
	more information, see Chapter 4.
	 */
}
