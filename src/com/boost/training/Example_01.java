package com.boost.training;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", "null", "20" };

		// readArray(array);
		// sum(array);
		sum2(array);

	}

	public static void readArray(String[] array) {

		Scanner scanner;
		int pick;

		try {
			scanner = new Scanner(System.in);
			System.out.println("Which index element you would like read");
			pick = scanner.nextInt();

			System.out.println("The element on the number :" + (pick + 1) + " is " + array[pick]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("your selection is exceeeded the length of array..");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void sum(String[] array) {

		int sum = 0;
		int error = 0;

		for (String string : array) {

			try {
				int num = Integer.parseInt(string);
				sum += num;

			} catch (Exception e) {
				System.out.println(e.getMessage());
				error++;
			}

		}

		System.out.println("Number of Error.: " + error);
		System.out.println("Sum .: " + sum);
	}

	public static void sum2(String[] array) {

		int sum = 0;
		int error = 0;

		for (String string : array) {

			try {
				if (string == null) {
					throw new NullPointerException("This element is Null..");

				} else {

					int num = Integer.parseInt(string);
					sum += num;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				error++;
			}
		}

		System.out.println("Number of Error.: " + error);
		System.out.println("Sum .: " + sum);
	}

}
