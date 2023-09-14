package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex2Test {
    @Test
    public void TestNewUser() {
        User panos = new User();
        Assertions.assertEquals(panos.setEmail("panagiotis_karapiperis@hotmail.com"),"Email registered");
        Assertions.assertEquals(panos.setPassword("12345"),"Password Registered");
        Assertions.assertEquals(panos.setEmail("panos"),"Invalid Email");
        Assertions.assertEquals(panos.setPassword("kdsjflaskjdflksdj"),"Invalid Password");
    }

    @Test
    public void TestStatus() {
        User user = new User();
        Assertions.assertFalse(user.getEnabled());
        user.setEnabled(true);
        Assertions.assertTrue(user.getEnabled());
    }

    @Test
    public void checkLogin() {
        User user = new User();
        Assertions.assertFalse(user.logIn());
        user.setEnabled(true);
        Assertions.assertTrue(user.logIn());
    }
}
