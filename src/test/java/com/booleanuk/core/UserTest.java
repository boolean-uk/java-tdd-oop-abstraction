package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testCreateAccount(){
        User user = new User();
        Assertions.assertEquals("Account Created", user.createAccount("email@gmail.com", "123456789"));

        Assertions.assertEquals("Invalid email", user.createAccount("emailgmail.com", "123456789"));

        Assertions.assertEquals("Invalid password", user.createAccount("email@mail.com", "123"));


    }

    @Test
    public void testGetIsEnabled(){
        SystemAdmin systemAdmin = new SystemAdmin();
        String email ="email@gmail.com";
        String password = "123456789";
        systemAdmin.system1.addUser(email,password);
        Assertions.assertFalse(systemAdmin.system1.getUsers().get(email).getIsEnabled());
        systemAdmin.enableAccount(email);
        Assertions.assertTrue(systemAdmin.system1.getUsers().get(email).getIsEnabled());

    }
}
