package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testStatus() {
        TodoItem item = new TodoItem("Walk dog", "Take the dog for a walk around the park", "Incomplete");
        Assertions.assertEquals("Incomplete", item.getStatus());

        item.setStatus("Complete");
        Assertions.assertEquals("Complete", item.getStatus());
    }

    @Test
    public void testTitle() {
        TodoItem item = new TodoItem("Walk dog", "Take the dog for a walk around the park", "Incomplete");
        Assertions.assertEquals("Walk dog", item.getTitle());

        item.setTitle("Run with dog");
        Assertions.assertEquals("Run with dog", item.getTitle());
    }

    @Test
    public void testDetail() {
        TodoItem item = new TodoItem("Walk dog", "Take the dog for a walk around the park", "Incomplete");
        Assertions.assertEquals("Take the dog for a walk around the park", item.getDetail());

        item.setDetail("Take the dog for a walk at the beach");
        Assertions.assertEquals("Take the dog for a walk at the beach", item.getDetail());
    }


}
