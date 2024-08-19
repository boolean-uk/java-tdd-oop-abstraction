package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testVerifyEmail() throws Exception {
        Account account = new Account("example.com", "12345");
        Assertions.assertEquals("invalid email", account.getError());
    }

    @Test
    public void canLogIn() {
    }
}