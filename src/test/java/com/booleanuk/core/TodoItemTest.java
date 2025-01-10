package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void settingStatusToComplete() {
        TodoItem todo = new TodoItem();
        todo.setTitle("Grocery shopping");
        todo.setDetail("Get groceries for two days");
        todo.setStatusToComplete();

        Assertions.assertEquals("Complete", todo.getStatus());
    }

    @Test
    public void settingStatusToInComplete() {
        TodoItem todo = new TodoItem();
        todo.setTitle("Grocery shopping");
        todo.setDetail("Get groceries for two days");
        todo.setStatusToInComplete();

        Assertions.assertEquals("Incomplete", todo.getStatus());
    }

    @Test
    public void settingTitleToItem() {
        TodoItem todo = new TodoItem();
        todo.setDetail("Get groceries for two days");
        todo.setStatusToInComplete();

        Assertions.assertFalse(todo.setTitle(""));
    }

}
