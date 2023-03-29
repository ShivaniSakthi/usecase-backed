package com.student.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.model.Student;

public interface StudentRepositry extends JpaRepository<Student,Long> {
	@Query(value = "SELECT * FROM student t WHERE t.first_name=?1", nativeQuery = true)
	Student getStudentbyname(String username);
}
