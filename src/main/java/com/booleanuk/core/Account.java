package com.booleanuk.core;

public class Account {
    private String email;
    private String password;
    private boolean status;

    public Account(String email, String password) throws Exception {
        this.setEmail(email);
        this.setPassword(password);
        this.status = false;
    }

    public void setEmail(String email) throws Exception {
        if (email.contains("@")){
            this.email = email;
        }

        // TODO:
        // Should return false if following domain model idea
        // Or throw an error instead of just printing out to the console.
//        System.out.println("ERROR: Email is not valid.");
        this.email = null;
        throw new Exception("ERROR: Email is not valid.");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
