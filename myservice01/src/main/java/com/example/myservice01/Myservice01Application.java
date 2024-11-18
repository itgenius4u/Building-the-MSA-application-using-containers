package com.example.myservice01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Myservice01Application {

	public static void main(String[] args) {
		SpringApplication.run(Myservice01Application.class, args);
	}

	@GetMapping("/message")
	public String message() {
		return "My Message";
	}

}
