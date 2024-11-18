package com.example.myservice02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Myservice02Application {

	public static void main(String[] args) {
		SpringApplication.run(Myservice02Application.class, args);
	}
	@GetMapping("/message2")
	public String message() {
		return "My Message2";
	}
	@GetMapping("/message")
	public String message3() {
		return "My Message #2";
	}
}
