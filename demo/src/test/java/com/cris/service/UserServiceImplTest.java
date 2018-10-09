package com.cris.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceImplTest {


    @Autowired
    UserServiceImpl userService;

    @Test
    public void buyOneBook() {
        // 测试库存不足
//        boolean b = userService.buyOneBook(1, 1234);
        // 测试用户钱不足
        boolean b = userService.buyOneBook(1, 1111);
        log.info("b=" + b);
    }
}