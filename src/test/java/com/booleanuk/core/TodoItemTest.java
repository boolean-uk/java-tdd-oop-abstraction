package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void setTitleTest() {
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Work 1");
        Assertions.assertEquals("Work 1", todoItem.getTitle());
    }

    @Test
    public void setTitleTest2() {
        TodoItem todoItem = new TodoItem();
        Assertions.assertNull(todoItem.getTitle());
    }

    @Test
    public void setDetailsTest() {
        TodoItem todoItem = new TodoItem();
        Assertions.assertNull(todoItem.getDetail());
    }

    @Test
    public void setDetailsTest2() {
        TodoItem todoItem = new TodoItem();
        todoItem.setDetail("Something");
        Assertions.assertEquals("Something", todoItem.getDetail());
    }

    @Test
    public void setStatusTest() {
        TodoItem todoItem = new TodoItem();
        todoItem.setStatus("Completed");
        Assertions.assertEquals("Completed", todoItem.getStatus());
    }

    @Test
    public void setStatusTest2() {
        TodoItem todoItem = new TodoItem();
        Assertions.assertNull(todoItem.getStatus());
    }

    @Test
    public void testGetter() {
        TodoItem todoItem = new TodoItem("Test abstraction", "Complete some tasks", "In progress");
        Assertions.assertEquals("In progress", todoItem.getStatus());
    }

    @Test
    public void testGetter2() {
        TodoItem todoItem = new TodoItem("Test abstraction", "Complete some tasks", "In progress");
        Assertions.assertEquals("Test abstraction", todoItem.getTitle());
        Assertions.assertEquals("Complete some tasks", todoItem.getDetail());
    }

}
