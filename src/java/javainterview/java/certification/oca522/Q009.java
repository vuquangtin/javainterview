package javainterview.java.certification.oca522;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Q009 {

    class C {
        public C() {
            System.out.println("C");
        }
    }

    class B extends C {
        public B() {                   //line n1
        System.out.println("B");
    }
    }

    public class A extends B {           //line n2
        public A() {
            System.out.println("A");
        }

  //      public static void main(String[] args) {
            A a = new A();
        }
    }
//second version da classlarin yeri degismis



// what is the result ?

/*-
What is the result?
A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2
Answer: A
 */