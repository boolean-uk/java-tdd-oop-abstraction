package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    TodoItem todoItem;

    @BeforeEach
    void createObject() {
        String title = "Eat dinner";
        String detail = "Buy all ingredients";
        String status = "Uncompleted";
        this.todoItem = new TodoItem(title, detail, status);
    }

    @Test
    void getDetail() {
        Assertions.assertEquals("Buy all ingredients", this.todoItem.getDetail());
    }

    @Test
    void setDetail() {
        this.todoItem.setDetail("Follow the recipe");
        Assertions.assertEquals("Follow the recipe", this.todoItem.getDetail());
    }

    @Test
    void getTitle() {
        Assertions.assertEquals("Eat dinner", this.todoItem.getTitle());
    }

    @Test
    void setTitle() {
        this.todoItem.setTitle("Relax");
        Assertions.assertEquals("Relax", this.todoItem.getTitle());
    }

    @Test
    void setStatus() {
        this.todoItem.setStatus("Completed");
        Assertions.assertEquals("Completed", this.todoItem.getStatus());
    }

    @Test
    void getStatus() {
        Assertions.assertEquals("Uncompleted", this.todoItem.getStatus());
    }
}
