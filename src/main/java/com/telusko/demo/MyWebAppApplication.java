package com.telusko.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MyWebAppApplication {
	
	@RequestMapping(value = "/req")
	public String index() {
		return "<h1> Welcome to the Real World! </h1>";
	}
	
	@RequestMapping(value = "/")
	public String emptyURL() {
		return "<h1> Learning Spring Boot.... </h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
		System.out.println("Welcome to Spring boot");
		
	}

}
