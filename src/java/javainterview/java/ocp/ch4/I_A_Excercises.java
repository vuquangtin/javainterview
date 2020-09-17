package javainterview.java.ocp.ch4;

import org.junit.Test;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class I_A_Excercises {

	public int howMany(boolean b, boolean... b2) {
		System.out.println(b2.length);
		return b2.length;
	}

	@Test
	public void cinco() {
		howMany(true, new boolean[] { true, true });
		howMany(true, true, true);
	}

}
