package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoItemTest {
    @Test
    public void gettersTest() {
        TodoItem todoItem = new TodoItem("Do the dishes", "Take the dishes and wash them");
        assertEquals("Do the dishes", todoItem.getTitle());
        assertEquals("Take the dishes and wash them", todoItem.getDetail());
        assertEquals("InCompleted", todoItem.getStatus());
    }

    @Test
    public void settersTest() {
        TodoItem todoItem = new TodoItem("Do the dishes", "Take the dishes and wash them");
        todoItem.setTitle("Do the laundry");
        assertEquals("Do the laundry", todoItem.getTitle());
        todoItem.setDetail("Take dirty clothes and put them in washing machine");
        assertEquals("Take dirty clothes and put them in washing machine", todoItem.getDetail());
        todoItem.setStatusCompleted();
        assertEquals("Completed", todoItem.getStatus());
        todoItem.setStatusInCompleted();
        assertEquals("InCompleted", todoItem.getStatus());
    }
}
