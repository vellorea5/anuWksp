package com.example.anuspringboot.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.anuspringboot.dto.StudentDTO;
import com.example.anuspringboot.service.StudentService;

@RestController
public class StudentRESTController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/createstudent")
	public StudentDTO createStudent(@RequestBody StudentDTO studentDTO) {
		
		StudentDTO studentCreated = studentService.createStudent(studentDTO);
		
		return studentCreated;
	}
}
