package com.example.teacher.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.teacher.exception.ResourcenotFoundException;
import com.example.teacher.model.Teacher;
import com.example.teacher.repository.TeacherRepository;
import com.example.teacher.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	private TeacherRepository teacherRepo;

	public TeacherServiceImpl(TeacherRepository tRepository) {
		super();
		this.teacherRepo = tRepository;
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepo.findAll();
	}

	@Override
	public Teacher getTeacherById(long id) {
		return teacherRepo.findById(id).orElseThrow(
				()-> new ResourcenotFoundException("Teacher", "Id", id));
	}

	@Override
	public Teacher getTeachersbyname(String username) {
		return teacherRepo.getTeachersbyname(username);
	}

}
