package javainterview.java.oca.chapter02.datatypes;

/**
 * @author Mariana Azevedo
 * @since 16/06/2019
 * 
 * Question 1.2.16 (page 76) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class B{
 * }
 *
 * class A {
 *	  public static void main(String[] args) {
 *		B[] bs = new B[100];
 *		System.out.println("end!");
 *	  }
 * }
 * 
 * a) Compiles and 100 B-type objects are created, but we can not say anything about the garbage collector 
 * having thrown the objects out in the System.out row (x)
 * b) Compiles and no B-type objects are created.
 * c) Compile, create 100 and throw away all Type B objects upon reaching System.out.
 */
class F{
}

public class Question16 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		F[] bs = new F[100];
		System.out.println("end!");
	}
}
