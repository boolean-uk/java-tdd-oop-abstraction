package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserAccountTest {

    @Test
    public void setCorrectPasswordTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        assertEquals("New password set.", userAccount.setPassword("123456789"));
    }

    @Test
    public void setIncorrectPasswordTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        assertEquals("Password is too short.", userAccount.setPassword("123456"));
    }

    @Test
    public void setCorrectEmailTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        assertEquals("New email set.", userAccount.setEmail("other@mail.com"));
    }

    @Test
    public void setIncorrectEmailTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        assertEquals("Mail has to contain @.", userAccount.setEmail("othermail.com"));
    }

    @Test
    public void checkAvailabilityTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        assertTrue(userAccount.isDisabled());
    }

    @Test
    public void toggleAvailabilityTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        userAccount.toggleAvailability();
        assertFalse(userAccount.isDisabled());
    }

    @Test
    public void loginOnDisabledAccountTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        assertEquals(
                "Account is disabled, you can't log in.",
                userAccount.login(
                        "example@mail.com",
                        "hardpassword123")
        );
    }

    @Test
    public void loginOnEnabledAccountTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        userAccount.toggleAvailability();
        assertEquals(
                "You successfully logged in!.",
                userAccount.login(
                        "example@mail.com",
                        "hardpassword123")
        );
    }

    @Test
    public void loginOnEnabledAccountWrongInputTest() {
        UserAccount userAccount = new UserAccount("example@mail.com", "hardpassword123");
        userAccount.toggleAvailability();
        assertEquals(
                "You entered wrong email or password.",
                userAccount.login(
                        "exple@mail.com",
                        "hardpassword123")
        );
    }
}
