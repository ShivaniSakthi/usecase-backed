package com.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.admin.model.LeaveDetails;

public interface LeaveRepository extends JpaRepository<LeaveDetails, Long> {
	@Query(value = "SELECT * FROM leavedetails a WHERE a.teachername=?1", nativeQuery = true)
	List<LeaveDetails> viewleaveByTeachername(String teachername);
}
