package com.booleanuk.core;

public class Main {

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(100.15);
        System.out.println("You have "+myAccount.getBalance()+"$ in your account");
    }
}
