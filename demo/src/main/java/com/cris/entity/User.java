package com.cris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 对应user表的po
 *
 * @author zc-cris
 * @version 1.0
 **/
@SuppressWarnings("unused")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer deptId;
    private Double money;
}
