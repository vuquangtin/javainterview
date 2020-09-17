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
public class C_D_Default_Interface_Methods {}
/*
With the release of Java 8, the authors of Java have introduced a new type of method to an interface, referred to as a default method.
A default method is a method defined within an interface with the default keyword in which a method body is provided.
Contrast default methods with “regular” methods in an interface, which are assumed to be abstract and may not have a method body.

A default method within an interface defines an abstract method with a default implementation.
In this manner, classes have the option to override the default method if they need to, but they are not required to do so.
If the class doesn’t override the method, the default implementation will be used. In this manner, the method definition is concrete, not abstract.

The purpose of adding default methods to the Java language was in part to help with code development and backward compatibility.
Imagine you have an interface that is shared among dozens or even hundreds of users that you would like to add a new method to.
If you just update the interface with the new method, the implementation would break among all of your subscribers, who would then be forced to update their code.
In practice, this might even discourage you from making the change altogether.
By providing a default implementation of the method, though, the interface becomes backward compatible with the existing codebase, while still providing those
individuals who do want to use the new method with the option to override it.

The following is an example of a default method defined in an interface:
*/
/*public*/ interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature() {
        return 10.0;
    }
}
/*
This example defines two interface methods, one is a normal abstract method and the other a default method.
Note that both methods are assumed to be public, as all methods of an interface are all public.
The first method is terminated with a semicolon and doesn’t provide a body, whereas the second default method provides a body.
Any class that implements IsWarmBlooded may rely on the default implementation of getTemperature() or override the method and create its own version.
Note that the default access modifier as defined in Chapter 4 is completely different from the default method defined in this chapter.
We defined a default access modifier in Chapter 4 as lack of an access modifier, which indicated a class may access a class, method, or value within another class if
both classes are within the same package.
In this chapter, we are specifically talking about the keyword default as applied to a method within an interface.
Because all methods within an interface are assumed to be public, the access modifier for a default method is therefore public.

The following are the default interface method rules you need to be familiar with:
    1. A default method may only be declared within an interface and not within a class or abstract class.
    2. A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
    3. A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class that implements the interface.
    4. Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.

The first rule should give you some comfort in that you’ll only see default methods in interfaces. If you see them in a class on the exam, assume the code will not compile.
The second rule just denotes syntax, as default methods must use the default keyword. For example, the following code snippets will not compile:
*/
/*public*/ interface Carnivore {
    //public default void eatMeat(); // DOES NOT COMPILE
    //public int getRequiredFoodAmount() { // DOES NOT COMPILE
    //    return 13;
    //}
}
/*
In this example, the first method, eatMeat(), doesn’t compile because it is marked as default but doesn’t provide a method body.
The second method, getRequiredFood Amount(), also doesn’t compile because it provides a method body but is not marked with the default keyword.
Unlike interface variables, which are assumed static class members, default methods cannot be marked as static and require an instance of the class implementing the interface to be invoked.
They can also not be marked as final or abstract, because they are allowed to be overridden in subclasses but are not required to be overridden.
When an interface extends another interface that contains a default method, it may choose to ignore the default method, in which case the default implementation for the method will be used.
Alternatively, the interface may override the definition of the default method using the standard rules for method overriding, such as not limiting the accessibility of the method and using covariant returns.
Finally, the interface may redeclare the method as abstract, requiring classes that implement the new interface to explicitly provide a method body.
Analogous options apply for an abstract class that implements an interface.
For example, the following class overrides one default interface method and redeclares a second interface method as abstract:
*/
/*public*/ interface HasFins {
    public default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength() {
        return 20.0;
    }
    public default boolean doFinsHaveScales() {
            return true;
    }
}

/*public*/ interface SharkFamily extends HasFins {
    public default int getNumberOfFins() {//override
        return 8;
    }
    public double getLongestFinLength();//replace with a new abstract method
    /*public boolean doFinsHaveScales() { // DOES NOT COMPILE; override, but not mark the method as default
        return false;
    }*/
}
/*
In this example, the first interface, HasFins , defines three default methods: getNumberOfFins() , getLongestFinLength(), and doFinsHaveScales().
The second interface, SharkFamily, extends HasFins and overrides the default method getNumberOfFins() with a new method that returns a different value.
Next, the SharkFamily interface replaces the default method getLongestFinLength() with a new abstract method, forcing any class that implements the SharkFamily interface to provide an implementation of the method.
Finally, the SharkFamily interface overrides the doFinsHaveScales() method but doesn’t mark the method as default.
Since interfaces may only contain methods with a body that are marked as default, the code will not compile.
Because default methods are new to Java 8, there will probably be a few questions on the exam about them, although they likely will not be any more difficult than the previous example.

//TODO: Default_Methods_and_Multiple_Inheritance
=========================================
You may have realized that by allowing default methods in interfaces, coupled with the fact a class may implement multiple interfaces,
Java has essentially opened the door to multiple inheritance problems. For example, what value would the following code output?
*/
/*public*/ interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
/*public*/ interface Run {
    public default int getSpeed() {//override
        return 10;
    }
}
/*class Cat1 implements Walk, Run { // DOES NOT COMPILE, debe implementar
    public static void main(String[] args) {
        System.out.println(new Cat1().getSpeed());
    }
}*/
/*
In this example, Cat inherits the two default methods for getSpeed(), so which does it use?
Since Walk and Run are considered siblings in terms of how they are used in the Cat class, it is not clear whether the code should output 5 or 10.
The answer is that the code outputs neither value—it fails to compile.
If a class implements two interfaces that have default methods with the same name and signature, the compiler will throw an error.
There is an exception to this rule, though: if the subclass overrides the duplicate default methods, the code will compile without issue—the ambiguity about which version of the method to call has been removed.
For example, the following modified implementation of Cat will compile and output 1:
*/
/*public*/ class Cat2 implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat2().getSpeed());
    }
}
/*
You can see that having a class that implements or inherits two duplicate default methods forces the class to implement a new version of the method, or the code will not compile.
This rule holds true even for abstract classes that implement multiple interfaces, because the default method could be called in a concrete method within the abstract class.
*/