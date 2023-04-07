package com.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.Admin;
import com.admin.service.AdminService;

@CrossOrigin("*")
@RestController
@RequestMapping("/usecase/admin")
public class AdminController {

	private AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@PostMapping
	public ResponseEntity<Admin> savePerson(@RequestBody Admin admin){
		return new ResponseEntity<Admin>(adminService.savePerson(admin), HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Admin login){
		String username = login.getUserName();
		String password = login.getPassword();
		String role = login.getRole();
		boolean isAuthenticated = adminService.authenticateUser(username, password,role);
		
		if(isAuthenticated) {
			return ResponseEntity.ok("User authenticated successfully");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
		}
	}
}
