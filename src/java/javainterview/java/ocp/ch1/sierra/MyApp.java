package javainterview.java.ocp.ch1.sierra;

import org.apache.log4j.Logger;

import core.java.utilities.Log4jUtils;

/**
 * https://github.com/motus101/javacertification/tree/master/OCA/chapter-2/oca-
 * boyarsky
 * 
 * abstract-class/static-method-in-abstract-class
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a href="https://github.com/vuquangtin/javainterview">https://github.com
 *      /vuquangtin/javainterview</a>
 *
 */
public class MyApp {
	static Logger logger = Logger.getLogger(MyApp.class);

	public static void main(String[] args) {
		logger = Log4jUtils.initLog4j();
		MySubClass aClass = new MySubClass();
		aClass.doGeneralThings();
		aClass.doConcreteThings();
		aClass.staticMethod();
	}
}