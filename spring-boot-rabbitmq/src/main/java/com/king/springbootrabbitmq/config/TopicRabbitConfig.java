package com.king.springbootrabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {
    @Bean
    Queue queueMessage(){
        return new Queue("topic.message");
    }

    @Bean
    TopicExchange topicExchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    Binding bindingTopicExchange(Queue queueMessage, TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
}