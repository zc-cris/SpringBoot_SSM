package com.cris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * book表的对应po
 *
 * @author zc-cris
 * @version 1.0
 **/
@SuppressWarnings("unused")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Book {
    private Integer isbn;
    private Integer stock;
    private Double price;
}
