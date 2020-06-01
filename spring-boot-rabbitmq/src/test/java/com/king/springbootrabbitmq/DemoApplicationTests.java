package com.king.springbootrabbitmq;

import com.king.springbootrabbitmq.sender.MessageSender;
import com.king.springbootrabbitmq.sender.TopicExchangeSender;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	MessageSender messageSender;

	@Autowired
	TopicExchangeSender topicExchangeSender;

	@Test
	void contextLoads() {
	}

	@Test
	void testSend(){
		for(int i=0; i< 100; i ++)
			this.messageSender.send(i);
	}

	@Test
	void testTopicExchange(){
		this.topicExchangeSender.send();
	}
}
