package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean status;

    public UserAccount(){

    }

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
        this.status = false;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        if(!email.contains("@")){
            return "Invalid email";
        }
        this.email = email;
        return "Your email is set: " + this.email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        if(password.length()< 8){
            return "Invalid password";
        }
        this.password = password;
        return "Your password is set: " + this.password;
    }

    public boolean isStatus() {
        return status;
    }

    public String enable(){
        this.status = true;
        return "The status is enabled";
    }
}
