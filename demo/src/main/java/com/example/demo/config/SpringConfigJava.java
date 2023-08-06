package com.example.demo.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Course;
import com.example.demo.Trainer;

@Configuration
public class SpringConfigJava {
	
	@Bean
	public Trainer getTrainer() {
		Trainer t = new Trainer(2,"James");
		System.out.println("From bean:"+t.hashCode());
		return t;
	}
	
	@Bean
	public Course getCourse() {
		Course c = new Course();
		c.setId(2);
		c.setName("SQL");
		c.setTrainer(getTrainer());
		Set<Integer> marks = new HashSet();
		marks.add(60); marks.add(70); marks.add(80);
		c.setMarks(marks);
		return c;
	}
}
