package com.cris.mappers;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 本地的 mapper 接口，需要继承自 Mapper 和 MySqlMapper，为了可以方便的使用
 * Mapper 提供的默认方法以及实现批处理
 *
 * @author zc-cris
 * @version 1.0
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
