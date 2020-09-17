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

public class C_G_Static_vs_Instance {
    /*-
    There’s another way the exam creators will try to trick you regarding static and instance members.
    (Remember that “member” means field or method.)
    A static member cannot call an instance member.
    This shouldn't be a surprise since static doesn't require any instances of the class to be around.
    */
}

class Static {

    private String name = "Static class";

    public static void first() {}

    public static void second() {}

    public void third() {
        System.out.println(name);
    }

    /*The compiler will give you an error about making a static reference to a non-static method.
    If we fix this by adding static to third(), we create a new problem. Can you figure out what it is?

    All this does is move the problem. Now, third() is referring to nonstatic name. Adding static to name as well would solve the problem.
    Another solution would have been to call third as an instance method—for example, new Static().third();.*/
    public static void static_method_1(String args[]) {
        first();
        second();
        //third(); // DOES NOT COMPILE --> Solution: new Static().third();
        new Static().third();
    }

    /*Un instance member si puede llamar a un static member*/
    public void instance_method_1(String args[]) {
        first();
        second();
        third();
    }

    /*-
     * The exam creators like this topic.
    A static method or instance method can call a static method because static methods don’t require an object to use.
    pero, un metodo estatico no puede llamar a una instancia de metodo

    Only an instance method can call another instance method on the same class without using a reference variable, because instance methods do require an object.*/
    public void instance_method_2(String args[]) {
        first();
        second();
    }

    /*-
    Similar logic applies for the instance and static variables. Make sure you understand Table 4.3 before continuing.

    TABLE 4.3      Static vs. instance calls
    ____________________________________________________________________________________________________________________
    Type                Calling                                 Legal?      How?
    ____________________________________________________________________________________________________________________
    Static method       Another static method or variable       Yes         Using the classname

    Static method       An instance method or variable          No

    Instance method     A static method or variable             Yes         Using the classname or a reference variable

    Instance method     Another instance method or variable     Yes         Using a reference variable
    ____________________________________________________________________________________________________________________
    Do you understand why the following lines fail to compile?
    */
}

class Gorilla {

    public static int count;

    //static and instance methods can refer to a static variable.
    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    //instance method can call a static method
    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        //babyGorilla(); // DOES NOT COMPILE,  because a static method cannot call an instance method
    }

    public int total;
    //public static average = total / count; // DOES NOT COMPILE,  because a static variable is trying to use an instance variable.
}

//A common use for static variables is counting the number of instances:
class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
    }
    /*-
    Each time the constructor gets called, it increments count by 1.
    This example relies on the fact that static (and instance) variables are automatically initialized to the default value for that type, which is 0 for int.
    See Chapter 1 to review the default values. Also notice that we didn’t write Counter.count. We could have.
    It isn’t necessary because we are already in that class so the compiler can infer it.
     */
}