package com.booleanuk.core;


public class UserAccount {
    private String email;
    private String password;
    private boolean isDisabled;

    public UserAccount(String email, String password) {
        setEmail(email);
        setPassword(password);
        this.isDisabled = true;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String newEmail) {
        if(newEmail.contains("@")){
            email = newEmail;
            return "New email set.";
        }
        return "Mail has to contain @.";
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String newPassword) {
        if (newPassword.length() < 8)
            return "Password is too short.";

        password = newPassword;
        return "New password set.";
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void toggleAvailability() {
        isDisabled = !isDisabled;
    }

    public String login(String email, String password) {
        if(isDisabled())
            return "Account is disabled, you can't log in.";
        if(!getPassword().equals(password) || !getEmail().equals(email))
            return "You entered wrong email or password.";
        return "You successfully logged in!.";
    }
}
