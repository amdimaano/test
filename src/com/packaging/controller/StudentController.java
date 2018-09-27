package com.packaging.controller;

import com.packaging.service.student.StudentService;

public class StudentController {
	
	StudentService studentService;

	public void getStudent(String name) {
		studentService.getStudent(name).getAddress();
	}

}
