package com.boost;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("1th Number...: ");
			int n1 = scanner.nextInt();

			System.out.println("2th Number...: ");
			int n2 = scanner.nextInt();

			int div = n2 / n1;

			System.out.println("Division..: " + div);

		} catch (InputMismatchException e) {
			System.out.println("Please enter numrical value..");
		} catch (ArithmeticException e) {
			System.out.println("It is not possible to make this arithmetically..");
		} catch (Exception e) {
			System.out.println("Opss something went wrong..");
		}
	}

}
