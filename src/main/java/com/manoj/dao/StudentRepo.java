package com.manoj.dao;

import java.util.List;

import com.manoj.entity.Student;

public interface StudentRepo {

	
	public String findNameById(Integer id);
	
	public List<String> findNames();
	
	public Student findByStudentId(Integer id);
}
