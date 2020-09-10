package javainterview.java.oca.chapter03.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.24 (page 136) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		String s1 = "s1";
 *      String s2 = s1.substring(0,2);
 *      System.out.println(s1==s2);
 *      System.out.println(s1.equals(s2));
 *	 }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and prints true, false. 
 * c) Compiles and prints true, true. (x)
 * d) Compiles and prints false, false. 
 * e) Compiles and prints false, true. 
 */
class Question24 {
	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = s1.substring(0,2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
