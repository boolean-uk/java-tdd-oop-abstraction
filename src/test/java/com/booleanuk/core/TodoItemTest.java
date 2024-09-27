package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testAccessPrivateValues() {
        TodoItem todoItem = new TodoItem("Title", "Detail", "Status");

        Assertions.assertEquals("Status", todoItem.getStatus());
        Assertions.assertEquals("Detail", todoItem.getDetail());
        Assertions.assertEquals("Title", todoItem.getTitle());

        todoItem.setStatus("Status2");
        todoItem.setDetail("Detail2");
        todoItem.setTitle("Title2");

        Assertions.assertEquals("Status2", todoItem.getStatus());
        Assertions.assertEquals("Detail2", todoItem.getDetail());
        Assertions.assertEquals("Title2", todoItem.getTitle());
    }

}
