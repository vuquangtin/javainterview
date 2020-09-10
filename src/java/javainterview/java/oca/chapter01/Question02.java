package javainterview.java.oca.chapter01;

import org.apache.log4j.Logger;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question 1.1.2 (page 6) - Choose the appropriate option when attempting to compile 
 * and run the following code:
 * 
 * class Test {
 *    public static void main(String[] args) {
 *		 for (int i=0; i<20; i++) 
 *			System.out.println(i);
 *			//if this section is uncommented, a compilation error occurs
 *			//System.out.println(i);
 *		 System.out.println("finished");
 *    }
 * }
 * 
 * a) Compilation error (x)
 * b) The code compiles and runs, printing from 0 to 19 and then 19
 * c) The code compiles and runs, printing from 0 to 19, then 19, and then 'finished'
 * d) The code compiles and runs, printing from 0 to 19 and then a compilation error occurs
 * 
 */
class Question02 {
	
	private static final Logger logger = Logger.getLogger(Question02.class.getName());

	public static void main(String[] args) {
		for (int i=0; i<20; i++) 
			logger.info(i);
			//if this section is uncommented, a compilation error occurs
			//logger.info(i);
		logger.info("finished");
	}
}
