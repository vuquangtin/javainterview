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

public class B_C_Extending_an_Abstract_Class {}
/*
Let’s expand our discussion of abstract classes by introducing the concept of extending an abstract class with another abstract.(extiendes con otra clase abstracta)
We’ll repeat our previous Walrus example with one minor variation:
*/
/*public*/ abstract class Animal8C {
    public abstract String getName();
}

//public class Walrus extends Animal8C {} // DOES NOT COMPILE, debe implementar getName


/*public*/ abstract class Eagle8C extends Animal8C {}//si compila xq tambien es una clase abstracta

/*
In this example, we again have an abstract class Animal with a concrete subclass Walrus that doesn’t compile since it doesn’t implement a getName() method.
We also have an abstract class Eagle, which like Walrus extends Animal and doesn’t provide an implementation for getName().
In this situation, Eagle does compile because it is marked as abstract.
Be sure you understand why Walrus doesn’t compile and Eagle does in this example.

As you saw in this example, abstract classes can extend other abstract classes and are not required to provide implementations for any of the abstract methods.
It follows, then, that a concrete class that extends an abstract class must implement all inherited abstract methods.
For example, the following concrete class Lion must implement two methods,getName() and roar():
*/
/*public*/ abstract class Animal9C {
    public abstract String getName();
}

/*public*/ abstract class BigCat9C extends Animal9C {//abstract extend abstract
    public abstract void roar();
}

/*public*/ class Lion2C extends BigCat9C {//concret extend abstract, implementamos los 2 metodos abstractos que estan arriba
    public String getName() {//implemt getName
        return "Lion";
    }

    public void roar() {//implemet roar
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
/*
In this sample code, BigCat extends Animal but is marked as abstract; therefore, it is not required to provide an implementation for the getName() method.
The class Lion is not marked as abstract, and as the first concrete subclass, it must implement all inherited abstract methods not defined in a parent class.
There is one exception to the rule for abstract methods and concrete classes: a concrete subclass is not required to provide an implementation for an abstract method if an
intermediate abstract class provides the implementation. For example, take a look at the following variation on our previous example:
*/
/*public*/ abstract class Animal3D {
    public abstract String getName();
}

/*public*/ abstract class BigCat3D extends Animal3D {//abstract extend abstract, no necesita implementar nada, pero es opcional implmentar la de arriba
    public String getName() {
        return "BigCat";
    }
    public abstract void roar();
}

/*public*/ class Lion3D extends BigCat3D { //concret extend abstract, solo te queda implementar roar
    public void roar() { //implements roar
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
/*
In this example, BigCat provides an implementation for the abstract method getName() defined in the abstract Animal class.
Therefore, Lion inherits only one abstract method, roar(), and is not required to provide an implementation for the method getName().
Here’s one way to think about this: if an intermediate class provides an implementation for an abstract method, that method is inherited by subclasses as a concrete method, not
as an abstract one. In other words, the subclasses do not consider it an inherited abstract method because it is no longer abstract by the time it reaches the subclasses.
The following are lists of rules for abstract classes and abstract methods that we have covered in this section. Review and understand these rules before taking the exam.

Abstract Class Definition Rules:
    1. Abstract classes cannot be instantiated directly.
    2. Abstract classes may be defined with any number, including zero, of abstract and non abstract methods.
    3. Abstract classes may not be marked as private or final.
    4. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.(hereda los metodos abstractos y tambien sumale sus propios metodos abstractos)
    5. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.

Abstract Method Definition Rules:
    1. Abstract methods may only be defined in abstract classes.
    2. Abstract methods may not be declared private or final.
    3. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
    4. Implementing an abstract method in a subclass follows the same rules for overriding a method.
       For example, the name and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as the method in the parent class.
*/

