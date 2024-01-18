package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testUser() {
        User user = new User("email@email.email", "bestPassword");


        Assertions.assertEquals("invalid password", user.setPassword("1"));
        Assertions.assertEquals("invalid email", user.setEmail("1"));
        Assertions.assertFalse(user.isEnabled());
        Assertions.assertEquals("invalid login", user.ableToLogin());
        user.setEnabled(true);
        Assertions.assertTrue(user.isEnabled());
        Assertions.assertEquals("valid login", user.ableToLogin());


    }

}
