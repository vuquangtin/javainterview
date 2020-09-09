package javainterview.java.scjp02;

import java.util.Vector;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class MyList710 {
	static int size;

	public void expandList(int newSize) {
		ListExpander lexp = new ListExpander();
		Vector expandedList = lexp.expand();
		class ListExpander {
			public Vector expand() {
				Vector v = new Vector(this.size + newSize);
				return v;
			}
		}
	}

	// public class Parent {
	// public int size = 0;
	//
	// static class InnerClass {
	// public void incrementParentSize() {
	// size = size + 10;
	// size;
	// }
	// }
	// }
	// public class Parent {
	// public Parent(int x, int y)
	// {
	// System.out.println("Created Parent");
	// }
	// }// end of Parent class
	//
	// public class Child extends Parent {
	// public Child(int x, int y) {
	// //
	// }
	//
	// public Child(int x, int y, int z){
	// System.out.println("Creating child");
	// this(x,y);
	// }
	//
	// public static void main(String[] args) {
	// Child c = new Child(1, 2, 3);
	// }
	// }

	public class OuterClass {
		class InnerClass {
		}

		public void innerClassDemo() {
			// Explicit instance of InnerClass
		}
		void main(){
			InnerClass i=new OuterClass ().new InnerClass();
		}
	}

}
