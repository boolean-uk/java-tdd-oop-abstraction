package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void statusSetGetTest() {
        TodoItem todoItem = new TodoItem();
        todoItem.setStatus("active");
        Assertions.assertEquals("active", todoItem.getStatus());
    }

    @Test
    public void titleSetGetTest() {
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Hobbit");
        Assertions.assertEquals("Hobbit", todoItem.getTitle());
    }

    @Test
    public void detailSetGetTest() {
        TodoItem todoItem = new TodoItem();
        todoItem.setDetail("First detail");
        Assertions.assertEquals("First detail", todoItem.getDetail());
    }

}
