package com.example.datajpademo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.datajpademo.beans.Employee;
import com.example.datajpademo.beans.EmployeeRepository;
import com.example.datajpademo.beans.JavaConfig;

@SpringBootApplication
public class DataJpaDemoApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DataJpaDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee emp = ctxt.getBean(Employee.class);
		System.out.println(emp);
		System.out.println("==============================\n");
		
		// create
		employeeRepository.save(emp);
		System.out.println(emp+" saved to database");
		System.out.println("==============================\n");
		
		// read
		Optional<Employee> opEmp =  employeeRepository.findById(emp.getId());
		Employee emp2 = opEmp.get();
		System.out.println(emp2+" from database");
		System.out.println("==============================\n");
		
		// update
		emp2.setName("Tiger");
		employeeRepository.save(emp2);
		System.out.println(emp2+" updated to database");
		System.out.println("==============================\n");
		
		// delete
		//employeeRepository.delete(emp2);
		//System.out.println(emp2+" deleted from database");
		//System.out.println("==============================\n");
		
	}

}
