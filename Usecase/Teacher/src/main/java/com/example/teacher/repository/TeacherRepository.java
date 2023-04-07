package com.example.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.teacher.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	@Query(value = "SELECT * FROM teacher t WHERE t.first_name=?1", nativeQuery = true)
	Teacher getTeachersbyname(String username);
}
