package com.example.datajpademo.beans;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Employee getEmployee() {
		
		Employee e = new Employee(1,"Scott");
		return e; 
	}
	
}
