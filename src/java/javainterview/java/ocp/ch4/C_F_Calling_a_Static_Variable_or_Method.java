package javainterview.java.ocp.ch4;



import org.junit.Test;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_F_Calling_a_Static_Variable_or_Method {
    //Usually, accessing a static member is easy. You just put the classname before the method or variable and you are done. Example:
    @Test
    public void calling_a_Static_Variable_or_Method_1() {
        System.out.println(Koala.count);
        Koala.main(new String[0]);
    }
    /*
    Both of these are nice and easy. There is one rule that is trickier.
    You can use an instance of the object to call a static method.
    The compiler checks for the type of the reference and uses that instead of the object.
    This code is perfectly legal:
    */

    @Test
    public void calling_a_Static_Variable_or_Method_2() {
        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala
        k = null;
        System.out.println(k.count); // k is still a Koala
    }
    /*-
    Believe it or not, this code outputs 0 twice.
    Line 6 sees that k is a Koala and count is a static variable, so it reads that static variable.
    Line 8 does the same thing. Java doesn’t care that k happens to be null. Since we are looking for a static, it doesn’t matter.
    */

    //what does the following output?
    @Test
    public void calling_a_Static_Variable_or_Method_3() {
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); //5
    }
    /*
    There is only one count variable since it is static. It is set to 4, then 6, and finally winds up as 5. All the Koala variables are just distractions.
     */
}