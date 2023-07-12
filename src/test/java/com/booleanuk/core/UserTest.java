package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void constructor_shouldThrowForIllegalEmail() {
        assertThrows(IllegalArgumentException.class, () -> new User("user", "invalid.email", "valid_password"));
    }

    @Test
    void constructor_shouldThrowForIllegalPassword() {
        assertThrows(IllegalArgumentException.class, () -> new User("user", "valid@mail.com", "pass"));
    }

    @Test
    void constructor_shouldCreateDisabledAccountForValidArguments() {
        var user = new User("user", "valid@email.com", "valid_password");

        assertFalse(user.isEnabled());
    }

    @Test
    void enable_shouldEnableDisabledAccount() {
        var user = new User("user", "valid@email.com", "valid_password");

        user.enable();

        assertTrue(user.isEnabled());
    }

    @Test
    void disable_shouldDisableEnabledAccount() {
        var user = new User("user", "valid@email.com", "valid_password");
        user.disable();

        user.enable();

        assertFalse(user.isEnabled());
    }
}