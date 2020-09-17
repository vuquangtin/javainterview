package javainterview.java.ocp.ch4;

/*
 Primitives work in a way similar to reference variables.
 Java tries to find the most specific matching overloaded method.
 What do you think happens here?
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class E_C_Primitives {
	public void fly(int i) {
		System.out.print("int ");
	}

	public void fly(long l) {
		System.out.print("long ");
	}

	public static void main(String[] args) {
		E_C_Primitives p = new E_C_Primitives();
		p.fly(123);
		p.fly(123L);
	}
}