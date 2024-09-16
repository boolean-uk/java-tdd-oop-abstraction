package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {
    @Test
    public void newAccountShouldBeDisabled() {
        UserAccount acc = new UserAccount();
        Assertions.assertFalse(acc.getAccountStatus());
    }

    @Test
    public void accountShouldActivate() {
        UserAccount acc = new UserAccount();
        acc.activateAccount();
        Assertions.assertTrue(acc.getAccountStatus());
    }

    @Test
    public void shouldHavePasswordCheck() {
        UserAccount acc = new UserAccount();
        Assertions.assertFalse(acc.setPassword("abcdef"));
        Assertions.assertTrue(acc.setPassword("12345678"));
    }

    @Test
    public void shouldHaveEmailCheck() {
        UserAccount acc = new UserAccount();
        Assertions.assertFalse(acc.setEmailAddress("wrongEmailFormat.com"));
        Assertions.assertTrue(acc.setEmailAddress("correctEmail@format.com"));
    }

    @Test
    public void onSuccessfulCreationShouldGetData() {
        UserAccount acc = new UserAccount();
        Assertions.assertTrue(acc.setEmailAddress("correctEmail@format.com"));
        Assertions.assertTrue(acc.setPassword("12345678"));
        Assertions.assertEquals("correctEmail@format.com", acc.getEmailAddress());
        Assertions.assertEquals("12345678", acc.getPassword());
    }
}
