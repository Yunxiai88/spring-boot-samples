package com.king.springcloudconsumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer", fallback = RemoteHelloHystrix.class)
public interface RemoteHello {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String msg);

}