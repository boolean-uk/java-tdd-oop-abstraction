package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testAccount() {
        Account a = new Account("asdasd@weqwe", "12313212312321");
        Assertions.assertTrue(a.checkEmail());
        Assertions.assertTrue(a.checkPassword());
        Assertions.assertEquals("Can't log in", a.canLogin());
        a.enable();
        Assertions.assertEquals("Can log in", a.canLogin());
    }

    @Test
    public void testAccountProblem() {
        Account a = new Account("asdaweqwe", "1231");
        Assertions.assertFalse(a.checkEmail());
        Assertions.assertFalse(a.checkPassword());
        Assertions.assertEquals("Can't log in", a.canLogin());
        a.enable();
        Assertions.assertEquals("Can log in", a.canLogin());
    }
}
