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
        return this.email;
    }

    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        }
        System.out.println("Invalid email format");
        return false;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean setPassword(String password) {
        if (password.length()>=8) {
            this.password = password;
            return true;
        }
        System.out.println("Password should be at least 8 characters");
        return false;

    }

    public boolean getStatus() {
        System.out.println(this.status ? "Your account is active. You can now log in." : "Your account hasn't been activated yet");
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
