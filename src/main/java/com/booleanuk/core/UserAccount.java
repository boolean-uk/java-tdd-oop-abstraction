package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        setEmail(email);
        this.password = password;
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
        return "12345678";
    }
}
