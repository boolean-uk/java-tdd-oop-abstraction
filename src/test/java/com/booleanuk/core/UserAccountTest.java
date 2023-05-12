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


}
