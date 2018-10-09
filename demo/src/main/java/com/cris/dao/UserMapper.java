package com.cris.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;


/**
 * 定义对user表的基础dao操作
 *
 * @author zc-cris
 * @version 1.0
 **/
@Mapper
public interface UserMapper {

    /**
     * 根据用户id查询余额
     *
     * @param id 用户id
     * @return 返回用户的余额
     */
    BigDecimal getMoneyById(@Param("id") Integer id);

    /**
     * 根据图书金额减去用户的余额
     *
     * @param price 图书金额
     * @param id    用户id
     * @return 返回1表示执行成功，返回0表示执行失败
     */
    Integer updateMoneyByBookPrice(@Param("price") BigDecimal price, @Param("id") Integer id);

}
