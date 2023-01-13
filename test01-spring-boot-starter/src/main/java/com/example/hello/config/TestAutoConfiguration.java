package com.example.hello.config;


import com.example.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(HelloService.class)
public class TestAutoConfiguration {

    @Bean
    public HelloService makeHelloService(){
        return new HelloService();
    }
}
