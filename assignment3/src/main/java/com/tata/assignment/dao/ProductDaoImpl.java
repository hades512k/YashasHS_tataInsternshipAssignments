package com.tata.assignment.dao;

import com.tata.assignment.entities.Product;
import com.tata.assignment.helpers.PostgresHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ProductDaoImpl implements ProductDao{
    Connection conn;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
    List<Product> list = null;

    @Override
    public List<Product> display() throws SQLException {
        conn = PostgresHelper.getConnection();
        String query = resourceBundle.getString("selectProduct");
        Product product;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        list = new ArrayList<Product>();
        while (rs.next()){
            product = new Product();
            product.setProductId(rs.getInt(1));
            product.setDate(rs.getDate(2));
            product.setImgUrl(rs.getString(3));
            product.setProductName(rs.getString(4));
            product.setPrice(rs.getInt(5));
            product.setQuantity(rs.getInt(6));
            product.setCategoryId(rs.getInt(7));

            list.add(product);

            product = null;
        }
        conn.close();
        return list;
    }
}
