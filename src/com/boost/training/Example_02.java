package com.boost.training;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		// controlNumber(scanner);
		// controlDate(scanner);

		LocalDate localDate = null;
		int number = 0;

		boolean control = false;
		do {

			try {
				calcAge(controlDate(scanner), controlNumber(scanner));
				control = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				control = true;
			} finally {
				scanner.nextLine();
			}

		} while (control);

	}

	private static int controlNumber(Scanner scanner) throws Exception {

		try {
			System.out.println("Please enter the number");
			int number = scanner.nextInt();
			return number;
		} catch (Exception e) {
			throw new Exception("it is wrong, please try again..");
		} finally {
			scanner.nextLine();
		}

	}

	private static LocalDate controlDate(Scanner scanner) throws Exception {

		try {
			System.out.println("Please enter the date");
			LocalDate date = LocalDate.parse(scanner.nextLine());
			return date;
		} catch (Exception e) {
			throw new Exception("it is wrong, please try again..");

		}

	}

	public static void calcAge(LocalDate bDay, int number) throws Exception {

		long years = bDay.until(LocalDate.now().minusYears(number), ChronoUnit.YEARS);

		System.out.println("you were " + (years - number) + " years old " + number + " years ago.");

	}

}
