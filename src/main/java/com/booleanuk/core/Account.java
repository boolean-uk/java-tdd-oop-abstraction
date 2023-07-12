package com.booleanuk.core;

public class Account {
    private String email;
    private String password;
    private String status;

    public Account(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.setStatus("Disabled");
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
