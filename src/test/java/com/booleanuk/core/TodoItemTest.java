package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoItemTest {
    @Test
    void constructor_shouldInitializeTodoItemWithCorrectStatus() {
        var todoItem = new TodoItem("todo", "important task");

        assertEquals(TodoItem.Status.InProgress, todoItem.getStatus());
    }

    @Test
    void toggleStatus_shouldCorrectlyToggleStatus() {
        var todoItem = new TodoItem("todo", "important task");

        todoItem.toggleStatus();

        assertEquals(TodoItem.Status.Done, todoItem.getStatus());
    }
}
