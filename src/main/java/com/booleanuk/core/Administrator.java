package com.booleanuk.core;

public class Administrator extends User{
    public Administrator(String email, String password) {
        super(email, password);
        this.setEnabled(true);
    }

    public void activateAccount(User user)
    {
        user.setEnabled(true);
    }
}
