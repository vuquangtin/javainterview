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
public class MyList736 {
	private static final int MAX_SIZE = 10;
	private Object[] list = new Object[MAX_SIZE];

	public void add(Object obj) {
		int size = list.length;
		if (size >= MAX_SIZE) {

			class ListExpander {
				public void expand() {
					Object temp[] = list;
					list = new Object[size + MAX_SIZE];
					for (int i = 0; i < temp.length; i++) {
						list[i] = temp[i];
					}
				}// end of public void expand()
			}// end of class ListExpander
			ListExpander listEx = new ListExpander();
			listEx.expand();
			list[size] = obj;
		}// end of if
	}// end of add
}// end of class MyList
