package com.tata.assignment.business;

import com.tata.assignment.dao.CartDao;
import com.tata.assignment.dao.CartDaoImpl;
import com.tata.assignment.entities.ShoppingCart;

import java.sql.SQLException;
import java.util.List;

public class CartOps {
    CartDao cartDao = new CartDaoImpl();

    public void displayCart() throws SQLException {
        List<ShoppingCart> list = cartDao.displayCart();
        if (list == null)
            System.out.println("Empty cart");
        else
            for (ShoppingCart cartItems : list) {
                System.out.println(cartItems.getProductId() + " "+ cartItems.getProductName()+ " "+cartItems.getPrice()+" "+cartItems.getQuantity());
            }
    }

    public int displayTotal() throws SQLException{
        return cartDao.displayAmount();
    }
}
