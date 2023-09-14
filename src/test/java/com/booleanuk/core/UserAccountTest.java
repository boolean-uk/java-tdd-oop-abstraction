package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAccountTest {

    @Test
    void testEmail() {
        UserAccount userAccount = new UserAccount("vera@abv.bg", "12345678");
        Assertions.assertEquals("vera@abv.bg", userAccount.getEmail());
        Assertions.assertTrue(userAccount.setEmail("vera2@abv.bg"));
        Assertions.assertEquals("vera2@abv.bg", userAccount.getEmail());
        Assertions.assertFalse(userAccount.setEmail("vera.abv.bg"));
        Assertions.assertEquals("vera2@abv.bg", userAccount.getEmail());
    }


    @Test
    void testPassword() {
        UserAccount userAccount = new UserAccount("vera@abv.bg", "12345678");
        Assertions.assertEquals("12345678", userAccount.getPassword());
        Assertions.assertTrue(userAccount.setPassword("123456789"));
        Assertions.assertEquals("123456789", userAccount.getPassword());
        Assertions.assertFalse(userAccount.setPassword("1234567"));
        Assertions.assertEquals("123456789", userAccount.getPassword());
    }


    @Test
    void testStatus() {
        UserAccount userAccount = new UserAccount("vera@abv.bg", "12345678");
        Assertions.assertFalse(userAccount.getStatus());
        userAccount.setStatus(true);
        Assertions.assertTrue(userAccount.getStatus());
    }

}