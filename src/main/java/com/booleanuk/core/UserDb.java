package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class UserDb {
    private List<User> users = new ArrayList<>();


    public void createUser(String email, String password) {
        if(validateEmail(email) && validatePassword(password))
            users.add(new User(email, password));
    }

    public List<User> getUsers() {
        return users;
    }

    public boolean login(User user) {
        return user.isActive();
    }

    public boolean validateEmail(String mail) {
        return mail.contains("@");
    }

    public boolean validatePassword(String password) {
        return password.length() >= 8;
    }
}
