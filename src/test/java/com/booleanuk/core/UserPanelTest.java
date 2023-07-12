package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserPanelTest {
    @Test
    public void testCreateAccount() {
        UserPanel userPanel = new UserPanel();
        UserAccount newAccount = userPanel.createAccount("email@address.com", "password");

        Assertions.assertNotNull(newAccount);
    }
}
