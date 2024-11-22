package com.example.consumer_service_binder;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerServiceBinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceBinderApplication.class, args);
	}
	
	@Bean
    public Consumer<String> input() {
        return message -> {
            System.out.println("Received message: " + message);
        };
    }

}
