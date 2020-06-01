package com.king.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "Testing")
public class MessageReceiver1 {
  
    @RabbitHandler
    public void process(String msg){
        System.out.println("receiver2: " + msg);
    }
}