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
public class MyList {
	int size = 1;

	public static void main(String[] args) {
		MyList list = new MyList();
		list.size = 10;
		ListManager lm = new ListManager();
		lm.expandList(list);
		System.out.println("list.size=" + list.size);
	}
} // end of MyList

class ListManager {
	public void expandList(MyList l) {
		l.size = l.size + 10;
	}
}// end of ListManager
