package com.cris.service;

import com.cris.dao.BookMapper;
import com.cris.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * book的service层
 *
 * @author zc-cris
 * @version 1.0
 **/
@Service
public class BookServiceImpl {

    private final
    BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * 根据isbn号卖出一本书
     *
     * @param isbn 图书的isbn号
     */
    public void saleOne(Integer isbn) {
        bookMapper.updateStockBySubOne(isbn);
    }

    /**
     * 根据isbn获取该书的库存
     *
     * @param isbn 图书的isbn
     * @return 图书的库存
     */
    Integer getStock(Integer isbn) {
        return bookMapper.getStockByIsbn(isbn);
    }

    /**
     * 根据isbn获取图书的价格
     *
     * @param isbn 图书的isbn
     * @return 图书的价格
     */
    BigDecimal getPrice(Integer isbn) {
        return bookMapper.getPriceByIsbn(isbn);
    }

    /**
     * 根据isbn获取图书的信息
     *
     * @param isbn 图书的isbn
     * @return 对应的图书信息
     */
    public Book getBookByIsbn(Integer isbn) {
        return bookMapper.getBookByIsbn(isbn);
    }
}
