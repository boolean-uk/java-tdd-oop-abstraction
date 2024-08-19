package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void checkSetStatus() {
        TodoItem todo = new TodoItem("Todo", "JUnit testing", "pending");
        Assertions.assertEquals("pending", todo.getStatus());
        todo.setStatus("complete");
        Assertions.assertEquals("complete", todo.getStatus());
    }
}
