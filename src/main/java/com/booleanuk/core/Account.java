package com.booleanuk.core;

public class Account {

    private String email;


    private String password;

    private boolean enabled;

    public Account(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.enabled = false;

    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(String email) {
        if(email.contains("@")) {
            this.email = email;
            return "valid email";
        }
        return "invalid email";
    }

    public String getPassword() {
        return this.password;
    }

    public String setPassword(String password) {
        if(password.length() >= 8) {
            this.password = password;
            return "valid password";
        }
        return "invalid password";
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String ableToLogin() {
        if(this.isEnabled()) {
            return "valid login";
        }
        return "invalid login";

    }
}
