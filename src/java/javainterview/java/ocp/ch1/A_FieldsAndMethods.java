package javainterview.java.ocp.ch1;

/**
 * A_understanding_the_java_class_structure
 * 
 * https://github.com/cjarroyo/oca8/blob
 * /master/src/test/java/ch2/ch2/operatorsAndStatements
 * /A_Understanding_Java_Operators/A_UnderstandingJavaOperators.java
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_FieldsAndMethods {
	/*-
	 * Java classes have two primary elements:
	        - "methods", often called functions or procedures in other languages.
	        - "fields", more generally known as variables.
	         Together these are called "the members of the class".
	        - "Methods" operate on that state.
	        - "Variables" hold the state of the program.
	         If the change is important to remember, a variable stores that change.  That’s all classes really do.
	 The simplest Java class
	 */
	/* public */class Animal {
		// A String is a value that we can put text into, such as
		// "this is a string". String is also a class supplied with Java
		String name;

		// A method is an operation that can be called. Next comes the return
		// type—in this case, the method returns a String
		public String getName() {
			return name;
		}

		/*-
		"void" means that no value at all is returned
		This method requires information be supplied to it from the calling method; this information is called a parameter.
		The full declaration of a method is called a method signature
		 */
		public void setName(String newName) {
			name = newName;
		}
	}
}