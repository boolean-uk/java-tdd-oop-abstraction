package com.booleanuk.core;


public class Account {
    private String email;
    private String password;
    private boolean disabled;
    public Account(String email, String password){
        this.email = email;
        this.password = password;
        this.disabled = true;
    }
    public void toggleDisabled(){
        this.disabled = !disabled;
    }
    public boolean isDisabled() {
        return disabled;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
