package javainterview.java.scjp03;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class OuterClass {
    private String s = "I am outer class member variable";
    class InnerClass {
           private String s1 = "I am inner class variable";
           public void innerMethod() {
                  System.out.println(s);
                  System.out.println(s1);
           }
  }
    public static void outerMethod() {
           // XXX legal code here
    	OuterClass.InnerClass inner = new OuterClass().new InnerClass();
           inner.innerMethod();
    }
}

