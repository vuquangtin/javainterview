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
public class C_B_Default_Package_Private_Access {
    /*
    MotherDuck allows classes in the same package to access her members.
    When there is no access modifier, Java uses the default, which is package private access.
    This means that the member is “private” to classes in the same package.
    In other words, only classes in the package may access it.
    */
}

class MotherDuck {
    String noise = "quack";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    private void makeNoise() {
        quack(); // default access is ok
    }
}

/*
MotherDuck can call quack() and refer to noise. After all, members in the same class are certainly in the same package.
GoodDuckling tiene una experiencia mucho mejor que BadDuckling
protected                                           private
*/

class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}

/*another package*/
/*
In this same pond, a swan just gave birth to a baby swan. A baby swan is called a cygnet.
The cygnet sees the ducklings learning to quack and decides to learn from MotherDuck as well.
//imagine que BadCygnet esta en otro paquete
 */
class BadCygnet {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //duck.quack(); // DOES NOT COMPILE
        //System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
/*
Oh no! MotherDuck only allows lessons to other ducks by restricting access to the pond .duck package. Poor little BadCygnet
is in the pond.swan package and the code doesn’t compile.

Remember that when there is no access modifier, only classes in the same package can access it.
*/