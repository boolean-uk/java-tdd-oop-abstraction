package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
        this.enabled=false;
    }

    public String getEmail(){
        return "anything@gmail.com";
    }
}
