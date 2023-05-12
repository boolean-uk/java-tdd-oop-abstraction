package com.booleanuk.core;

public class BankAccount {
    private int balance;
    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.setBalance(balance);
    }

    public double getBalance() {
        return balance/100.0;
    }

    public void setBalance(double balance) {
        this.balance = (int)(balance*100);
    }
    public void setBalance(int balance) {
        this.balance = balance*100;
    }
}
