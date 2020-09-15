package javainterview.java.ocp.ch1;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_NamingConflicts {
	java.util.Date date;
	java.sql.Date sqlDate;
	/*-
	One of the reasons for using packages is so that class names don’t have to be unique across all of Java.
	This means you’ll sometimes want to import a class that can be found in multiple places.
	A common example of this is the Date class. Java provides implementations of java.util.Date and java.sql.Date.
	public class Conflicts {
	    Date date;
	    // some more code
	}
	The answer should be easy by now. You can write either import java.util.*; or
	import java.util.Date;. The tricky cases come about when other imports are present:
	import java.util.*;
	import java.sql.*; // DOES NOT COMPILE
	When the class is found in multiple packages, Java gives you the compiler error:
	    The type Date is ambiguous
	In our example, the solution is easy—remove the java.sql.Date import that we don’t need.
	But what do we do if we need a whole pile of other classes in the java.sql package?
	    import java.util.Date;
	    import java.sql.*;
	Ah, now it works. If you explicitly import a class name, it takes precedence over any wildcards present. Java thinks, “Okay! The programmer really wants me to assume use of the java.util.Date class.”
	One more example. What does Java do with “ties” for precedence?
	    import java.util.Date;
	    import java.sql.Date; //DOES NOT COMPILE
	Java is smart enough to detect that this code is no good. As a programmer, you’ve claimed to explicitly want the default to be both the java.util.Date and java.sql.Date implementations.
	Because there can’t be two defaults, the compiler tells you:
	    The import java.sql.Date collides with another import statement
	If You Really Need to Use Two Classes with the Same Name...
	    public class Conflicts {
	        java.util.Date date;
	        java.sql.Date sqlDate;
	    }
	 */
}