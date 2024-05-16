package com.example.demo7;

import java.sql.SQLException;
import java.util.Collection;

public class LoginBean {
    public boolean checkLogin(String usr, String pwd) {
        /*if (usr.equals(pwd)) {
            return true;
        }
        return false;*/
        Users user = new Users();
        user.setUsername(usr);
        user.setPassword(pwd);
        try {
            String result = loginPreparedStatement(user);
            return result.equals("Login successful!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //Step 2. Instance of Model

    public String loginStatementController(Users user) throws SQLException {
        //Step 2
        //  String message = login.checkLoginStatement(user);
        //Step 3. Return to view
        // return message;
        return null;
    }

    public String loginPreparedStatement(Users user) throws SQLException {
        //Step 2,3
        LoginDaoImpl login = new LoginDaoImpl();
        return login.checkLoginPreparedStatement(user);
    }


}
