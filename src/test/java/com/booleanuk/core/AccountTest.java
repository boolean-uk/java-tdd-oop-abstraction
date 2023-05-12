package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    void createShouldBeTrue() {
        Assertions.assertTrue(Account.create("test@test.test", "test1234"));
    }
    @Test
    void createShouldBeFalse() {
        // Bad email
        Assertions.assertFalse(Account.create("test_test.test", "test1234"));
        // Bad password
        Assertions.assertFalse(Account.create("test@test.test", "test123"));
    }

    @Test
    void loginShouldBeTrue() {
        Account.create("test@test.test", "test1234");

        Account account = Account.getAccountByEmail("test@test.test");
        Assertions.assertNotNull(account);

        account.enable();

        Assertions.assertTrue(Account.login("test@test.test", "test1234"));
    }
    @Test
    void loginShouldBeFalse() {
        Account.create("test@test.test", "test1234");

        Account account = Account.getAccountByEmail("test@test.test");
        Assertions.assertNotNull(account);

        Assertions.assertFalse(Account.login("test@test.test", "test1234"));
    }
}
