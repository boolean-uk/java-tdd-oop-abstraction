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
        user.setEmail("user2@domain.com");
        Assertions.assertEquals("user2@domain.com", user.getEmail());
        user.setPassword("user3.com");
        Assertions.assertEquals("user2@domain.com", user.getEmail());
    }

}
