package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
        enabled = false;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
