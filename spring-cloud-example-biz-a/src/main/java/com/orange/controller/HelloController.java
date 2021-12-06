package com.orange.controller;

import com.orange.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private RemoteService remoteService;

    /**
     * 示例方法
     *
     * @return
     */
    @GetMapping
    public String sayHello() {
        return "Hello,This is Biz-A Service.";
    }

    @GetMapping("/callB")
    public String call(){
        return remoteService.sayHello();
    }
}
