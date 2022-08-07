package com.api.javastoreback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class JavastorebackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavastorebackApplication.class, args);
	}
	
	
	@RequestMapping("/home")
	public String hello() {
		return "Hello buddy!";
	}
	
}
