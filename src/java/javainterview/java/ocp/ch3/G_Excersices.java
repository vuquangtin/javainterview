package javainterview.java.ocp.ch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

public class G_Excersices {

	@Test
	public void Whizlabs_1() {

		int array[][] = new int[2][];

		array[0][0] = 0;
		array[0][1] = 1;
		array[0][2] = 2;

		array[1][0] = 0;
		array[1][1] = 10;
		array[1][2] = 20;

		System.out.println(array[1][1]);

	}

	@Test
	public void Whizlabs_2() {
		int array[] = { 2, 5, 9, 5, 0, 3 };
		Arrays.sort(array, 2, 6);
		// seran sorteados desde el indice 2 al indice 5, es decir {9, 5, 0, 3},
		// por lo que quedaria asi {2, 5, 0, 3, 5, 9}
		System.out.println(array[2] + array[5]); // 0 + 9
		// output: 9
	}

	@Test
	public void uno() {
		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s))
			System.out.println("one");
		if (t == s)
			System.out.println("two");
		if (t.equals(s))
			System.out.println("three");
		if ("Hello" == s)
			System.out.println("four");
		if ("Hello" == t)
			System.out.println("five");

	}

	@Test
	public void cuatro() {
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);
	}

	@Test
	public void cinco() {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		/*
		 * if(s1 == s2){ }
		 */
	}

	@Test
	public void seis() {
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
	}

	class Lion {
		public void roar(String roar1, StringBuilder roar2) {
			roar1.concat("!!!");
			roar2.append("!!!");
			System.out.println(roar1 + " " + roar2);
		}
	}

	@Test
	public void siete() {
		String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		System.out.println(letters.charAt(6));
	}

	@Test
	public void ocho() {
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
	}

	@Test
	public void nueve() {
		String s = "purr";
		s.toUpperCase();
		s.trim();
		s.substring(1, 3);
		s += " two";
		System.out.println(s);
		System.out.println(s.length());
	}

	@Test
	public void diez() {
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse")
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");
	}

	@Test
	public void once() {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		total += letters.substring(6, 5).length();
		System.out.println(total);
	}

	@Test
	public void doce() {
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8);
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);
	}

	@Test
	public void quince() {
		int[][] scores = new int[5][];
		Object[][][] cubbies = new Object[3][0][5];
		java.util.Date[] dates[] = new java.util.Date[2][];
		// String beans[] = new beans[6]; // debe ser --> String beans[] = new
		// String[6];
		// int[][] types = new int[];
		// int[][] java = new int[][]; // debes inicializar el primero -->
		// int[][] java = new int[4][];
	}

	@Test
	public void diezyseis() {
		char[] c = new char[2];
		// int length = c.capacity;
		// int length = c.capacity();
		int length = c.length;
		// int length = c.length();
		// int length = c.size;
		// int length = c.size();
	}

	@Test
	public void diezysiete() {
		ArrayList l = new ArrayList();
		int length = l.size();
	}

	@Test
	public void veint() {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		// list.add(7);
	}

	@Test
	public void veintiuno() {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for (Integer v : values)
			System.out.print(v);

	}

	@Test
	public void veintidos() {
		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
	}

	@Test
	public void veintitres() {
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
	}

	@Test
	public void veinticuatro() {
		String[] names = { "Tom", "Dick", "Harry" };
		List<String> list = Arrays.asList(names);
		// List<String> list = names.asList(); ->pregunta
		list.set(0, "Sue");
		System.out.println(names[0]);
	}

	@Test
	public void veintisiete() {
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
			System.out.println("A");
		else if (one.equals(two))
			System.out.println("B");
		else
			System.out.println("C");

	}

	@Test
	public void treinta() {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
				+ date.getDayOfMonth());

	}

	@Test
	public void treintauno() {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
				+ date.getDayOfMonth());

	}

	@Test
	public void treintados() {
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter
				.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
	}

	@Test
	public void treintatres() {
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));

	}

	@Test
	public void simulador() {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System.out.println(a[(a = b)[3]]);
	}

}