package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testCreateAccount(){
        Assertions.assertEquals("Account Created", createAccount("email@gmail.com", "123456789"));
        Assertions.assertEquals("Invalid email", createAccount("emailgmail.com", "123456789"));
        Assertions.assertEquals("Invalid password", createAccount("email@mail.com", "123"));
    }
}
