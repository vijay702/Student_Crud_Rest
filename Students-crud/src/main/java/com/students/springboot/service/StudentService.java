package com.students.springboot.service;

import java.util.List;

import com.students.springboot.model.Student;

public interface StudentService {

	public Student SaveStudent(Student theStudent);

	public List<Student> getStudentList();

	public Student getStudentById(Long registerNumber);

	public void deleteStudentById(Long registerNumber);

	public Student updateStudentByID(Long registerNumber, Student theStudent);



	

	

}
