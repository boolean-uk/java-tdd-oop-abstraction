package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean isDisabled;

    public UserAccount(String email, String password) {
        setEmail(email);
        setPassword(password);
        this.isDisabled = true;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        if (password.length() < 8)
        this.password = password;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void toggleAvailability() {
        isDisabled = !isDisabled;
    }

    public String login(String email, String password) {
        return "";
    }
}
