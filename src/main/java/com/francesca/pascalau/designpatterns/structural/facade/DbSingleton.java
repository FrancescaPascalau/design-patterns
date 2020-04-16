package com.francesca.pascalau.designpatterns.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static DbSingleton instance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/jdbc";
    private String username = "root";
    private String password = "localhost";

    private DbSingleton() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            try {
                instance = new DbSingleton();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (instance.getConnection().isClosed()) {
                    instance = new DbSingleton();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
