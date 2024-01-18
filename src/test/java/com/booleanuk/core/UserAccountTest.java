package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAccountTest {

    @Test
    public void getSetEmailTest() {
        UserAccount userAccount = new UserAccount("test@test.test", "tEst!@#");
        Assertions.assertEquals("test@test.test", userAccount.getEmail());
        userAccount.setEmail("tested@tested.tested");
        Assertions.assertEquals("tested@tested.tested", userAccount.getEmail());
        userAccount.setEmail("test");
        Assertions.assertEquals("tested@tested.tested", userAccount.getEmail());
    }

    @Test
    public void getSetPasswordTest() {
        UserAccount userAccount = new UserAccount("test@test.test", "tEst!@#");
        Assertions.assertEquals("tEst!@#", userAccount.getPassword());
        userAccount.setPassword("Gavilar!@#");
        Assertions.assertEquals("Gavilar!@#", userAccount.getPassword());
        userAccount.setPassword("kk");
        Assertions.assertEquals("Gavilar!@#", userAccount.getPassword());

    }

    @Test
    public void enableAccountTest() {
        UserAccount userAccount = new UserAccount("test@test.test", "tEst!@#");
        Assertions.assertFalse(userAccount.getEnabled());
        userAccount.enableAccount();
        Assertions.assertTrue(userAccount.getEnabled());

    }

    @Test
    public void disableAccountTest() {
        UserAccount userAccount = new UserAccount("test@test.test", "tEst!@#");
        userAccount.enableAccount();
        Assertions.assertTrue(userAccount.getEnabled());
        userAccount.disableAccount();
        Assertions.assertFalse(userAccount.getEnabled());

    }

    @Test
    public void LogInTest() {
        UserAccount userAccount = new UserAccount("test@test.test", "tEst!@#");
        userAccount.logIn("test@test.test", "tEst!@#");
        Assertions.assertFalse(userAccount.isLoggedIn());
        userAccount.logIn("@test.test", "tE!@#");
        Assertions.assertFalse(userAccount.isLoggedIn());
        userAccount.enableAccount();
        userAccount.logIn("test@test.test", "tEst!@#");
        Assertions.assertTrue(userAccount.isLoggedIn());

    }


}
