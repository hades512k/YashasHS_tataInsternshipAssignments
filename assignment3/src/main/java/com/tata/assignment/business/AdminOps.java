package com.tata.assignment.business;

import com.tata.assignment.dao.AdminDao;
import com.tata.assignment.dao.AdminDaoImpl;
import com.tata.assignment.entities.Admin;
import com.tata.assignment.entities.Product;
import com.tata.assignment.entities.ShoppingCart;
import com.tata.assignment.entities.Transactions;

import java.sql.Date;
import java.sql.SQLException;

public class AdminOps {
    AdminDao adminDao = new AdminDaoImpl();
    public void addProducts(){
        //adding product
        Product product = new Product(Date.valueOf("2021-02-25"),"/imgs/img1.jpg",1,"toy",100,10);
        product.setCategoryId(10);
        product.setName("Kids");
        try{
            adminDao.addProduct(product);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void updateProducts(){
        Product product = new Product(Date.valueOf("2000-01-05"),"/imgs/img2.jpg",1,"kitchen",1000,2);
        product.setCategoryId(5);
        product.setName("appliance");
        try{
            adminDao.updateProduct(product);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void updateAdminAccount(){
        Admin admin = new Admin("root","toor",101);
        try {
            adminDao.updateAccount(admin);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void getTransaction(int id) throws SQLException {
        Transactions transactions = adminDao.getTransactionbyId(id);

        System.out.println("Tx Id : "+ transactions.getTransactionId() + " "+"tx Date : "+transactions.getDate()+" "+"tx quantity : "+transactions.getQuantity()+" Product Name : "+transactions.getProductName());
    }
}
