package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testAccount() {
        Account account = new Account("email@email.email", "bestPassword");

        Assertions.assertEquals("invalid password", account.setPassword("1"));
        Assertions.assertEquals("invalid email", account.setEmail("1"));
        Assertions.assertFalse(account.isEnabled());
        Assertions.assertEquals("invalid login", account.ableToLogin());
        account.setEnabled(true);
        Assertions.assertTrue(account.isEnabled());
        Assertions.assertEquals("valid login", account.ableToLogin());



    }
}
