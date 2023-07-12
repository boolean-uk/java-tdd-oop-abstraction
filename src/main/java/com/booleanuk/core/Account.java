package com.booleanuk.core;

public class Account {
    private String email;
    private String password;
    private boolean isEnabled;

    public Account(String email, String password) {
        validateEmail(email);
        validatePassword(password);

        this.email = email;
        this.password = password;
        this.isEnabled = false;
    }

    public void enable() {
        isEnabled = true;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    private void validateEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Incorrect email. It must contain @");
        }
    }

    private void validatePassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Incorrect password. It must be 8 characters or more.");
        }
    }
}
