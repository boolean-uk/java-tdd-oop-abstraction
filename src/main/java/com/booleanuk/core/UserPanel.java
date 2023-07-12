package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class UserPanel {
    private List<UserAccount> userAccounts = new ArrayList<>();

    public String createAccount(String email, String password) {
        if (!isPasswordCorrect(password)) {
            return "invalid password";
        }

        if (!isEmailCorrect(email)) {
            return "invalid email";
        }

        UserAccount userAccount = new UserAccount(email, password);
        userAccounts.add(userAccount);
        return "account created";
    }

    private boolean isPasswordCorrect(String password) {
        return password.length() >= 8;
    }

    private boolean isEmailCorrect(String email) {
        return email.matches("^.+@.+$");
    }

    public List<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public boolean login(String mail, String password) {
        UserAccount userAccount = userAccounts.stream()
                .filter(account -> account.getEmail().equals(mail) && account.getPassword().equals(password))
                .findFirst().orElse(null);
        if (userAccount == null) {
            throw new IllegalArgumentException();
        }
        return userAccount.isEnabled();
    }
}
