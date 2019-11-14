package com.cicd.cicdappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cicd.cicdappliedtospringbootjavaapp.controller.HelloController;

@SpringBootApplication
//@RestController
public class CicdAppliedToSpringBootJavaAppApplication {
	
	/*
	 * @GetMapping("/") public String home() { return "Hello World from DZONE"; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}

}
