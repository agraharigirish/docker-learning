package com.test.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/docker")
public class DockerApplication {

	@GetMapping("/message")
	public String message(){
		return "Testing Docker.....";
	}

	public static void main(String[] args) {

		SpringApplication.run(DockerApplication.class, args);
		System.out.println("Project Started .....");
	}

}
