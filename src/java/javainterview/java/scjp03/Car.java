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
class Vehicle {

	String str;

	public Vehicle() {
	}

	public Vehicle(String s) {
		str = s;
	}
}

public class Car extends Vehicle {

	public static void main(String args[]) {
		final Vehicle v = new Vehicle(" Hello");
		v = new Vehicle(" How are you");
		v.str = "How is going";
		System.out.println("Greeting is : " + v.str);
	}
}
