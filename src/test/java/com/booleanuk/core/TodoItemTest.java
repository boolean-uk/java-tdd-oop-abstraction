package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    TodoItem todoItem;

    @BeforeEach
    public void setUp(){
        todoItem = new TodoItem("kitchen", "make a dinner", "undone");
    }

    @Test
    public void testGetStatusShouldReturnDone(){
        todoItem.setStatus("done");
        Assertions.assertEquals("done", todoItem.getStatus());
    }

    @Test
    public void testGetStatusShouldReturnUndone(){
        Assertions.assertNotEquals("done", todoItem.getStatus());
    }

    @Test
    public void testGetTitle(){
        todoItem.setTitle("bedroom");
        Assertions.assertEquals("bedroom", todoItem.getTitle());
    }

    @Test
    public void testGetDetailShouldReturnEqual(){
        todoItem.setDetail("make the bed");
        Assertions.assertEquals("make the bed", todoItem.getDetail());
    }

    @Test
    public void testGetDetailShouldReturnNotEqual(){
        Assertions.assertNotEquals("done", todoItem.getStatus());
    }

}
