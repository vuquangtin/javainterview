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
public class A_B_Applying_Class_Access_Modifiers {
    /*-
    As discussed in Chapter 4, you can apply access modifiers (public, private, protected, default) to both class methods and variables.
    It probably comes as no surprise that you can also apply access modifiers to class definitions, since we have been adding the public access modifier to nearly every class up to now.

    ======================================
    For the OCA exam, you should only be familiar with public and default package-level class access modifiers, because these are the only ones that can be applied to top-level
    classes within a Java file.
    The protected and private modifiers can only be applied to inner classes, which are classes that are defined within other classes, but this is well out of scope for the OCA exam.
    ======================================

    The public access modifier applied to a class indicates that it can be referenced and used in any class.
    The default package private modifier, which is the lack of any access modifier, indicates the class can be accessed only by a subclass or class within the same package.
    As you know, a Java file can have many classes but at most one public class. In fact, it may have no public class at all.
    One feature of using the default package private modifier is that you can define many classes within the same Java file. For example, the following definition could
    appear in a single Java file named Groundhog.java, since it contains only one public class:
    */
    class Rodent {
    }

    public class Groundhog extends Rodent {
    }
    /*-
    If we were to update the Rodent class with the public access modifier, the Groundhog.java file would not compile unless the Rodent class was moved to its own Rodent.java file.
    The rules for applying class access modifiers are identical for interfaces. There can be at most one public class or interface in a Java file.
    Like classes, top-level interfaces can also be declared with the public or default modifiers. We’ll discuss interfaces in detail later in this chapter.
    ======================================
    For simplicity, any time you see multiple public classes or interfaces defined in the same code block in this chapter, assume each class is defined in its own Java file.
    ======================================
    */
}
