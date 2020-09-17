package javainterview.java.ocp.ch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

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

public class F_C_Working_with_Periods {
	/*
	 * The head zookeeper has decided to switch the toys every month. This
	 * system will continue for three months to see how it works out.
	 */

	@Test
	public void working_with_Periods_1() {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(start, end);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
	}

	/*
	 * This code works fine. It adds a month to the date until it hits the end
	 * date. The problem is that this method can’t be reused. Our zookeeper
	 * wants to try different schedules to see which works best. Luckily, Java
	 * has a Period class that we can pass in
	 */

	@Test
	public void working_with_Periods_2() {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end,
			Period period) { // uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period
		}
	}

	/*-
	The method can add an arbitrary period of time that gets passed in. This allows us to reuse the 
	same method for different periods of time as our zookeeper changes her mind.
	Period annually = Period.ofYears(1); // every 1 year
	Period quarterly = Period.ofMonths(3); // every 3 months
	Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
	Period everyOtherDay = Period.ofDays(2); // every 2 days
	Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
	You cannot chain methods when creating a Period */

	@Test
	public void working_with_Periods_3() {
		/*
		 * The following code looks like it is equivalent to the
		 * everyYearAndAWeek example, but it’s not. Only the last method is used
		 * because the Period.ofXXX methods are static methods.
		 */

		Period wrong = Period.ofYears(1).ofWeeks(1); // every week
		Period wrong1 = Period.ofYears(1);
		wrong1 = Period.ofWeeks(7);

		/* This is clearly not what you intended! */
	}

	@Test
	public void working_with_Periods_4() {
		/*
		 * The last thing to know about Period is what objects it can be used
		 * with. Let’s look at some code:
		 */
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period)); // 2015-02-20
		System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
		System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
	}
}