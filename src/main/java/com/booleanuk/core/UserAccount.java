package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        setEmail(email);
        setPassword( password);
        this.enabled=false;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        if (!email.contains("@")){
            System.out.println("Invalid mail!");
            return;
        }
        this.email=email;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        if (password.length()<8){
            System.out.println("Password should min. consist of 8 characters!");
            return;
        }
        this.password=password;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled() {
        this.enabled = !isEnabled();
    }
    public void logIn() {

    }
}
