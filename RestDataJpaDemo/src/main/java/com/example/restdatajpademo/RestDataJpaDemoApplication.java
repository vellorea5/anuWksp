package com.example.restdatajpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDataJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDataJpaDemoApplication.class, args);
		System.out.println("Spring boot app ready to accept Rest urls...");
	}
}

