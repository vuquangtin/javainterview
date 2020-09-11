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
public class TestBuffer {

	public void myBuf(StringBuffer s, StringBuffer s1) {
		s.append(" how are you");
		s = s1;
	}

	public static void main(String args[]) {
		TestBuffer tb = new TestBuffer();
		StringBuffer s = new StringBuffer("Hello");
		StringBuffer s1 = new StringBuffer("doing");
		tb.myBuf(s, s1);
		System.out.print(s);
	}
}
