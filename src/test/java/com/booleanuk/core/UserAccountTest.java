package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {

    @Test
    public void testGetEmail(){
        UserAccount user = new UserAccount("user@domain.com", "password");
        Assertions.assertEquals("user@domain.com", user.getEmail());
    }

    @Test
    public void testSetEmail(){
        UserAccount user = new UserAccount("user@domain.com", "password");
        user.setPassword("newPassword");
        Assertions.assertEquals("newPassword", user.getPassword());
        user.setPassword("short");
        Assertions.assertEquals("newPassword", user.getPassword());
    }

}
