package com.admin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "loginid")
	private long loginid;
	
	@Column(name= "username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name= "role")
	private String role;
	
	@Column(name= "email")
	private String email;
	
	
	public Admin() {
		super();
	}

	public Admin(long loginid, String userName, String password, String role, String email) {
		super();
		this.loginid = loginid;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.email = email;
	}

	public long getLoginid() {
		return loginid;
	}

	public void setLoginid(long loginid) {
		this.loginid = loginid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
