package javainterview.java.ocp.ch1;
/**
 * A_understanding_the_java_class_structure
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_WrittingAMainMethod {
    /*-
    A Java program begins execution with its main() method
    A main() method is the gateway between the startup of a Java process, which is managed by the Java Virtual Machine (JVM).
    The JVM calls on the underlying system to allocate memory and CPU time, access files, and so on.
    The main() method lets us hook our code into this process, keeping it alive long enough to do the work we’ve coded.
     */
}
/*public*/ class Zoo1 {
    public static void main(String[] args) {
        System.out.println("Welcome!");
    }
    /*- To compile and execute this code
           javac Zoo.java
           java Zoo
    To compile Java code, the file must have the extension ".java". The name of the file must match the name of the class.
    The result is a file of bytecode by the same name, but with a .class filename extension.
    Bytecode consists of instructions that the JVM knows how to execute.
    Notice that we must omit the .class extension to run Zoo.java because the period has a reserved meaning in the JVM.
    -Each file can contain only one class
    -The filename must match the class name, including case, and have a .java extension
    Let’s first review the words in the main() method’s signature:
        The keyword public is what’s called an access modifier. It declares this method’s level of exposure to potential callers in the program.
        The keyword static binds a method to its class so it can be called by just the class name, as in, for example, Zoo.main()
        The keyword void represents the return type. A method that returns no data returns control to the caller silently.
            The main() method changes the program state from started to finished.
        The main() method’s parameter list, represented as an array of java.lang.String objects.
            In practice, you can write String[] args, String args[] or String...args;
            The variable name args hints that this list contains values that were read in (arguments) when the JVM started.
        public class Zoo {
            public static void main(String[] args) {
                System.out.println(args[0]);
                System.out.println(args[1]);
            }
        }
            javac Zoo.java
            java Zoo Bronx Zoo
                Output:
                        Bronx
                        Zoo
        If you want spaces inside an argument, you need to use quotes as in this example:
            javac Zoo.java
            java Zoo "San Diego" Zoo
                Output:
                        San Diego
                        Zoo
            javac Zoo.java
            java Zoo Zoo 2
                Output:
                        Zoo
                        2
        Finally, what happens if you don’t pass in enough arguments?
            javac Zoo.java
            java Zoo Zoo
                Output:
                        ZooException in thread "main"
                        java.lang.ArrayIndexOutOfBoundsException: 1
                        at mainmethod.Zoo.main(Zoo.java:7)
        To review, you need to have a JDK to compile because it includes a compiler.
        You do not need to have a JDK to run the code—a JRE is enough.
        Java class files run on the JVM and therefore run on any machine with Java rather than just the machine or operating system they happened to have been compiled on.
     */
}