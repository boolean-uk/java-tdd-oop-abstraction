package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabledOrDisabled = false;

    //constructor
    public UserAccount(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
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

    public boolean isEnabledOrDisabled() {
        return enabledOrDisabled;
    }

    public void setEnabledOrDisabled(boolean enabledOrDisabled) {
        this.enabledOrDisabled = enabledOrDisabled;
    }
}
