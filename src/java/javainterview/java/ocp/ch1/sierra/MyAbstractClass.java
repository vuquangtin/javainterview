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
public abstract class MyAbstractClass {
	static Logger logger = Logger.getLogger(MyAbstractClass.class);
    public abstract void doGeneralThings();

    public void doConcreteThings() {
        //System.out.println("Hi from concrete method!");
        logger.debug("Hi from concrete method!");
        
    }

    public static void staticMethod() {
        //System.out.println("static method from abstract class");
        logger.debug("static method from abstract class");
    }
}