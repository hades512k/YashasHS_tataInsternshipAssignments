package com.tata.assignment.dao;

import com.tata.assignment.entities.Product;

import java.sql.SQLException;

public interface CustomerDao {
    void addToCart(Product product) throws SQLException;
}
