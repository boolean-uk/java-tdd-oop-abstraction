package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testCreateUser_WhenUserAndPasswordAreCorrect_ShouldLogInUser(){
       //Given
       User user = new User();

       //When
       String result = user.createUser("exaple@gmail.com", "password");

       //Then
        Assertions.assertEquals(result, "Account successfully created!");
    }

    @Test
    public void testCreateUser_WhenEmailIsInvalid_ShouldReturnProperMessage(){
        //Given
        User user = new User();

        //When
        String result = user.createUser("exaplegmail.com", "password");

        //Then
        Assertions.assertEquals(result, "Account not created! Invalid email!");
    }
}
