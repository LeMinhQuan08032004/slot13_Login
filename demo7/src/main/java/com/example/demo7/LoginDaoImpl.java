package com.example.demo7;

import java.sql.*;
import java.sql.Connection;

public class LoginDaoImpl implements LoginDAO {

    private static final Connection conn;

    static {
        try {
            conn = MySQLConnectionDB.getMySQLConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String checkLoginStatement(Users user) throws SQLException {
        // Đoạn code đã triển khai phương thức checkLoginStatement ở trên
        return "";
    }

    @Override
    public String checkLoginPreparedStatement(Users user) throws SQLException {
        String username = user.getUsername();
        String password = user.getPassword();

        String query = "SELECT * FROM accout WHERE username=? AND password=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return "Login successful!";
        } else {
            return "Login failed!";
        }
    }
}
