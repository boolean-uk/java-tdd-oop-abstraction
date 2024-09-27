package com.booleanuk.core;
public class UserAccount {
    private String email;
    private String password;
    private boolean isActive;

    public UserAccount(String password, String email){
        this.setPassword(password);
        this.setEmail(email);
        isActive = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")){
            System.out.println("invalid email");
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 8)
            System.out.println("invalid password");
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive() {
        isActive = !isActive;
    }

    public String checkIfAbleToLogIn(){
        if(isActive){
            return "User able to log in";
        }
        else return "User not able to log in";
    }
}
