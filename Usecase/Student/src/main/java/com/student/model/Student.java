package com.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rollno;
	
	@Column(name= "first_name", nullable = false)
	private String Firstname;
	
	@Column(name= "last_name")
	private String Lastname;
	
	@Column(name= "guardian")
	private String Guardian;
	
	@Column(name= "dob")
	private String Dob;
	
	@Column(name="gender")
	private String Gender;
	
	@Column(name="cls")
	private int cls;
	
	@Column(name= "address")
	private String Address;
	
	@Column(name= "contact")
	private long contact;
	
	@Column(name= "email")
	private String email;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String Password;
	
	public Student() {
		super();
	}

	public Student(long rollno, String firstname, String lastname, String guardian, String dob, String gender, int cls,
			String address, long contact, String email, String username, String password) {
		super();
		this.rollno = rollno;
		Firstname = firstname;
		Lastname = lastname;
		Guardian = guardian;
		Dob = dob;
		Gender = gender;
		this.cls = cls;
		Address = address;
		this.contact = contact;
		this.email = email;
		this.username = username;
		Password = password;
	}



	public long getRollno() {
		return rollno;
	}

	public void setRollno(long rollno) {
		this.rollno = rollno;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getGuadrian() {
		return Guardian;
	}

	public void setGuadrian(String guadrian) {
		Guardian = guadrian;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getCls() {
		return cls;
	}

	public void setCls(int cls) {
		this.cls = cls;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGuardian() {
		return Guardian;
	}

	public void setGuardian(String guardian) {
		Guardian = guardian;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
