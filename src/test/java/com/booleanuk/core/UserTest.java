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

    @Test
    public void testCreateUser_WhenPasswordIsInvalid_ShouldReturnProperMessage(){
        //Given
        User user = new User();

        //When
        String result = user.createUser("exaple@gmail.com", "passwor");

        //Then
        Assertions.assertEquals(result, "Account not created! Invalid password!");
    }

    @Test
    public void testShowDisability_WhenAccountIsDisabled_ShouldReturnProperMessage() {
        //Given
        User user = new User();

        //When
        String result = user.showDisability();

        //Then
        Assertions.assertEquals(result,"Account is disabled!");
    }

    @Test
    public void testChangeDisabilityAndShowDisability_WhenAccountIsDisabled_ShouldChangeToEnabled() {
        //Given
        User user = new User();

        //When
        String result1 = user.showDisability();
        user.changeDisability();
        String result2 = user.showDisability();

        //Then
        Assertions.assertEquals(result1,"Account is disabled!");
        Assertions.assertEquals(result2,"Account is enabled!");
    }
}
