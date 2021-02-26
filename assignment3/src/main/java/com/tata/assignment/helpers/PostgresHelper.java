package com.tata.assignment.helpers;

import java.sql.*;
import java.util.ResourceBundle;

public class PostgresHelper {
    private static ResourceBundle resourceBundle;
    private static Connection conn;

    public static Connection getConnection(){

        resourceBundle = ResourceBundle.getBundle("db");
        String url = resourceBundle.getString("url");
        String username = resourceBundle.getString("username");
        String password = resourceBundle.getString("password");
        try {
            conn = DriverManager.getConnection(url,username,password);
        }
        catch (SQLException exception){
            System.out.println("connection failed");
        }
        return conn;
    }
}
