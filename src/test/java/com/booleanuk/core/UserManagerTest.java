package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserManagerTest {

    UserManager userManager;

    @BeforeEach
    public void setup(){
        userManager = new UserManager();
    }

    @Test
    public void testValidEmailAndPassword() {
        Assertions.assertTrue(userManager.createUser("mpampis@app.com", "123456789"));
        Assertions.assertFalse(userManager.createUser("app.com", "123456789"));
        Assertions.assertFalse(userManager.createUser("mpampis@app.com", "1234567"));
    }
}
