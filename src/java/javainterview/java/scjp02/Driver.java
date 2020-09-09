package javainterview.java.scjp02;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
class MyThread733 implements Runnable {
	public void run() {
		System.out.println("Running MyThread");
	}
}// end of MyThread

class YourThread extends Thread {
	public YourThread(Runnable r) {
		super(r);
	}

	public void run() {
		System.out.println("Running YourThread");
	}
}// end of YourThread

public class Driver {

	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread(t1);
		t2.start();
	}
}// end of class

interface Doable {// Corresponds to Runnable
	public void doit(); // this method corresponds to run()
}

class Work implements Doable { // Class Work coressponds to Thread
	Doable work;
	String name;

	public Work() {
		this("defaultname", null);
	} // Diff. constructors

	public Work(String name) {
		this(name, null);
	}

	public Work(Doable work) {
		this("defaultname", work);
	}

	public Work(String name, Doable work) {
		this.name = name;
		this.work = work;
	}

	public void start() {
		doit();
	} // Plain implementation of start , no JVM things of course

	public void doit() {
		if (work != null)
			work.doit();
	}; // Implemented same way as Original run() in Thread
}

/***** Rest of the example corresponds to Ashok's original code ***/
class MyWork implements Doable {
	public void doit() {
		System.out.println("Doing MyWork");
	}
}

class YourWork extends Work {
	public YourWork(Doable work) {
		super(work);
	}

	public void doit() {
		System.out.println("Doing YourWork");
	}
}

class MyThreadingTest {
	public static void main(String args[]) {
		MyWork w1 = new MyWork();
		YourWork w2 = new YourWork(w1);
		w2.start();
	}
}
