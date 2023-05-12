package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemAdminTest {
    @Test
    public void testEnableAccount(){
        System1 system1 = new System1();
        SystemAdminTest systemAdmin = new SystemAdminTest();
        Assertions.assertTrue(system1.addUser("email@gmail.com","123456789"));
        Assertions.assertTrue(systemAdmin.enableAccount("email@gmail.com"));
        Assertions.assertFalse(systemAdmin.enableAccount("email@gmail.com"));
        Assertions.assertFalse(systemAdmin.enableAccount("notExisting@gmail.com"));
    }
}
