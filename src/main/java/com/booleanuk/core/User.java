package com.booleanuk.core;

public class User {
    private Account account;

    public void createAccount(String email, String password) {
        this.account = new Account(email, password);
    }

    public boolean canLogIn() {
        return this.account.getStatus().equals("Enabled");
    }

    public Account getAccount() {
        return this.account;
    }
}
