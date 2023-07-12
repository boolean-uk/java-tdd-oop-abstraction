package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    TodoItem todoItem;
    @BeforeEach
    public void setUp() {
        todoItem = new TodoItem("Learn TDD", "Write tests", "done");
    }

    @Test
    public void testSetStatus() {
        todoItem.setStatus("not completed");

        Assertions.assertEquals("not completed", todoItem.getStatus());
    }

    @Test
    public void testSetDetails() {
        todoItem.setDetail("Run tests");

        Assertions.assertEquals("Run tests", todoItem.getDetail());
    }

    @Test
    public void testSetTitle() {
        todoItem.setTitle("Practice TDD");

        Assertions.assertEquals("Practice TDD", todoItem.getTitle());
    }
}
