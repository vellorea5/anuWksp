package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.config.SpringConfigJava;

public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("configConstructor.xml");
		//ApplicationContext ctxt = new ClassPathXmlApplicationContext("configSetter.xml");
		//ApplicationContext ctxt = new AnnotationConfigApplicationContext(SpringConfigJava.class);
		
		Trainer t = (Trainer)ctxt.getBean(Trainer.class);
		System.out.println(t);
		System.out.println(t.hashCode());
		
		Course c  = (Course)ctxt.getBean(Course.class);
		System.out.println(c);
		System.out.println(c.getTrainer().hashCode());
	}

}
