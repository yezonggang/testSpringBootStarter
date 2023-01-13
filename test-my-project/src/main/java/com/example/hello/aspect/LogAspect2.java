package com.example.hello.aspect;


import com.example.hello.annotation.LogAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author y25958
 */
@Aspect
@Component
@Slf4j
public class LogAspect2 {

    @Around("@annotation(logAnnotation)")
    public Object around(ProceedingJoinPoint joinPoint, LogAnnotation logAnnotation) throws Throwable {
        log.info(String.format("time now :%s",new Date()));
        Object o = joinPoint.proceed();
        log.info(String.format("time now :%s",new Date()));
        return o;
    }
}
