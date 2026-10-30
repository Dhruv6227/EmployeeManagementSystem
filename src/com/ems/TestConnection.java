package com.ems;

import java.sql.Connection;
import java.sql.SQLException;

import com.ems.util.DatabaseConnection;

public class TestConnection {

    public static void main(String[] args) {

        try (Connection con = DatabaseConnection.getConnection()) {

            System.out.println("MySQL connected successfully!");
            System.out.println("Database: " + con.getCatalog());

        } catch (SQLException e) {

            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
// test connection is used for the connection if the connection is established or not. 
