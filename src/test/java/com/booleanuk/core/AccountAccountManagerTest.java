package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountAccountManagerTest {
    @Test
    public void testCreatingUserWithInvalidPassword(){
        AccountManager s = new AccountManager();
        Assertions.assertEquals("invalid password", s.createUser("email@email.com", "passwor"));
    }
    @Test
    public void testCreatingUserWithInvalidEmail(){
        AccountManager s = new AccountManager();
        Assertions.assertEquals("invalid email", s.createUser("emailemail.com", "password"));
    }
    @Test
    public void testCreatingAUserWithValidEmailAndPassword(){
        AccountManager s = new AccountManager();
        Assertions.assertEquals("account created", s.createUser("email@email.com", "password"));
    }

    @Test
    public void testNewUserDisabledWhenCreated(){
        AccountManager s = new AccountManager();
        s.createUser("email@email.com", "password");
        Assertions.assertTrue(s.getAccountByEmail("email@email.com").isDisabled());
    }

    @Test
    public void testSetUserToNotDisabled(){
        AccountManager s = new AccountManager();
        s.createUser("email@email.com", "password");
        Assertions.assertTrue(s.getAccountByEmail("email@email.com").isDisabled());
        s.toggleUserDisabled("email@email.com");
        Assertions.assertFalse(s.getAccountByEmail("email@email.com").isDisabled());
    }

    @Test
    public void testLoginToAccountThatIsDisabled(){
        AccountManager s = new AccountManager();
        s.createUser("email@email.com", "password");
        Assertions.assertEquals("account disabled", s.loginUser("email@email.com", "password"));
    }
}
