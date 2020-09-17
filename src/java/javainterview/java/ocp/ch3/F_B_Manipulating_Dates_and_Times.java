package javainterview.java.ocp.ch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

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

public class F_B_Manipulating_Dates_and_Times {

	@Test
	public void manipulating_Dates_and_Times_1() {
		/*
		 * Adding to a date is easy. The date and time classes are immutable,
		 * just like String was.
		 */
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28
	}

	@Test
	public void manipulating_Dates_and_Times_2() {
		/*
		 * There are also nice easy methods to go backward in time. This time,
		 * let’s work with LocalDateTime.
		 */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30
	}

	@Test
	public void manipulating_Dates_and_Times_3() {
		/* It is common for date and time methods to be chained */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time).minusDays(1)
				.minusHours(10).minusSeconds(30);
	}

	@Test
	public void manipulating_Dates_and_Times_4() {
		/* exercise 1 */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		date.plusDays(10);
		System.out.println(date);
		/*
		 * It prints January 20, 2020. Adding 10 days was useless because we
		 * ignored the result. Whenever you see immutable types, pay attention
		 * to make sure the return value of a method call isn’t ignored.
		 */
	}

	@Test
	public void manipulating_Dates_and_Times_5() {
		/* exercise 2 */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		// date = date.plusMinutes(1); // DOES NOT COMPILE
		/* LocalDate does not contain time */
	}

	/*-
	TABLE 3. 4 Methods in LocalDate, LocalTime, and LocalDateTime
	============================================================
	                        Can call on LocalDate?          Can call on LocalTime?          Can call on LocalDateTime?
	plusYears/minusYears                Yes                             No                          Yes
	plusMonths/minusMonths              Yes                             No                          Yes
	plusWeeks/minusWeeks                Yes                             No                          Yes
	plusDays/minusDays                  Yes                             No                          Yes
	plusHours/minusHours                No                              Yes                         Yes
	plusMinutes/minusMinutes            No                              Yes                         Yes
	plusSeconds/minusSeconds            No                              Yes                         Yes
	plusNanos/minusNanos                No                              Yes                         Yes
	 */
}