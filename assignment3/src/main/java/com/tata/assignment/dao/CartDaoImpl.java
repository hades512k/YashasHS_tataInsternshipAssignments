package com.tata.assignment.dao;

import com.tata.assignment.entities.Product;
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
        return total;
    }

    @Override
    public List<Product> displayCart() throws SQLException {
        String display = resourceBundle.getString("selectCart");
        Statement st;
        ResultSet rs;
        Product product;
        List<Product> cartContents = null;

            conn = PostgresHelper.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(display);
            cartContents = new  ArrayList<Product>();
            while (rs.next()) {
                product = new Product();
                product.setProductId(rs.getInt(1));
                product.setName(rs.getString(2));
                product.setPrice(rs.getInt(3));
                product.setQuantity(rs.getInt(4));

                cartContents.add(product);
                product = null;
            }
            conn.close();

        return cartContents;
    }
}
