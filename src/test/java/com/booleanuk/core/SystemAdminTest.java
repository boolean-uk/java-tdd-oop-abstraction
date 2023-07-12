package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemAdminTest {
    @Test
    public void testEnableAccount(){
        SystemAdmin systemAdmin = new SystemAdmin();
        Assertions.assertTrue(systemAdmin.system1.addUser("email@gmail.com","123456789"));
        Assertions.assertTrue(systemAdmin.enableAccount("email@gmail.com"));
        Assertions.assertFalse(systemAdmin.enableAccount("email@gmail.com"));
        Assertions.assertFalse(systemAdmin.enableAccount("notExisting@gmail.com"));
    }
}
