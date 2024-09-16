package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class System1Test {

    @Test
    public void testCheckEmailGiven(){
        System1 system1 = new System1();

        Assertions.assertTrue(system1.checkEmail("email@gmail.com"));
        Assertions.assertFalse(system1.checkEmail("emailgmail.com"));
    }

    @Test
    public void testCheckPasswordGiven(){
        System1 system1 = new System1();
        Assertions.assertTrue(system1.checkPassword("123456789"));
        Assertions.assertTrue(system1.checkPassword("asdjinasdjnkasdjn"));
        Assertions.assertFalse(system1.checkPassword("123"));
        Assertions.assertFalse(system1.checkPassword("small"));
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
