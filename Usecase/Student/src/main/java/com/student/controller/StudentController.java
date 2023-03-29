package com.student.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/usecase/student")
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping()
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Student> getStudentbyId(@PathVariable long id){
		return new ResponseEntity<Student>(studentService.getStudentbyId(id), HttpStatus.CREATED);
	}
	
	@GetMapping("/profile/{username}")
	public ResponseEntity<Student> getStudentbyname(@PathVariable String username){
		return new ResponseEntity<Student>(studentService.getStudentbyname(username), HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") long rollno,@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.updateStudent(student,rollno), HttpStatus.OK);
	}
	
}
