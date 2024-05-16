package com.example.demo7;

import java.sql.SQLException;

import com.example.demo7.Users;

public interface LoginDAO {
    public String checkLoginStatement(Users user) throws SQLException;

    public String checkLoginPreparedStatement(Users user) throws SQLException;
}
