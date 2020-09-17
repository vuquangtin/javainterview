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
public class C_B_Inheriting_an_Interface {}
/*
There are two inheritance rules you should keep in mind when extending an interface:
    1. An interface that extends another interface, as well as an abstract class that implements an interface, inherits all of the abstract methods as its own abstract methods.
    2. The first concrete class that implements an interface, or extends an abstract class that implements an interface, must provide an implementation for all of the inherited abstract methods.

Like an abstract class, an interface may be extended using the extend keyword.
In this manner, the new child interface inherits all the abstract methods of the parent interface.
Unlike an abstract class, though, an interface may extend multiple interfaces. Consider the following example:
*/
/*public*/ interface HasTail {
    public int getTailLength();
}
/*public*/ interface HasWhiskers {
    public int getNumberOfWhiskers();
}
/*public*/ interface Seal extends HasTail, HasWhiskers {}
/*
Any class that implements the Seal interface must provide an implementation for all methods in the parent interfaces—in this case, getTailLength() and getNumberOfWhiskers().

What about an abstract class that implements an interface? In this scenario, the abstract class is treated in the same way as an interface extending another interface.
In other words, the abstract class inherits the abstract methods of the interface but is not required to implement them.
That said, like an abstract class, the first concrete class to extend the abstract class must implement all the inherited abstract methods of the interface.
We illustrate this in the following example:
*/
/*public*/ interface HasTail2 {
    public int getTailLength();
}
/*public*/ interface HasWhiskers2 {
    public int getNumberOfWhiskers();
}
/*public*/ abstract class HarborSeal2 implements HasTail, HasWhiskers {}// La primera clase concreta que implemente esa interfaz es la que debe implementar todas los metodos abstractos
                                                                        // La primera clase concreta que extienda HarborSeal2 debe implementar todas los metodos abstractos

//class LeopardSeal implements HasTail, HasWhiskers {} // DOES NOT COMPILE, como primera clase concreta, debe implementar los metodos

/*
In this example, we see that HarborSeal is an abstract class and compiles without issue.
Any class that extends HarborSeal will be required to implement all of the methods in the HasTail and HasWhiskers interface.
Alternatively, LeopardSeal is not an abstract class, so it must implement all the interface methods within its definition.
In this example, LeopardSeal doesn’t provide an implementation for the interface methods, so the code doesn’t compile.


//TODO: Classes_Interfaces_and_Keywords
=======================================
The exam creators are fond of questions that mix class and interface terminology.
Although a class can implement an interface, a class cannot extend an interface.
Likewise, whereas an interface can extend another interface, an interface cannot implement another interface.
The following examples illustrate these principles:
*/
/*public*/ interface CanRun {}
//public class Cheetah extends CanRun {} // DOES NOT COMPILE
/*public*/ class Hyena {}
//public interface HasFur extends Hyena {} // DOES NOT COMPILE
//public interface HasFur implements CanRun {} // DOES NOT COMPILE
/*
The first example shows a class trying to extend an interface that doesn’t compile. The second example shows an interface trying to extend a class, which also doesn’t compile.
Be wary of examples on the exam that mix class and interface definitions.
Make sure the only connection between a class and an interface is with the class implements interface syntax.

//Todo: Abstract_Methods_and_Multiple_Inheritance
=================================================
Since Java allows for multiple inheritance via interfaces, you might be wondering what will happen if you define a class that inherits from two interfaces that contain the same abstract method:
*/
/*public*/ interface Herbivore {
    public void eatPlants();
}
/*public*/ interface Omnivore {
    public void eatPlants();
    public void eatMeat();
}
/*
In this scenario, the signatures for the two interface methods eatPlants() are compatible, so you can define a class that fulfills both interfaces simultaneously:
*/
/*public*/ class Bear6 implements Herbivore, Omnivore {
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
/*
Why does this work? Remember that interface methods in this example are abstract and define the “behavior” that the class implementing the interface must have.
If two abstract interface methods have identical behaviors—or in this case the same method signature— creating a class that implements one of the two methods automatically implements the second method.
In this manner, the interface methods are considered duplicates since they have the same signature.
What happens if the two methods have different signatures?
If the method name is the same but the input parameters are different, there is no conflict because this is considered a method overload.
We demonstrate this principle in the following example:
*/
/*public*/ interface Herbivore2 {
    public int eatPlants(int quantity);
}
/*public*/ interface Omnivore2 {
    public void eatPlants();
}
/*public*/ class Bear5 implements Herbivore2, Omnivore2 {
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: "+quantity);
        return quantity;
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
/*
In this example, we see that the class that implements both interfaces must provide implements of both versions of eatPlants(), since they are considered separate methods.
Notice that it doesn’t matter if the return type of the two methods is the same or different, because the compiler treats these methods as independent.
Unfortunately, if the method name and input parameters are the same but the return types are different between the two methods, the class or interface attempting to inherit both interfaces will not compile.
The reason the code doesn’t compile has less to do with interfaces and more to do with class design, as discussed in Chapter 4.
It is not possible in Java to define two methods in a class with the same name and input parameters but different return types.
Given the following two interface definitions for Herbivore and Omnivore, the following code will not compile:
*/
/*public*/ interface Herbivore3 {
    public int eatPlants();
}
/*public*/ interface Omnivore3 {
    public void eatPlants();
}
/*
class Bear3 implements Herbivore3, Omnivore3 {
    public int eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants: 10");
        return 10;
    }
    public void eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants");
    }
}
*/
/*
The code doesn’t compile, as the class defines two methods with the same name and input parameters but different return types.
If we were to remove either definition of eatPlants(), the compiler would stop because the definition of Bear would be missing one of the required methods.
In other words, there is no implementation of the Bear class that inherits from Herbivore and Omnivore that the compiler would accept.
The compiler would also throw an exception if you define an interface or abstract class that inherits from two conflicting interfaces, as shown here:
*/
/*public*/ interface Herbivore4 {
    public int eatPlants();
}
/*public*/ interface Omnivore4 {
    public void eatPlants();
}
//public interface Supervore4 extends Herbivore4, Omnivore4 {} // DOES NOT COMPILE

//abstract class AbstractBear4 implements Herbivore4, Omnivore4 {} // DOES NOT COMPILE

/*
Even without implementation details, the compiler detects the problem with the abstract definition and prevents compilation.
This concludes our discussion of abstract interface methods and multiple inheritance.
We’ll return to this discussion shortly after we introduce default interface methods. You’ll see that things work a bit differently with default interface methods.
*/