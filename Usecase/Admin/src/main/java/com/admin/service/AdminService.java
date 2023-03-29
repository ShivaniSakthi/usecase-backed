package com.admin.service;

import com.admin.model.Admin;

public interface AdminService {
	Admin savePerson(Admin admin);
	boolean authenticateUser(String username,String password,String role);
}
