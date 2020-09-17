package javainterview.java.ocp.ch2;

import java.util.ArrayList;
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

public class G_Excercises {

	@Test
	public void tres() {

		int x = 0;
		while (x++ < 10) {
		}
		// String message = x>10 ? "Greater than":false; DONT COMPILE
		// System.out.println(message+","+x);
	}

	@Test
	public void cuatro() {

		long x = 10;

		int y = (int) (2 * x);
		System.out.println(y);

		int z = 2 * (int) x;
		System.out.println(z);

		long w = 2 * x;
		System.out.println(w);

	}

	@Test
	public void cinco() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(14);

		for (int x : list) {
			System.out.print(x + ", ");
			break;
		}
	}

	@Test
	public void seis() {
		int x = 4;
		long y = x * 4 - x++;

		if (y < 10)
			System.out.println("Too Low");
		else
			System.out.println("Just Right");
		// else System.out.println("Too High");
	}

	@Test
	public void siete() {
		int x = 5;
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
	}

	@Test
	public void ocho() {
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z = false);
		System.out.println(x + "" + y + "" + z);
	}

	@Test
	public void nueve() {
		for (int i = 0; i < 10;) {
			i = i++;
			System.out.println("Hello World:"+i);
		}

	}

	@Test
	public void diez() {
		byte a = 40, b = 50;
		byte sum = (byte) ((byte) a + b);
		System.out.println(sum);

	}

	@Test
	public void doce() {
		int x = 0;
		String s = null;
		/*-
		 *  if (x == s)
		     System.out.println("");*/
	}

	@Test
	public void trece() {
		int x1 = 50, x2 = 75;
		boolean b = x1 >= x2;
		if (b = true)
			System.out.println("Success");
		else
			System.out.println("Failure");

	}

	@Test
	public void quince() {
		int x = 1, y = (int) 15L;

	}

	@Test
	public void dieznueve() {
		int m = 9, n = 1, x = 0;
		while (m > n) {
			m--;
			n += 2;
			x += m + n;
		}
		System.out.println(x);

	}

	@Test
	public void veinte() {
		final char a = 'A', d = 'D';
		char grade = 'B';
		switch (grade) {
		case a:
		case 'B':
			System.out.println("great");
		case 'C':
			System.out.println("good");
			break;
		case d:
		case 'F':
			System.out.println("not good");
		}
	}

	@Test
	public void Withz() {
		String name1 = "Rekha";
		String name2 = new String("Rekha");

		System.out.println(name1.equals(name2) + " ");
		System.out.println(name1 == name2);

	}

	@Test
	public void Withz2() {
		String s = "AB";
		String ss = "";
		if (ss.length() != 0)
			ss += "C";
		ss += "D";
		s += ss;

		System.out.println(s);

	}

	@Test
	public void Withz3() {
		String out = "0";
		int x = 6, y = 6;

		if (x <= 6)
			if (y > 0)
				if (x > y)
					out += "1";
				else
					out += "2";
			else
				out += "3";
		else
			out += "4";

		System.out.println(out);

	}

	@Test
	public void withz_1_1() {
		// recorre hasta -4 de ahi el break lo bota del bucle
		int ar[][] = { { 1, 0 }, { -4 }, { 3, 1 } };

		f1: for (int[] a : ar) {
			for (int x = 0; x < a.length; x++) {
				if (a[x] < 0)
					break f1;
				System.out.print(a[x]);
			}
		}
	}

	@Test
	public void withz_1_2() {
		int x = 10;
		while (x > 0) {
			// hacer...mientras...
			do {
				x -= 2;
			} while (x > 3);
			x--;
			System.out.print(x);
		}
		/*-
		 * while(false){ DONT COMPILE
		}*/
	}

	@Test
	public void withz_1_3() {
		int x = 0;
		do {
			System.out.print(x);// aumenta en uno tarde
		} while (x++ < 2);
		for (x = 0; x++ < 2;) {// aumenta en uno
			System.out.print(x);
		}
	}

	@Test
	public void withz_1_4() {
		int x = 0;
		do {
			System.out.print(x);// aumenta en uno tarde
		} while (x++ > 0);
	}

	@Test
	public void withz_1_5() {
		int x = 0;
		while ((x = 0) <= 1) {
			System.out.print(x);
			x++;
		}
	}

	@Test
	public void book() {
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		// primero x = 4
		// luego baja a 3
		// luego vuelve a bajar a 2
		System.out.println("y = " + y);
		System.out.println("x = " + x);
	}

	@Test
	public void overflow() {
		// roll over effect to lower limit in overflow
		int overflowExample = 2147483647;
		System.out.println("Overflow: " + (overflowExample + 1));

		// roll over effect to upper limit in underflow
		int underflowExample = -2147483648;
		System.out.println("Underflow: " + (underflowExample - 1));

		// underflow
		float f = 3.4028235E38f * 20f;
		System.out.println(f);
	}

	@Test
	public void switchstatement0() {
		// sabe que ninguno va coincidir, entonces se mete al default
		int days = 5;
		switch (days) {
		default:
			System.out.println("Weekday0");
			break;
		case 0:
			System.out.println("Sunday0");
			break;
		case 6:
			System.out.println("Saturday0");// aqui entra
			break;
		}
	}

	@Test
	public void switchstatement1() {
		// sabe que ninguno va coincidir, entonces se mete al deault
		// una vez que entra, ya entra a todos lados, hasta en los que no
		// coinciden (sin BREAK)
		int days = 5;
		switch (days) {
		case 0:
			System.out.println("Sunday1");
		default:
			System.out.println("Weekday1");// aqui entra
		case 6:
			System.out.println("Saturday1");// aqui entra
			break;
		}
	}

	@Test
	public void switchstatement2() {
		// sabe que uno va coincidir, entonces NO se mete al default
		// una vez que entra, ya entra a todos lados, hasta en los que no
		// coinciden (sin BREAK)
		int days = 6;
		switch (days) {
		default:
			System.out.println("Weekday2");
		case 0:
			System.out.println("Sunday2");
		case 6:
			System.out.println("Saturday2");
			break;
		}
	}

	@Test
	public void switchstatement3() {
		// sabe que uno va coincidir, entonces NO se mete al default
		// una vez que entra, ya entra a todos lados, hasta en los que no
		// coinciden (sin BREAK)
		int days = 0;
		switch (days) {
		case 0:
			System.out.println("Sunday3");// entra aqui
		default:
			System.out.println("Weekday3");// entra aqui
		case 6:
			System.out.println("Saturday3");// entra aqui
			break;
		}
	}

	@Test
	public void boo() {
		float f = -1;
		float f1 = 0x0123;
		float f2 = 4;
	}

	@Test
	public void test() {
		char i;
		LOOP: for (i = 0; i < 5; i++) {
			switch (i++) {
			case '0':
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
			case 'E':
				System.out.println("F");
			}
		}
	}

}