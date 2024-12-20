package com.example.consumer_service2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @KafkaListener(topics = "exampleTopic", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}