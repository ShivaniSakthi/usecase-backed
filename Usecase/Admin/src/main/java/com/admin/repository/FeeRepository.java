package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.model.FeeDetails;

public interface FeeRepository extends JpaRepository<FeeDetails, Long> {

}
