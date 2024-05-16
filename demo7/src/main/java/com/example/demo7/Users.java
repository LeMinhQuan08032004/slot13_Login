package com.example.demo7;

public class Users {
    private int id;
    private String username;
    private String password;

    public Users(String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Users() {

    }

    public int getUser_id() {
        return id;
    }

    public void setUser_id(int user_id) {
        this.id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
