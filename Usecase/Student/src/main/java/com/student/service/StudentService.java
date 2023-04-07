package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	Student saveStudent(Student student);
	Student getStudentbyId(long id);
	List<Student> getAllStudents();
	Student updateStudent(Student student, long rollno);
	Student getStudentbyname(String username);
}
