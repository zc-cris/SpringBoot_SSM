package com.cris.entity;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 测试spring boot 的AOP
 *
 * @author zc-cris
 * @version 1.0
 **/
@Aspect
@Component
@Slf4j
public class LogAspectj {

    @Before("execution(public void com.cris.entity.MyCalculator.*(int ,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        log.info("名为 {} 的方法执行了，参数是：{}", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        System.out.println("我是方法的前置通知");
    }

}
