package com.transaction.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {

		SpringApplication.run(Service1Application.class, args);
		System.out.println("Service 1 started successfully");
	}

}
