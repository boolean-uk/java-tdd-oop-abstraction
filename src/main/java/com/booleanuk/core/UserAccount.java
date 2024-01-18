package com.booleanuk.core;

public class UserAccount {

    private String email;
    private String password;
    private boolean enabled;
    private boolean loggedIn;

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
        this.enabled = false;
        this.loggedIn = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() >= 8) {
            this.password = password;
        }
    }

    public void enableAccount() {
        this.enabled = true;
    }

    public void disableAccount() {
        this.enabled = false;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void logIn(String email, String password) {
        if(!this.loggedIn) {
            if (this.enabled) {
                if(this.email.equals(email) && this.password.equals(password)) {
                    this.loggedIn = true;
                }
            }
            this.loggedIn = false;
        }
    }

    public boolean isLoggedIn() {
        return this.loggedIn;
    }

}
