package com.cris.entity;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyCalculatorTest {

    @Autowired
    MyCalculator calculator;

    @Test
    public void add() {
        calculator.add(1, 2);

    }

    @Test
    public void sub() {

    }
}