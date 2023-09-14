package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testTitle(){
        TodoItem todoItem = new TodoItem("Feed the cat", "Feed Tommy in the evening.");
        Assertions.assertEquals("Feed the cat", todoItem.getTitle());
        todoItem.setTitle("Feed Tommy");
        Assertions.assertEquals("Feed Tommy", todoItem.getTitle());
    }


    @Test
    public void testDetails(){
        TodoItem todoItem = new TodoItem("Feed the cat", "Feed Tommy in the evening.");
        Assertions.assertEquals("Feed Tommy in the evening.", todoItem.getDetail());
        todoItem.setDetail("Feed Tommy in the morning");
        Assertions.assertEquals("Feed Tommy in the morning", todoItem.getDetail());
    }

    @Test
    public void testStatus(){
        TodoItem todoItem = new TodoItem("Feed the cat", "Feed Tommy in the evening.");
        Assertions.assertFalse( todoItem.getStatus());
        todoItem.setStatus(true);
        Assertions.assertTrue( todoItem.getStatus());
    }

}
