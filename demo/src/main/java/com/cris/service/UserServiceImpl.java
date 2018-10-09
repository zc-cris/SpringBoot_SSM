package com.cris.service;


import com.cris.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * user的service层
 *
 * @author zc-cris
 * @version 1.0
 **/
@Service
@Slf4j
public class UserServiceImpl {

    private final
    UserMapper userMapper;

    private final
    BookServiceImpl bookService;

    @Autowired
    public UserServiceImpl(BookServiceImpl bookService, UserMapper userMapper) {
        this.bookService = bookService;
        this.userMapper = userMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean buyOneBook(Integer id, Integer isbn) {
        log.info("id为{}的用户准备买isbn为{}的图书", id, isbn);
        Integer stock = bookService.getStock(isbn);
        if (stock <= 0) {
            throw new RuntimeException(String.format("isbn为%s的图书库存不足！", isbn));
        }

        BigDecimal price = bookService.getPrice(isbn);
        BigDecimal money = userMapper.getMoneyById(id);
        int compare = price.compareTo(money);
        if (compare > 0) {
            throw new RuntimeException("用户的钱不够买书");

        }

        userMapper.updateMoneyByBookPrice(price, id);
        log.info("id为{}的用户已经付款{}员", id, price);
        bookService.saleOne(isbn);
        log.info("id为{}的用户已经买了isbn为{}的一本书，库存已经减去一", id, isbn);
        return true;
    }


}
