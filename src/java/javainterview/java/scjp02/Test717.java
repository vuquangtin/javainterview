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
public class Test717 {
	public void demo(String[] list) {
		try {
			String s = list[list.length + 1];
			System.out.println(s);
		} catch (ArrayIndexOutOfBoundsException e) {
			return;
		} finally {
			System.out.println("Finally here.");
		}
	}

	public static void main(String[] args) {
		Test717 t = new Test717();
		String[] list = { "one", "two" };
		t.demo(list);
		System.out.println("Done!");
		ma();
		m3();
	}

	public static void ma() {
		int x = 2;
		int y = 3;
		int z = 4;
		if (x > 2) {
			System.out.println("Tested x");
		}
		if (y < 3) {
			System.out.println("Tested y");
		}
		if (z <= 3) {
			System.out.println("Tested z");
		}

		for (int i = 0; i < 2; i++) {
			for (int j = i; j < 3; j++) {
				if (i == j) {
					continue;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}

		int j = 0;
		for (int i = 0; i < 2; i++) {
			for (j = i; j < 3; j++) {
				continue;
			}
			System.out.println("-->i = " + i + " j = " + j);
		}

		int i = 0;
		j = 0;
		for (i = 0; i < 2; i++) {
			for (j = i; j < 3; j++) {
				break;
			}
			System.out.println("i = " + i + " j = " + j);
		}

		i = 0;
		j = 0;

		for (i = 0; i < 2; i++) {
			inner: for (j = i; j < 3; j++) {
				break inner;
			}
			System.out.println("i = " + i + " j = " + j);
		}

	}

	public static void m3(){
		Thread currentThread=Thread.currentThread();
		int priority = currentThread.getPriority();
		Thread t1=new Thread();
		t1.setPriority(9);
		ThreadGroup tgrp=new ThreadGroup("name");
		tgrp.setMaxPriority(10);
		Thread t2=new Thread(tgrp,"t2");
		System.out.println("Priority of t1="+t1.getPriority());
		System.out.println("Priority of t2="+t2.getPriority());

	}
}// end of Test class
