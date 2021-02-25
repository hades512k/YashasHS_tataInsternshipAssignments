package com.tata.assignment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Category{
    private Date date;
    private String imgUrl;
    private int productId;
    private String productName;
    private int price;
    private int quantity;
}
