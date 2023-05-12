package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class System1Test {

    @Test
    public void testCheckEmailGiven(){
        Assertions.assertTrue(checkEmail("email@gmail.com"));
        Assertions.assertFalse(checkEmail("emailgmail.com"));
    }

    @Test
    public void testCheckPasswordGiven(){
        Assertions.assertTrue(checkPassword("123456789"));
        Assertions.assertTrue(checkPassword("asdjinasdjnkasdjn"));
        Assertions.assertFalse(checkPassword("123"));
        Assertions.assertFalse(checkPassword("small"));
    }

    @Test
    public void testAddUser(){
        System1 system1 = new System1();
        Assertions.assertEquals(0, system1.getUsers().size());
        Assertions.assertTrue(system1.addUser("email@gmail.com","123456789"));
        Assertions.assertTrue(system1.getUsers().containsKey("email@gmail.com"));
        Assertions.assertEquals(1, system1.getUsers().size());
        Assertions.assertFalse(system1.addUser("email@gmail.com","123456789"));
        Assertions.assertEquals(1, system1.getUsers().size()); //user not created again
    }
}
