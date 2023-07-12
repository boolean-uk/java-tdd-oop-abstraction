package com.booleanuk.core;

public class User {
    private boolean isDisabled;

    public String createUser(String email, String password) {
        if(email.contains("@") && password.length() >= 8){
            return "Account successfully created!";
        } else if(!email.contains("@")){
            return "Account not created! Invalid email!";
        }

        return "Account not created! Invalid password!";
    }

    public String showDisability() {
        return isDisabled ? "Account is enabled!" : "Account is disabled!";
    }
}
