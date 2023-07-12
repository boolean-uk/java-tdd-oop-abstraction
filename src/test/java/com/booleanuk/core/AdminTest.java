package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    private Admin admin;
    private Account account;

    @BeforeEach
    void setUp() {
        admin = new Admin();
        account = new Account("test@example.com", "password123");
    }

    @Test
    void canEnableAccount() {
        admin.enableAccount(account);
        assertEquals("Enabled", account.getStatus());
    }
}
