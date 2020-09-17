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

public class D_C_Using_an_Array {

	@Test
	public void using_an_Array_1() {
		// let’s try accessing one
		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println(mammals.length); // 3
		System.out.println(mammals[0]); // monkey
		System.out.println(mammals[1]); // chimp
		System.out.println(mammals[2]); // donkey
	}

	@Test
	public void using_an_Array_2() {
		String[] birds = new String[6];
		System.out.println(birds.length);
		// The answer is 6. Even though all 6 elements of the array are null,
	}

	@Test
	public void using_an_Array_3() {
		// It is very common to use a loop when reading from or writing to an
		// array
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
			System.out.println(numbers[i]);
		}
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void using_an_Array_4() {
		// Can you tell why each of these throws an
		// ArrayIndexOutOfBoundsException for our array of size 10?
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;
		numbers[10] = 3;// no exists numbers[10]
		numbers[numbers.length] = 5;
		for (int i = 0; i <= numbers.length; i++)
			numbers[i] = i + 5;
		// the for loop incorrectly uses <= instead of <, which is also a way of
		// referring to that 10th element.
	}
}