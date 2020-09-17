package javainterview.java.ocp.ch5;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class B_B_Creating_a_Concrete_Class {}

/*
(Su unica funcion es definir metodos y variables estaticas)(no se puede intanciar)
When working with abstract classes, it is important to remember that by themselves, they cannot be instantiated and therefore do not do much other than define static variables and methods.
For example, the following code will not compile as it is an attempt to instantiate an abstract class.
*/
/*public*/ abstract class Eel {
    public static void main(String[] args) {
        //final Eel eel = new Eel(); // DOES NOT COMPILE, porque no se puede instanciar una clase abstracta
    }
}
/*
An abstract class becomes useful when it is extended by a concrete subclass.
A concrete class is the first non-abstract subclass that extends an abstract class and is required to implement all inherited abstract methods.
When you see a concrete class extending an abstract class on the exam, check that it implements all of the required abstract methods. Let’s review this with the following example.
*/
    /*public*/ abstract class Animal5 {
        public abstract String getName();
    }

    //public class Walrus extends Animal5 {} // DOES NOT COMPILE, xq debe implementar la metodo abstracto getName

/*
First, note that Animal is marked as abstract and Walrus is not. In this example, Walrus is considered the first concrete subclass of Animal.
Second, since Walrus is the first concrete subclass, it must implement all inherited abstract methods, getName() in this example.

Because it doesn’t, the compiler rejects the code.
Notice that when we define a concrete class as the “first” non-abstract subclass, we include the possibility that another non-abstract class may extend an existing non-abstract class.
The key point is that the first class to extend the non-abstract class must implement all inherited abstract methods. For example, the following variation will also not compile:
*/
    /*public*/ abstract class Animal6 {
        public abstract String getName();
    }


    //public class Bird6 extends Animal6 {} // DOES NOT COMPILE, xq debe implementra las clases abstractas del padre

    /*public class Flamingo6 extends Bird6 {
        public String getName() {
            return "Flamingo";
        }
    }*/

/*
Even though a second subclass Flamingo implements the abstract method getName(), the first concrete subclass Bird doesn’t; therefore, the Bird class will not compile.
*/