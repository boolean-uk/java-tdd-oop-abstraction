package com.booleanuk.core;

public class Account {
    private String email;
    private String password;
    private Boolean status;
    private String error;

    public Account(String email, String password) {
        this.email = verifyEmail(email);
        this.password = verifyPassword(password);
        this.status = false;
    }

    private String verifyEmail(String email) {
        return email;
    }

    private String verifyPassword(String password) {
        return password;
    }

    public Boolean canLogIn() {
        return this.status;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
