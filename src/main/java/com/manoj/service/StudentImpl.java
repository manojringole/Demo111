package com.manoj.service;

import java.util.List;

import com.manoj.dao.StudentRepo;
import com.manoj.entity.Student;

public class StudentImpl implements StudentI {

	
	private StudentRepo studentRepo;
	
	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	
	@Override
	public String getNameById(Integer id) {
		
		String names = studentRepo.findNameById(id);
		String upperCase = names.toUpperCase();
		return upperCase;
	}

	@Override
	public List<String> getAllStudent() {
		
		List<String> list = studentRepo.findNames();
		return list;
	}

	@Override
	public Student getStudentId(Integer id) {
		
		Student name = studentRepo.findByStudentId(id);
		return name;
	}

}
