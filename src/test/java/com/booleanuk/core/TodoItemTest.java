package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void setStatus() {
        TodoItem todoItem = new TodoItem("Wash the car", "It's dirty", "");
        todoItem.setStatus("incomplete");

        Assertions.assertEquals("incomplete", todoItem.getStatus());

        TodoItem todoItem2 = new TodoItem("Read a book", "It relaxes me", "");
        todoItem2.setStatus("complete");

        Assertions.assertNotEquals("incomplete", todoItem2.getStatus());
    }

    @Test
    public void setTitle() {
        TodoItem todoItem = new TodoItem("", "It's dirty", "incomplete");
        todoItem.setTitle("Wash the car");

        Assertions.assertEquals("Wash the car", todoItem.getTitle());

        TodoItem todoItem2 = new TodoItem("", "It relaxes me", "complete");
        todoItem2.setTitle("Read a book");

        Assertions.assertNotEquals("Wash the car", todoItem2.getTitle());
    }

    @Test
    public void setDetail() {
        TodoItem todoItem = new TodoItem("Wash the car", "", "incomplete");
        todoItem.setDetail("It's dirty");

        Assertions.assertEquals("It's dirty", todoItem.getDetail());

        TodoItem todoItem2 = new TodoItem("Read a book", "", "complete");
        todoItem2.setDetail("It relaxes me");

        Assertions.assertNotEquals("It's dirty", todoItem2.getDetail());
    }

    @Test
    public void getStatus() {
        TodoItem todoItem = new TodoItem("Wash the car", "It's dirty", "incomplete");

        Assertions.assertEquals("incomplete", todoItem.getStatus());

        TodoItem todoItem2 = new TodoItem("Read a book", "It relaxes me", "complete");

        Assertions.assertNotEquals("incomplete", todoItem2.getStatus());
    }

    @Test
    public void getTitle() {
        TodoItem todoItem = new TodoItem("Wash the car", "It's dirty", "incomplete");

        Assertions.assertEquals("Wash the car", todoItem.getTitle());

        TodoItem todoItem2 = new TodoItem("Read a book", "It relaxes me", "complete");

        Assertions.assertNotEquals("Wash the car", todoItem2.getTitle());
    }

    @Test
    public void getDetail() {
        TodoItem todoItem = new TodoItem("Wash the car", "It's dirty", "incomplete");

        Assertions.assertEquals("It's dirty", todoItem.getDetail());

        TodoItem todoItem2 = new TodoItem("Read a book", "It relaxes me", "complete");

        Assertions.assertNotEquals("It's dirty", todoItem2.getDetail());
    }
}
