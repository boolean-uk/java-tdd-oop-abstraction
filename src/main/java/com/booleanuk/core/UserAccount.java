package com.booleanuk.core;

public class UserAccount {

    private String email;
    private String password;
    private boolean enabled;


    //initialization values
    public UserAccount() {
        this.email = "";
        this.password = "";
        this.enabled = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email not contains @");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()<8){
            System.out.println("Password mustnot be less than 8 characters");
        } else {
            this.password = password;
        }
    }
}
