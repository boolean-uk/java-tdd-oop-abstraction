package com.booleanuk.core;

import java.util.ArrayList;

public class AccountManager {

    private ArrayList<Account> accountList;

    public AccountManager(){
        accountList = new ArrayList<>();
    }

    public Boolean addAccount(String email, String password){
        if(!email.contains("@")){
            System.out.println("Invalid Email doesn't contain @");
            return false;
        }else if (password.length() < 8){
            System.out.println("Password not strong enough");
            return false;
        }
        accountList.add(new Account(email, password));
        System.out.println("Account successfully created");
        return true;
    }

    public Boolean login(String email, String password){
        for (Account account: accountList){
            if (account.getEmail().equals(email) && account.getPassword().equals(password) && !account.getActive()){
                System.out.println("ACCOUNT DISABLED");
                return false;
            }else if(account.getEmail().equals(email) && account.getPassword().equals(password)){
                System.out.println("Login successful");
                return true;
            }
        }
        return false;
    }

    public void toggleActive(String email){
        for (Account a: accountList){
            if(a.getEmail().equals(email)){
                a.toggleActive();
            }
        }
    }


}
