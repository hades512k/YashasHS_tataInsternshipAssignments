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
            //admin operations

            adminOps.addProducts(); //add products
            adminOps.updateProducts(); //update existing product
            adminOps.updateAdminAccount(); //update admin product

            System.out.println("Transaction Details");
            adminOps.getTransaction(1); //get  transaction from id

            System.out.println("Cart Contents :-");
            //cart operations
            cartOps.displayCart(); //display cart contents
            System.out.println();
            System.out.println("Total amount of cart is : " + cartOps.displayTotal()); //display total amount

            //customer operations
            customerOps.addToCart(); //add product to cart

            System.out.println();
            System.out.println("Logging in...");
            //verify login
            if(customerOps.login(1,"root"))
                System.out.println("Login successful");
            else
                System.out.println("Login failed");
            System.out.println()
            System.out.println("Display all products");
            productOps.displayProducts();
        }
        catch (Exception e){
            System.out.println(e);
        }
        }
    }
