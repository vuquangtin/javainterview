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
public class OuterClass52 {
	final String s = "I am outer class member variable";

	public void Method() {
		//final 
		String s1 = "I am inner class variable";
		class InnerClass {
			public void innerMethod() {
				int xyz = 20;
				System.out.println(s);
				System.out.println("Integer value is" + xyz);
				System.out.println(s1); // Illegal, compiler error
			}
		}
	}

}
