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

/*
Java supports polymorphism, the property of an object to take on many different forms.
To put this more precisely, a Java object may be accessed using a reference with the same type as the object,
a reference that is a superclass of the object, or a reference that defines an interface the object implements, either directly or through a superclass.
Furthermore, a cast is not required if the object is being reassigned to a super type or interface of the object.

Let’s illustrate this polymorphism property with the following example:
*/
/*public*/ class Primate {
    public boolean hasHair() {
        return true;
    }
}

/*public*/ interface TieneCola {
    public boolean isTailStriped();
}

/*public*/ class Lemur extends Primate implements TieneCola {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        TieneCola tieneCola = lemur; //reference that defines an interface the object implements
        System.out.println(tieneCola.isTailStriped());

        Primate primate = lemur; //reference that is a superclass of the object
        System.out.println(primate.hasHair());
    }
}
/*This code compiles and executes without issue and yields the following output:
10
false
true
The most important thing to note about this example is that only one object, Lemur, is created and referenced.
The ability of an instance of Lemur to be passed as an instance of an interface it implements, HasTail, as well as an instance of one of its superclasses, Primate, is the nature of polymorphism.
Once the object has been assigned a new reference type, only the methods and variables available to that reference type are callable on the object without an explicit cast.
For example, the following snippets of code will not compile:
*/
/*public*/ class Lemur2 extends Primate implements TieneCola {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur2 lemur = new Lemur2();
        System.out.println(lemur.age);

        TieneCola hasTail = lemur; //reference that defines an interface the object implements
        //System.out.println(hasTail.age); // DOES NOT COMPILE

        Primate primate = lemur; //reference that is a superclass of the object
        //System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
    }
}
/*
In this example, the reference hasTail has direct access only to methods defined with the HasTail interface; therefore, it doesn’t know the variable age is part of the object.
Likewise, the reference primate has access only to methods defined in the Primate class, and it doesn’t have direct access to the isTailStriped() method.
*/

public class D_A_Object_vs_Reference {
/*
In Java, all objects are accessed by reference, so as a developer you never have direct access to the object itself.
Conceptually, though, you should consider the object as the entity that exists in memory, allocated by the Java runtime environment.
Regardless of the type of the reference you have for the object in memory, the object itself doesn’t change.
For example, since all objects inherit java.lang.Object, they can all be reassigned to java.lang.Object, as shown in the following example:
*/
    Lemur lemur = new Lemur();
    Object lemurAsObject = lemur;
/*
Even though the Lemur object has been assigned a reference with a different type, the object itself has not changed and still exists as a Lemur object in memory.
What has changed, then, is our ability to access methods within the Lemur class with the lemurAsObject reference.
Without an explicit cast back to Lemur, as you’ll see in the next section, we no longer have access to the Lemur properties of the object.

We can summarize this principle with the following two rules:

    1. The type of the object determines which properties exist within the object in memory.
    2. The type of the reference to the object determines which methods and variables are accessible to the Java program.

It therefore follows that successfully changing a reference of an object to a new reference type may give you access to new properties of the object,
but those properties existed before the reference change occurred.

Let’s illustrate this property using the previous example in Figure 5.6. As you can see in the figure, the same object exists in memory regardless of which reference is pointing to it.
Depending on the type of the reference, we may only have access to certain methods.
For example, the hasTail reference has access to the method isTailStriped() but doesn’t have access to the variable age defined in the Lemur class.
As you’ll learn in the next section, it is possible to reclaim access to the variable age by explicitly casting the hasTail reference to a reference of type Lemur.

figure
*/
}
