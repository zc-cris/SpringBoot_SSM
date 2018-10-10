package com.cris.dao;

import com.cris.entity.Emp;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpMapperTest {

    @Autowired
    EmpMapper empMapper;


    /**
     * 根据主键查询单条数据
     */
    @Test
    public void testSelectOne() {
        Emp emp = empMapper.selectByPrimaryKey(1);
        System.out.println("emp = " + emp);
    }

    /**
     * 查询所有员工
     */
    @Test
    public void testSelectAll() {

        List<Emp> emps = empMapper.selectAll();
        emps.forEach(System.out::println);
    }

    /**
     * 分页查询（借助pageHelper 插件）
     */
    @Test
    public void testSelectAllPage() {
        // 查询第一页的两条数据
        PageHelper.startPage(1, 2);
        List<Emp> emps = empMapper.selectAll();
        emps.forEach(System.out::println);
    }

    /**
     * 测试保存一条数据（这里没有选择自增主键）
     */
    @Test
    public void testSave() {
        empMapper.insert(new Emp(5, "麻花腾", 1002, "日本"));
    }

    /**
     * 有选择性的保存数据（null值不保存到数据库，前提是数据库允许该列为空）
     */
    @Test
    public void testInsertSelective() {
        empMapper.insertSelective(new Emp(6, "麻生希", 1001, null));
    }

    /**
     * 有选择性的更新数据，根据id更新数据，如果为null的属性就不更新对应的列，效率更高
     */
    @Test
    public void testUpdateSelective() {
        empMapper.updateByPrimaryKeySelective(new Emp(6, null, null, "台湾"));
    }

    /**
     * 根据主键删除数据
     */
    @Test
    public void testDeleteById() {
        empMapper.deleteByPrimaryKey(5);
    }

    /**
     * 搭配使用mapper 文件来完成复杂的sql crud，当然也可以使用
     * 通用mapper 插件为我们提供的 QBC 查询，个人建议使用手写sql 语句的形式
     * 因为可以自己优化sql 语句的执行效率
     * 同时也可以发现通用mapper插件是支持调用接口继承方法和mapper文件的sql语句的
     */
    @Test
    public void testDynamicSql() {
        List<Emp> byCountryName = empMapper.getByCountryName(Arrays.asList("中国", "德国"));
        byCountryName.forEach(System.out::println);
    }
}