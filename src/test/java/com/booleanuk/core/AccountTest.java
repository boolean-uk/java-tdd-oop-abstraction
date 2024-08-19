package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void checkValidEmail() throws Exception {
        Account account = new Account("email", "password");

//        Assertions.assertThrows(Exeption(), "ERROR: Email is not valid.");

    }
}
