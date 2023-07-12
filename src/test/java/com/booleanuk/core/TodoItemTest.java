package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    private TodoItem todoItem;

    @BeforeEach
    private void setUp() {
        String title = "Wash the dishes";
        String detail = "Very hard";
        String status = "Incomplete";
        todoItem = new TodoItem(title, detail, status);
    }

    @Test
    public void shouldGetTitle() {
        String title = todoItem.getTitle();

        // Verify
        Assertions.assertEquals("Wash the dishes", title);
    }

    @Test void shouldSetTitle() {
        String newTitle = "Don't wash the dishes";

        // Execute
        todoItem.setTitle(newTitle);

        // Verify
        Assertions.assertEquals(newTitle, todoItem.getTitle());
    }

    @Test
    public void shouldGetDetail() {
        String detail = todoItem.getDetail();

        // Verify
        Assertions.assertEquals("Very hard", detail);
    }

    @Test void shouldSetDetail() {
        String newDetail = "Not so hard";

        // Execute
        todoItem.setDetail(newDetail);

        // Verify
        Assertions.assertEquals(newDetail, todoItem.getDetail());
    }

    @Test
    public void shouldGetStatus() {
        String status = todoItem.getStatus();

        // Verify
        Assertions.assertEquals("Incomplete", status);
    }

    @Test void shouldSetStatus() {
        String newStatus = "Complete";

        // Execute
        todoItem.setStatus(newStatus);

        // Verify
        Assertions.assertEquals(newStatus, todoItem.getStatus());
    }
}
