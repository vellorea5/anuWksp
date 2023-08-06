package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.springcore.*;

public class PSprCoreApplication {

	public static void main(String[] args) {
		ApplicationContext xmlCtxt = new ClassPathXmlApplicationContext("springconfig.xml");
		Course c1 = (Course) xmlCtxt.getBean("course");
		System.out.println(c1);
		Trainer t1 = xmlCtxt.getBean(Trainer.class);
		System.out.println(t1);
		
		ApplicationContext annoCtxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		Course c2 = annoCtxt.getBean(Course.class);
		System.out.println(c2);
	}

}
