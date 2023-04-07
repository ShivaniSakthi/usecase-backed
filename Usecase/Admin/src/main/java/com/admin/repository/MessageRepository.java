package com.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.admin.model.MessageDetails;

public interface MessageRepository extends JpaRepository<MessageDetails, Long> {
	@Query(value = "SELECT * FROM messsagedetails a WHERE a.teachername=?1", nativeQuery = true)
	List<MessageDetails> viewmsgByTeachername(String teachername);
}
