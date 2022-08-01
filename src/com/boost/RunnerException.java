package com.boost;

import java.util.Scanner;

public class RunnerException {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		boolean isException = false;
		do {
			try {
				scanner = new Scanner(System.in);
				System.out.println("Enter any number..:");
				n1 = scanner.nextInt();
				System.out.println("Enter any number..:");
				n2 = scanner.nextInt();
				sum = n1 + n2;
				isException = false;
				System.out.println("sum...: " + sum);
			} catch (Exception e) {
				System.err.println("Please enter proper number..");
				isException = true;
			}
		} while (isException);

	}

}
