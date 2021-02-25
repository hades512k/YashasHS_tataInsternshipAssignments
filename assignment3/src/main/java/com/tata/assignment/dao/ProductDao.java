package com.tata.assignment.dao;

import com.tata.assignment.entities.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    List<Product> display() throws SQLException;
}
