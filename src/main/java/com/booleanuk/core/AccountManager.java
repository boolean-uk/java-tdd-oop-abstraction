package com.booleanuk.core;

import java.util.ArrayList;

public class AccountManager {
    private ArrayList<Account> accounts;
    public AccountManager(){
        accounts = new ArrayList<>();
    }
    public String createUser(String email, String password){
        if(!email.contains("@")){
            return "invalid email";
        }
        else if(password.length() < 8){
            return "invalid password";
        }
        accounts.add(new Account(email, password));
        return "account created";
    }
    public String loginUser(String email, String password) {
        for (Account a : accounts) {
            if (a.getEmail().equals(email) && a.isDisabled()) {
                return "account disabled";
            } else if (a.getEmail().equals(email) && a.getPassword().equals(password)) {
                return "login success";
            }


        }
        return "user not found";
    }
    public void toggleUserDisabled(String email){
        for(Account a : accounts ){
            if(a.getEmail().equals(email)){
                a.toggleDisabled();
                return;
            }
        }
    }
    public Account getAccountByEmail(String email) {
        for(Account a : accounts){
            if(a.getEmail().equals(email)){
                return a;
            }
        }
        return null;
    }


}
