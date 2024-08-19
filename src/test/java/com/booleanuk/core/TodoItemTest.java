package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TodoItemTest {

    @Test
    void setStatus() {
        TodoItem todoItem = new TodoItem("My title", "My details", "Complete");
        todoItem.setStatus("Incomplete");

        Assertions.assertEquals("Incomplete", todoItem.getStatus());
    }

    @Test
    void getStatus() {
        TodoItem todoItem = new TodoItem("My title", "My details", "Complete");

        Assertions.assertEquals("Complete", todoItem.getStatus());
    }

    @Test
    void getTitle() {
        TodoItem todoItem = new TodoItem("My title", "My details", "Complete");


        Assertions.assertEquals("My title", todoItem.getTitle());
    }

    @Test
    void setTitle() {
        TodoItem todoItem = new TodoItem("My title", "My details", "Complete");
        todoItem.setTitle("New title");

        Assertions.assertEquals("New title", todoItem.getTitle());
    }

    @Test
    void getDetail() {
        TodoItem todoItem = new TodoItem("My title", "My details", "Complete");

        Assertions.assertEquals("My details", todoItem.getDetail());
    }

    @Test
    void setDetail() {
        TodoItem todoItem = new TodoItem("My title", "My details", "Complete");
        todoItem.setDetail("New details");

        Assertions.assertEquals("New details", todoItem.getDetail());
    }
}