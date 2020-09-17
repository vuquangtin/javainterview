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
public class F_B_Default_Constructor {
    public static void main(String[] args) {
        F_B_Default_Constructor rabbit = new F_B_Default_Constructor();
        // Calls default constructor
    }
}

class Rabbit1 {}

class Rabbit2 {
    public Rabbit2() {
    }
}

class Rabbit3 {
    public Rabbit3(boolean b) {
    }
}

class Rabbit4 {
    private Rabbit4() {}
}

class RabbitsMultiply {

    public static void main(String[] args) {
        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
        //Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE
    }
}