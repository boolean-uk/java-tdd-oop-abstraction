package com.booleanuk.core;

public class Account {

    private Boolean active;
    private String email;
    private String password;

    public Account(String email, String password) {
        this.active = false;
        this.email = email;
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void toggleActive() {
        this.active = !active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
