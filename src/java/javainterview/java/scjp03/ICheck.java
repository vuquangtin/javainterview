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
class Check {
	Check() {
	}
}

public class ICheck extends Check {
	public static void main(String[] args) {
		Object o = new ICheck();
		Check i = new ICheck();
		Check c = new Check();

		if (o instanceof XXX) {
			System.out.println("True");
		}
	}

}
