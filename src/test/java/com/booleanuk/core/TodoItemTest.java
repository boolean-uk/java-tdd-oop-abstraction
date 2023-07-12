package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @BeforeEach
    void init() {
        TodoItem todoItem = new TodoItem();
    }
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


}
