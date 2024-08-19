package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @Test
    void createUserTest() {
        AccountManager acm = new AccountManager();

        //Test if it can be compelted
        Assertions.assertTrue(acm.addAccount("jostein@gmail.com", "12345678"));
        //Test if password length is good enough
        Assertions.assertFalse(acm.addAccount("Jostein@gmail.com", "123"));
        //Test for @ in email
        Assertions.assertFalse(acm.addAccount("Josteingmail.com", "12345678"));

    }

    @Test
    void loginTest(){
        AccountManager acm = new AccountManager();
        acm.addAccount("jostein@gmail.com", "12345678");
        //set account to active
        acm.toggleActive("jostein@gmail.com");

        Assertions.assertTrue(acm.login("jostein@gmail.com", "12345678"));

        acm.toggleActive("jostein@gmail.com");
        //Test for disabled account
        Assertions.assertFalse(acm.login("jostein@gmail.com", "12345678"));


    }
}