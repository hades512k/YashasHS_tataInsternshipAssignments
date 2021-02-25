package com.tata.assignment.dao;

import com.tata.assignment.entities.Product;

import java.sql.SQLException;
import java.util.List;

public interface CartDao {
    int displayAmount() throws SQLException;
    List<Product> displayCart() throws SQLException;
}
