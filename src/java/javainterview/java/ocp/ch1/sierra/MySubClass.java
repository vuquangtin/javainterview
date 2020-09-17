package javainterview.java.ocp.ch1.sierra;

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
public class MySubClass extends MyAbstractClass {
	static Logger logger = Logger.getLogger(MySubClass.class);
    public void doGeneralThings() {
        //System.out.println("Overrided or implememted method - doGeneralThings!");
        logger.debug("Overrided or implememted method - doGeneralThings!");
    }

    public static void staticMethod() {
        //System.out.println("Overriden static method!");
        logger.debug("Overriden static method!");
    }
}