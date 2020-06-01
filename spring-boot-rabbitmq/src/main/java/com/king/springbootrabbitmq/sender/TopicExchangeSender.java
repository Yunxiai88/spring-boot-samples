package com.king.springbootrabbitmq.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicExchangeSender {
    @Autowired
    RabbitTemplate rabbitTemplate;

    public void send() {
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", "topic message sending.....");
    }

}