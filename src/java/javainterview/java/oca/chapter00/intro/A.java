package javainterview.java.oca.chapter00.intro;

import org.apache.log4j.Logger;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class A {
	
	private static final Logger logger = Logger.getLogger(A.class.getName());
	
	public static final int VALUE = 15;
	public void run(int x) {
		logger.info(x);
	}
	/*-
	 * @author Mariana Azevedo
	 * @since 25/02/2019
	 * 
	 * Question 1.4.7 (page 43) - Choose the appropriate option to save and compile the following file:
	 * 
	 * a/A.java:
	 * 
	 * package a;
	 * public class A {
	 *    public static final int VALUE = 15;
	 *	  public void run(int x) {
	 *		  System.out.println(x);
	 *	  }
	 * }
	 * 
	 * b.B.java:
	 * 
	 * package b;
	 * import static a.A.*;
	 * class B {
	 * 	  void m() {
	 *    	 A a = new A();
	 *       a.run(VALUE);
	 *    }
	 * }
	 * 
	 * a) B doesn't compile: error on line 2.
	 * b) B doesn't compile: error on line 5. (x)
	 * c) B doesn't compile: error on line 6.
	 * d) Everything compiles.
	 *
	 */
}