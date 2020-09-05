package core.java.base;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class GenTemplateMethod {
	public static void main(String[] args) {
		int LENGTH = 100;

		genMain(0, LENGTH, "main");
	}

	public static void genMain(int START, int LENGTH, String name) {
		String callInMain = "";
		for (int i = 1; i <= START + LENGTH; i++) {
			System.out.println("public static void " + name + i
					+ "(String[] args){}");
			callInMain += name + "" + i + "(args);\n";
		}
		System.out.println(callInMain);

	}

	public static void genImplemention(int START, int LENGTH) {
		for (int i = START; i <= START + LENGTH; i++) {
			System.out.println("public abstract void implemention" + i
					+ "(String[] args) throws Exception;");

		}

	}
}
