package javainterview.java.ocp.ch4;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_C_Protected_Access {
    //Protected access allows everything that default access allows and more.
    //The protected access modifier adds the ability to access members of a parent class

    //package: pond.shore  -> Classes: Bird, BirdWatcher
    //package: pond.goose  -> Classes: Gosling(extends Bird), Goose(extends Bird)
    //package: pond.inland -> Classes: BirdWatcherFromAfar
    //package: pond.swan   -> Classes: Swan(extends Bird)
    //package: pond.duck   -> Classes: GooseWatcher
}

//we create a Bird class and give protected access to its members:

class Bird {
    protected String text = "floating"; // protected access

    protected void floatInWater() { // protected access
        System.out.println(text);
    }
}

//Next we create a subclass: in a different package
class Gosling extends Bird { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}

//Gosling is a subclass of Bird, it can access these members even though it is in a different package.
//Remember that protected also gives us access to everything that default access does.
//This means that a class in the same package as Bird can access its protected members

//same package as Bird
class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    }
}

//Since Bird and BirdWatcher are in the same package, BirdWatcher can access members of the bird variable.
//The definition of protected allows access to subclasses and classes in the same package.

// different package than Bird
class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE
        //System.out.println(bird.text); // DOES NOT COMPILE
    }
}

//BirdWatcherFromAfar is not in the same package as Bird and it doesn't inherit from Bird.
//This means that it is not allowed to access protected members of Bird.

//Subclasses and classes in the same package are the only ones allowed to access protected members.
class Swan extends Bird { // but subclass of bird

    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan swan = new Swan();
        swan.floatInWater(); // package access to superclass
        System.out.println(swan.text);// package access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE
        //System.out.println(bird.text); // DOES NOT COMPILE
    }
    //This time a Bird reference is used. It is created on line 14.
    //Bird is in a different package, and this code isn’t inheriting from Bird, so it doesn't get to use protected members.

    /*-
    A member is used without referring to a variable. This is the case on lines 5 and 6.
    In this case, we are taking advantage of inheritance and protected access is allowed.

    A member is used through a variable. This is the case on lines 10, 11, 15, and 16. In this case, the rules for the reference type of the variable are what matter.
    If it is a subclass, protected access is allowed. This works for references to the same class or a subclass.
     */

    // Can you figure out why these examples don’t compile?

    class Goose extends Bird {
        public void helpGooseSwim() {
            Goose goose = new Goose();
            goose.floatInWater();
            System.out.println(goose.text);
        }

        public void helpOtherGooseSwim() {
            Bird bird = new Goose();
            //bird.floatInWater(); // DOES NOT COMPILE
            //System.out.println(bird.text); // DOES NOT COMPILE
        }
    }
    /*
    The second method is a problem. Although the object happens to be a Goose, it is stored in a Bird reference.
    We are not allowed to refer to members of the Bird class since we are not in the same package and Bird is not a subclass of Bird.
    */

    //What about this one?

    class GooseWatcher {
        public void watch() {
            Goose goose = new Goose();
            //goose.floatInWater(); // DOES NOT COMPILE
        }
    }
    /*
    This code doesn't compile because we are not in the Goose class. The floatInWater() method is declared in Bird.
    GooseWatcher is not in the same package as Bird, nor does it extend Bird.
    Goose extends Bird. That only lets Goose refer to floatInWater() and not callers of Goose.
    */
}