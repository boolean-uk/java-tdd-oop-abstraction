package com.booleanuk.core;

import java.util.HashMap;

public class SystemDB {
    private HashMap<String, String> user;
    private HashMap<String, Boolean> activated;

    public SystemDB() {
        user = new HashMap<>();
        activated = new HashMap<>();
    }

    public boolean createUser(String email, String password) {
        if (password.length() < 8 || !email.contains("@")) {
            return false;
        }
        user.put(email, password);
        activated.put(email, false);
        System.out.println("User " + email + " was created.");
        return true;
    }

    public boolean activateUser(String email) {
        if (!user.containsKey(email)) {
            return false;
        }
        activated.replace(email,true);
        java.lang.System.out.println("User "+ email +" was activated");
        return true;
    }

    public boolean amIActivated(String email) {
        if (!user.containsKey(email)) {
            return false;
        }
        activated.get(email);
        return false;
    }

    public HashMap<String, String> getUser() {
        return user;
    }
}
