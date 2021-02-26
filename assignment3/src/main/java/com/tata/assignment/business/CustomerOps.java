package com.tata.assignment.business;

import com.tata.assignment.dao.CustomerDao;
import com.tata.assignment.dao.CustomerDaoImpl;
import com.tata.assignment.entities.Product;

import java.sql.Date;
import java.sql.SQLException;

public class CustomerOps {
    CustomerDao customerDao = new CustomerDaoImpl();
    Product product = new Product(Date.valueOf("2021-01-05"),"",984,"Batteries",1999,1);
    public void addToCart() throws SQLException {
        customerDao.addToCart(product);
    }

    public boolean login(int userid, String pswd) throws SQLException{
        return customerDao.verifyLogin(userid,pswd);
    }
}
