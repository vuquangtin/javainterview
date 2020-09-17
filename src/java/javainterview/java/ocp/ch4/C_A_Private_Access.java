package javainterview.java.ocp.ch4;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_A_Private_Access {
	/*-
	 There are four access modifiers: We are going to discuss them in order from most restrictive to least restrictive.
	    - private: Only accessible within the same class.
	    - default (package private) access: private and other classes in the same package.
	    - protected: default access and child classes.
	    - public: protected and classes in the other packages.
	 */
	// Only code in the same class can call private methods or access private
	// fields.
}

class FatherDuck {
	private String noise = "quack";

	private void quack() {
		System.out.println(noise); // private access is ok
	}

	private void makeNoise() {
		quack(); // private access is ok
	}
}

class BadDuckling {
	public void makeNoise() {
		FatherDuck fatherDuck = new FatherDuck();
		// fatherDuck.quack(); // DOES NOT COMPILE
		// System.out.println(fatherDuck.noise); // DOES NOT COMPILE
	}
}
