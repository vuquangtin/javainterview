package javainterview.java.oca.chapter03.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.16 (page 124) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		char c = 65;
 *		char c2 = 68 - 65;
 *		System.out.println(c + c2);
 *	 }
 * }
 * 
 * a) Doesn't compile in the two char statements.
 * b) Doesn't compile on the three lines inside the main method.
 * c) Doesn't compile only in the c2 declaration. 
 * d) Doesn't compile only in the sum of characters.
 * e) Compiles and run, printing 62.
 * f) Compiles and run, printing another value. (x)
 */
class Question16 {
	public static void main(String[] args) {
		char c = 65;
		char c2 = 68 - 65;
		System.out.println(c + c2);
	}
}
