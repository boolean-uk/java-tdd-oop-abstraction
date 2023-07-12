package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UserAccountTest {


    @Test
    public void testPassword(){
        UserAccount user = new UserAccount("12345678", "test@gmail.com");
        Assertions.assertEquals("12345678",user.getPassword());




        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        UserAccount user2 = new UserAccount("1234", "test@gmail.com");

        String output = outputStream.toString().trim();
        Assertions.assertTrue(output.contains("invalid password"));

    }

    @Test
    public void testEmail(){
        UserAccount user = new UserAccount("12345678", "test@gmail.com");
        Assertions.assertEquals("test@gmail.com",user.getEmail());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        UserAccount user2 = new UserAccount("12345678", "testgmail.com");

        String output = outputStream.toString().trim();
        Assertions.assertTrue(output.contains("invalid email"));

    }

    @Test
    public void isActiveTest(){
        UserAccount user = new UserAccount("12345678", "test@gmail.com");
        Assertions.assertFalse(user.isActive());
    }

    @Test
    public void loginTest(){
        UserAccount user = new UserAccount("12345678", "test@gmail.com");
        Assertions.assertEquals("User not able to log in", user.checkIfAbleToLogIn());
        user.setActive();
        Assertions.assertEquals("User able to log in", user.checkIfAbleToLogIn());
    }
}
