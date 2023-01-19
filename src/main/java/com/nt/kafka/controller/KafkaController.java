package com.nt.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KafkaController {
    @Autowired
    private MessageBasket messageBasket;
@Autowired
private KafkaProducer kafkaProducer;
    @GetMapping("/sendMessage/{message}")
    public String sendMessage(@PathVariable("message") String message) {
        kafkaProducer.sendMessageg(message);
        return "Message sent to topic";
    }
    @GetMapping("/get")
    public List<String> getMessage() {
        return messageBasket.getAllMessage();
    }
}
