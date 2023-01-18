package com.nt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private MessageBasket messageBasket;

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            id = AppConstants.GROUP_ID)
    public void consume(String message) {
        System.out.println("==================================" + message + "==================================");
        messageBasket.putMessage(message);
    }
}
