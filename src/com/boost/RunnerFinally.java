package com.boost;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RunnerFinally {

	public static void main(String[] args) {

		File file;
		BufferedWriter bufferedWriter = null;
		try {
			file = new File("C:\\Ornek\\deneme.txt");
			bufferedWriter = new BufferedWriter(new FileWriter(file, false));
			bufferedWriter.append("new row is added");
			bufferedWriter.newLine();

			String textString = "Text";
			System.out.println(textString.charAt(0));

		} catch (Exception e) {
			System.out.println("something went wrong..");
		} finally {
			try {
				bufferedWriter.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			System.out.println("work all the time...");
		}
	}

}
