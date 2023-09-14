package com.booleanuk.core;

public class User {
    private String email;
    private String password;
    private boolean enabled;

    public User() {
        this.enabled = false;
    }

    public String getEmail() {
        return email;
    }

    public String  setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return "Email registered";
        } else {
            return "Invalid Email";
        }
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        if (password.length() <= 8) {
            this.password = password;
            return "Password Registered";
        } else {
            return "Invalid Password";
        }
    }

    public void setEnabled(boolean status) {
        this.enabled=status;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public boolean logIn() {
        if (this.enabled) {
            return true;
        } else {
            return false;
        }
    }
}
