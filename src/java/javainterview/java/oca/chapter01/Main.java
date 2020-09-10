package javainterview.java.oca.chapter01;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Main {

    InnerMain innerMain = new InnerMain();

    public static void main(String[] args) {

       Main main = new Main();




    }

    class InnerMain {

        public InnerMain(){}

        private String text = "Hello World";

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

}

class NonMain{

    private String text = "Hello World";



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}