package com.tata.assignment.dao;

import com.tata.assignment.entities.ShoppingCart;

import java.sql.SQLException;
import java.util.List;

public interface CartDao {
    int displayAmount() throws SQLException;
    List<ShoppingCart> displayCart() throws SQLException;
}
