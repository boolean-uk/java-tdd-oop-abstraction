package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.setEnabled(false);
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(String email) {
        if (email.contains("@")){
        this.email = email;
        return "Email successfully set.";
        }
        return "Invalid email.";
    }

    public String getPassword() {
        return this.password;
    }

    public String setPassword(String password) {
        if(password.length() < 8){
            return "Password is too short.";
        }
        this.password = password;
        return "Password successfully set";
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


}
