package com.manoj.service;

import java.util.List;

import com.manoj.entity.Student;

public interface StudentI {

	
	
	public String getNameById(Integer id);
	
	public List<String> getAllStudent();
	
	public Student getStudentId(Integer id);
}
