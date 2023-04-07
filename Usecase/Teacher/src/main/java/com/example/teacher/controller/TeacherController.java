package com.example.teacher.controller;

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

import com.example.teacher.model.Teacher;
import com.example.teacher.service.TeacherService;

@CrossOrigin("*")
@RestController
@RequestMapping("/usecase/teacher")
public class TeacherController {
	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	@GetMapping()
	public List<Teacher> getAllTeachers(){
		return teacherService.getAllTeachers();
	}
	
	@GetMapping("/profile/{username}")
	public ResponseEntity<Teacher> getTeachersbyname(@PathVariable String username){
		return new ResponseEntity<Teacher>(teacherService.getTeachersbyname(username), HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Teacher> getTeacherById(@PathVariable long id){
		return new ResponseEntity<Teacher>(teacherService.getTeacherById(id), HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(teacherService.saveTeacher(teacher), HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Teacher> updateTeacher(@PathVariable("id") long id,@RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(teacherService.updateTeacher(teacher,id), HttpStatus.OK);
	}
}
