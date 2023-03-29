package com.example.teacher.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "first_name",nullable = false)
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name="gender")
	private String Gender;
	
	@Column(name="subject")
	private String Subject;
	
	@Column(name= "email")
	private String email;
	
	@Column(name="contact_no")
	private long contact;
	
	@Column(name="password")
	private String Password;

	public Teacher(long id, String firstName, String lastName, String gender, String subject, String email,
			long contact, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		Subject = subject;
		this.email = email;
		this.contact = contact;
		Password = password;
	}

	public Teacher() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
