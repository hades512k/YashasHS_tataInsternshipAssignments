package com.tata.assignment.entities;

import lombok.Data;

import java.sql.Date;

@Data
public class Transactions {
    private Date date;
    private int productId;
    private int quantity;
    private String productName;
    private float price;
    private int transactionId;
}
