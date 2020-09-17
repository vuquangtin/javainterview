package javainterview.java.ocp.ch5;



/*
(deseas tener muhcas hijas y no instancien tu clase padre pero si a las hijas)
Let’s say you want to define a parent class that other developers are going to subclass.
Your goal is to provide some reusable variables and methods to developers in the parent class, whereas the developers provide specific implementations or overrides of other methods in the child classes.
Furthermore, let’s say you also don’t want an instance of the parent class to be instantiated unless it is an instance of the child class.

For example, you might define an Animal parent class that a number of classes extend from and use but for which an instance of Animal itself cannot be instantiated.
All subclasses of the Animal class, such as Swan, are required to implement a getName() method, but there is no implementation for the method in the parent Animal class.
How do you ensure all classes that extend Animal provide an implementation for this method?

In Java, you can accomplish this task by using an abstract class and abstract method.
An abstract class is a class that is marked with the abstract keyword and cannot be instantiated.(clase tiene "abstract" y no puede ser instanciado)
An abstract method is a method marked with the abstract keyword defined in an abstract class, for which no implementation is provided in the class in which it is declared.(metodo abstracto no tiene cuerpo)
The following code is based on our Animal and Swan description:
*/
/*public*/ abstract class AnimalBA5 {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}

/*public*/ class Swan extends AnimalBA5 {
    @Override
    public String getName() {
        return "Swan";
    }
}
/*
The first thing to notice about this sample code is that the Animal class is declared abstract and Swan is not.
Next, the member age and the method eat() are marked as protected and public, respectively; therefore, they are inherited in subclasses such as Swan.
Finally, the abstract method getName() is terminated with a semicolon and doesn’t provide a body in the parent class Animal.
This method is implemented with the same name and signature as the parent method in the Swan class.
*/
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class B_A_Defining_an_Abstract_Class {
}

/*
A_Defining_an_Abstract_Class
=============================
The previous sample code illustrates a number of important rules about abstract classes.
For example, an abstract class may include non-abstract methods and variables, as you saw with the variable age and the method eat().
In fact, an abstract class is not required to include any abstract methods.
For example, the following code compiles without issue even though it doesn’t define any abstract methods:
*/
    /*public*/ abstract class Cow {
    }
/*

Although an abstract class doesn’t have to implement any abstract methods, an abstract method may only be defined in an abstract class.
For example, the following code won’t compile because an abstract method is not defined within an abstract class:

    public class Chicken {
        public abstract void peck(); // DOES NOT COMPILE, si tienes un metodo abstract, la clase tambien debe ser abstract
    }

The exam creators are fond of questions like this one, which mixes non-abstract classes with abstract methods. They are also fond of questions with methods marked as abstract
for which an implementation is also defined. For example, neither method in the following code will compile because the methods are marked as abstract:
*/
    /*public*/ abstract class Turtle {
        //public abstract void swim() {}  //DOES NOT COMPILE, no deben de tener cuerpo o no deben ser abstractos
        //public abstract int getAge() { return 10; }  //DOES NOT COMPILE, no deben de tener cuerpo o no deben ser abstractos
    }
/*
The first method, swim(), doesn’t compile because two brackets are provided instead of a semicolon, and Java interprets this as providing a body to an abstract method.
The second method, getAge(), doesn’t compile because it also provides a body to an abstract method.
Pay close attention to swim(), because you’ll likely see a question like this on the exam.

=============================================================================================================================================================================
Default Method Implementations in Abstract Classes
=============================================================================================================================================================================
Although you can’t provide a default implementation to an abstract method in an abstract class, you can still define a method with a body—you just can’t mark it as abstract.
As long as you do not mark it as final, the subclass still has the option to override it, as explained in the previous section.
=============================================================================================================================================================================

Next, we note that an abstract class cannot be marked as final for a somewhat obvious reason.
By definition, an abstract class is one that must be extended by another class to be instantiated, whereas a final class can’t be extended by another class.
By marking an abstract class as final, you’re saying the class can never be instantiated, so the compiler refuses to process the code.
For example, the following code snippet will not compile:

    public final abstract class Tortoise { // DOES NOT COMPILE, no se puede combinar final con abstract en la clase
    }

Likewise, an abstract method may not be marked as final for the same reason that an abstract class may not be marked as final.
Once marked as final, the method can never be overridden in a subclass, making it impossible to create a concrete instance of the abstract class.

    public abstract class Goat {
        public abstract final void chew(); // DOES NOT COMPILE, no se debe combinar abstract con final en el metodo
    }

Finally, a method may not be marked as both abstract and private. This rule makes sense if you think about it.(no puede ser abstract y private)
How would you define a subclass that implements a required method if the method is not accessible by the subclass itself? The answer is you can’t, which is why the compiler will complain if you try to do the following:
*/
    /*public*/ abstract class Whale {
        //private abstract void sing(); // DOES NOT COMPILE, no se debe combinar private y Abstract en el metodo
    }

    /*public*/ class HumpbackWhale extends Whale {
        private void sing() {
            System.out.println("Humpback whale is singing");
        }
    }
/*
In this example, the abstract method sing() defined in the parent class Whale is not visible to the subclass HumpbackWhale.
Even though HumpbackWhale does provide an implementation, it is not considered an override of the abstract method since the abstract method is unreachable.
The compiler recognizes this in the parent class and throws an exception as soon as private and abstract are applied to the same method.

If we changed the access modified from private to protected in the parent class Whale, would the code compile? Let’s take a look:
*/
    /*public*/ abstract class Whale2 {
        protected abstract void sing();//overriding
    }

    /*public class HumpbackWhale2 extends Whale2 {
        private void sing() { // DOES NOT COMPILE, overriding, el metodo debe ser tan o mas accesible que el padre
            System.out.println("Humpback whale is singing");
        }
    }*/
/*
In this modified example, the code will still not compile but for a completely different reason.
If you remember the rules earlier in this chapter for overriding a method, the subclass cannot reduce the visibility of the parent method, sing().
Because the method is declared protected in the parent class, it must be marked as protected or public in the child class.
Even with abstract methods, the rules for overriding methods must be followed.
*/