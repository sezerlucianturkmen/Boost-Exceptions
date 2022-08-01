package com.boost.customExceptions;

public class Runner {

	private static StudentRepository db = new StudentRepository();

	public static void main(String[] args) {

		makeStudents();
		showList();

		db.update(new Student(10, "Deniz", "Haylaz"));

	}

	private static void showList() {
		db.findAll().forEach(System.out::println);
	}

	private static void makeStudents() {
		db.save("Ayse", "Gul");
		db.save("Deniz", "Tek");
		db.save("Gumus", "Turan");
		db.save("Hande", "Bebek");
		db.save("Ayhan", "Kasik");
	}

}
