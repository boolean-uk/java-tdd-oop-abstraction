package com.booleanuk.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount {

    private String email;
    private String password;
    private boolean enabledAccount = false;

    public UserAccount() {}

    public UserAccount(String email, String password, boolean enabledAccount) {
        this.email = email;
        this.password = password;
        this.enabledAccount = enabledAccount;
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

    public boolean getIsEnabledAccount() {
        return enabledAccount;
    }

    public void setEnabledAccount(boolean enabledAccount) {
        this.enabledAccount = enabledAccount;
    }

    public String isValidEmail() {
        String email = getEmail();
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return "Valid email";
        }
        return "Invalid email";
    }

    public String isPasswordValid() {
        String password = getPassword();
        Pattern pattern = Pattern.compile("^.{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return "Valid Password";
        }
        return "Invalid Password";
    }

    public String canLogIn() {
        if (getIsEnabledAccount()) {
            return "User can log in";
        }
        return "User cannot log in";
    }
}
