package org.Super.day09.studentmvc.controller;

import java.util.ArrayList;
import java.util.List;
import org.Super.day09.studentmvc.model.Student;


public class StudentController {
	// 저장소
	List<Student> students;
	
	public StudentController() {
		students = new ArrayList<Student>();
	}
	// 저장
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// 출력
	public List<Student> allStudentList() {
		return students;
	}
}
