package com.booleanuk.core;

public abstract class User {

    private String email;
    private String password;
    private boolean isEnabled = false;

    public User(String email, String password) {

        if (!isEmailValid(email)) {
            throw new IllegalArgumentException("Email doesn't contain @");
        }
        if (!isPasswordValid(password)) {
            throw new IllegalArgumentException("Password is too short!");
        }

        this.email = email;
        this.password = password;
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

    boolean isPasswordValid(String password) {
        return password.length() >= 8;
    }

    boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public String isAbleToLogIn() {
        if (!isEnabled) {
            return "You can't log in!";
        }
        return "You can log in";
    }


}
