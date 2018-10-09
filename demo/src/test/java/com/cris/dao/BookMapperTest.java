package com.cris.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest()
@RunWith(SpringRunner.class)
public class BookMapperTest {

    @Autowired
    BookMapper bookMapper;

    @Test
    public void getPriceByIsbn() {
        Assert.assertNotNull(bookMapper.getPriceByIsbn(1234));
    }

    @Test
    public void getStockByIsbn() {
        Assert.assertNotNull(bookMapper.getStockByIsbn(1234));
    }

    @Test
    public void updateStockBySubOne() {
        Assert.assertEquals(1, bookMapper.updateStockBySubOne(1234).intValue());
    }
}