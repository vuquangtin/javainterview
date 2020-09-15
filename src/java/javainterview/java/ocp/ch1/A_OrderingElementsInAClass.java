package javainterview.java.ocp.ch1;
/**
 * 
 * A_understanding_the_java_class_structure
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_OrderingElementsInAClass {
    /*-
    Now that you’ve seen the most common parts of a class, let’s take a look at the correct order to type them into a file.
    Comments can go anywhere in the code. Beyond that, you need to memorize the rules in Table 1.4.
    TABLE 1.4        Elements of a class
    ___________________________________________________________________________________________________________
    Element                         Example                 Required?           Where does it go?
    ___________________________________________________________________________________________________________
    Package declaration             package abc;            No                  First line in the file
    Import statements               import java.util.*;     No                  Immediately after the package
    Class declaration               public class C          Yes                 Immediately after the import
    Field declarations              int value;              No                  Anywhere inside a class
    Method declarations             void method()           No                  Anywhere inside a class
    ___________________________________________________________________________________________________________
    Let’s look at a few examples to help you remember this. The first example contains one of each element:
    package structure;      // package must be first non-comment
    import java.util.*;     // import must come after package
    public class Meerkat {  // then comes the class
        double weight;      // fields and methods can go in either order
        public double getWeight() {
            return weight;
        }
        double height;      // another field – they don't need to be together
    }
    So far so good. This is a common pattern that you should be familiar with. How about this one?
    /* header * /
    package structure;
    // class Meerkat
    public class Meerkat { }
    Still good. We can put comments anywhere, and imports are optional. In the next example, we have a problem:
    import java.util.*;
    package structure; // DOES NOT COMPILE
    String name; // DOES NOT COMPILE
    public class Meerkat { }
    There are two problems here. One is that the package and import statements are reversed. Though both are optional, package must come before import if present.
    The other issue is that a field attempts declaration outside a class. This is not allowed. Fields and methods must be within a class.
    Got all that? Think of the acronym PIC (picture): package, import, and class. Fields and methods are easier to remember because they merely have to be inside of a class.
    You need to know one more thing about class structure for the OCA exam: multiple classes can be defined in the same file, but only one of them is allowed to be public.
    The public class matches the name of the file. For example, these two classes must be in a file named Meerkat.java:
        1: public class Meerkat { }
        2: class Paw { }
    A file is also allowed to have neither class be public. As long as there isn’t more than one public class in a file, it is okay.
    On the OCP exam, you’ll also need to understand inner classes, which are classes within a class.
     */
}