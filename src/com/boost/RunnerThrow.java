package com.boost;

public class RunnerThrow {

	public static void main(String[] args) {

		System.out.println(countEggs(0));

	}

	/**
	 * 
	 * @param coopId-> coop number btw 0-100
	 * @return How many eggs in the coop..
	 */
	public static int countEggs(int coopId) {

		if (coopId < 0 || coopId > 100) {
			throw new ArithmeticException("ID number is not valid..");

		} else {
			return 100;
		}

	}

}
