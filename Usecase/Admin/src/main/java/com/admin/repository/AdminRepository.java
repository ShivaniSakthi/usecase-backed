package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.admin.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	@Query(value = "SELECT * FROM admin a WHERE a.username=?1 && a.password=?2 && a.role=?3", nativeQuery = true)
	Admin findByUsername(String username,String password,String role);
}
