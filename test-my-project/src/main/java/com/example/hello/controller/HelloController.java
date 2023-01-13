package com.example.hello.controller;


import com.example.hello.annotation.LogAnnotation;
import com.example.hello.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(){
        log.info("------------------------------------------------------------------- >running hello");
        return helloService.sayHello();
    }
    @GetMapping("/hello2")
    @LogAnnotation(param = "HelloController")
    public String sayHello2(){
        log.info("------------------------------------------------------------------- >running hello2");
        return helloService.sayHello();
    }
}
