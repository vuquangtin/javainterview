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

public class A_E_Calling_Inherited_Class_Members {
    /*
    Java classes may use any public or protected member of the parent class, including methods, primitives, or object references.
    If the parent class and child class are part of the same package, the child class may also use any default members defined in the parent class.
    Finally, a child class may never access a private member of the parent class, at least not through any direct reference.
    As you saw in the first example in this chapter, a private member age may be accessed indirectly via a public or protected method.

    To reference a member in a parent class, you can just call it directly, as in the following example with the output function displaySharkDetails():
    */
class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }


    /*
    In the child class, we use the public method getAge() and protected member size to access values in the parent class.
    As you may remember from Chapter 4, you can use the keyword this to access a member of the class.
    You may also use this to access members of the parent class that are accessible from the child class, since a child class inherits all of its parent members.
    Consider the following alternative defi nition to the displaySharkDetails() method in the previous example:
    */
    public void displaySharkDetails2() {
        System.out.print("Shark with age: " + this.getAge());
        System.out.print(" and " + this.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    /*
   In Java, you can explicitly reference a member of the parent class by using the super keyword, as in the following alternative definition of displaySharkDetails():
   */
    public void displaySharkDetails3() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    /*
    In the previous example, we could use this or super to access a member of the parent class, but is the same true for a member of the child class? Consider this example:
    */
    public void displaySharkDetails4() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        //System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE
    }
}
/*
This code will not compile because numberOfFins is only a member of the current class, not the parent class.
In other words, we see that this and super may both be used for methods or variables defined in the parent class, but only this may be used for
members defined in the current class.
As you’ll see in the next section, if the child class overrides a member of the parent class, this and super could have very different effects when applied to a class member.
*/

//////////////////////////////////////////////////////////////////////////////////////////////
    public void super_vs_super() {}
/*-
As discussed in Chapter 4, this() and this are unrelated in Java. Likewise, super() and super are quite different but may be used in the same methods on the exam.
The first, super(), is a statement that explicitly calls a parent constructor and may only be used in the first line of a constructor of a child class.
The second, super, is a keyword used to reference a member defined in a parent class and may be used throughout the child class.
The exam may try to trick you by using both super() and super in a constructor. For example, consider the following code:

    public Rabbit(int age) {
        super();
        super.setAge(10);
    }

The first statement of the constructor calls the parent’s constructor, whereas the second statement calls a function defined in the parent class. Contrast this with the following
code, which doesn’t compile:

    public Rabbit(int age) {
        super; // DOES NOT COMPILE
        super().setAge(10); // DOES NOT COMPILE
    }

This code looks similar to the previous example, but neither line of the constructor will compile since they are using the keywords incorrectly.
When you see super() or super on the exam, be sure to check that they are being used correctly.
*/
///////////////////////////////////////////////////////////////////////////////////////////

}
