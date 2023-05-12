package com.booleanuk.core;

public class Account {
    private String email = "";
    private String password = "";
    private boolean enabled = false;

    public Account(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public boolean checkPassword() {
        if (this.password.length() < 8) {
            System.out.println("Invalid password");
            return false;
        }

        System.out.println("Valid password");
        return true;
    }

    public boolean checkEmail() {
        if (!this.email.contains("@")) {
            System.out.println("Invalid email");
            return false;
        }

        System.out.println("Valid email");
        return true;
    }

    public boolean setEmail(String email) {
        String prevEmail = this.email;
        this.email = email;

        if (!checkEmail()) {
            this.email = prevEmail;
            return false;
        }

        return true;
    }

    public boolean setPassword(String password) {
        String prevPassword = this.password;
        this.password = password;

        if (!checkPassword()) {
            this.email = prevPassword;
            return false;
        }

        return true;
    }

    public String canLogin() {
        return this.enabled ? "Can log in" : "Can't log in";
    }

    public void enable() {
        if (checkEmail() && checkPassword())
            this.enabled = true;
    }
}
