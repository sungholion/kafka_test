package com.kafka.consumer01.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class KafkaConsumerService01 {

    @KafkaListener(topics = "my-topic", groupId = "consumer_group01")
    public void consume(String message) throws IOException {
        System.out.printf("Consumed Message : %s%n", message);
    }
}