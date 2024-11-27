package com.kafka.consumer02.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class KafkaConsumerService02 {

    @KafkaListener(topics = "my-topic", groupId = "consumer_group02")
    public void consume(String message) throws IOException {
        System.out.printf("Consumed Message : %s%n", message);
    }
}