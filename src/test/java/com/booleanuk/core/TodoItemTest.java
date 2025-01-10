package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testStatusValidity() {
        TodoItem todo = new TodoItem();
        todo.setStatusComplete();
        Assertions.assertEquals("Complete", todo.getStatus());
        todo.setStatusIncomplete();
        Assertions.assertEquals("Incomplete", todo.getStatus());

    }

    @Test
    public void testTitleValidity() {
        TodoItem todo = new TodoItem();
        Assertions.assertFalse(todo.setTitle(""));
        Assertions.assertTrue(todo.setTitle("title"));
        todo.setTitle("Test");
        Assertions.assertEquals("Test", todo.getTitle());
    }

    @Test
    public void testDetailValidity() {
        TodoItem todo = new TodoItem();
        todo.setDetail("Detail");
        Assertions.assertEquals("Detail", todo.getDetail());
    }

}
