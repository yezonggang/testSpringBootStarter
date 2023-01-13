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
        log.info("---- 模拟基于标准注解的切面过程 ---------- >running hello");
        return helloService.sayHello();
    }
    @GetMapping("/hello2")
    public String sayHello2(){
        log.info("---- 模拟异常后切面过程 ---------- >running hello2");
        throw new RuntimeException();
    }

    @GetMapping("/hello3")
    @LogAnnotation(param = "HelloController")
    public String sayHello3(){
        log.info("---- 模拟基于自定义注解的切面 ---------- >running hello3");
        return helloService.sayHello();
    }
}
