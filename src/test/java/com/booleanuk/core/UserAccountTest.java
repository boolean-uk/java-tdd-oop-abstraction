package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {
    @Test
    public void testGetEmail(){
        UserAccount uAccount = new UserAccount("anything@gmail.com","any");
        Assertions.assertEquals("anything@gmail.com",uAccount.getEmail());
    }
    @Test
    public void testSetEmail(){
        UserAccount uAccount = new UserAccount("anything@gmail.com","any");
        uAccount.setEmail("somethingelse@gmail.com");
        Assertions.assertEquals("somethingelse@gmail.com",uAccount.getEmail());
        // test for invalid mail
        uAccount.setEmail("somethingelsegmail.com");
        Assertions.assertEquals("somethingelse@gmail.com",uAccount.getEmail());
    }
    @Test
    public void testGetPassword(){
        UserAccount uAccount = new UserAccount("anything@gmail.com","12345678");
        Assertions.assertEquals("12345678",uAccount.getPassword());
    }

    @Test
    public void testSetPassword(){
        UserAccount uAccount = new UserAccount("anything@gmail.com","12345678");
        uAccount.setPassword("87654321");
        Assertions.assertEquals("87654321",uAccount.getPassword());
        // test for password less than 8 characters
        uAccount.setPassword("8765432");
        Assertions.assertEquals("87654321",uAccount.getPassword());
    }

}
