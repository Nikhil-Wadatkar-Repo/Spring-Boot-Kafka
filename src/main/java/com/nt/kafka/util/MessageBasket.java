package com.nt.kafka.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageBasket {

    List<String> messages=new ArrayList<>();

    public void putMessage(String msg){
        messages.add(msg);
    }

    public List<String> getAllMessage(){
        return messages;
    }
}
