package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void titleSetAndGetTest() {
        TodoItem item = new TodoItem("title1", "detail1", "status1");
        Assertions.assertEquals("title1", item.getTitle());
        item.setTitle("title2");
        Assertions.assertEquals("title2", item.getTitle());
    }
    @Test
    public void detailSetAndGetTest() {
        TodoItem item = new TodoItem("title1", "detail1", "status1");
        Assertions.assertEquals("detail1", item.getDetail());
        item.setTitle("detail2");
        Assertions.assertEquals("detail2", item.getTitle());
    }
    @Test
    public void statusSetAndGetTest() {
        TodoItem item = new TodoItem("title1", "detail1", "status1");
        Assertions.assertEquals("status1", item.getStatus());
        item.setTitle("status2");
        Assertions.assertEquals("status2", item.getTitle());
    }
}
