package com.booleanuk.core;

public class Account {
    private String email;
    private String password;
    private Boolean status;

    public Account(String email, String password) {
        this.email = verifyEmail(email);
        this.password = verifyPassword(password);
        this.status = false;
    }

    private String verifyEmail(String email) {
        if (!email.contains("@")) {
            return "invalid email";
        }
        return email;
    }

    private String verifyPassword(String password) {
        if (password.length() < 8) {
            return "invalid password";
        }
        return password;
    }

    public Boolean canLogIn() {
        return this.status;
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

    public void setStatus(Boolean status) {
        if (!this.email.equals("invalid email") && !this.password.equals("invalid password"))
            this.status = status;
    }
}
