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


}
