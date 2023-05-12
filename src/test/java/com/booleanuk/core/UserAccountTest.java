package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {
    @Test
    public void testUserAccount(){
        UserAccount account = new UserAccount("example@me.com", "12345678");
        Assertions.assertEquals("example@me.com", account.getEmail());
        Assertions.assertEquals("12345678", account.getPassword());

    }

    @Test
    public void TestEmail(){
        // test for success
        UserAccount account = new UserAccount("example@me.com", "12345678");
        Assertions.assertEquals("example@me.com", account.getEmail());
        // test for failure
        account.setEmail("exampleme.com");
        Assertions.assertEquals("example@me.com", account.getEmail());


    }


}
