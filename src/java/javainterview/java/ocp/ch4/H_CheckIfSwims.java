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

public class H_CheckIfSwims implements H_CheckTrait{
    @Override
    public boolean test(H_Animal a) {
        return a.canSwim();
    }
}
