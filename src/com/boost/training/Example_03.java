package com.boost.training;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter any number..");
			int number = scanner.nextInt();

			if (number < 0) {

				try {
					throw new minusValueException("The value cannot be minus..");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

		}

	}

}
