package com.tata.assignment.business;

import com.tata.assignment.dao.AdminDao;
import com.tata.assignment.dao.AdminDaoImpl;
import com.tata.assignment.dao.ProductDao;
import com.tata.assignment.entities.Product;

import java.sql.Date;
import java.util.List;

public class ShoppingDenApp {
    public static void main(String[] args) {
        AdminOps adminOps = new AdminOps();
        CartOps cartOps = new CartOps();
        CustomerOps customerOps = new CustomerOps();
        ProductOps productOps = new ProductOps();
        try {
            //adminOps.addProducts();
            //adminOps.updateProducts();
            adminOps.updateAdminAccount();
            cartOps.displayCart();
            System.out.println("Total amount of cart is : " + cartOps.displayTotal());

            customerOps.addToCart();

            productOps.displayProducts();
        }
        catch (Exception e){

        }
        }
    }
