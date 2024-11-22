package com.example.rabbitmq_binder;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqBinderApplication {
	private static final Logger log = LoggerFactory.getLogger(RabbitmqBinderApplication.class);	
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqBinderApplication.class, args);
	}

	@Bean
	public Supplier<String> mySupplierSource() {
		return () -> {
			String message = "Hello..";
			log.info("Sending value: " + message);
			return message;
		};
	}

	@Bean
	public Consumer<String> myConsumerSink() {
		return message -> {
			log.info("Received message " + message);
		};
	}
}
