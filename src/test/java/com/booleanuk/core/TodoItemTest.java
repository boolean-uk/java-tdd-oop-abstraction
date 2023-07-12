package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    TodoItem todoItem;

    public TodoItemTest() {
        todoItem = new TodoItem("List", "workout", "finished");
    }

    @Test

    public void getTitleTest() {
        Assertions.assertEquals("List", todoItem.getTitle());
        Assertions.assertNotEquals("not a list", todoItem.getTitle());
    }
    @Test
    public void setTitleTest() {
        todoItem.setTitle("first");
        Assertions.assertEquals("first", todoItem.getTitle());
        Assertions.assertNotEquals("not a list", todoItem.getTitle());
    }

    @Test
    public void getDetailTest() {
        Assertions.assertEquals("workout", todoItem.getDetail());
        Assertions.assertNotEquals("not a workout", todoItem.getDetail());
    }

    @Test
    public void setDetailTest() {
        todoItem.setDetail("running");
        Assertions.assertEquals("running", todoItem.getDetail());
        Assertions.assertNotEquals("not a workout", todoItem.getDetail());
    }

    @Test
    public void getStatusTest() {
        Assertions.assertEquals("finished", todoItem.getStatus());
        Assertions.assertNotEquals("not finished", todoItem.getStatus());
    }

    @Test
    public void setStatusTest() {
        todoItem.setStatus("not finished");
        Assertions.assertEquals("not finished", todoItem.getStatus());
        Assertions.assertNotEquals("finished", todoItem.getStatus());
    }

}
