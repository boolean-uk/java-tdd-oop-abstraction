package com.booleanuk.core;

public class User {
    public String createUser(String email, String password) {
        if(email.contains("@") && password.length() >= 8){
            return "Account successfully created!";
        }

        return "";
    }
}
