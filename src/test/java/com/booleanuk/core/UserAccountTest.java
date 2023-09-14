package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {


    @Test
    void getEmail() {
        UserAccount userAccount = new UserAccount("petros@email.com", "123456789", false);
        Assertions.assertEquals("petros@email.com", userAccount.getEmail());
    }

    @Test
    void setEmail() {
        UserAccount userAccount = new UserAccount();
        userAccount.setEmail("newemail@gmail.com");
        Assertions.assertEquals("newemail@gmail.com", userAccount.getEmail());
    }

    @Test
    void getPassword() {
        UserAccount userAccount = new UserAccount("petros@email.com", "123456789", false);
        Assertions.assertEquals("123456789", userAccount.getPassword());

    }

    @Test
    void setPassword() {
        UserAccount userAccount = new UserAccount();
        userAccount.setPassword("123456789");
        Assertions.assertEquals("123456789", userAccount.getPassword());
    }

    @Test
    void getIsEnabledAccount() {
        UserAccount userAccount = new UserAccount("petros@email.com", "123456789", true);
        Assertions.assertTrue(userAccount.getIsEnabledAccount());
    }

    @Test
    void setEnabledAccount() {
        UserAccount userAccount = new UserAccount("petros@email.com", "123456789", false);
        userAccount.setEnabledAccount(true);
        Assertions.assertTrue(userAccount.getIsEnabledAccount());
    }

    @Test
    void isValidEmail() {
        UserAccount userAccount = new UserAccount();
        userAccount.setEmail("petros!email.com");
        Assertions.assertEquals("Invalid email", userAccount.isValidEmail());
    }

    @Test
    void isValidEmail2() {
        UserAccount userAccount = new UserAccount();
        userAccount.setEmail("petros@email.com");
        Assertions.assertEquals("Valid email", userAccount.isValidEmail());
    }

    @Test
    void isPasswordValid() {
        UserAccount userAccount = new UserAccount();
        userAccount.setPassword("123");
        Assertions.assertEquals("Invalid Password", userAccount.isPasswordValid());
    }

    @Test
    void isPasswordValid2() {
        UserAccount userAccount = new UserAccount();
        userAccount.setPassword("123456lskd");
        Assertions.assertEquals("Valid Password", userAccount.isPasswordValid());
    }

    @Test
    void canLogIn() {
        UserAccount userAccount = new UserAccount("petros@email.com", "123456789", false);
        Assertions.assertEquals("User cannot log in", userAccount.canLogIn());
    }

    @Test
    void canLogIn2() {
        UserAccount userAccount = new UserAccount("petros@email.com", "123456789", false);
        userAccount.setEnabledAccount(true);
        Assertions.assertEquals("User can log in", userAccount.canLogIn());
    }

}
