package com.nt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaDemoApplication  {
@Autowired
private KafkaProducer kafkaProducer;
    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaDemoApplication.class, args);
        System.out.println("Kafka-Spring-Boot");
    }

}
