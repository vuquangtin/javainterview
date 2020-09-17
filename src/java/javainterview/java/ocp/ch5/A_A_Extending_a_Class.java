package javainterview.java.ocp.ch5;


/*-
Introducing Class Inheritance
=============================
When creating a new class in Java, you can define the class to inherit from an existing class.
Inheritance is the process by which the new child subclass automatically includes any public or protected primitives, objects, or methods defined in the parent class.
For illustrative purposes, we refer to any class that inherits from another class as a child class, or a descendent of that class.
Alternatively, we refer to the class that the child inherits from as the parent class, or an ancestor of the class.
If child X inherits from class Y, which in turn inherits from class Z, then X would be considered an indirect child, or descendent, of class Z.

Java supports single inheritance, by which a class may inherit from only one direct parent class.
Java also supports multiple levels of inheritance, by which one class may extend another class, which in turn extends another class.
You can extend a class any number of times, allowing each descendent to gain access to its ancestor’s members.

To truly understand single inheritance, it may helpful to contrast it with multiple inheritance, by which a class may have multiple direct parents.
By design, Java doesn’t support multiple inheritance in the language because studies have shown that multiple inheritance can lead to complex, often difficult-to-maintain code.
Java does allow one exception to the single inheritance rule: classes may implement multiple interfaces, as you’ll see later in this chapter.

Figure 5.1 illustrates the various types of inheritance models. The items on the left are considered single inheritance because each child has exactly one parent.
You may notice that single inheritance doesn’t preclude parents from having multiple children. The right side shows items that have multiple inheritance.
For example, a dog object has multiple parent designations. Part of what makes multiple inheritance complicated is determining which parent to inherit values from in case of a conflict.
For example, if you have an object or method defined in all of the parents, which one does the child inherit?
There is no natural ordering for parents in this example, which is why Java avoids these issues by disallowing multiple inheritance altogether.

FIGURE 5.1 Types of inheritance

        Animal                          Animal  Pet Friendly
        |    |                               |   |   |
   Mammal    Bird                               Dog
                                             |   |   |
Bat Tiger   Parrot  Eagle                   Husky   Poodle

If you try to define a class that inherits from a final class, the compiler will throw an error and not compile.
Unless otherwise specified, throughout this chapter you can assume the classes we work with are not marked as final.
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
public class A_A_Extending_a_Class {
/*-
    In Java, you can extend a class by adding the parent class name in the defi nition using the extends keyword. The syntax of defining and extending a class is shown in Figure 5.2.


    FIGURE 5.2 Defining and extending a class


                    public or default access modifier
                       |   abstract or final keyboard (option)
                       |      |      class keyboard (required)
                       |      |        |    class name
                       |      |        |        |        extends parent class(optional)
                       |      |        |        |             |
                       |      |        |        |      ------------
                    public abstract class ElephantSeal extends Seal {

                        //Method and Variables defined here

                    }

    We’ll discuss what it means for a class to be "abstract" and "final", as well as the class access modifiers, later in this chapter.

    Because Java allows only one public class per file, we can create two files, Animal.java and Lion.java, in which the Lion class extends the Animal class.
    Assuming they are in the same package, an import statement is not required in Lion.java to access the Animal class. Here are the contents of Animal.java:
*/
public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/*
And here are the contents of Lion.java:
*/
public class Lion extends Animal {
    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }
}
/*
Notice the use of the extends keyword in Lion.java to indicate that the Lion class extends from the Animal class.
In this example, we see that getAge() and setAge() are accessible by subclass Lion, because they are marked as public in the parent class.
The primitive age is marked as private and therefore not accessible from the subclass Lion, as the following would not compile:
*/
public class Lion2 extends Animal {
    private void roar() {
        //System.out.println("The " + age + " year old lion says: Roar!"); // DOES NOT COMPILE
    }
}
/*
Despite the fact that age is inaccessible by the child class, if we have an instance of a Lion object, there is still an age value that exists within the instance.
The age value just cannot be directly referenced by the child class nor any instance of the class.
In this manner, the Lion object is actually “bigger” than the Animal object in the sense that it includes all the properties of the Animal object (although not all
of those properties may be directly accessible) along with its own set of Lion attributes.

*/
}
