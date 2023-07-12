package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    UserAccount userAccount = new UserAccount();
    TodoItem todoItem = new TodoItem();
    @Test
    public void testGetSetDetails(){
        todoItem.setDetail("aaa");
        Assertions.assertEquals("aaa", todoItem.getDetail());
    }

    @Test
    public void testGetSetTitle(){
        todoItem.setTitle("bbb");
        Assertions.assertEquals("bbb", todoItem.getTitle());
    }

    @Test
    public void testGetSetStatus(){
        todoItem.setStatus("ccc");
        Assertions.assertEquals("ccc", todoItem.getStatus());
    }

    @Test
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


}
