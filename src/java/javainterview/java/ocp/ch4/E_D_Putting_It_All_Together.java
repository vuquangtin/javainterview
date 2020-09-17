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
public class E_D_Putting_It_All_Together {
	/*-
	So far, all the rules for when an overloaded method is called should be logical. Java calls the most specific method it can
	When some of the types interact, the Java rules focus on backward compatibility. In Java 1.4 and earlier, autoboxing and varargs didn’t exist.
	Although that was a long time ago, old code still needs to work—which means autoboxing and varargs come last when Java looks at overloaded methods.

	TABLE 4.4  Order Java uses to choose the right overloaded method
	___________________________________________________________________________
	Rule                      Example of what will be chosen for glide(1,2)
	___________________________________________________________________________

	Exact match by type       public String glide(int i, int j) {}

	Larger primitive type     public String glide(long i, long j) {}

	Autoboxed type            public String glide(Integer i, Integer j) {}

	Varargs                   public String glide(int... nums) {}
	___________________________________________________________________________
	 */

	public static String glide(String s) {
		return "1";
	}

	public static String glide(String... s) {
		return "2";
	}

	public static String glide(Object o) {
		return "3";
	}

	public static String glide(String s, String t) {
		return "4";
	}

	public static void main(String[] args) {
		System.out.print(glide("a"));
		System.out.print(glide("a", "b"));
		System.out.print(glide("a", "b", "c"));
	}
	// print 142
}

class TooManyConversions {

	public static void play(Long l) {
	}

	public static void play(Long... l) {
	}

	public static void main(String[] args) {
		// play(4); // DOES NOT COMPILE - 2 conversiones -> long - Long
		play(4L); // calls the Long version
	}
	/*-
	Here we have a problem. Java is happy to convert the int 4 to a long 4 or an Integer 4.
	It cannot handle converting in two steps to a long and then to a Long.
	If we had public static void play(Object o) { }, it would match because only one conversion would be necessary: from int to Integer.
	An Integer is an Object, as you’ll see in Chapter 5.
	 */
}
