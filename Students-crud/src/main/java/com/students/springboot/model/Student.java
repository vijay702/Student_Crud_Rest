package com.students.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long registerNumber;
	
	private String studentName;
	private String department;
	private String mobileNo;
	private String email;
	
	
	public Long getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(Long registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String studentName, String department, String mobileNo, String email) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [registerNumber=" + registerNumber + ", studentName=" + studentName + ", department="
				+ department + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	public Student() {
		
	}
	

}
