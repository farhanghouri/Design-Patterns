package service;

import model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudent() {
		return new Student("ahmed",12);
	}

	@Override
	public void saveStudent(Student student) {
		// saving code
		// interaction with database
	}

}
