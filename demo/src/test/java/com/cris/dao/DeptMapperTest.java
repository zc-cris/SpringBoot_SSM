package com.cris.dao;

import com.cris.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class DeptMapperTest {

    @Autowired
    DeptMapper deptMapper;

    @Test
    public void test() {
        List<Dept> depts = deptMapper.selectAll();
        depts.forEach(System.out::println);
    }

}