package com.tata.assignment.dao;

import com.tata.assignment.entities.ShoppingCart;
import com.tata.assignment.helpers.PostgresHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CartDaoImpl implements CartDao{
    ResourceBundle resourceBundle;
    Connection conn;
    public CartDaoImpl(){
        resourceBundle =ResourceBundle.getBundle("db");
    }

    @Override
    public int displayAmount() throws SQLException{
         int total = 0;
        String display = resourceBundle.getString("selectPrice");
        Statement st;
        ResultSet rs;
        conn = PostgresHelper.getConnection();
        st = conn.createStatement();
        rs = st.executeQuery(display);
        while (rs.next()) {
            total += (rs.getInt(1) * rs.getInt(2));
        }
        conn.close();
        return total;
    }

    @Override
    public List<ShoppingCart> displayCart() throws SQLException {
        String display = resourceBundle.getString("selectCart");
        Statement st;
        ResultSet rs;
        ShoppingCart cart;
        List<ShoppingCart> cartContents = null;

            conn = PostgresHelper.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(display);
            cartContents = new  ArrayList<ShoppingCart>();
            while (rs.next()) {
                cart = new ShoppingCart();
                cart.setProductId(rs.getInt(1));
                cart.setProductName(rs.getString(2));
                cart.setPrice(rs.getInt(3));
                cart.setQuantity(rs.getInt(4));
                cart.setTempItemId(rs.getInt(5));
                cartContents.add(cart);
                cart = null;
            }
            conn.close();

        return cartContents;
    }
}
