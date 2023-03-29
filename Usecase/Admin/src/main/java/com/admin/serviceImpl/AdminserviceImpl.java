package com.admin.serviceImpl;

import org.springframework.stereotype.Service;

import com.admin.model.Admin;
import com.admin.repository.AdminRepository;
import com.admin.service.AdminService;

@Service
public class AdminserviceImpl implements AdminService {

	private AdminRepository adminrepo;
	
	public AdminserviceImpl(AdminRepository adminrepo) {
		super();
		this.adminrepo = adminrepo;
	}

	@Override
	public Admin savePerson(Admin admin) {
		return adminrepo.save(admin);
	}

	@Override
	public boolean authenticateUser(String username, String password,String role) {
		Admin login = adminrepo.findByUsername(username,password,role);
		if(login==null || !login.getPassword().equals(password)) {
			return false;
		}
		return true;
	}

}
