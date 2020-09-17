package javainterview.java.ocp.ch2;
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


public class E_C_The_switch_Statement {

    /**************Supported Data Types******************/
    @Test
    public void theSwitchStatement_1() {
        /*-
        supports any of the primitive numeric wrapper classes, String, Enums
		supports
		   int and Integer
			byte and Byte
			short and Short
			char and Character
			int and Integer
			String
			enum values
        NO SUPPORT: boolean and long
        */
    }

    /**************Compile-time Constant Values******************/
    @Test
    public void theSwitchStatement_2() {
        /*that the data type for case statements must all match the data type of the switch variable*/
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday2");
                break;
            case 0:
                System.out.println("Sunday2");
                break;
            case 6:
                System.out.println("Saturday2");
                break;
        }
        //output: Weekday2
    }

    @Test
    public void theSwitchStatement_3() {
        int dayOfWeek2 = 5;
        switch (dayOfWeek2) {
            case 0:
                System.out.println("Sunday3");
            default:
                System.out.println("Weekday3");
            case 6:
                System.out.println("Saturday3");
                break;
        }
        //Weekday3
        //Saturday3
    }

    @Test
    public void theSwitchStatement_4() {
        //The order of the case and default statements is now important
        int dayOfWeek3 = 6;
        switch (dayOfWeek3) {
            case 0:
                System.out.println("Sunday4");
            default:
                System.out.println("Weekday4");
            case 6:
                System.out.println("Saturday4");
                break;
        }
        //Saturday4
    }

    @Test
    public void theSwitchStatement_5() {
        int dayOfWeek4 = 0;
        switch (dayOfWeek4) {
            case 0:
                System.out.println("Sunday5");
            default:
                System.out.println("Weekday5");
            case 6:
                System.out.println("Saturday5");
                break;
        }
        //Sunday5
        //Weekday5
        //Saturday5
    }

    @Test
    public void theSwitchStatement_6() {
        /*the case statement value must also be a literal, enum constant, or final constant variable.*/
        getSortOrder("firstName", "lastName");

    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test": //case statement es un literal
                return 52;
            /*-
             * case middleName: // DOES NOT COMPILE, tiene que ser un final variable, para que no cambie
                id = 5;
                break;*/
            case suffix://case statement es un final
                id = 0;
                break;
            /*-
             * case lastName: // DOES NOT COMPILE, no es constante, ya que se pasa a la funció, puede variar;
                id = 8;
                break;*/
            /*-
             * case 5: // DOES NOT COMPILE, match con string
                id = 7;
                break;*/
            /*-
             * case 'J': // DOES NOT COMPILE, match con string
                id = 10;
                break;*/
            /*-
             * case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE, , match con string
                id = 15;
                break;*/
        }
        return id;
    }
}