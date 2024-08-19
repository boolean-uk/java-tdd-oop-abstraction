package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testGetTitle() {
        TodoItem todoItem = new TodoItem("Walk", "Walk 5 km", "incomplete");
        Assertions.assertEquals("Walk", todoItem.getTitle());
    }
}
