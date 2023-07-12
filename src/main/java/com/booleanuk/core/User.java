package com.booleanuk.core;

import com.booleanuk.core.System1;
public class User {
    private String email;
    private String password;
    private boolean isEnabled;
    System1 system1 = new System1();


    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.isEnabled = false;
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

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String createAccount(String email, String password) {
        if(!system1.checkEmail(email))
            return "Invalid email";
        if(!system1.checkPassword(password))
            return "Invalid password";

        if(system1.addUser(email,password))
            return "Account Created";

        return "User Exists";
    }
}
