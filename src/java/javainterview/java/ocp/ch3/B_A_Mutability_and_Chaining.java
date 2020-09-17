package javainterview.java.ocp.ch3;

import org.junit.Test;

/**
 * 
 * B_Using_the_StringBuilder_Class
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class B_A_Mutability_and_Chaining {
	/************* B_Using_the_StringBuilder_Class ************/
	@Test
	public void string() {
		/*
		 * a lots of objects are instantiated, most of which are immediately
		 * eligible for garbage collection
		 */
		/* This is very inefficient */
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++) {
			alpha += current;
		}
		System.out.println(alpha);

		/*
		 * The StringBuilder class creates a String without storing all those
		 * interim String values
		 */
		/* Unlike the String class, StringBuilder is not immutable. */
	}

	@Test
	public void stringBuilder() {
		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++) {
			alpha.append(current);
		}
		System.out.println(alpha);
		/*
		 * This code reuses the same StringBuilder without creating an interim
		 * String each time
		 */
	}

	/******** Mutability_and_Chaining **************/
	@Test
	public void mutabilityAndChaining_1() {
		/*
		 * Chaining StringBuilder objects: the StringBuilder changes its own
		 * state and returns a reference to itself!
		 */
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");// sb = "start+middle"
		System.out.println(sb);
		StringBuilder same = sb.append("+end");// "start+middle+end"
		System.out.println(same);
		System.out.println(sb);
		/*
		 * sb This time the reference is stored in same which means sb and same
		 * point to the exact same object and would print out the same value
		 */
	}

	@Test
	public void mutabilityAndChaining_2() {
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		/* There are two variables referring to that object. */
	}
}