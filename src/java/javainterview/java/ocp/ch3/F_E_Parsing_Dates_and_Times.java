package javainterview.java.ocp.ch3;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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


public class F_E_Parsing_Dates_and_Times {
    /*
    you’ll find it easy to convert a String to a date or time
    Just like the format() method, the parse() method takes a formatter as well.
    If you don’t specify one, it uses the default for that type.
    */

    @Test
    public void formatting_Dates_and_Times_6() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22

        System.out.println(LocalDate.parse("2015-01-01").minusMonths(1));
        //.minusDays(1).plusYears(1);
    }
}