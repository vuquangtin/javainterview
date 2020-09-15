package javainterview.java.ocp.ch1;

/**
 * C_understanding_package_declarations_and_imports
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
/*
 * Java calls more detailed packages "child packages"
 */
public class C_Wildcards {
	/*
	 * Classes in the same package are often imported together. You can use a
	 * shortcut to import all the classes in a package: import java.util.*; //
	 * imports java.util.Random among other things public class ImportExample {
	 * public static void main(String[] args) { Random r = new Random();
	 * System.out.println(r.nextInt(10)); } } The * is a wildcard that matches
	 * all classes in the package. Every class in the java.util package is
	 * available to this program when Java compiles it
	 */
}