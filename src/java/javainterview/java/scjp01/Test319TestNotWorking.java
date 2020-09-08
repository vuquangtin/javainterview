package javainterview.java.scjp01;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test319TestNotWorking {
	private A a = null;

	public Test319TestNotWorking(A aParam) {
		this.a = aParam;
	}

	public Test319TestNotWorking(B bParam) {
		this(this.getAFromB(bParam));
	}

	// This does not work. WHY???
	private A getAFromB(B param) {
		A a = new A();
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