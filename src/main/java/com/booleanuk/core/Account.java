package com.booleanuk.core;

import java.util.HashMap;

public class Account {
    private HashMap<String, String[]> users;

    public Account() {
        this.users = new HashMap<>();
    }

    public String createAccount(String email, String password) {
        String result = "";
        if (!email.contains("@")) {
            result = "invalid email";
            return result;
        }

        if (password.length() < 8) {
            result = "invalid password";
            return result;
        }

        String[] value = {password, "disabled"};
        users.put(email, value);
        result = "Account successfully added";
        return result;
    }

    public Boolean enableAccount(String email, String password) {
        if (!users.containsKey(email))
            return false;
        if (!users.get(email)[0].equals(password))
            return false;
        String[] value = {users.get(email)[0], "enabled"};
        users.replace(email, value);
        return true;
    }

    public String logIn(String email, String password) {
        String result = "";
        if (!users.containsKey(email)) {
            result = "invalid email";
        }
        if (!users.get(email)[0].equals(password)) {
            result = "invalid password";
        }
        if (users.get(email)[1].equals("disabled")) {
            result = "Disabled Account";
        }
        return result;
    }


}
