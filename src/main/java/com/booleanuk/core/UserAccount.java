package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean status;

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
        this.status = false;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (password.length()>=8) {
            this.password = password;
            return true;
        }
        return false;

    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
