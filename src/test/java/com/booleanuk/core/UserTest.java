package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUserInitialState(){

        String testMail = "test@app.com";
        String testPassword = "testpass123";
        User user = new User(testMail, testPassword);

        Assertions.assertFalse(user.isEnabled());

        Assertions.assertEquals(testMail, user.getEmail());
        Assertions.assertEquals(testPassword, user.getPassword());
        user.setEmail("test2@app.com");
        user.setPassword("newpass123");
        user.setEnabled(true);
        Assertions.assertEquals("test2@app.com", user.getEmail());
        Assertions.assertEquals("newpass123", user.getPassword());
        Assertions.assertTrue(user.isEnabled());
    }
}
