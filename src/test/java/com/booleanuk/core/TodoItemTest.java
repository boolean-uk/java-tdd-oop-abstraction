package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void getTitleTest(){
        TodoItem todoItem = new TodoItem("title1", "detail1", "OK");
        Assertions.assertEquals("title1", todoItem.getTitle());
    }
    @Test
    public void getDetailTest() {
        TodoItem todoItem = new TodoItem("title1", "detail1", "OK");
        Assertions.assertEquals("detail1", todoItem.getDetail());
    }
    @Test
    public void getStatusTest() {
        TodoItem todoItem = new TodoItem("title1", "detail1", "OK");
        Assertions.assertEquals("OK", todoItem.getStatus());
    }
    @Test
    public void setStatusTest() {
        TodoItem todoItem = new TodoItem("title1", "detail1", "OK");
        Assertions.assertEquals("OK", todoItem.getStatus());
        todoItem.setStatus("Not OK");
        Assertions.assertEquals("Not OK", todoItem.getStatus());
    }
}
