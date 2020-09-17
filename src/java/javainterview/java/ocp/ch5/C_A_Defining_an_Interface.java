package javainterview.java.ocp.ch5;


/*
Although Java doesn’t allow multiple inheritance, it does allow classes to implement any number of interfaces.
An interface is an abstract data type that defines a list of abstract public methods that any class implementing the interface must provide.
An interface can also include a list of constant variables and default methods, which we’ll cover in this section.
In Java, an interface is defined with the interface keyword, analogous to the class keyword used when defining a class.
A class invokes the interface by using the implements keyword in its class definition.
Refer to Figures 5.4 and 5.5 for proper syntax usage.

FIGURE 5.4 Defining an interface

                    public or default access modifier
                       |     abstract keyword (assumed)
                       |     |       interface keyword (required)
                       |     |          |     interface name
                       |     |          |       |
                       |     |          |       |
                    public abstract interface CanBurrow {
                        public static final int MINIMUM_DEPTH = 2; --> public static final keywords (assumed)
                        public abstract int getMaximumDepth();   ----> public abstract keywords (assumed)
                    }

FIGURE 5.5 Implementing an interface

                                  class name
                                      |      implements keyword (required)
                                      |       |         interface name
                                      |       |         |
                                      |       |         |
                    public class FieldMouse implements CanBurrow {
                        public int getMaximumDepth() {   -----> signature matches interface method
                            return 10;
                        }
                    }


As you see in this example, an interface is not declared an abstract class, although it has many of the same properties of abstract class.
Notice that the method modifiers in this example, abstract and public, are assumed.
In other words, whether or not you provide them, the compiler will automatically insert them as part of the method definition.
A class may implement multiple interfaces, each separated by a comma, such as in the following example:

    public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {
    }

In the example, if any of the interfaces defined abstract methods, the concrete class Elephant would be required to implement those methods.
New to Java 8 is the notion of default and static interface methods, which we’ll cover at the end of this section.
*/
public class C_A_Defining_an_Interface {}

/*
It may be helpful to think of an interface as a specialized kind of abstract class, since it shares many of the same properties and rules as an abstract class.
The following is a list of rules for creating an interface, many of which you should recognize as adaptions of the rules for defining abstract classes.

    1. Interfaces cannot be instantiated directly.
    2. An interface is not required to have any methods.(La interfaz puede no tener metodos)
    3. An interface may not be marked as final.
    4. All top-level interfaces are assumed to have public or default access, and they must include the abstract modifier in their definition.
       Therefore, marking an interface as private, protected, or final will trigger a compiler error, since this is incompatible with these assumptions.
    5. All non-default methods in an interface are assumed to have the modifiers abstract and public in their definition.
       Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible with the abstract and public keywords.

The fourth rule doesn’t apply to inner interfaces, although inner classes and interfaces are not in scope for the OCA exam.
The first three rules are identical to the first three rules for creating an abstract class. Imagine we have an interface WalksOnTwoLegs, defined as follows:
*/
    /*public*/ interface WalksOnTwoLegs {}
/*
It compiles without issue, since interfaces are not required to define any methods. Now consider the following two examples, which do not compile:
*/
    /*public*/ class TestClass {
        public static void main(String[] args) {
            //WalksOnTwoLegs example = new WalksOnTwoLegs(); // DOES NOT COMPILE, una interfaz no se puede instanciar
        }
    }

    //public final interface WalksOnEightLegs {} // DOES NOT COMPILE, una interfaz no puede ser final
/*
The first example doesn’t compile, as WalksOnTwoLegs is an interface and cannot be instantiated directly.
The second example, WalksOnEightLegs, doesn’t compile since interfaces may not be marked as final for the same reason that abstract classes cannot be marked as final.
The fourth and fifth rule about “assumed keywords” might be new to you, but you should think of these in the same light as the compiler inserting a default no-argument constructor or super() statement into your constructor.
You may provide these modifiers yourself, although the compiler will insert them automatically if you do not.
For example, the following two interface definitions are equivalent, as the compiler will convert them both to the second example:
*/
    /*public*/ interface CanFly2 {
        void fly(int speed);
        abstract void takeoff();
        public abstract double dive();
    }
    /*public*/ abstract interface CanFly3 {
        public abstract void fly(int speed);
        public abstract void takeoff();
        public abstract double dive();
    }
/*
In this example, the abstract keyword is first automatically added to the interface definition. Then, each method is prepended with abstract and public keywords.
If the method already has either of these keywords, then no change is required. Let’s take a look at an example that violates the assumed keywords:

    private final interface CanCrawl { // DOES NOT COMPILE, no puede ser final
        private void dig(int depth); // DOES NOT COMPILE, no puede ser private
        protected abstract double depth(); // DOES NOT COMPILE, no puede ser protected
        public final void surface(); // DOES NOT COMPILE, no puede ser final
    }

Every single line of this example doesn’t compile. The first line doesn’t compile for two reasons.
First, it is marked as final, which cannot be applied to an interface since it conflicts with the assumed abstract keyword.
Next, it is marked as private, which conflicts with the public or default required access for interfaces.
The second and third line do not compile because all interface methods are assumed to be public and marking them as private or protected throws a compiler error.
Finally, the last line doesn’t compile because the method is marked as final and since interface methods are assumed to be abstract, the compiler throws an exception for using
both abstract and final keywords on a method.
================================================================================================================================================
Adding the assumed keywords to an interface is a matter of personal preference, although it is considered good coding practice to do so.
Code with the assumed keywords written out tends to be easier and clearer to read, and leads to fewer potential conflicts, as you saw in the previous examples.
================================================================================================================================================

Be sure to review the previous example and understand why each of the lines doesn’t compile.
There will likely be at least one question on the exam in which an interface or interface method uses an invalid modifier.
*/