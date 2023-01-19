package com.nt.kafka.producer;

import com.nt.kafka.kafkaConstants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate1;
//    @Autowired
//    private KafkaTemplate<String,List<Employee>> kafkaTemplate2;
    public void sendMessageg(String message) {
        System.out.println("sending message from kafka producer start");
        kafkaTemplate1.send(AppConstants.TOPIC_NAME, message);

        System.out.println("sending message from kafka producer ends");
    }

//    public void sendJSONMessage(List<Employee> employeeList) {
//        System.out.println("sending message from kafka producer start");
//        kafkaTemplate2.send(AppConstants.TOPIC_NAME, employeeList);
//        System.out.println("sending message from kafka producer ends");
//    }
}
