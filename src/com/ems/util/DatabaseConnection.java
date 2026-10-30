package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/employee_management";

    private static final String USER = "ems_user";

    private static final String PASSWORD =
            "ChangeThis_StrongPassword123!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
//util is short for utilities.
//A utility package contains reusable helper classes that support different parts of your application.
//In our project, DatabaseConnection.java belongs here.

//Its responsibility is to establish a connection to MySQL.