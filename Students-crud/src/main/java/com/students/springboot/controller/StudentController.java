package com.students.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.students.springboot.model.Student;
import com.students.springboot.service.StudentService;

;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public Student SaveStudent(@RequestBody Student theStudent) {
		
		return studentService.SaveStudent(theStudent);
		
	}
	

	@GetMapping("/students")
	public List<Student> getStudentById() {
		
		return studentService.getStudentList();
		
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") Long registerNumber) {
		
		
		return studentService.getStudentById(registerNumber);
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable("id") Long registerNumber) {
		
		
		studentService.deleteStudentById(registerNumber);
		return "student deleted sucessfully";
		
	}
	
	
	@PutMapping("/students/{id}")
	public Student updateStudentByID(@PathVariable("id") Long registerNumber,
			                                 @RequestBody Student theStudent) {
		
		
		return studentService.updateStudentByID(registerNumber,theStudent);
		
	}
	
	
	
	
	
	
	

}
