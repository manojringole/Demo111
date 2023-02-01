package com.manoj;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.manoj.dao.StudentRepo;
import com.manoj.entity.Student;
import com.manoj.service.StudentI;
import com.manoj.service.StudentImpl;

public class TestStudentimpl {

	
	private static StudentImpl studentImpl=null;
	
	@BeforeAll
	public static void init() {
	
		StudentRepo droproxy = EasyMock.createMock(StudentRepo.class);
		
		EasyMock.expect(droproxy.findNameById(1)).andReturn("laksh");
		EasyMock.expect(droproxy.findNameById(2)).andReturn("wani");
		
		
		List<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
        EasyMock.expect(droproxy.findNames()).andReturn(al);
        
        
        Student student=new Student();
        student.setId(11);
        student.setName("Manoj");
        student.setAddress("Wani");
        EasyMock.expect(droproxy.findByStudentId(11)).andReturn(student);
		
		EasyMock.replay(droproxy);
		
		studentImpl=new StudentImpl();
		
		studentImpl.setStudentRepo(droproxy);

	}
	
	@Test
	public void testGetNameById() {
		
		String name = studentImpl.getNameById(1);
		System.out.println(name);
		assertNotNull(name);
	}
	@Test
	public void testGetAllStudent() {
		
		List<String> list = studentImpl.getAllStudent();
		System.out.println(list);
		assertNotNull(list);
	}
	
	@Test
	public void testgetStudenyById() {
		
		 Student name = studentImpl.getStudentId(11);
		
		System.out.println(name);
		assertNotNull(name);
	}
}
