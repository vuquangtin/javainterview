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
class T implements Runnable {

	public void run() {
		System.out.println("Executing run() method");
		myTest();
	}

	public synchronized void myTest() {
		try {
			wait(-1000);
			System.out.println("Executing the myTest() method");
		} catch (InterruptedException im) {
		}
	}
}

public class MyTest05 {

	public static void main(String args[]) {
		T t = new T();
		Thread th = new Thread(t);
		th.start();
	}
}
