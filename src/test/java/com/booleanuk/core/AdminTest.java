package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdminTest {

    @Test
    public void testAdmin() {
        Admin admin = new Admin("email@email.email", "bestPassword");


        Assertions.assertEquals("invalid password", admin.setPassword("1"));
        Assertions.assertEquals("invalid email", admin.setEmail("1"));
        Assertions.assertFalse(admin.isEnabled());
        Assertions.assertEquals("invalid login", admin.ableToLogin());
        admin.setEnabled(true);
        Assertions.assertTrue(admin.isEnabled());
        Assertions.assertEquals("valid login", admin.ableToLogin());


    }
}
