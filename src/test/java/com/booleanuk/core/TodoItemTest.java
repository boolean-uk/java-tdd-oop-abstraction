package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testTodoItemGetNameAndDetailAndStatus(){
        TodoItem ti = new TodoItem("Dinner", "Make dinner");
        Assertions.assertEquals("Dinner", ti.getTitle());
        Assertions.assertEquals("Make dinner", ti.getDetail());
    }

    @Test
    public void testTodoItemInitialStatusSetToFalse(){
        TodoItem ti = new TodoItem("Dinner", "Make dinner");
        Assertions.assertFalse(ti.getStatus());
    }

    @Test
    public void testTodoItemToggleStatusShouldBeTrue(){
        TodoItem ti = new TodoItem("Dinner", "Make dinner");
        ti.toggleStatus();
        Assertions.assertTrue(ti.getStatus());
    }
}
