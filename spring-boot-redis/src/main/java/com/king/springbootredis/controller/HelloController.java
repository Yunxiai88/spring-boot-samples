package com.king.springbootredis.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import com.king.springbootredis.model.User;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @Cacheable(value = "king")
    public User sayHello(){
        User user = new User("123", "123@gmail.com", "456");
        System.out.println("===================================");
        return user;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session){
        UUID uid = (UUID)session.getAttribute("uid");
        if(uid == null)
            uid = UUID.randomUUID();
        
        session.setAttribute("uid", uid);
        return session.getId();
    }
}