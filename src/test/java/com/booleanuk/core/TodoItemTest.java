package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
//    @BeforeEach
//    void init() {
//        TodoItem todoItem = new TodoItem();
//        UserAccount userAccount = new UserAccount();
//    }
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
        Assertions.assertTrue(userAccount.checkEmail("aaa@email.com"));
    }

    @Test
    public void testCheckEmailIfNotCorrect(){
        Assertions.assertFalse(userAccount.checkEmail("aaa"));
    }

    @Test
    public void testCheckPasswordIfNotCorrect(){
        Assertions.assertFalse(userAccount.checkPassword("aaa"));
    }

    @Test
    public void testCheckPasswordIfCorrect(){
        Assertions.assertTrue(userAccount.checkPassword("ddd333ff44"));
    }


}
