package com.project.springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.springdatajpa.entities.Student;
import com.project.springdatajpa.repos.StudentRepository;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Vivek");
		student.setTestScore(100);
		repository.save(student);
		
		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
	}

}
