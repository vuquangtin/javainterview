package javainterview.java.oca.chapter05.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.6 (page 196) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		for(int i=0, j=1; i<10; i++, j++) System.out.println(i);
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and prints 0 to 9. (x)
 * c) Compiles and prints 0 to 10.
 * d) Compiles and prints 1 to 10.
 * e) Compiles and prints 1 to 11.
 */
class Question06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		for(int i=0, j=1; i<10; i++, j++) System.out.println(i);
	}
}
