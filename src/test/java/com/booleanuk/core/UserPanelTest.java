package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserPanelTest {
    @Test
    public void testCreateAccount() {
        UserPanel userPanel = new UserPanel();
        String message = userPanel.createAccount("email@address.com", "password");

        assertEquals("account created", message);
    }

    @Test
    public void testInvalidPassword() {
        UserPanel userPanel = new UserPanel();
        String message = userPanel.createAccount("email@address.com", "pswd");

        assertEquals("invalid password", message);
    }

    @Test
    public void testInvalidEmail() {
        UserPanel userPanel = new UserPanel();
        String message = userPanel.createAccount("emailaddress.com", "password");

        assertEquals("invalid email", message);
    }

    @Test
    public void testNewAccountInitiallyDisabled() {
        UserPanel userPanel = new UserPanel();
        userPanel.createAccount("email@address.com", "password");

        assertFalse(userPanel.getUserAccounts().get(0).isEnabled());
    }
}
