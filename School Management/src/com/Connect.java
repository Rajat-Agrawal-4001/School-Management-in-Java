package com;

import java.sql.*;

public class Connect {

    public Connection c;
    public Statement st;

    public Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // registers driver class for mysql database

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
             System.out.println("connection established successfully.");
            st = c.createStatement();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}

