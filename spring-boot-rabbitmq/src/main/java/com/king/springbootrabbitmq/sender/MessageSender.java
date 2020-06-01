package com.king.springbootrabbitmq.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void send(int i) {
        String content = "Hello, this is your message - " + i;
        this.rabbitTemplate.convertAndSend("Testing", content);
    }

}