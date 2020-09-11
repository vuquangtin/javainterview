package javainterview.java.scjp03;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
class MyTest04 {

	public void myTest() {
		System.out.println("Printing myTest in MyTest class");
	}

	public static void myStat() {
		System.out.println("Printing myStat in MyTest class");
	}
}

public class Test extends MyTest04 {

	public void myTest() {
		System.out.println("Printing myTest in Test class");
	}

	public static void myStat() {
		System.out.println("Printing myStat in Test class");
	}

	public static void main(String args[]) {

		MyTest04 mt = new Test();
		mt.myTest();
		mt.myStat();
	}
}
