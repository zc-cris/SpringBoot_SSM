package com.cris.dao;

import com.cris.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * 定义对book表的基础dao操作
 *
 * @author zc-cris
 * @version 1.0
 **/
public interface BookMapper {

    /**
     * 根据isbn查询图书的价格
     *
     * @param isbn 图书的isbn号
     * @return 图书的价格
     */
    BigDecimal getPriceByIsbn(@Param("isbn") Integer isbn);

    /**
     * 根据isbn查询图书的库存
     *
     * @param isbn 图书的isbn号
     * @return 图书的库存量
     */
    Integer getStockByIsbn(@Param("isbn") Integer isbn);


    /**
     * 根据isbn减去一本书的库存
     *
     * @param isbn 图书的isbn号
     * @return 返回1表示（本书库存成功-1），否则返回0
     */
    Integer updateStockBySubOne(@Param("isbn") Integer isbn);


    /**
     * 根据isbn 查询图书的信息
     *
     * @param isbn 图书的isbn 号
     * @return 图书完整信息
     */
    Book getBookByIsbn(Integer isbn);
}
