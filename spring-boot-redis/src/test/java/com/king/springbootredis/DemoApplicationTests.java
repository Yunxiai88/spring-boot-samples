package com.king.springbootredis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.king.springbootredis.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Autowired
	RedisTemplate redisTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void test(){
		stringRedisTemplate.opsForValue().set("country", "Singapore");
		assertEquals("Singapore", stringRedisTemplate.opsForValue().get("country"));
	}

	@Test
	void testObject(){
		User user = new User("king", "king@gmail.com", "password");
		ValueOperations<String, User> operations = redisTemplate.opsForValue();
		operations.set("u1", user);
		assertEquals(true, redisTemplate.hasKey("u1"));
	}

}
