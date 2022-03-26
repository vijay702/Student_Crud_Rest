package com.students.springboot.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.springboot.exception.StudentNotFoundException;
import com.students.springboot.model.Student;
import com.students.springboot.repo.StudentRepo;
import com.sun.el.stream.Optional;

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
	public Student getStudentById(Long registerNumber) throws StudentNotFoundException  {
		// TODO Auto-generated method stub
		
		java.util.Optional<Student>	 student =	studentRepo.findById(registerNumber);
		
		
		if (!student.isPresent()) {
			
			throw new StudentNotFoundException("Department Not Avaiable");
		}
		          return student.get();
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

	@Override
	public Student getStudentByStudentName(String studentName) throws StudentNotFoundException {
		
		java.util.Optional<Student> student = studentRepo.findByStudentName(studentName);
		 
		 if(!student.isPresent()) {
			 
			 throw new StudentNotFoundException("Enter a exisiting name  , Data Not Aviable");
		 }
		 
		 return student.get();
	}

	
	

	

	

}
