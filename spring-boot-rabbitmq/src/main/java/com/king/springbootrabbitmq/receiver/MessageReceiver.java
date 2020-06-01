package com.king.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "Testing")
public class MessageReceiver {
  
    @RabbitHandler
    public void process(String msg){
        System.out.println("receiver1: " + msg);
    }
}