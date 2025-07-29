package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {
		System.out.println("Starting Microservice1  Application...");
		SpringApplication.run(MicroserviceApplication.class, args);
	}

}
