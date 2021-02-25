package com.tata.assignment.dao;

import com.tata.assignment.entities.Admin;
import com.tata.assignment.entities.Product;

import java.sql.SQLException;

public interface AdminDao {
    void addProduct(Product product) throws SQLException;
    void updateAccount(Admin admin) throws SQLException;
    void updateProduct(Product product);

}
