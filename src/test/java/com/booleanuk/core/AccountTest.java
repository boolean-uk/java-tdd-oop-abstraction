package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
    @Test
    void accountThrowsExceptionForIncorrectEmail(){
        assertThrows(IllegalArgumentException.class,()->new Account("testexample.com","password123"));
    }

    @Test
    void accountThrowsExceptionForIncorrectPassword() {
        assertThrows(IllegalArgumentException.class, () -> new Account("test@example.com", "foo"));
    }

}
