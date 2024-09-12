package com.booleanuk.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private String email;
    private String password;
    private Boolean enabled;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validatePassword(password);
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Account(String email, String password) {
        if (validateEmail(email)){
            this.email = email;
        }
        if (validatePassword(password)){
            this.password = password;
        }
        this.enabled = false;
    }
    private Boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email");
            return true;
        }
        System.out.println("Invalid email");
        return false;
    }
    private Boolean validatePassword(String password){
        Pattern pattern = Pattern.compile("^.{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid password");
            return true;
        }
        System.out.println("Invaldi password");
        return false;
    }
    private String activeAccount(){
        if (getEnabled()){
            return "Account is enabled";
        }
        return "Account is disabled";
    }
}
