package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {
    @Test
    public void testUserAccount(){
        UserAccount account = new UserAccount("example@me.com", "12345678");
        Assertions.assertEquals("example@me.com", account.email);
        Assertions.assertEquals("12345678", account.password);

    }

}
