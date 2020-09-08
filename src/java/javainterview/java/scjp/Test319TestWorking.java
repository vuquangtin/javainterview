package javainterview.java.scjp;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test319TestWorking {
	private A a = null;

	public Test319TestWorking(A aParam) {
		this.a = aParam;
	}

	public Test319TestWorking(B bParam) {
		this(Test319TestWorking.getAFromB(bParam));
	}

	public Test319TestWorking() {
		
	}

	// It works because its marked static.
	private static A getAFromB(B param) {
		A a = new Test319TestWorking().new A();
		a.setName(param.getName());
		return a;
	}

	class A {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	class B {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}