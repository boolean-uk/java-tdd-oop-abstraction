package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    public Account account;

    @BeforeEach
    public void setUp() {
        this.account = new Account("example.com", "12345");
    }

    @Test
    public void testVerifyEmail() {
        Assertions.assertEquals("invalid email", account.getEmail());
        account.setEmail("example@.com");
        Assertions.assertEquals("example@.com", account.getEmail());
    }

    @Test
    public void testVerifyPassword() {
        Assertions.assertEquals("invalid password", account.getPassword());
        account.setPassword("12345678");
        Assertions.assertEquals("12345678", account.getPassword());
    }

    @Test
    public void testCanLogIn() {
        account.setEmail("example@test.com");
        account.setPassword("12345678");
        account.setStatus(true);
        Assertions.assertTrue(account.canLogIn());
    }
}