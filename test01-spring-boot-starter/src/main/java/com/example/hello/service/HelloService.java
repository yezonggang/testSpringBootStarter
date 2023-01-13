package com.example.hello.service;


import com.example.hello.bean.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;


public class HelloService {

    @Autowired
    TestProperties testProperties;

    public String sayHello() {
        return testProperties.getPrefix() + "<---- say hello --->" + testProperties.getSuffix();
    }

}
