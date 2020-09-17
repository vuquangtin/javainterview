package javainterview.java.ocp.ch3;

import java.util.ArrayList;
import java.util.List;

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

public class E_D_Autoboxing {
	/*
	 * Since Java 5, you can just type the primitive value and Java will convert
	 * it to the relevant wrapper class for you. This is called autoboxing.
	 */

	@Test
	public void autoboxing_1() {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5); // [50.5]
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		double first = weights.get(0); // 60.0 //convierte en primitivo
										// automaticamente
		System.out.println(first);
	}

	@Test(expected = NullPointerException.class)
	public void autoboxing_2() {
		// What do you think happens if you try to unbox a null?
		List<Integer> heights = new ArrayList<>();
		heights.add(null); // we add a null to the list
		int h = heights.get(0); // we try to unbox that null to an int primitive
								// --> NullPointerException, Java tries to get
								// the int value of null
	}

	@Test
	public void autoboxing_3() {
		// What do you think this code outputs?
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		System.out.println(numbers);
		numbers.remove(1);
		System.out.println(numbers);
		System.out.println(numbers.remove(new Integer(2))); // is correct
		System.out.println(numbers);
	}
}