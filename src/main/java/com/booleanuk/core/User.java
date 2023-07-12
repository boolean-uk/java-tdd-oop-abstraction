package com.booleanuk.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private String email;
    private String password;
    private boolean active = false;

    public User(String username, String email, String password) {
        if (!isEmailValid(email)) {
            throw new IllegalArgumentException(String.format("Email must contain '@' [was: %s]", email));
        }
        if (!isPasswordValid(password)) {
            throw new IllegalArgumentException(String.format("Password must be at least 8 characters long [was %s]", password));
        }

        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean isEnabled() {
        return active;
    }

    public void enable() {
        if (active) {
            System.err.printf("%s: This account is already enabled", this);
        }
        active = true;
    }

    public void disable() {
        if (!active) {
            System.err.printf("%s: This account is disabled", this);
        }
        active = false;
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password.length() >= 8;
    }
}
