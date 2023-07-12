package com.booleanuk.core;

import java.util.Scanner;

public class Account {
    private String email;
    private String password;
    private boolean active;

    Account(String email, String password) {
        Scanner input = new Scanner(System.in);
        while(!setEmail(email))
            email = input.nextLine();
        while(!setPassword(password))
            password = input.nextLine();
        this.active = false;
    }
    public boolean setPassword(String password) {
        if(password.length() < 8){
            System.out.println("invalid password");
            return false;
        }
        this.password = password;
        return true;
    }
    public String getPassword() {
        return this.password;
    }
    public boolean setEmail(String email) {
        if(!email.contains("@")) {
            System.out.println("invalid email");
            return false;
        }
        this.email = email;
        return true;
    }
    public String getEmail() {
        return this.email;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public boolean isActive() {
        return this.active;
    }
}
