package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void cannotLogInWhenAccountIsDisabled() {
        user.createAccount("test@example.com", "password123");
        assertFalse(user.canLogIn());
    }

    @Test
    void canLogInWhenAccountIsEnabled() {
        user.createAccount("test@example.com", "password123");
        user.getAccount().setStatus("Enabled");
        assertTrue(user.canLogIn());
    }

    @Test
    void throwsExceptionWhenCreatingAccountWithInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> user.createAccount("invalidEmail", "password123"));
    }

    @Test
    void throwsExceptionWhenCreatingAccountWithShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> user.createAccount("test@example.com", "short"));
    }
}
