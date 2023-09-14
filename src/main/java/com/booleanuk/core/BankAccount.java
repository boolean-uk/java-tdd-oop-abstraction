package com.booleanuk.core;

public class BankAccount {
    private int balance;

    public BankAccount(double openingBalance) {
        this.setBalance(openingBalance);
    }

    public void depositAmount(double deposit) {
        double newTotal = this.getBalance() + deposit;
        this.setBalance(newTotal);
    }

    public double getBalance() {
        return this.balance/100.0;
    }

     private void setBalance(double balance) {
        this.balance = (int) (balance * 100);
    }
}
