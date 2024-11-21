package com.example.rabbitmq_binder;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageProcessor {

    @Bean
    public Function<String, String> process() {
        return message -> {
            System.out.println("Received message: " + message);
            // 메시지를 소문자로 변환하여 반환
            return message.toLowerCase();
        };
    }
}
