package com.example.anuspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.anuspringboot.dao.StudentRepository;
import com.example.anuspringboot.dto.StudentDTO;
import com.example.anuspringboot.entity.StudentEntity;
import com.example.anuspringboot.service.StudentService;

@SpringBootApplication
public class AnuSpringBootApplication implements CommandLineRunner {

	// @Autowired
	// private StudentRepository studentRepository;

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {

		// Any class variables declared can't be used in main as main is static and
		// non static variables can't be used, hence using run method of
		// SpringApplication.
		SpringApplication.run(AnuSpringBootApplication.class, args);
	}

	public void run(String... args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("Anu Spring Boot Application started and running...");

		// Comment below call when demo...ing REST Controller
		//demoJPA(ctxt);
	}

	public void demoJPA(ApplicationContext ctxt) {
		// Dependency Injection example
		// Instead of exposing an entity obj, we use DTO (Data Transfer Object).
		// StudentEntity s1 = (StudentEntity) ctxt.getBean("student");
		StudentDTO s1 = (StudentDTO) ctxt.getBean("student");
		System.out.println("Student bean injected:"+s1);

		// Instead of using repo obj directly, we use Service obj
		//studentRepository.save(s1);
		System.out.println("Student Bean persisted:"+studentService.createStudent(s1));
	}
}
