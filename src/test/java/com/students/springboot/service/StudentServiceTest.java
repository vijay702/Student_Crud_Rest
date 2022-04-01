package com.students.springboot.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.students.springboot.exception.StudentNotFoundException;
import com.students.springboot.model.Student;
import com.students.springboot.repo.StudentRepo;

@SpringBootTest
class StudentServiceTest {
	@Autowired
	private StudentService studentService;
	
	@MockBean
	private StudentRepo studentRepo;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	public void whenValidStudentName_thenStudentShouldFound() throws StudentNotFoundException {
		
		String studentName = "vijay";
		
		Student found = studentService.getStudentByStudentName(studentName);
		assertEquals(studentName,found.getStudentName());
		
	}
}
