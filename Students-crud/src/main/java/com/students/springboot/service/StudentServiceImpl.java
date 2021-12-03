package com.students.springboot.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.springboot.model.Student;
import com.students.springboot.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student SaveStudent(Student theStudent) {
		
		return studentRepo.save(theStudent);

	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(Long registerNumber) {
		// TODO Auto-generated method stub
		return studentRepo.findById(registerNumber).get();
	}

	@Override
	public void deleteStudentById(Long registerNumber) {
	
		
		studentRepo.deleteById(registerNumber);
		
	}

	@Override
	public Student updateStudentByID(Long registerNumber, Student theStudent) {

Student tempStudent = studentRepo.findById(registerNumber).get();


   if(Objects.nonNull(theStudent.getStudentName()) &&
	      !"".equalsIgnoreCase(theStudent.getStudentName())){
	    	  
	    	  tempStudent.setStudentName(theStudent.getStudentName());
	      }


      if(Objects.nonNull(theStudent.getDepartment()) &&
      !"".equalsIgnoreCase(theStudent.getDepartment())){
    	  
    	  tempStudent.setDepartment(theStudent.getDepartment());
      }

    

      if(Objects.nonNull(theStudent.getStudentName()) &&
      !"".equalsIgnoreCase(theStudent.getStudentName())){
    	  
    	  tempStudent.setStudentName(theStudent.getStudentName());
      }

   

      if(Objects.nonNull(theStudent.getEmail()) &&
      !"".equalsIgnoreCase(theStudent.getEmail())){
    	  
    	  tempStudent.setEmail(theStudent.getEmail());
      }
      


      if(Objects.nonNull(theStudent.getMobileNo()) &&
      !"".equalsIgnoreCase(theStudent.getMobileNo())){
    	  
    	  tempStudent.setMobileNo(theStudent.getMobileNo());
      }

   

   

		return studentRepo.save(tempStudent);
	}

	
	

	

	

}
