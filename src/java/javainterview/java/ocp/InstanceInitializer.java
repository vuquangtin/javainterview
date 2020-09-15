package javainterview.java.ocp;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class InstanceInitializer {

	public static void main(String[] args) {
		{
			System.out.println("Feathers");
		}
	}

	{
		System.out.println("Snowy");
	}
}

// Field and instance initialier blocks run in the order which they appear in
// file
// Constructor runs after all fields and instance initializers have run.