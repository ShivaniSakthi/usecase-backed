package com.example.teacher.service;

import java.util.List;

import com.example.teacher.model.Teacher;

public interface TeacherService {
	Teacher saveTeacher(Teacher teacher);
	Teacher getTeacherById(long id);
	List<Teacher> getAllTeachers();
	Teacher getTeachersbyname(String username);
	Teacher updateTeacher(Teacher teacher, long rollno);
}
