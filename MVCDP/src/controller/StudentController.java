package controller;

import model.Student;
import service.StudentService;

public class StudentController {

	private StudentService ss;
	
	public String getStudent() {
		Student student = ss.getStudent();
		return "student";
	}
	
	public String postStudent(Student student) {
		ss.saveStudent(student);
		return "";
	}
	
}
