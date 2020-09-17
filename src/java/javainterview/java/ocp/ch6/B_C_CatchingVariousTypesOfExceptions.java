package javainterview.java.ocp.ch6;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class B_C_CatchingVariousTypesOfExceptions {
    /*
    So far, you have been catching only one type of exception. Now let’s see what happens when different types of exceptions can be thrown from the same method.

    You only need to do two things with this information. First, you must be able to recognize if the exception is a checked or an unchecked exception.
    Second, you need to determine if any of the exceptions are subclasses of the others.
     */

    class AnimalsOutForAWalk extends RuntimeException {
    }

    class ExhibitClosed extends RuntimeException {
    }

    class ExhibitClosedForLunch extends ExhibitClosed {
    }

    /*
    In this example, there are three custom exceptions. All are unchecked exceptions because they directly or indirectly extend RuntimeException.
    Now we catch both types of exceptions and handle them by printing out the appropriate message:
     */

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }
    }

    private void seeAnimal() {
    }

    /*
   There are three possibilities for when this code is run. If seeAnimal() doesn’t throw an exception, nothing is printed out. If the animal is out for a walk, only the fi rst catch block runs. If the exhibit is closed, only the second catch block runs.

    A rule exists for the order of the catch blocks. Java looks at them in the order they appear. If it is impossible for one of the catch blocks to be executed, a compiler error about unreachable code occurs. This happens when a superclass is caught before a subclass.

    Remember, we warned you to pay attention to any subclass exceptions.
    In the porcupine example, the order of the catch blocks could be reversed because the exceptions don’t inherit from each other. And yes, we have seen a porcupine be taken for a walk on a leash.

    The following example shows exception types that do inherit from each other:
     */

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// superclass exception
            System.out.print("not today");
        }
    }

    /*
    If the more specific ExhibitClosedForLunch exception is thrown, the fi rst catch block runs.
    If not, Java checks if the superclass ExhibitClosed exception is thrown and catches it.
    This time, the order of the catch blocks does matter. The reverse does not work.
     */

    public void visitMonkeys2() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        /*} catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
            System.out.print("try back later");
        }*/
        }
    }
    /*
    This time, if the more specific ExhibitClosedForLunch exception is thrown, the catch block for ExhibitClosed runs—which means there is no way for the second catch block to ever run. Java correctly tells us there is an unreachable catch block.

    Let’s try this one more time. Do you see why this code doesn’t compile?
     */

    public void visitSnakes() {
        try {
            seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } /*catch (ExhibitClosed e) {// DOES NOT COMPILE
            System.out.print("not today");
        } */catch (Exception e) {
            System.out.print("exception");
        }
    }

    /*
    It’s the same problem. ExhibitClosed is a RuntimeException. If it is thrown, the first catch block takes care of it, making sure there no way to get to the second catch block.
    To review catching multiple exceptions, remember that at most one catch block will run and it will be the first catch block that can handle it.
     */
}
