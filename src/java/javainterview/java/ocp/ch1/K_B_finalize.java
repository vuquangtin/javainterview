package javainterview.java.ocp.ch1;
import java.util.ArrayList;
import java.util.List;

/**
 * K_Destroying_Objects
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class K_B_finalize {
    /*-
    Java allows objects to implement a method called finalize() that might get called. This method gets called if the garbage collector tries to collect the object.
    If the garbage collector doesn’t run, the method doesn’t get called.
    If the garbage collector fails to collect the object and tries to run it again later, the method doesn’t get called a second time.
    In practice, this means you are highly unlikely to use it in real projects. Luckily, there isn’t much to remember about finalize() for the exam.
    Just keep in mind that it might not get called and that it definitely won’t be called twice. With that said, this call produces no output when we run it:
    */
}
class Finalizer {
    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}
    /*-
    The reason is that the program exits before there is any need to run the garbage collector.
    While "f" is eligible for garbage collection, Java has better things to do than take out the trash constantly.
    For the exam, you need to know that this finalize() call could run zero or one time. Now for a more interesting example:
    */
class Finalizer2 {
    private static List objects = new ArrayList();

    protected void finalize() {
        objects.add(this); // Don't do this
    }
}
/*-
Remember, finalize() is only run when the object is eligible for garbage collection.
The problem here is that by the end of the method, the object is no longer eligible for garbage collection because a static variable is referring to it and static variables stay in scope until the program ends.
Java is smart enough to realize this and aborts the attempt to throw out the object. Now suppose later in the program objects is set to null.
Oh, good, we can finally remove the object from memory. Java remembers already running finalize() on this object and will not do so again.
The lesson is that the finalize() call could run zero or one time. This is the exact same lesson as the simple example—that’s why it’s so easy to remember.
 */