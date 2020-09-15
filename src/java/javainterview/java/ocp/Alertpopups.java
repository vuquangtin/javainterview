package javainterview.java.ocp;

import java.util.Scanner;

public class Alertpopups {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int count = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {

				break;
			}
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 0) {

			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}

	}
}
