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
public class LoggingAspect {
    @Pointcut("execution(public * com.example.hello.controller.*.*())")
    public void LogAspect(){}
    @Before("LogAspect()")
    public void doBefore(JoinPoint joinPoint){
        log.info(" -------------------------> this is before.");
    }
    @After("LogAspect()")
    public void doAfter(JoinPoint joinPoint){
        log.info(" -------------------------> this is after.");
    }
    @AfterReturning("LogAspect()")
    public void doAfterReturning(JoinPoint joinPoint){
        log.info(" -------------------------> this is afterReturning.");
    }
    @AfterThrowing("LogAspect()")
    public void deAfterThrowing(JoinPoint joinPoint){
        log.info(" -------------------------> this is deAfterThrowing.");
    }
    @Around("LogAspect()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info(" -------------------------> this is deAround.");
        return joinPoint.proceed();
    }
}
