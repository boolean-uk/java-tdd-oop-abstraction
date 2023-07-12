package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {

    @Test
    public void setEmailTest(){
        UserAccount account = new UserAccount();
        Assertions.assertEquals("Invalid email", account.setEmail("adsafd"));
        Assertions.assertEquals("Your email is set: adik@test.com", account.setEmail("adik@test.com"));
    }

    @Test
    public void setPasswordTest(){
        UserAccount account = new UserAccount();
        Assertions.assertEquals("Invalid password", account.setPassword("12345"));
        Assertions.assertEquals("Your password is set: 12345678", account.setPassword("12345678"));
    }

    @Test
    public void enableTest(){
        UserAccount account = new UserAccount();
        Assertions.assertFalse(account.isStatus());
        account.enable();
        Assertions.assertTrue(account.isStatus());
    }
}
