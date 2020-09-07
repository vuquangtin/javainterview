package javainterview.java.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class EqualsFullTest {
	private char value[];
	private int count;

	public EqualsFullTest(char[] value) {
		super();
		this.value = value;
		this.count = value.length;
	}

	public EqualsFullTest() {
		super();
	}

	public char[] getValue() {
		return value;
	}

	public void setValue(char[] value) {
		this.value = value;
	}

	public int getCount() {
		return count;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj instanceof EqualsFullTest) {
			EqualsFullTest o = (EqualsFullTest) obj;
			if (this.count != o.count) {
				return false;
			}
			int len = this.count;
			char ob[] = o.value;
			for (int i = 0; i < len - 1; i++) {
				if (this.value[i] != ob[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		char a[] = { 'a', 'b' };
		char b[] = { '1', '2' };
		char c[] = { 'a', 'b' };
		EqualsFullTest eqTest1 = new EqualsFullTest(a);
		EqualsFullTest eqTest2 = new EqualsFullTest(c);

		System.out.println(eqTest1.equals(a));
		System.out.println(eqTest1.equals(b));
		System.out.println(eqTest1.equals(c));
		System.out.println(eqTest1.equals(eqTest2));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}
