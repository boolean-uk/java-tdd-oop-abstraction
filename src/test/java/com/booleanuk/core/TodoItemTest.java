package com.booleanuk.core;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    void testGetStatus() {
        TodoItem item = new TodoItem("title", "detail", "status");

        Assertions.assertEquals("status", item.getStatus());
    }

    @Test
    void testGetTitle() {
        TodoItem item = new TodoItem("title", "detail", "status");

        Assertions.assertEquals("title", item.getTitle());
    }

    @Test
    void testGetDetail() {
        TodoItem item = new TodoItem("title", "detail", "status");

        Assertions.assertEquals("detail", item.getDetail());
    }

    @Test
    void testSetStatus() {
        TodoItem item = new TodoItem("title", "detail", "status");

        item.setStatus("complete");

        Assertions.assertEquals("complete", item.getStatus());
    }

    @Test
    void testSetTitle() {
        TodoItem item = new TodoItem("title", "detail", "status");

        item.setTitle("newTitle");

        Assertions.assertEquals("newTitle", item.getTitle());
    }
    @Test
    void testSetDetail() {
        TodoItem item = new TodoItem("title", "detail", "status");

        item.setDetail("newDetail");

        Assertions.assertEquals("newDetail", item.getDetail());
    }
}
