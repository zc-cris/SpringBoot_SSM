package com.cris.dao;


import com.cris.entity.Emp;
import com.cris.mappers.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 关于emp的mapper接口，继承自本地的 Mapper接口（即MyMapper）
 *
 * @author zc-cris
 * @version 1.0
 **/
public interface EmpMapper extends MyMapper<Emp> {

    /**
     * 查询符合国家列表要求的所有员工
     *
     * @param countryNames 想要匹配的多个国家名字列表
     * @return 匹配的员工列表
     */
    List<Emp> getByCountryName(@Param("countryNames") List<String> countryNames);

}
