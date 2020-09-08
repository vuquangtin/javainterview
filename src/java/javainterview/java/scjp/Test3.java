package javainterview.java.scjp;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test3 {
	public static void main(String a[]) {
		Map s = new WeakHashMap(10);
		s.put(null, null);
		System.out.println(s);
	}
}