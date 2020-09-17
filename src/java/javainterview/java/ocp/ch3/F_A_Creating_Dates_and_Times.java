package javainterview.java.ocp.ch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.junit.Test;

/**
 * F_Working_with_Dates_and_Times
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

/* import java.time.*; */
public class F_A_Creating_Dates_and_Times {
	/* The exam gives you three choices */
	/*-
	LocalDate: Contains just a date. good example of LocalDate is your birthday this year.
	LocalTime: Contains just a time. A good example of LocalTime is midnight
	LocalDateTime: Contains both a date and time but no time zone. A good example of LocalDateTime is “the stroke of midnight on New Year’s.”
	 */
	@Test
	public void creating_Dates_and_Times_1() {
		/* create your first date and time objects */
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		/* output format: mm/dd/yyyy (24 hours) */
	}

	@Test
	public void creating_Dates_and_Times_2() {
		/*- Let’s look at other specific dates and times. To begin, let’s create just a date with no time
		public static LocalDate of(int year, int month, int dayOfMonth)
		public static LocalDate of(int year, Month month, int dayOfMonth)       */

		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); // recomendable
		LocalDate date2 = LocalDate.of(2015, 1, 20);
	}

	@Test
	public void creating_Dates_and_Times_3() {
		/*-
		 *  When creating a time, you can choose how detailed you want to be. You can specify just the hour and minute, seconds, nanosecond
		public static LocalTime of(int hour, int minute)
		public static LocalTime of(int hour, int minute, int second)
		public static LocalTime of(int hour, int minute, int second, int nanos)     */

		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
	}

	@Test
	public void creating_Dates_and_Times_4() {
		/*
		 * Finally The first line of code shows how you can specify all the
		 * information about the LocalDateTime right in the same line
		 */
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6,
				15, 30);

		/*
		 * The second line of code shows how you can create LocalDate and
		 * LocalTime objects separately first and then combine them to create a
		 * LocalDateTime object
		 */
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(6, 15);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

		/*-
		 *  This time there are a lot of method signatures since there are more combinations
		public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
		public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
		public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
		public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
		public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
		public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
		public static LocalDateTime of(LocalDate date, LocalTime)
		 */
	}
	/*-
	 *  we did not use a constructor in any of the examples?
	    The date and time classes have private constructors to force you to use the static methods
	    LocalDate d = new LocalDate(); // DOES NOT COMPILE
	    what happens when you pass invalid numbers to of().
	    LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException           */
}