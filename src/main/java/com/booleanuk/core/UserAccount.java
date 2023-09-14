package com.booleanuk.core;

public class UserAccount {
    private String emailAddress;
    private String password;
    private boolean isActivated;

    public UserAccount() {
        this.isActivated = false;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean setEmailAddress(String emailAddress) {
        if (emailAddress.contains("@")){
            this.emailAddress = emailAddress;
            System.out.println("Email set successfully.");
            return true;
        } else {
            System.out.println("Invalid email address format.");
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (password.length()<8){
            System.out.println("Password should be at least 8 characters long.");
            return false;
        } else {
            this.password = password;
            System.out.println("Password set successfully.");
            return true;
        }

    }

    public boolean getAccountStatus() {
        System.out.println(!isActivated?"The account has not been activated yet.":"The account is currently active.");
        return isActivated;
    }

    public void activateAccount() {
        isActivated = true;
    }
}
