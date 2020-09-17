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

public class B_Working_with_Varargs {
	/*
	 * a method may use a vararg parameter (variable argument). A vararg
	 * parameter must be the last element in a method’s parameter list This
	 * implies you are only allowed to have one vararg parameter per method. Can
	 * you identify why each of these does or doesn’t compile?
	 */
	public void walk1(int... nums) {
	}

	public void walk2(int start, int... nums) {
	}

	// public void walk3(int... nums, int start) { } // DOES NOT COMPILE -> have
	// a vararg parameter in a position that is not the last one

	// public void walk4(int... start, int... nums) { } // DOES NOT COMPILE ->
	// only one

	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

	/*
	 * When calling a method with a vararg parameter, you have a choice: You can
	 * pass in an array, or you can list the elements of the array and let Java
	 * create it for you. You an even omit the vararg values in the method call
	 * and Java will create an array of length zero for you.
	 */
	@Test(expected = NullPointerException.class)
	public void main2() {
		walk(1); // 0 --> This means Java creates an array of length 0 for nums.
		walk(1, 2); // 1 --> Java converts this one value to an array of length
					// 1
		walk(1, 2, 3); // 2 --> Java converts these two values to an array of
						// length 2
		walk(1, new int[] { 4, 5 }); // 2 --> an array of length 2 directly as
										// nums.
		walk(1, null); // throws a NullPointerException --> it tries to
						// determine the length of null.
	}

	// Accessing a vararg parameter is also just like accessing an array. It
	// uses array indexing.
	// For example:

	public static void run(int... nums) {
		System.out.println(nums[1]);
	}

	@Test
	public void main3() {
		run(11, 22); // 22
	}
}