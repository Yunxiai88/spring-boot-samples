package com.king.springcloudconsumer.config;

import org.springframework.stereotype.Component;

@Component
public class RemoteHelloHystrix implements RemoteHello {

    @Override
    public String sayHello(String msg) {
        return "Hello, AoHystrix..";
    }

}