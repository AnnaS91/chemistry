package com.epam.chemistry.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by мвидео on 03.09.2016.
 */
public class SQLConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/chemistry";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin";

    private static SQLConnection instance;

    public static SQLConnection getInstance(){
        if (instance == null){
            instance = new SQLConnection();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private SQLConnection(){}

}
