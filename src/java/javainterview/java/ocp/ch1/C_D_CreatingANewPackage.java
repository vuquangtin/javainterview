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
public class C_D_CreatingANewPackage {
	/*-
	Up to now, all the code we’ve written in this chapter has been in the default package.
	This is a special unnamed package that you should use only for throwaway code In real life, always name your packages to avoid naming conflicts and to allow others to reuse your code.
	Now it’s time to create a new package. The directory structure on your computer is related to the package name.
	Suppose we have these two classes:
	C:\temp\packagea\ClassA.java
	package packagea;
	public class ClassA {
	}
	C:\temp\packageb\ClassB.java
	package packageb;
	import packagea.ClassA;
	public class ClassB {
	    public static void main(String[] args) {
	        ClassA a;
	        System.out.println("Got it");
	    }
	}
	When you run a Java program, Java knows where to look for those package names.
	In this case, running from C:\temp works because both packagea and packageb are underneath it
	 */
}