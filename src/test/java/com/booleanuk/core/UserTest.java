package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void setPasswordTestIfProvidedLessThan8Char(){
        User user = new User();
        String message = user.setPassword("12345");
        Assertions.assertEquals("invalid password", message);
    }

    @Test
    public void setPasswordTestIfProvidedGood(){
        User user = new User();
        String message = user.setPassword("123456789");
        Assertions.assertEquals("correct password", message);
    }

    @Test
    public void setEmailTestIfProvidedWithoutSymbol(){
        User user = new User();
        String message = user.setEmail("email.com");
        Assertions.assertEquals("invalid email", message);
    }
    @Test
    public void setEmailTestIfProvidedGoodEmail(){
        User user = new User();
        String message = user.setEmail("email@email.com");
        Assertions.assertEquals("correct email", message);
    }
}
