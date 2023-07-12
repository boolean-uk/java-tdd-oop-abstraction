package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    void testSetTitle(){
        TodoItem item = new TodoItem("Title", "Detail","Status");
        item.setTitle("New Title");
        Assertions.assertEquals("New Title", item.getTitle());
    }
    @Test
    void testSetDetail(){
        TodoItem item = new TodoItem("Title", "Detail","Status");
        item.setDetail("New Detail");
        Assertions.assertEquals("New Detail", item.getDetail());
    }
    @Test
    void testSetStatus(){
        TodoItem item = new TodoItem("Title", "Detail","Status");
        item.setStatus("Completed");
        Assertions.assertEquals("Completed", item.getStatus());
    }


}
