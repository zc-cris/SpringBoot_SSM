package com.cris.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void getMoneyById() {
        Assert.assertNotNull(userMapper.getMoneyById(1));
    }

    @Test
    public void updateMoneyByBookPrice() {
        Assert.assertEquals(1, userMapper.updateMoneyByBookPrice(new BigDecimal(30.0), 1).intValue());
    }
}