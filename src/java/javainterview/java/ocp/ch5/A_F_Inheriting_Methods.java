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
public class A_F_Inheriting_Methods {
/*
Inheriting a class grants us access to the public and protected members of the parent class,
but also sets the stage for collisions between methods defined in both the parent class and the subclass.
In this section, we’ll review the rules for method inheritance and how Java handles such scenarios.
*/
    public void overriding_a_Method() {
    }
}
/*
//TODO: 1.-Overriding_a_Method
overriding_a_Method
===================
What if there is a method defined in both the parent and child class?
For example, you may want to define a new version of an existing method in a child class that makes use of the definition in the parent class.
In this case, you can override a method a method by declaring a new method with the signature and return type as the method in the parent class.
As you may recall from Chapter 4, the method signature includes the name and list of input parameters.

When you override a method, you may reference the parent version of the method using the super keyword.
In this manner, the keywords this and super allow you to select between the current and parent version of a method, respectively.
We illustrate this with the following example:
*/
class Canine {
    public double getAverageWeight() {
        return 50;
    }
}

class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
/*
In this example, in which the child class Wolf overrides the parent class Canine, the method getAverageWeight() runs without issue and outputs the following:
    50.00
    70.00

You might be wondering, was the use of super in the child’s method required? For example,
what would the following code output if we removed the super keyword in the getAverageWeight() method of the Wolf class?
*/
class Wolf2 extends Canine {
    public double getAverageWeight() {
        return getAverageWeight() + 20; //INFINITE LOOP, recursive call.
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf2().getAverageWeight());
    }
}

/*-
In this example, the compiler would not call the parent Canine method; it would call the current Wolf method since it would think you were executing a recursive call.
A recursive function is one that calls itself as part of execution, and it is common in programming. A recursive function must have a termination condition.
In this example, there is no termination condition; therefore, the application will attempt to call itself infinitely and produce a stack overflow error at runtime.
Overriding a method is not without limitations, though. The compiler performs the following checks when you override a non-private method:

    1. The method in the child class must have the same signature as the method in the parent class.
       (metodo de hija debe tener la misma firma que la del padre)
    2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
       (hija debe ser tan o mas accesible que el padre)
    3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
       (hija no puede lanzar un checked exception que sea mas amplia que la del padre)
    4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
       (el tipo de retorno de la hija debe ser la misma o una subclase de la del padre)

The first rule of overriding a method is somewhat self-explanatory.
If two methods have the same name but different signatures, the methods are overloaded, not overridden.
As you may recall from our discussion of overloaded methods in Chapter 4, the methods are unrelated to each other and do not share any properties.

/////////////////////////////////////////////////////////////////////
overloading_vs_Overriding
=====================================================================
Overloading a method and overriding a method are similar in that they both involve redefining a method using the same name.
They differ in that an overloaded method will use a different signature than an overridden method.
This distinction allows overloaded methods a great deal more freedom in syntax than an overridden method would have.
For example, take a look at the following code sample:
*/
class Bird {
    public void fly() {//overloaded
        System.out.println("Bird is flying");
    }

    public void eat(int food) {//overriding
        System.out.println("Bird is eating " + food + " units of food");
    }
}

class Eagle extends Bird {
    public int fly(int height) {//overloaded
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }
    /*-
    public int eat(int food) { // DOES NOT COMPILE, overriding, the return type void is not a subclass of int
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }
    */
}
/*
The first method, fly(), is overloaded in the subclass Eagle, since the signature changes from a no-argument constructor to a constructor with one int argument.
Because the method is being overloaded and not overridden, the return type can be changed from void to int without issue.
The second method, eat(), is overridden in the subclass Eagle, since the signature is the same as it is in the parent class Bird—they both take a single argument int.
Because the method is being overridden, the return type of the method in Eagle must be a subclass of the return type of the method in Bird.
In this example, the return type void is not a subclass of int; therefore, the compiler will throw an exception on this method definition.
Any time you see a method on the exam with the same name as a method in the parent class, determine whether the method is being overloaded or overridden first;
doing so will help you with questions about whether the code will compile.
=====================================================================

Let’s review some examples of the last three rules of overriding methods so you can learn to spot the issues when they arise:
*/
class Camel {
    protected String getNumberOfHumps() {//Overriding
        return "Undefined";
    }
}

/*-
public class BactrianCamel extends Camel {
    private int getNumberOfHumps() { //Overriding, DOES NOT COMPILE, tipo retorno int no es subclass de String, este metodo debe ser igual o mas accesible que la del padre
        return 2;
    }
}
*/
/*
In this example, the method in the child class doesn’t compile for two reasons. First, it violates the second rule of overriding methods:
the child method must be at least as accessible as the parent.
In the example, the parent method uses the protected modifier, but the child method uses the private modifier, making it less accessible in the child method than in the parent method.

It also violates the fourth rule of overriding methods: the return type of the parent method and child method must be covariant.
In this example, the return type of the parent method is String, whereas the return type of the child method is int, neither of which is covariant with each other.
Any time you see a method that appears to be overridden on the example, first check to make sure it is truly being overridden and not overloaded.
Once you have confirmed it is being overridden, check that the access modifiers, return types, and any exceptions defined in the method are compatible with one another.
Let’s take a look at some example methods that use exceptions:
*/
class InsufficientDataException extends Exception {//checked
}

class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {//overriding
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {//overriding
        return 2;
    }
}

class Snake extends Reptile {
    protected boolean hasLegs() {//overriding, hija puede eliminar u ocultar la exception del padre
        return false;
    }

    protected double getWeight() throws InsufficientDataException {//overriding, exception igual o menos amplia que la del padre
        return 2;
    }
}
/*
In this example, both parent and child classes define two methods, hasLegs() and getWeight().
The first method, hasLegs(), throws an exception InsufficientDataException in the parent class but doesn’t throw an exception in the child class.
This does not violate the third rule of overriding methods, though, as no new exception is defined.
In other words, a child method may hide or eliminate a parent method’s exception without issue.
The second method, getWeight(), throws Exception in the parent class and InsufficientDataException in the child class.
This is also permitted, as InsufficientDataException is a subclass of Exception by construction.
Neither of the methods in the previous example violates the third rule of overriding methods, so the code compiles and runs without issue.
Let’s review some examples that do violate the third rule of overriding methods:
*/
class InsufficientDataException2 extends Exception {
}

class Reptile2 {
    protected double getHeight() throws InsufficientDataException2 {
        return 2;
    }

    protected int getLength() {
        return 10;
    }
}


class Snake2 extends Reptile2 {
//        protected double getHeight() throws Exception { // DOES NOT COMPILE Exception es mas amplia que InsufficientDataException2
//            return 2;
//        }
//        protected int getLength() throws InsufficientDataException2 { // DOES NOT COMPILE. xq define una nueva exception que el padre no la tiene
//            return 10;
//        }
}
/*
Unlike the earlier example, neither of the methods in the child class of this code will compile.
The getHeight() method in the parent class throws an InsufficientDataException, whereas the method in the child class throws an Exception.
Since Exception is not a subclass of InsufficientDataException, the third rule of overriding methods is violated and the code will not compile.
Coincidentally, Exception is a superclass of InsufficientDataException.
Next, the getLength() method doesn’t throw an exception in the parent class, but it does throw an exception, InsufficientDataException, in the child class.
In this manner, the child class defines a new exception that the parent class did not, which is a violation of the third rule of overriding methods.
The last three rules of overriding a method may seem arbitrary or confusing at first, but as you’ll see later in this chapter when we discuss polymorphism,
they are needed for consistency of the language. Without these rules in place, it is possible to create contradictions within the Java language.

TODO: 2.-Redeclaring_private_Methods
Redeclaring_private_Methods
============================
Resumen: ambos metodo son separados e independientes de las reglas de overriding
The previous section defined the behavior if you override a public or protected method in the class. Now let’s expand our discussion to private methods.
In Java, it is not possible to override a private method in a parent class since the parent method is not accessible from the child class.
Just because a child class doesn’t have access to the parent method, doesn’t mean the child class can’t define its own version of the method.
It just means, strictly speaking, that the new method is not an overridden version of the parent class’s method.
Java permits you to redeclare a new method in the child class with the same or modified signature as the method in the parent class.
This method in the child class is a separate and independent method, unrelated to the parent version’s method, so none of the rules for overriding methods are invoked.
For example, let’s return to the Camel example we used in the previous section and show two related classes that define the same method:
*/
class Camel2 {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

class BactrianCamel extends Camel2 {
    private int getNumberOfHumps() {
        return 2;
    }
}
    //son metodos separados e independientes
/*-
This code compiles without issue. Notice that the return type differs in the child method from String to int.
In this example, the method getNumberOfHumps() in the parent class is hidden, so the method in the child class is a new method and not an override of the method in the parent class.
As you saw in the previous section, if the method in the parent class were public or protected, the method in the child class would not compile because it would violate two rules
of overriding methods.
The parent method in this example is private, so there are no such issues.

//TODO: 3.-Hiding_Static_Methods
Hiding_Static_Methods
=====================
A hidden method occurs when a child class defines a static method with the same name and signature as a static method defined in a parent class.
Method hiding is similar but not exactly the same as method overriding. First, the four previous rules for overriding a method must be followed when a method is hidden.
In addition, a new rule is added for hiding a method, namely that the usage of the static keyword must be the same between parent and child classes.
The following list summarizes the five rules for hiding a method:

1. The method in the child class must have the same signature as the method in the parent class.
2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
5. The method defined in the child class must be marked as static if it is marked as static in the parent class (method hiding). Likewise, the method must not be marked
   as static in the child class if it is not marked as static in the parent class (method overriding).
   (si son static -> hidden / si no son static -> overriding )

Note that the first four are the same as the rules for overriding a method.
Let’s review some examples of the new rule:
*/
class Bear {
    public static void eat() {//static overriding and is hidden by child class
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear {
    public static void eat() {//static overriding
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        Panda.eat();
    }
}
/*
In this example, the code compiles and runs without issue. The eat() method in the child class hides the eat() method in the parent class.
Because they are both marked as static, this is not considered an overridden method. Let’s contrast this with examples that violate the fifth rule:
*/
class Bear2 {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

class Panda2 extends Bear2 {
    /*-
    public void sneeze() { // DOES NOT COMPILE, si vas a sobreescribir un metodo estatico , este tambien debe ser static y se llamaria hidden
        System.out.println("Panda bear sneezes quietly");
    }

    public static void hibernate() { // DOES NOT COMPILE, el padre deberia tener static
        System.out.println("Panda bear is going to sleep");
    }
    */
}
/*
In this example, sneeze() is marked as static in the parent class but not in the child class.
The compiler detects that you’re trying to override a method that should be hidden and generates a compiler error.
In the second method, hibernate() is an instance member in the parent class but a static method in the child class.
In this scenario, the compiler thinks that you’re trying to hide a method that should be overridden and also generates a compiler error.

=========================================================
As you saw in the previous example, hiding static methods is fraught with pitfalls and potential problems and as a practice should be avoided.
Though you might see questions on the exam that contain hidden static methods that are syntactically correct, avoid hiding static methods in your
own work, since it tends to lead to confusing and difficult-to-read code.
You should not reuse the name of a static method in your class if it is already used in the parent class.
=========================================================

//TODO: 4.-Overriding_vs_Hiding_Methods
Overriding_vs_Hiding_Methods
=============================
(overriding, el metodo hija reemplaza a la del padre en llamadas desde la hija o padre)
(hidden, el metodo hija reemplaza a la del padre en llamadas solo desde la hija)

In our description of hiding of static methods, we indicated there was a distinction between overriding and hiding methods.
Unlike overriding a method, in which a child method replaces the parent method in calls defined in both the parent and child,
hidden methods only replace parent methods in the calls defined in the child class.
At runtime the child version of an overridden method is always executed for an instance regardless of whether the method call is defined in a parent or child class method.
In this manner, the parent method is never used unless an explicit call to the parent method is referenced, using the syntax ParentClassName.method().
Alternatively, at runtime the parent version of a hidden method is always executed if the call to the method is defined in the parent class. Let’s take a look at an example:
*/
class Marsupial2 {
    public static boolean isBiped() {//hidden
        return false;
    }

    public void getMarsupialDescription() {//independiente
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}

class Kangaroo2 extends Marsupial2 {

    public static boolean isBiped() {//hidden
        return true;
    }

    public void getKangarooDescription() {//independiente
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo2 joey = new Kangaroo2();
        joey.getMarsupialDescription();//llama a un metod padre indepediente. luego se esta llamando a un metodo oculto desde el padre al padre, si lo vee, es false
        joey.getKangarooDescription();//llama a un metod hijo indepediente. luego se esta llamando a un metodo oculto desde el hijo al hijo, si lo vee, es true
    }
}
/*
In this example, the code compiles and runs without issue, outputting the following:
    Marsupial walks on two legs: false
    Kangaroo hops on two legs: true

Notice that isBiped() returns false in the parent class and true in the child class. In the first method call, the parent method getMarsupialDescription() is used.
The Marsupial class only knows about isBiped() from its own class definition, so it outputs false.
In the second method call, the child executes a method of isBiped(), which hides the parent method’s version and returns true.

Contrast this first example with the following example, which uses an overridden version of isBiped() instead of a hidden version:
*/
class Marsupial3 {
    public boolean isBiped() {//overriden
        return false;
    }

    public void getMarsupialDescription() { //independiente
        System.out.println("Marsupial walks on two legs: " + isBiped()); // overriding padre a padre, no lo vee, llama al hijo tendrias que usar ParentClassName.Method()... revuelve true
    }
}

class Kangaroo3 extends Marsupial3 {
    public boolean isBiped() {//overriden
        return true;
    }

    public void getKangarooDescription() {//independiente
        System.out.println("Kangaroo hops on two legs: " + isBiped());//overridind desde hja  a hija si lo vee...devuelve true
    }

    public static void main(String[] args) {
        Kangaroo3 joey = new Kangaroo3();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
    /*-
This code also compiles and runs without issue, but it outputs slightly different text:
    Marsupial walks on two legs: true
    Kangaroo hops on two legs: true

In this example, the isBiped() method is overridden, not hidden, in the child class.
Therefore, it is replaced at runtime in the parent class with the call to the child class’s method.
Make sure you understand these examples as they show how hidden and overridden methods are fundamentally different.
This example makes uses of polymorphism, which we’ll discuss later in this chapter.

//TODO: 5.-Creating_final_methods
creating_final_methods (no puede crear una otro metodo overriding ni overloaded en la clase hija)
=====================
We conclude our discussion of method inheritance with a somewhat self-explanatory rule: final methods cannot be overridden.
If you recall our discussion of modifiers from Chapter 4, you can create a method with the final keyword.
By doing so, though, you forbid a child class from overriding this method. This rule is in place both when you override a method and when you hide a method.
In other words, you cannot hide a static method in a parent class if it is marked as final.

Let’s take a look at an example:
*/
class Bird4 {
    public final boolean tienePlumas() {
        return true;
    }
}

class Penguin extends Bird4 {
        /*-
         * public final boolean tienePlumas() { // DOES NOT COMPILE
            return false;
        }*/
}
/*-
In this example, the method hasFeathers() is marked as final in the parent class Bird, so the child class Penguin cannot override the parent method, resulting in a compiler error.
Note that whether or not the child method used the final keyword is irrelevant—the code will not compile either way.

=====================================================================
Why_Mark_a_Method_as_final
=====================================================================
Although marking methods as final prevents them from being overridden, it does have advantages in practice.
For example, you’d mark a method as final when you’re defining a parent class and want to guarantee certain behavior of a method in the parent class,
regardless of which child is invoking the method.
For example, in the previous example with Birds, the author of the parent class may want to ensure the method hasFeathers() always returns true, regardless of the child class
instance on which it is invoked. The author is confident that there is no example of a Bird in which feathers are not present.
The reason methods are not commonly marked as final in practice, though, is that it may be difficult for the author of a parent class method to consider all of the possible
ways her child class may be used.
For example, although all adult birds have feathers, a baby chick doesn’t; therefore, if you have an instance of a Bird that is a chick, it would not have feathers.
In short, the final modifier is only used on methods when the author of the parent method wants to guarantee very precise behavior.
=====================================================================
*/