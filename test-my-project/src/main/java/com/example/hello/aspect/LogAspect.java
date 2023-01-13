package com.example.hello.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author y25958
 */
@Component
@Aspect
@Slf4j
public class LogAspect {
    @Pointcut("execution(public * com.example.hello.controller.*.*())")
    public void LogAspect(){}

    @Before("LogAspect()")
    public void doBefore(JoinPoint joinPoint){
        log.info(" -------------------------> doBefore");
    }

    @After("LogAspect()")
    public void doAfter(JoinPoint joinPoint){
        log.info(" -------------------------> doAfter");
    }

    @AfterReturning("LogAspect()")
    public void doAfterReturning(JoinPoint joinPoint){
        log.info(" -------------------------> doAfterReturning");
    }

    @AfterThrowing("LogAspect()")
    public void deAfterThrowing(JoinPoint joinPoint){
        log.info(" -------------------------> deAfterThrowing");
    }

    @Around("LogAspect()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info(" -------------------------> deAround");
        return joinPoint.proceed();
    }

}
