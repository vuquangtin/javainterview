package javainterview.java.ocp.ch1;
/**
 * D_creating_objects
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class D_D_OrderOfInitialization {
/*- 
 * When writing code that initializes fields in multiple places, you have to keep track of the order of initialization.
   In the meantime, you need to remember:
        -  Fields and instance initializer blocks are run in the order in which they appear in the file.
        -  The constructor runs after all fields and instance initializer blocks have run.
   Let’s look at an example:
*/
}

/*public*/ class Chick {                        //-----------1
      private String name = "Fluffy";           //-----------2
     { System.out.println("setting field"); }   //-----------3
     public Chick() {                           //-----------4
         name = "Tiny";                         //-----------5
         System.out.println("setting constructor"); //-------6
     }                                          //-----------7
     public static void main(String[] args) {   //-----------8
         Chick chick = new Chick();             //-----------9
         System.out.println(chick.name); } }    //----------10
/*-
Running this example prints this:
    setting field
    setting constructor
    Tiny
Let’s look at what’s happening here. We start with the main() method because that's where Java starts execution.
On line 9, we call the constructor of Chick. Java creates a new object.
First it initializes name to "Fluffy" on line 2. Next it executes the print statement in the instance initializer on line 3.
Once all the fields and instance initializers have run, Java returns to the constructor. Line 5 changes the value of name to "Tiny" and line 6 prints another statement.
At this point, the constructor is done executing and goes back to the print statement on line 10.
Order matters for the fields and blocks of code. You can’t refer to a variable before it has been initialized:
    { System.out.println(name); } // DOES NOT COMPILE
    private String name = "Fluffy";
You should expect to see a question about initialization on the exam. Let’s try one more.
What do you think this code prints out?
 */


/*public*/ class Egg {
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    private int number = 3;

    { number = 4; }
}
// If you answered 5, you got it right. Fields and blocks are run first in order, setting number to 3 and then 4. Then the constructor runs, setting number to 5.