package com.example.demo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionDB {

    public static Connection getMySQLConnection() throws SQLException {
        Connection conn = null;
        String hostName = "localhost"; //127.0.0.1
        String dbName = "fptaptech2024";
        String username = "root";
        String password = "";
        String connURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            conn = DriverManager.getConnection(connURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

        return conn;
    }

    public static void main(String[] args) throws SQLException {
        if (getMySQLConnection() != null) {
            System.out.println("Kết nối thành công!");
        }
    }
}
