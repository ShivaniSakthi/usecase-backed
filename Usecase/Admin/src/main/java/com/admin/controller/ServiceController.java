package com.admin.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.FeeDetails;
import com.admin.model.LeaveDetails;
import com.admin.model.MessageDetails;
import com.admin.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/usecase/student")
public class ServiceController {
	private StudentService studentService;

	public ServiceController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping()
	public List<MessageDetails> viewmessage(){
		return studentService.viewmessage();
	}
	
	@GetMapping("/viewleave")
	public List<LeaveDetails> viewAppliedLeave(){
		return studentService.viewAppliedLeave();
	}
	
	@GetMapping("/viewmessage")
	public List<MessageDetails> viewmsgByTeachername(String teachername){
		return studentService.viewmsgByTeachername(teachername);
	}
	
	@PostMapping("/message")
	public ResponseEntity<MessageDetails> message(@RequestBody MessageDetails message){
		return new ResponseEntity<MessageDetails>(studentService.message(message),HttpStatus.CREATED);
	}
	
	@PostMapping("/payfee")
	public ResponseEntity<FeeDetails> payfee(@RequestBody FeeDetails feeDetails){
		return new ResponseEntity<FeeDetails>(studentService.payfee(feeDetails),HttpStatus.CREATED);
	}
	
	@PostMapping("/applyleave")
	public ResponseEntity<LeaveDetails> applyleave(@RequestBody LeaveDetails leave){
		return new ResponseEntity<LeaveDetails>(studentService.applyleave(leave),HttpStatus.CREATED);
	}
}
