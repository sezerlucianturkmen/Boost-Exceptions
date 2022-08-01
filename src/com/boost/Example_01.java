package com.boost;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {

		System.out.println("***********************");
		System.out.println("*******  SCHOOL *******");
		System.out.println("***********************");
		System.out.println();
		System.out.println("1- Define Class");
		System.out.println("2- Define Student");
		System.out.println("3- Add Stduent");
		System.out.println("0- Exit");

		int secim = makeSelection();

		System.out.println("PROGRAM BÝTTÝ.");

	}

	private static int makeSelection() {

		Scanner scanner;
		int selection = 0;
		boolean isRepeat = false;

		do {
			scanner = new Scanner(System.in);
			System.out.println("Selection...: ");
			try {
				selection = scanner.nextInt();
				if (selection < 0 || selection > 3) {
					System.out.println("Please make selection btw 0-3");
					isRepeat = true;
				} else
					isRepeat = false;
			} catch (Exception e) {
				System.err.println("Please enter numerical selection...");
				isRepeat = true;
			}
		} while (isRepeat);
		return selection;
	}

}
