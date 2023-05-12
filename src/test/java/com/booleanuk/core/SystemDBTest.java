package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemDBTest {

    @Test
    public void createUserTest() {
        SystemDB systemDB = new SystemDB();

        Assertions.assertFalse(systemDB.createUser("nick@123", "123"));
        Assertions.assertFalse(systemDB.createUser("nick123", "12345678"));
        Assertions.assertTrue(systemDB.createUser("nick@123", "12345678"));
        Assertions.assertEquals(1, systemDB.getUser().size() );
    }

    @Test
    public void activateUserTestAndAmIActivated(){
        SystemDB systemDB = new SystemDB();

        Assertions.assertFalse(systemDB.activateUser("nick@123"));
        systemDB.createUser("nick@123", "12345678");
        Assertions.assertTrue(systemDB.activateUser("nick@123"));
        Assertions.assertTrue(systemDB.amIActivated("nick@123"));
    }
}
