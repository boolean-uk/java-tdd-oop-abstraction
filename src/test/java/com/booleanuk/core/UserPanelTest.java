package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserPanelTest {
    @Test
    public void testCreateAccount() {
        UserPanel userPanel = new UserPanel();
        String message = userPanel.createAccount("email@address.com", "password");

        Assertions.assertEquals("account created", message);
    }

    @Test
    public void testInvalidPassword() {
        UserPanel userPanel = new UserPanel();
        String message = userPanel.createAccount("email@address.com", "password");

        Assertions.assertEquals("invalid password", message);
    }
}
