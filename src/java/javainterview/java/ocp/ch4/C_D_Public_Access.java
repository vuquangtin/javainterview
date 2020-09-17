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

public class C_D_Public_Access {
    // Anyone can access the member from anywhere
}

class DuckTeacher {
    public String name = "helpful"; // public access

    public void swim() { // public access
        System.out.println("swim");
    }
}

//DuckTeacher allows access to any class that wants it.
class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks" + teacher.name);
    }
}

//LostDuckling is able to refer to swim() and name on DuckTeacher because they are public.

/*-
The story has a happy ending.
LostDuckling has learned to swim and can find its parents—all because DuckTeacher made them public.

To review access modifiers, make sure you know why everything in Table 4.2 is true.
Remember that a member is a method or field.

TABLE 4.2 Access modifiers
______________________________________________________________________________________________________________
Can access              If that member      If that member has default     If that member   If that member
                         is private?        (package private) access?      is protected?     is public?
______________________________________________________________________________________________________________

Member in the same class    Yes                     Yes                        Yes              Yes

Member in another
class in same package       No                      Yes                        Yes              Yes

Member in a
superclass in a
different package           No                      No                         Yes              Yes

Method/field in a
non-superclass class
in a different package      No                      No                         No               Yes
______________________________________________________________________________________________________________
*/