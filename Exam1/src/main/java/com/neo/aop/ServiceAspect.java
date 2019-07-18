package com.neo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ServiceAspect {

    private static final Logger log = LoggerFactory.getLogger(ServiceAspect.class);

    public static long endTime;

    @Pointcut("execution(public * com.neo.service.*.*(..))")
    public void print() {

    }

    @Before("print()")
    public void BeforeInsertFilmEvent(JoinPoint joinPoint) {
        log.info("BeforeInsertFilmData");


    }

    @After("print()")
    public void AfterInsertFilmEvent() {
        log.info("AfterInsertFilmData");

    }

    @AfterReturning(pointcut = "print()", returning = "object")
    public void getAfterReturn(Object object) {
    }
}