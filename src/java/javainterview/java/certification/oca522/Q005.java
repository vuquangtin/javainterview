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

class Vehicle {
    String type = "4W'";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {
    }
}
public class Q005 extends Vehicle {
    String trans;

    Q005(String trans) { //line n1  //parent class ta default constractor olmasaydi hata verirdi
        super();
        this.trans = trans;
    }

    Q005(String type, int maxSpeed, String trans) {
        super(type, maxSpeed); // line n2
        this.trans = trans;

    }

    public static void main(String[] args) {
        //  And given the code fragment:
    	Q005 c1 = new Q005("Auto");
    	Q005 c2 = new Q005("4W", 150, "Manual ");
        //Her object kendi copysini tasir
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

/*-
What is the result?
A. 4W' 100 Auto 4W 150 Manual
B. null 0 Auto 4W 150 Manual
C. Compilation fails only at line n1
D. Compilation fails only at line n2
E. Compilation fails at both line n1 and line n2
Answer:A
 */
//class Vehicle {
//    String type = "4W'";
//    int maxSpeed = 100;
//
//    Vehicle(String type, int maxSpeed) {
//        this.type = type;
//        this.maxSpeed = maxSpeed;
//    }
//
//    Vehicle() {
//    }
//}
//class Car extends Vehicle {
//    String trans;
//
//    Car(String trans) { //line n1
//        this.trans = trans;
//    }
//
//    Car(String type, int maxSpeed, String trans) {
//        super(type, maxSpeed); // line n2
//        this(trans);
//
//    }
//
//    public static void main(String[] args) {
//        //  And given the code fragment:
//        Car c1 = new Car("Auto");
//        Car c2 = new Car("4W", 150, "Manual ");
//
//        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
//        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
//    }
//}