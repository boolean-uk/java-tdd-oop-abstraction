package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Optional;

public class Account {
    final static ArrayList<Account> accounts = new ArrayList<>();
    private boolean enabled;
    final String email;
    final String password;

    public void enable() { this.enabled = true; }

    private Account(String email, String password) {
        this.enabled = false;
        this.email = email;
        this.password = password;
    }

    public static boolean create(String email, String password) {
        if(emailInvalid(email)) return false;
        if(passwordInvalid(password)) return false;

        accounts.add(new Account(email, password));
        return true;
    }

    private static boolean emailInvalid(String email) {
        if(!email.contains("@")) return true;

        return false;
    }

    private static boolean passwordInvalid(String password) {
        if(password.length() < 8) return true;

        return false;
    }

    public static boolean login(String email, String password) {
        Optional<Account> account = accounts.stream().filter(x -> x.email.equals(email)).findFirst();
        if(account.isEmpty()) return false;

        if(!account.get().password.equals(password)) return false;

        if(!account.get().enabled) return false;

        return true;
    }

    public static Account getAccountByEmail(String email) {
        return accounts.stream().filter(x -> x.email.equals(email)).findFirst().orElse(null);
    }
}
