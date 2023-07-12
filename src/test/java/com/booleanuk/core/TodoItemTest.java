package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
<<<<<<< HEAD
  

=======
>>>>>>> e400084932de6053ea1b0a53f2a872fdaf697c18
    UserAccount userAccount = new UserAccount();
    TodoItem todoItem = new TodoItem();

    @Test
    public void testGetSetDetails() {
        todoItem.setDetail("aaa");
        Assertions.assertEquals("aaa", todoItem.getDetail());
    }

    @Test
    public void testGetSetTitle() {
        todoItem.setTitle("bbb");
        Assertions.assertEquals("bbb", todoItem.getTitle());
    }

    @Test
    public void testGetSetStatus() {
        todoItem.setStatus("ccc");
        Assertions.assertEquals("ccc", todoItem.getStatus());
    }

    @Test
<<<<<<< HEAD
    public void testAccountStatus() {

        Assertions.assertEquals(false, userAccount.getAccountStatus());

        userAccount.SetAccountStatus();

        Assertions.assertEquals(true, userAccount.getAccountStatus());

    }
=======
    public void testCheckEmailIfCorrect(){
        Assertions.assertTrue(userAccount.checkEmail("aaa@email.com").equals("valid email"));
    }

    @Test
    public void testCheckEmailIfNotCorrect(){
        Assertions.assertTrue(userAccount.checkEmail("aaa").equals("invalid email"));
    }

    @Test
    public void testCheckPasswordIfNotCorrect(){
        Assertions.assertEquals(userAccount.checkPassword("aaa"), "invalid password");
    }

    @Test
    public void testCheckPasswordIfCorrect(){
        Assertions.assertEquals(userAccount.checkPassword("ddd333ff44"), "valid password");
    }

>>>>>>> e400084932de6053ea1b0a53f2a872fdaf697c18

}
