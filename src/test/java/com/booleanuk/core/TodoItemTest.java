package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void GetTitleTest() {
        TodoItem todoList = new TodoItem("laundry", "wash dark clothes", "incomplete");
        Assertions.assertEquals("laundry", todoList.getTitle());
    }

    @Test
    public void SetTitleTest() {
        TodoItem todoList = new TodoItem("laundry", "wash dark clothes", "incomplete");
        todoList.setTitle("drawing");
        Assertions.assertEquals("drawing", todoList.getTitle());
    }

    @Test
    public void GetDetailTest() {
        TodoItem todoList = new TodoItem("laundry", "wash dark clothes", "incomplete");
        Assertions.assertEquals("wash dark clothes", todoList.getDetail());
    }

    @Test
    public void SetDetailTest() {
        TodoItem todoList = new TodoItem("laundry", "wash dark clothes", "incomplete");
        todoList.setDetail("wash white clothes");
        Assertions.assertEquals("wash white clothes", todoList.getDetail());
    }

    @Test
    public void GetStatusTest() {
        TodoItem todoList = new TodoItem("laundry", "wash dark clothes", "incomplete");
        Assertions.assertEquals("incomplete", todoList.getStatus());
    }

    @Test
    public void SetStatusTest() {
        TodoItem todoList = new TodoItem("laundry", "wash dark clothes", "incomplete");
        todoList.setStatus("complete");
        Assertions.assertEquals("complete", todoList.getStatus());
    }

}
