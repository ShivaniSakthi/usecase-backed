package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.model.LeaveDetails;

public interface LeaveRepository extends JpaRepository<LeaveDetails, Long> {

}
