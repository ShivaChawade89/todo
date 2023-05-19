package com.example.todo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class TodoApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodoApplication.class, args);
//		System.out.print("hello world");
	}

}
