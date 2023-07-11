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
        if (email.contains("@")){
            this.email = email;
        }else {
            System.out.println("Email must contain @ for a valid email address.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8){
            this.password = password;
        } else {
            System.out.println("Password must contain 8 or more characters.");
        }
    }

    public boolean isEnabledOrDisabled() {
        return enabledOrDisabled;
    }

    public void setEnabledOrDisabled(boolean enabledOrDisabled) {
        this.enabledOrDisabled = enabledOrDisabled;
    }
}
