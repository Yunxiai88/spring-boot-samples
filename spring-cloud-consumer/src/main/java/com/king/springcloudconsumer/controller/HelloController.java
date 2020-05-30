package com.king.springcloudconsumer.controller;

import com.king.springcloudconsumer.config.RemoteHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    RemoteHello remoteHello;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String msg){
        return remoteHello.sayHello(msg);
    }

}