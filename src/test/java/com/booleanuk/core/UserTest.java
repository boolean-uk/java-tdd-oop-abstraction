package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void shouldCreateBasicUser() {
        BasicUser user1 = new BasicUser("mail@mail", "123456789");
        Assertions.assertEquals("mail@mail", user1.getEmail());
        Assertions.assertFalse(user1.isEnabled());
        Assertions.assertEquals("123456789", user1.getPassword());
    }

    @Test
    public void shouldCreateAdministrator() {
        Administrator admin = new Administrator("mail@mail", "123456789");
        Assertions.assertTrue(admin.isEnabled());
        Assertions.assertEquals("mail@mail", admin.getEmail());
        Assertions.assertEquals("123456789", admin.getPassword());
    }

    @Test
    public void shouldThrowExceptionPasswordTooShort() {
        IllegalArgumentException invalidPasswordException = Assertions.assertThrows(IllegalArgumentException.class, () -> new BasicUser("mail@mail", "123456"));
        Assertions.assertEquals("Password is too short!", invalidPasswordException.getMessage());
    }

    @Test
    public void shouldThrowExceptionInvalidEmail() {
        IllegalArgumentException emailInvalidException = Assertions.assertThrows(IllegalArgumentException.class, () -> new BasicUser("mailmail", "12345678"));
        Assertions.assertEquals("Email doesn't contain @", emailInvalidException.getMessage());
    }

    @Test
    public void shouldAdministratorBeAbleToChangeUserAccountStatus() {
        Administrator admin = new Administrator("mail@mail", "123456789");
        BasicUser user1 = new BasicUser("mail@mail", "123456789");
        Assertions.assertFalse(user1.isEnabled());
        admin.activateAccount(user1);
        Assertions.assertTrue(user1.isEnabled());
    }

    @Test
    public void shouldReturnAbleToLogInMessage() {
        BasicUser user1 = new BasicUser("mail@mail", "123456789");
        user1.setEnabled(true);
        Assertions.assertEquals("You can log in", user1.isAbleToLogIn());
    }


}
