package javainterview.java.ocp.ch3;

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

public class A_B_Immutability {
	/*
	 * Once a String object is created, it is not allowed to change. The
	 * trade-off for the optimal packing is zero flexibility. You need to know
	 * that String is immutable.
	 */

	class Mutable {
		private String s;

		// Setter makes it mutable
		public void setS(String newS) {
			s = newS;
		}

		// Immutable only has a getter.
		public String getS() {
			return s;
		}
	}

	class Immutable {
		private String s = "name";

		public String getS() {
			return s;
		}
	}

	@Test
	public void inmutability1() {
		// + similar concat
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);
	}
}