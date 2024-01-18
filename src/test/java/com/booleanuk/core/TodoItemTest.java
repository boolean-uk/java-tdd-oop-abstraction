package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testAbstractions() {
        TodoItem toDo = new TodoItem("Do homework", "deadline tomorrow", "barely started");

        toDo.setTitle("Homework");
        toDo.setDetail("Deadline: Friday");
        toDo.setStatus("Started");

        Assertions.assertEquals("Homework", toDo.getTitle());
        Assertions.assertEquals("Deadline: Friday", toDo.getDetail());
        Assertions.assertEquals("Started", toDo.getStatus());
    }
}
