package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Course getCourse() {
		return new Course(1002, "Spring Core");
	}
}
