package com.booleanuk.core;

public class User {
    private String address;
    private String password;

    public String setEmail(String address) {
        if (address.contains("@")) {
            this.address = address;
            return "correct email";
        } else return "invalid email";
    }

    public String setPassword(String password) {
        if(password.length() < 8){
            return "invalid password";
        }else{
            this.password = password;
            return "correct password";
        }

    }

}
