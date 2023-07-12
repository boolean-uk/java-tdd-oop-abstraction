package com.booleanuk.core;

public class UserPanel {
    public UserAccount createAccount(String mail, String password) {
        return new UserAccount(mail, password);
    }
}
