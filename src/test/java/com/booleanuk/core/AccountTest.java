package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("test@example.com", "password123");
    }

    @Test
    void accountInitiallyDisabled() {
        assertEquals("Disabled", account.getStatus());
    }

    @Test
    void canSetEnabledStatus() {
        account.setStatus("Enabled");
        assertEquals("Enabled", account.getStatus());
    }

    @Test
    void throwsExceptionWhenSettingInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> account.setEmail("invalidEmail"));
    }

    @Test
    void doesNotThrowExceptionWhenSettingValidEmail() {
        assertDoesNotThrow(() -> account.setEmail("valid@example.com"));
    }

    @Test
    void throwsExceptionWhenSettingShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> account.setPassword("short"));
    }

    @Test
    void doesNotThrowExceptionWhenSettingLongPassword() {
        assertDoesNotThrow(() -> account.setPassword("longpassword"));
    }
}
