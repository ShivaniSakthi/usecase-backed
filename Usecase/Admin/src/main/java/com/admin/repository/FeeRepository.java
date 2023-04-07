package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.admin.model.FeeDetails;

public interface FeeRepository extends JpaRepository<FeeDetails, Long> {
	@Query(value = "SELECT * FROM feedetails a WHERE a.name=?1", nativeQuery = true)
	FeeDetails findByUsername(String studentname);
}
