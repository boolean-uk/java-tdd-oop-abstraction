package com.booleanuk.core;

import java.util.HashMap;

public class System1 {
    private HashMap<String,User> users;

    public System1() {
        this.users = new HashMap<>();
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public boolean checkEmail(String email){


        return email.contains("@");
    }
    public boolean checkPassword(String password){
        return password.length()>=8;
    }

    public boolean addUser(String email, String password) {
        if(this.users.containsKey(email)){
            return false;
        }
        User newUser = new User(email,password);
        this.users.put(email,newUser);
        return true;

    }
}
