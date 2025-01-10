package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testGetStatus(){
        TodoItem todoItem = new TodoItem("Buy bread", "From store", "Incomplete");

        Assertions.assertEquals("Incomplete",todoItem.getStatus());
    }

    @Test
    public void testSetStatus(){
        TodoItem todoItem = new TodoItem("Buy bread", "From store", "Incomplete");
        Assertions.assertEquals("Incomplete",todoItem.getStatus());
        todoItem.setStatus("Complete");
        Assertions.assertEquals("Complete",todoItem.getStatus());
    }

    @Test
    public void testGetTitle(){
        TodoItem todoItem = new TodoItem("Buy bread", "From store", "Incomplete");
        Assertions.assertEquals("Buy bread",todoItem.getTitle());
    }

    @Test
    public void testGetDetail(){
        TodoItem todoItem = new TodoItem("Buy bread", "From store", "Incomplete");
        Assertions.assertEquals("From store",todoItem.getDetail());
    }

}
