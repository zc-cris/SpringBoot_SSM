package com.cris.entity;


import org.springframework.stereotype.Component;

/**
 * 一个简单的计算器类，用于简单的测试AOP功能
 *
 * @author zc-cris
 * @version 1.0
 **/
@SuppressWarnings("unused")
@Component
public class MyCalculator {

    public void add(int a, int b){
        System.out.println("(a+b) = " + (a+b));
    }

    public void sub(double a, double b){
        System.out.println("(a-b) = " + (a - b));
    }

}
