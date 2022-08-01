package com.boost.customExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {

	private List<Student> studentList;

	public StudentRepository() {
		studentList = new ArrayList<Student>();
	}

	public void save(String name, String surname) {
		studentList.add(new Student(name, surname));
	}

	public void update(Student student) {

		Optional<Student> existLiStudent = studentList.stream().filter(x -> x.getId().equals(student.getId()))
				.findFirst();

		if (existLiStudent.isPresent()) {
			existLiStudent.get().setName(student.getName());
			existLiStudent.get().setSurname(student.getSurname());
		} else {
			throw new StudentException(ErrorType.REPOSITORY_ERROR_UPDATEERROR,
					"It could not be found any student with this ID");
		}

	}

	public Student findById(Long id) {
		Optional<Student> student = studentList.stream().filter(x -> x.getId().equals(id)).findFirst();
		if (student.isEmpty()) {

			throw new StudentException(ErrorType.REPOSITORY_ERROR_NOTFOUND_ID);

		} else
			return student.get();
	}

	public List<Student> findAll() {
		return studentList;
	}

}
