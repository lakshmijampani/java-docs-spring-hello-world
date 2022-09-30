package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		System.out.println("Hello world logs test===>");
		System.out.println("welcome to devops");
		System.out.println("welcome to pr in devops");

		return "Hello  azure cloud World logs Updated with small change!!!!!!!";
		
		
	}
}
