package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void emailGetterAndSetterTest() {
        Account account = new Account("bob@gmail.com", "password");
        Assertions.assertEquals("bob@gmail.com", account.getEmail());
        Assertions.assertFalse(account.setEmail("bob"));
        Assertions.assertTrue(account.setEmail("bagel@gmail.com"));
        Assertions.assertEquals("bagel@gmail.com", account.getEmail());
    }
    @Test
    public void passwordGetterAndSetterTest() {
        Account account = new Account("bob@gmail.com", "password");
        Assertions.assertEquals("password", account.getPassword());
        Assertions.assertFalse(account.setPassword("1234"));
        Assertions.assertTrue(account.setPassword("12345678"));
        Assertions.assertEquals("12345678", account.getPassword());
    }
    @Test
    public void activeGetterAndSetterTest() {
        Account account = new Account("bob@gmail.com", "password");
        Assertions.assertFalse(account.isActive());
        account.setActive(true);
        Assertions.assertTrue(account.isActive());
    }
}
