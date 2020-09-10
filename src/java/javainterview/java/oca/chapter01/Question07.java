package javainterview.java.oca.chapter01;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question 1.2.2 (page 17) - Choose the appropriate option when attempting to compile and run the following file:
 * 
 * class Test {
 * 	  int Test = 305;
 *	
 *    void Test() {
 *	     System.out.println(Question7);
 *    }
 *	
 *    public static void main(String[] args) {
 *	     new Test();
 *    }
 * }
 * 
 * a) The code doesn't compile: errors on lines 2, 4, 5, and 6
 * b) The code doesn't compile: error on line 5
 * c) The code doesn't compile: errors in line 2, 4 and 6
 * d) The code compiles and, when running, prints 305
 * e) The code compiles and doesn't print anything (x)
 * f) The code compiles and, as it runs, prints a blank line
 *
 */
class Question07 {

	int Question7 = 305;
	
//	void Question7() {
//		System.out.println(Question7);
//	}
	
	public static void main(String[] args) {
		new Question07();
	}
}
