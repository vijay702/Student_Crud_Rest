package com.students.springboot.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.springboot.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	public Optional<Student> findByStudentName(String studentName);

	

}
