package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    void membersShouldBeSet() {
        TodoItem item = new TodoItem("title", "detail", "status");

        Assertions.assertEquals("title", item.title);
        Assertions.assertEquals("detail", item.detail);
        Assertions.assertEquals("status", item.getStatus());
    }
    @Test
    void setStatusShouldBeNewStatus() {
        TodoItem item = new TodoItem("title", "detail", "status");

        item.setStatus("new status");

        Assertions.assertEquals("new status", item.getStatus());
    }
}
