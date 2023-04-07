package com.student.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.exception.ResourcenotFoundException;
import com.student.model.Student;
import com.student.repositry.StudentRepositry;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepositry studentRepo;
	
	
	public StudentServiceImpl(StudentRepositry studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentbyId(long id) {
		return studentRepo.findById(id).orElseThrow(
				()-> new ResourcenotFoundException("Teacher", "Id", id));
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student updateStudent(Student student, long rollno) {
		Student existingStudent = studentRepo.findById(rollno).orElseThrow(
				()-> new ResourcenotFoundException("Student", "rollno", rollno));
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setContact(student.getContact());
		existingStudent.setDob(student.getDob());
		existingStudent.setGuadrian(student.getGuadrian());
		existingStudent.setGender(student.getGender());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setPassword(student.getPassword());
		existingStudent.setCls(student.getCls());
		existingStudent.setRollno(student.getRollno());
		
		
		studentRepo.save(existingStudent);
		return existingStudent;
	}

	@Override
	public Student getStudentbyname(String username) {
		return studentRepo.getStudentbyname(username);
	}

}
