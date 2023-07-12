package com.booleanuk.core;

public class User {
    private String username;
    private String email;
    private String password;
    private boolean active = false;

    public User(String username, String email, String password) {
        // TODO
    }

    public boolean isEnabled() {
        // TODO
        return false;
    }

    public void enable() {
        // TODO
    }

    public void disable() {
        // TODO
    }

    private boolean isEmailValid(String email) {
        // TODO
        return false;
    }

    private boolean isPasswordValid(String password) {
        // TODO
        return false;
    }
}
