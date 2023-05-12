package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void gettersTest() {
        TodoItem todoItem = new TodoItem("This is a title","This is a detail", "This is a status");
        Assertions.assertEquals("This is a title", todoItem.getTitle() );
        Assertions.assertEquals("This is a detail", todoItem.getDetail() );
        Assertions.assertEquals("This is a status", todoItem.getStatus() );
    }

    @Test
    public void settersTest() {
        TodoItem todoItem = new TodoItem("","", "");
        todoItem.setTitle("This is a new title");
        todoItem.setDetail("This is a new detail");
        todoItem.setStatus("This is a new status");
        Assertions.assertEquals("This is a new title", todoItem.getTitle() );
        Assertions.assertEquals("This is a new detail", todoItem.getDetail() );
        Assertions.assertEquals("This is a new status", todoItem.getStatus() );

    }

}
