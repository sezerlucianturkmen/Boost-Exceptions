package com.boost.customExceptions;

public class Student {

	private static long count = 1L;
	private Long id;
	private String name;
	private String surname;

	public Student() {
		super();
	}

	public Student(long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public Student(String name, String surname) {
		super();
		id = count++;
		this.name = name;
		this.surname = surname;
	}

	public Long getId() {
		return id;
	}

	public static long getCount() {
		return count;
	}

	public static void setCount(long count) {
		Student.count = count;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}

}
