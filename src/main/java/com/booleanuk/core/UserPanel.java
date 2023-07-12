package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class UserPanel {
    List<UserAccount> userAccounts = new ArrayList<>();

    public String createAccount(String mail, String password) {
        if (!isPasswordCorrect(password)) {
            return "invalid password";
        }

        UserAccount userAccount = new UserAccount(mail, password);
        userAccounts.add(userAccount);
        return "account created";
    }

    private boolean isPasswordCorrect(String password) {
        return password.length() >= 8;
    }
}
