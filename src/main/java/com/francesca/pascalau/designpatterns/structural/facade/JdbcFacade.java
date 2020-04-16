package com.francesca.pascalau.designpatterns.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER)");
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address (ID) values (1)");
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }


    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                Address address = new Address();
                address.setCity("Barcelona");

                addresses.add(address);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return addresses;
    }
}
