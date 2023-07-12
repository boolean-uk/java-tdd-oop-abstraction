package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserDbTest {

    static UserDb userDb;

    @BeforeAll
    public static void setUp() {
        userDb = new UserDb();
    }

    @Test
    public void testCreateUser() {
        userDb.createUser("user@example.com", "12345678");

        Assertions.assertEquals(1, userDb.getUsers().size());
    }

    @Test
    public void testUserLogin() {
        userDb.createUser("user@example.com", "12345678");
        User user = userDb.getUsers().get(0);
        Assertions.assertFalse(userDb.login(user));

        user.setActive(true);

        Assertions.assertTrue(userDb.login(user));
    }


    @Test
    public void testValidateEmail() {
        Assertions.assertTrue(userDb.validateEmail("user@example.com"));
        Assertions.assertFalse(userDb.validateEmail("userexample.com"));
    }
    @Test
    public void testValidatePassword() {
        Assertions.assertTrue(userDb.validatePassword("12345678"));
        Assertions.assertFalse(userDb.validatePassword("123"));
    }

}
