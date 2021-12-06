package com.orange.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-example-biz-b")
public interface RemoteService {

    @GetMapping("/hello")
    public String sayHello();
}
