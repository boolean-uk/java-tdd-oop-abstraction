package com.booleanuk.core;

public class User {
    private String email;
    private String password;
    private boolean isEnabled;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.isEnabled = false;
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

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
