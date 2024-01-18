package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getEmail() {
        Account account = new Account("noe@mail.com","kalskeoskdfne");
        Assertions.assertEquals("noe@mail.com", account.getEmail());
    }

    @Test
    void setEmail() {
        Account account = new Account("noe@mail.com","kalskeoskdfne");
        account.setEmail("annet@mail.com");
        Assertions.assertEquals("annet@mail.com", account.getEmail());
    }
    @Test
    void getPassword() {
        Account account = new Account("noe@mail.com","kalskeoskdfne");
        Assertions.assertEquals("kalskeoskdfne", account.getPassword());
    }
    @Test
    void setPassword() {
        Account account = new Account("noe@mail.com","kalskeoskdfne");
        account.setPassword("sadøjslafnkdas");
        Assertions.assertEquals("sadøjslafnkdas", account.getPassword());
    }
    @Test
    void getEnabled() {
        Account account = new Account("noe@mail.com","kalskeoskdfne");
        Assertions.assertFalse(account.getEnabled());
        account.setEnabled(true);
        Assertions.assertTrue(account.getEnabled());
    }
}