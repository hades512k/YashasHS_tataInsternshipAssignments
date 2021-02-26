package com.tata.assignment.entities;

import lombok.Data;

@Data
public class ShoppingCart {
    private long productId;
    private String productName;
    private int price;
    private int quantity;
    private int tempItemId;
}
