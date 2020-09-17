package javainterview.java.ocp.ch4;


// we had an example of a class with a field that wasn’t private:
/*class Swan {

    int numberEggs;     // instance variable
    //that means any class in the package can set numberEggs
    //We no longer have control of what gets set in our own class. A caller could even write this:.

    // mother.numberEggs = -1;
    //This is clearly no good. We do not want the mother Swan to have a negative number of eggs!
}*/

//Encapsulation to the rescue
//==============================
//Encapsulation means we set up the class so only methods in the class with the variables can refer to the instance variables.
//Callers are required to use these methods. Let’s take a look at our newly encapsulated Swan class:
class SwanG {

    private int numberEggs; // private

    public int getNumberEggs() { // getter or accessor method
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) { // setter or mutator method
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
    }
}
/*-  For encapsulation, remember that data (an instance variable) is private and getters/setters are public.
    Java defines a naming convention that is used in JavaBeans. JavaBeans are reusable software components.
    JavaBeans call an instance variable a property. The only thing you need to know about JavaBeans for the exam is the naming conventions listed   */

class Saw2 {

    private boolean playing;
    private String name;

    public boolean getPlaying() { //doesn't follow the JavaBeans naming conventions. isPlaying
        return playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String name() { // doesn't follow the JavaBeans naming conventions. getName
        return name;
    }

    public void updateName(String n) { //do not follow the JavaBeans naming conventions. setName
        name = n;
    }

    public void setname(String n) { ////do not follow the JavaBeans naming conventions. setName
        name = n;
    }

}

public class G_Creating_Immutable_Classes {

    /*-
    Encapsulating data is helpful because it prevents callers from making uncontrolled changes to your class.
    Another common technique is making classes immutable so they cannot be changed at all.
    Immutable classes are helpful because you know they will always be the same.
    You can pass them around your application with a guarantee that the caller didn’t change anything.
    This helps make programs easier to maintain.
    It also helps with performance by limiting the number of copies, as you saw with String in Chapter 3

    One step in making a class immutable is to omit the setters.
    But wait: we still want the caller to be able to specify the initial value.
    we just don’t want it to change after the object is created.

    Constructors to the rescue!
    ========================
     */

    class ImmutableSwan {

        private int numberEggs;

        public ImmutableSwan(int numberEggs) {
            this.numberEggs = numberEggs;
        }

        public int getNumberEggs() {
            return numberEggs;
        }
    }

    /*-
    In this example, we don't have a setter. We do have a constructor that allows a value to be set.
    Remember, immutable is only measured after the object is constructed.
    Immutable classes are allowed to have values. They just can't change after instantiation.

     */
}

/*-
Return Types in Immutable Classes
================================
When you are writing an immutable class, be careful about the return types.
On the surface, this class appears to be immutable since there is no setter:
 */

class NotImmutable {
    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder()); // initial added more
    }
    /*
    The problem  is that we are just passing the same StringBuilder all over.
    The caller has a reference since it was passed to the constructor.
    Anyone who calls the getter gets a reference too.
    A solution is to make a copy of the mutable object. This is called a "defensive copy
    */
}

class Mutable {
    private StringBuilder builder;

    public Mutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        Mutable problem = new Mutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder()); // initial
        /*
        Now the caller can make changes to the initial sb object and it is fine. Mutable no longer
        cares about that object after the constructor gets run. The same goes for the getter: call-
        ers can change their StringBuilder without affecting Mutable.
        Another approach for the getter is to return an immutable object:

        public String getValue() {
            return builder.toString();
        }

        There’s no rule that says we have to return the same type as we are storing. String is safe to return because
        it is immutable in the first place.
        */
    }
}
/*
To review, encapsulation refers to preventing callers from changing the instance variables directly.
Immutability refers to preventing callers from changing the instance variables at all.
*/