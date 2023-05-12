package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;

    public UserManager(){
        this.users = new ArrayList<>();
    }
    public UserManager(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean createUser(String mail, String password) {
        if (!mail.contains("@")) {
            System.out.println("Email is not valid");
            return false;
        }
        if (password.length() < 8) {
            System.out.println("Password is too short");
            return false;
        }

        users.add(new User(mail, password));
        return true;
    }

    public boolean canLogin(String mail) {
        for (User user: users) {
            if (user.getEmail().equals(mail)) {
                return user.isEnabled();
            }
        }
        return false;
    }

    public User login(String email, String password) {

        for(User user: this.users){
            if(user.getEmail().equals(email)){
                if(user.getPassword().equals(password) && user.isEnabled()) return user;
            }
        }
        return null;
    }
}
