package com.booleanuk.core;

public class User { // can also include a class called manager that has many users.
    UserAccount account;
    public User(String email, String password){
        this.account = new UserAccount(email, password);
        if(this.account.getEmail()==null) {
            System.out.println("Invalid email. Will use random.");
            this.account.setEmail("Random@gmail.com");
        }
        if(this.account.getPassword()==null){
            System.out.println("Invalid password. Will use random.");
            this.account.setPassword("123456789");
        }
    }
}
